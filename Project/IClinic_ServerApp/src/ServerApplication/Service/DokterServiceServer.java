/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ServerApplication.Service;

import Database.Entity.Penyakit_diagnosa;
import Database.Entity.Penyakit_tabelMaster;
import Database.Entity.Rekam_Medis;
import Database.Entity.Tindakan_detailTindakan;
import Database.Entity.Tindakan_tabelMaster;
import Database.Service.DokterService;
import ServerApplication.Utilities.DatabaseUtilities;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tiara Ratna Sari
 */
public class DokterServiceServer extends UnicastRemoteObject implements DokterService {

    public DokterServiceServer() throws RemoteException {
    }

    public Rekam_Medis insertRekam_Medis(Rekam_Medis rekam_medis) throws RemoteException {

       System.out.println("Client Melakukan Proses Insert pada Tabel Rekam Medis");
    PreparedStatement statement = null;
       try{
           statement = DatabaseUtilities.getConnection().prepareStatement(
                   "INSERT INTO rekam_medis (ID_REKAM, ID_DIAGNOSA, ID_PASIEN, NO_DETAIL, TGL_REKAM, TINGGI, "
                           + "BERAT, TEKANAN_DARAH, HASIL_PEMERIKSAAN, ALERGI, TOTAL_HARGA, LAYANAN_TAMBAHAN) values(?,?,?,?,?,?,?,?,?,?,?,?)"
                   );
           statement.setString(1, rekam_medis.getId_Rekam());
           statement.setString(2, rekam_medis.getId_Diagnosa());
           statement.setString(3, rekam_medis.getId_Pasien());
           statement.setString(4, rekam_medis.getNo_Detail());
           statement.setDate(7, (Date) rekam_medis.getTgl_Rekam());
           statement.setInt(6, rekam_medis.getTinggi());
           statement.setInt(7, rekam_medis.getBerat());
           statement.setInt(8, rekam_medis.getTekanan_Darah());
           statement.setString(9, rekam_medis.getHasil_Pemerikasaan());
           statement.setString(10, rekam_medis.getAlergi());
           statement.setInt(11, rekam_medis.getTotal_Harga());
           statement.setString(12, rekam_medis.getLayanan_Tambahan());

           statement.executeUpdate();
           ResultSet result = statement.getGeneratedKeys();
//           if(result.next()){
//               rekam_medis.setId_Rekam_Medis(result.getString(1));
//           }
        result.close();
        return rekam_medis;
       }catch(SQLException exception){
        exception.printStackTrace();
            return null;
       }finally{
           if(statement != null){
               try{
                   statement.close();
               }catch(SQLException exception){

               }
           }
       }
    }

    public void updateRekam_Medis(Rekam_Medis rekam_medis) throws RemoteException {

        System.out.println("Client Melakukan Proses Update pada Tabel Rekam Medis");
    }

    public void deleteRekam_Medis(int Id_Rekam) throws RemoteException {

        System.out.println("Client Melakukan Proses Delete pada Tabel Rekam Medis");
    }

    public Rekam_Medis getRekam_Medis(int Id_Rekam) throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel Rekam Medis");
        PreparedStatement statement = null;
        try{
            statement = DatabaseUtilities.getConnection().prepareStatement(
                 "SELECT * FROM rekam_medis WHERE ID_REKAM = ?");

            ResultSet result = statement.executeQuery();

            Rekam_Medis rekam_medis = null;

            if(result.next()){
                rekam_medis = new Rekam_Medis();
                
                rekam_medis.setId_Rekam(result.getString("Id_Rekam"));
                rekam_medis.setId_Diagnosa(result.getString("Id_Diagnosa"));
                rekam_medis.setId_Pasien(result.getString("Id_Detail_Lab"));
                rekam_medis.setNo_Detail(result.getString("Id_Resep"));
                rekam_medis.setTgl_Rekam(result.getDate("Id_Rekam"));
                rekam_medis.setBerat(result.getInt("Id_Transaksi_Layanan"));
                rekam_medis.setTekanan_Darah(result.getInt("Tanggal_Bayar"));
                rekam_medis.setHasil_Pemerikasaan(result.getString("Total_Harga"));
                rekam_medis.setAlergi(result.getString("Status"));
                rekam_medis.setTotal_Harga(result.getInt("Status"));
                rekam_medis.setLayanan_Tambahan(result.getString("Status"));
                 
            }

            return rekam_medis;

        }catch(SQLException exception){
          exception.printStackTrace();
          return null;
        }finally{
            if(statement != null){
                try{
                    statement.close();
                }catch(SQLException exception){
                   exception.printStackTrace();
                }
            }
        }
    }

    public List<Rekam_Medis> getRekam_Medis() throws RemoteException {

        System.out.println("Client Melakukan Proses Get All pada Tabel Rekam Medis");
        Statement statement = null;
        try{
          statement = DatabaseUtilities.getConnection().createStatement();

          ResultSet result = statement.executeQuery("SELECT * FROM rekam_medis");

          List<Rekam_Medis> list = new ArrayList<Rekam_Medis>();

          while(result.next()){
                Rekam_Medis rekam_medis = new Rekam_Medis();
                rekam_medis.setId_Rekam(result.getString("Id_Rekam"));
                rekam_medis.setId_Diagnosa(result.getString("Id_Diagnosa"));
                rekam_medis.setId_Pasien(result.getString("Id_Detail_Lab"));
                rekam_medis.setNo_Detail(result.getString("Id_Resep"));
                rekam_medis.setTgl_Rekam(result.getDate("Id_Rekam"));
                rekam_medis.setBerat(result.getInt("Id_Transaksi_Layanan"));
                rekam_medis.setTekanan_Darah(result.getInt("Tanggal_Bayar"));
                rekam_medis.setHasil_Pemerikasaan(result.getString("Total_Harga"));
                rekam_medis.setAlergi(result.getString("Status"));
                rekam_medis.setTotal_Harga(result.getInt("Status"));
                rekam_medis.setLayanan_Tambahan(result.getString("Status"));
                list.add(rekam_medis);
          }

          result.close();

          return list;

        }catch(SQLException exception){
          exception.printStackTrace();
          return null;
        }finally{
            if(statement != null){
                try{
                    statement.close();
                }catch(SQLException exception){
                   exception.printStackTrace();
                }
            }
        }
    }

    public Penyakit_tabelMaster insertPenyakit_tabelMaster(Penyakit_tabelMaster penyakit) throws RemoteException {
        
        System.out.println("Client Melakukan Proses Insert pada Tabel Penyakit_tabelMaster");
        return penyakit;
    }

    public void updatePenyakit_tabelMaster(Penyakit_tabelMaster penyakit) throws RemoteException {

        System.out.println("Client Melakukan Proses Update pada Tabel Penyakit_tabelMaster");
    }

    public void deletePenyakit_tabelMaster(int Id_Penyakit) throws RemoteException {

        System.out.println("Client Melakukan Proses Delete pada Tabel Penyakit_tabelMaster");
    }

    public Penyakit_tabelMaster getPenyakit_tabelMaster(int Id_Penyakit) throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel Penyakit_tabelMaster");
        Penyakit_tabelMaster penyakit = null;
        return penyakit;
    }

    public List<Penyakit_tabelMaster> getPenyakit_tabelMaster() throws RemoteException {

        System.out.println("Client Melakukan Proses Get All pada Tabel Penyakit_tabelMaster");
        List<Penyakit_tabelMaster> list = new ArrayList<Penyakit_tabelMaster>();
        return list;
    }
    
    public Penyakit_diagnosa insertPenyakit_diagnosa(Penyakit_diagnosa diagnosa) throws RemoteException {
        
        System.out.println("Client Melakukan Proses Insert pada Tabel Penyakit_diagnosa");
        return diagnosa;
    }

    public void updatePenyakit_diagnosa(Penyakit_diagnosa diagnosa) throws RemoteException {

        System.out.println("Client Melakukan Proses Update pada Tabel Penyakit_diagnosa");
    }

    public void deletePenyakit_diagnosa(int Id_Penyakit_diagnosa) throws RemoteException {

        System.out.println("Client Melakukan Proses Delete pada Tabel Penyakit_diagnosa");
    }

    public Penyakit_diagnosa getPenyakit_diagnosa(int Id_Penyakit_diagnosa) throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel Penyakit_diagnosa");
        Penyakit_diagnosa diagnosa = null;
        return diagnosa;
    }

    public List<Penyakit_diagnosa> getPenyakit_diagnosa() throws RemoteException {

        System.out.println("Client Melakukan Proses Get All pada Tabel Penyakit_diagnosa");
        List<Penyakit_diagnosa> list = new ArrayList<Penyakit_diagnosa>();
        return list;
    }
    
    public Tindakan_tabelMaster insertTindakan_tabelMaster(Tindakan_tabelMaster tindakan) throws RemoteException {
        
        System.out.println("Client Melakukan Proses Insert pada Tabel Tindakan");
        return tindakan;
    }

    public void updateTindakan_tabelMaster(Tindakan_tabelMaster tindakan) throws RemoteException {

        System.out.println("Client Melakukan Proses Update pada Tabel Tindakan");
    }

    public void deleteTindakan_tabelMaster(int Id_Tindakan) throws RemoteException {

        System.out.println("Client Melakukan Proses Delete pada Tabel Tindakan");
    }

    public Tindakan_tabelMaster getTindakan_tabelMaster(int Id_Tindakan) throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel Tindakan");
        Tindakan_tabelMaster tindakan = null;
        return tindakan;
    }

    public List<Tindakan_tabelMaster> getTindakan_tabelMaster() throws RemoteException {

        System.out.println("Client Melakukan Proses Get All pada Tabel Tindakan");
        List<Tindakan_tabelMaster> list = new ArrayList<Tindakan_tabelMaster>();
        return list;
    }
    
    public Tindakan_detailTindakan insertTindakan_detailTindakan(Tindakan_detailTindakan detail_tindakan) throws RemoteException {
        
        System.out.println("Client Melakukan Proses Insert pada Tabel Tindakan");
        return detail_tindakan;
    }

    public void updateTindakan_detailTindakan(Tindakan_detailTindakan detail_tindakan) throws RemoteException {

        System.out.println("Client Melakukan Proses Update pada Tabel Tindakan");
    }

    public void deleteTindakan_detailTindakan(int No_Detail) throws RemoteException {

        System.out.println("Client Melakukan Proses Delete pada Tabel Tindakan");
    }

    public Tindakan_detailTindakan getTindakan_detailTindakan(int No_Detail) throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel Tindakan");
        Tindakan_detailTindakan detail_tindakan = null;
        return detail_tindakan;
    }

    public List<Tindakan_detailTindakan> getTindakan_detailTindakan() throws RemoteException {

        System.out.println("Client Melakukan Proses Get All pada Tabel Tindakan");
        List<Tindakan_detailTindakan> list = new ArrayList<Tindakan_detailTindakan>();
        return list;
    }

    public List<Rekam_Medis> GetRekam_MedisbyPasien(String idpasien) throws RemoteException {
        PreparedStatement statement = null;
        try{
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "SELECT * FROM rekam_medis WHERE ID_PASIEN = ?");
            statement.setInt(1, Integer.parseInt(idpasien));
            ResultSet result = statement.executeQuery();
            List<Rekam_Medis> rms = new ArrayList<Rekam_Medis>();
            if(result.next()){
                Rekam_Medis rm = new Rekam_Medis();
                rm.setId_Rekam(result.getString("ID_REKAM"));
                rm.setId_Diagnosa(result.getString("ID_DIAGNOSA"));
                rm.setId_Pasien(result.getString("ID_PASIEN"));
                rm.setNo_Detail(result.getString("NO_DETAIL"));
                rm.setTgl_Rekam(result.getDate("TGL_REKAM"));
                rm.setTinggi(result.getInt("TINGGI"));
                rm.setBerat(result.getInt("BERAT"));
                rm.setTekanan_Darah(result.getInt("TEKANAN_DARAH"));
                rm.setHasil_Pemerikasaan(result.getString("HASIL_PEMERIKSAAN"));
                rm.setAlergi(result.getString("ALERGI"));
                rm.setTotal_Harga(result.getInt("TOTAL_HARGA"));
                rm.setLayanan_Tambahan(result.getString("LAYANAN_TAMBAHAN"));
                rms.add(rm);
            }
            return rms;
        } catch (SQLException exception){
            System.out.println(exception);
            return null;
        } finally{
            if (statement != null){
                try{
                    statement.close();
                } catch(SQLException exception){
                        
                }
            }
        }
    }
}
