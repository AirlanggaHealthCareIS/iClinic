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
           statement.setDate(5, new Date(rekam_medis.getTgl_Rekam().getTime()));
           statement.setInt(6, rekam_medis.getTinggi());
           statement.setInt(7, rekam_medis.getBerat());
           statement.setInt(8, rekam_medis.getTekanan_Darah());
           statement.setString(9, rekam_medis.getHasil_Pemerikasaan());
           statement.setString(10, rekam_medis.getAlergi());
           statement.setInt(11, rekam_medis.getTotal_Harga());
           statement.setString(12, rekam_medis.getLayanan_Tambahan());

           statement.executeUpdate();
//           ResultSet result = statement.getGeneratedKeys();
//           if(result.next()){
//               rekam_medis.setId_Rekam_Medis(result.getString(1));
//           }
  //      result.close();
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

    public void deleteRekam_Medis(String Id_Rekam) throws RemoteException {

        System.out.println("Client Melakukan Proses Delete pada Tabel Rekam Medis");
    }

    public Rekam_Medis getRekam_Medis(String Id_Rekam) throws RemoteException {

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
                rekam_medis.setId_Pasien(result.getString("Id_Pasien"));
                rekam_medis.setNo_Detail(result.getString("No_Detail"));
                rekam_medis.setTgl_Rekam(result.getDate("Tgl_Rekam"));
                rekam_medis.setTinggi(result.getInt("Tinggi"));
                rekam_medis.setBerat(result.getInt("Berat"));
                rekam_medis.setTekanan_Darah(result.getInt("Tekanan_Darah"));
                rekam_medis.setHasil_Pemerikasaan(result.getString("Hasil_Pemeriksaan"));
                rekam_medis.setAlergi(result.getString("Alergi"));
                rekam_medis.setTotal_Harga(result.getInt("Total_Harga"));
                rekam_medis.setLayanan_Tambahan(result.getString("Layanan_Tambahan"));
                 
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
                rekam_medis.setId_Pasien(result.getString("Id_Pasien"));
                rekam_medis.setNo_Detail(result.getString("No_Detail"));
                rekam_medis.setTgl_Rekam(result.getDate("Tgl_Rekam"));
                rekam_medis.setTinggi(result.getInt("Tinggi"));
                rekam_medis.setBerat(result.getInt("Berat"));
                rekam_medis.setTekanan_Darah(result.getInt("Tekanan_Darah"));
                rekam_medis.setHasil_Pemerikasaan(result.getString("Hasil_Pemeriksaan"));
                rekam_medis.setAlergi(result.getString("Alergi"));
                rekam_medis.setTotal_Harga(result.getInt("Total_Harga"));
                rekam_medis.setLayanan_Tambahan(result.getString("Layanan_Tambahan"));
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




    public List<Rekam_Medis> GetRekam_MedisbyPasien(String idpasien) throws RemoteException {
        PreparedStatement statement = null;
        try{
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "SELECT * FROM rekam_medis WHERE ID_PASIEN = ?");
            statement.setInt(1, Integer.parseInt(idpasien));
            ResultSet result = statement.executeQuery();
            List<Rekam_Medis> rms = new ArrayList<Rekam_Medis>();
            while(result.next()){
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


   
    public List getNamaDiagnosa() throws RemoteException {
   Statement statement = null;
	ResultSet resultSet = null;
        List product_code = new ArrayList();
	try {
	    statement = (Statement) DatabaseUtilities.getConnection().createStatement();
	    resultSet = statement.executeQuery("SELECT DIAGNOSA from diagnosa");
	    while (resultSet.next()) {
		product_code.add(resultSet.getString("diagnosa"));
	    }
	}
        catch (SQLException ex) {}
         finally {
	    try {
		if (resultSet != null) {
		    resultSet.close();
		}
	    }
            catch (SQLException ex) {}
	    try {
		if (statement != null) {
		    statement.close();
		}
	    }
            catch (SQLException ex) {}
	}
        return product_code;
    }

    public String getIdDiagnosa(String namaDiagnosa) throws RemoteException {
         System.out.println("Client Melakukan Proses Get Nama Diagnosa");
        Statement state = null;
        ResultSet rs = null;
        String idDiagnosa = "";
	try {
            state = (Statement) DatabaseUtilities.getConnection().createStatement();
            String sql = "SELECT ID_DIAGNOSA FROM DIAGNOSA WHERE  DIAGNOSA = '"+namaDiagnosa+"'";
            rs = state.executeQuery(sql);
            while (rs.next()){
                idDiagnosa = rs.getString(1);
            }
        }
        catch (Throwable ex) {
            System.out.println(ex);
        }
        System.out.println(idDiagnosa);
        return idDiagnosa;
    }

//    public List getAntrian() throws RemoteException {
//        Statement statement = null;
//	ResultSet resultSet = null;
//        List id_pasien = new ArrayList();
//	try {
//	    statement = (Statement) DatabaseUtilities.getConnection().createStatement();
//	    resultSet = statement.executeQuery("SELECT ID_PASIEN FROM antrian");
//	    while (resultSet.next()) {
//		id_pasien.add(resultSet.getString("ID_PASIEN"));
//	    }
//	}
//        catch (SQLException ex) {}
//         finally {
//	    try {
//		if (resultSet != null) {
//		    resultSet.close();
//		}
//	    }
//            catch (SQLException ex) {}
//	    try {
//		if (statement != null) {
//		    statement.close();
//		}
//	    }
//            catch (SQLException ex) {}
//	}
//        return id_pasien;
//    }
//

    public List getNamaDetail() throws RemoteException {
        Statement statement = null;
	ResultSet resultSet = null;
        List product_code = new ArrayList();
	try {
	    statement = (Statement) DatabaseUtilities.getConnection().createStatement();
	    resultSet = statement.executeQuery("SELECT NO_DETAIL from DETAIL_TINDAKAN");
	    while (resultSet.next()) {
		product_code.add(resultSet.getString("NO_DETAIL"));
	    }
	}
        catch (SQLException ex) {}
         finally {
	    try {
		if (resultSet != null) {
		    resultSet.close();
		}
	    }
            catch (SQLException ex) {}
	    try {
		if (statement != null) {
		    statement.close();
		}
	    }
            catch (SQLException ex) {}
	}
        return product_code;
    }

    public String getIdDetail(String namaDetail) throws RemoteException {
         System.out.println("Client Melakukan Proses Get Jenis Tindakan");
        Statement state = null;
        ResultSet rs = null;
        String noDetail = "";
	try {
            state = (Statement) DatabaseUtilities.getConnection().createStatement();
            String sql = "SELECT NO_DETAIL FROM DETAIL_TINDAKAN WHERE  ID_TINDAKAN = '"+namaDetail+"'";
            rs = state.executeQuery(sql);
            while (rs.next()){
                noDetail = rs.getString(1);
            }
        }
        catch (Throwable ex) {
            System.out.println(ex);
        }
        System.out.println(noDetail);
        return noDetail;}

    
    
    
}
