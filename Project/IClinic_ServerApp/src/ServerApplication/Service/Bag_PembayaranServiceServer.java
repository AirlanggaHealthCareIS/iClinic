/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ServerApplication.Service;

import Database.Entity.Pembayaran;
import Database.Service.Bag_PembayaranService;
import ServerApplication.Utilities.DatabaseUtilities;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tiara Ratna Sari
 */
public class Bag_PembayaranServiceServer extends UnicastRemoteObject implements Bag_PembayaranService {

    public Bag_PembayaranServiceServer() throws RemoteException {
    }

    public Pembayaran insertPembayaran(Pembayaran pembayaran) throws RemoteException {

        System.out.println("Client Melakukan Proses Insert pada Tabel Pembayaran");

        PreparedStatement statement = null;
       try{
           statement = DatabaseUtilities.getConnection().prepareStatement(
                   "INSERT INTO pembayaran (ID_PEMBAYARAN,ID_USG,ID_DETAIL_LAB,ID_RESEP,ID_REKAM,ID_TRANSAKSI_LAYANAN,TANGGAL_BAYAR,TOTAL_HARGA,STATUS) values(?,?,?,?,?,?,?,?,?)"
                   );
           statement.setString(1, pembayaran.getId_Pembayaran());
           statement.setString(2, pembayaran.getId_USG());
           statement.setString(3, pembayaran.getId_Detail_Lab());
           statement.setString(4, pembayaran.getId_Resep());
           statement.setString(5, pembayaran.getId_Rekam());
           statement.setString(6, pembayaran.getId_Transaksi_Layanan());
           statement.setDate(7, (Date) pembayaran.getTanggal_Bayar());
           statement.setInt(8, pembayaran.getTotal_Harga());
           statement.setString(9, pembayaran.getStatus());

           statement.executeUpdate();
           ResultSet result = statement.getGeneratedKeys();
           if(result.next()){
               pembayaran.setId_Pembayaran(result.getString(1));
           }
        result.close();
        return pembayaran;
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

    public void updatePembayaran(Pembayaran pembayaran) throws RemoteException {

        System.out.println("Client Melakukan Proses Update pada Tabel Pembayaran");

        PreparedStatement statement = null;
       try{
           statement = DatabaseUtilities.getConnection().prepareStatement(
                    "UPDATE pembayaran SET ID_USG = ?," +
                 "ID_DETAIL_LAB = ?, ID_RESEP = ?, ID_REKAM = ?, ID_TRANSAKSI_LAYANAN = ?, TANGGAL_BAYAR = ?, TOTAL_HARGA = ? " +
                 "WHERE ID_PEMBAYARAN = ?"
                   );
           statement.setString(1, pembayaran.getId_USG());
           statement.setString(2, pembayaran.getId_Detail_Lab());
           statement.setString(3, pembayaran.getId_Resep());
           statement.setString(4, pembayaran.getId_Rekam());
           statement.setString(5, pembayaran.getId_Transaksi_Layanan());
           statement.setDate(6, (Date) pembayaran.getTanggal_Bayar());
           statement.setInt(7, pembayaran.getTotal_Harga());
           statement.setString(8, pembayaran.getStatus());
           statement.setString(9, pembayaran.getId_Pembayaran());

           statement.executeUpdate();

       }catch(SQLException exception){
        exception.printStackTrace();
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

    public void deletePembayaran(String Id_Pembayaran) throws RemoteException {

        System.out.println("Client Melakukan Proses Delete pada Tabel Pembayaran");

        PreparedStatement statement = null;
       try{
           statement = DatabaseUtilities.getConnection().prepareStatement(
                    "DELETE FROM pembayaran WHERE ID_PEMBAYARAN = ?");

           statement.setString(1, Id_Pembayaran);

           statement.executeUpdate();

       }catch(SQLException exception){
        exception.printStackTrace();
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

    public Pembayaran getPembayaran(String Id_Pembayaran) throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel Pembayaran");

        PreparedStatement statement = null;
        try{
            statement = DatabaseUtilities.getConnection().prepareStatement(
                 "SELECT * FROM pembayaran WHERE ID_PEMBAYARAN = ?");

            ResultSet result = statement.executeQuery();

            Pembayaran pembayaran = null;

            if(result.next()){
                pembayaran = new Pembayaran();
                pembayaran.setId_Pembayaran(result.getString("Id_Pembayaran"));
                pembayaran.setId_USG(result.getString("Id_USG"));
                pembayaran.setId_Detail_Lab(result.getString("Id_Detail_Lab"));
                pembayaran.setId_Resep(result.getString("Id_Resep"));
                pembayaran.setId_Rekam(result.getString("Id_Rekam"));
                pembayaran.setId_Transaksi_Layanan(result.getString("Id_Transaksi_Layanan"));
                pembayaran.setTanggal_Bayar(result.getDate("Tanggal_Bayar"));
                pembayaran.setTotal_Harga(result.getInt("Total_Harga"));
                pembayaran.setStatus(result.getString("Status"));
            }

            return pembayaran;

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

    public List<Pembayaran> getPembayaran() throws RemoteException {
        
        System.out.println("Client Melakukan Proses Get All pada Tabel Pembayaran");

        Statement statement = null;
        try{
          statement = DatabaseUtilities.getConnection().createStatement();

          ResultSet result = statement.executeQuery("SELECT * FROM pembayaran");

          List<Pembayaran> list = new ArrayList<Pembayaran>();

          while(result.next()){
                Pembayaran pembayaran = new Pembayaran();
                pembayaran.setId_Pembayaran(result.getString("Id_Pembayaran"));
                pembayaran.setId_USG(result.getString("Id_USG"));
                pembayaran.setId_Detail_Lab(result.getString("Id_Detail_Lab"));
                pembayaran.setId_Resep(result.getString("Id_Resep"));
                pembayaran.setId_Rekam(result.getString("Id_Rekam"));
                pembayaran.setId_Transaksi_Layanan(result.getString("Id_Transaksi_Layanan"));
                pembayaran.setTanggal_Bayar(result.getDate("Tanggal_Bayar"));
                pembayaran.setTotal_Harga(result.getInt("Total_Harga"));
                pembayaran.setStatus(result.getString("Status"));
                list.add(pembayaran);
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
    public Pembayaran MeihatTotalTagihanPembayaran(String Id_Pasien) throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel Pembayaran");

        PreparedStatement statement = null;
        try{
            statement = DatabaseUtilities.getConnection().prepareStatement(
                "SELECT pasien.NAMA_PASIEN,pembayaran.ID_PEMBAYARAN,transaksi_usg.HARGA,detail_lab.TOTAL_HARGA,resep.TOTAL_HARGA,rekam_medis.TOTAL_HARGA,transaksi_layanan_kecantikan.TOTAL_HARGA,pembayaran.TOTAL_HARGA,pembayaran.STATUS\n" +
                "FROM pasien,transaksi_usg,detail_lab,resep,rekam_medis,transaksi_layanan_kecantikan,pembayaran\n" +
                "WHERE pembayaran.ID_PASIEN = '"+Id_Pasien+"' \n" +
                "AND pembayaran.TANGGAL_BAYAR = '2015-4-11'\n" +
                "AND pasien.ID_PASIEN = pembayaran.ID_PASIEN\n" +
                "AND pembayaran.ID_USG = transaksi_usg.ID_USG\n" +
                "AND pembayaran.ID_DETAIL_LAB = detail_lab.ID_DETAIL_LAB\n" +
                "AND pembayaran.ID_RESEP = resep.ID_RESEP\n" +
                "AND pembayaran.ID_REKAM = rekam_medis.ID_REKAM\n" +
                "AND pembayaran.ID_TRANSAKSI_LAYANAN = transaksi_layanan_kecantikan.ID_TRANSAKSI_LAYANAN");

            ResultSet result = statement.executeQuery();

            Pembayaran pembayaran = null;

            if(result.next()){
                pembayaran = new Pembayaran();
                pembayaran.setId_Pembayaran(result.getString("Id_Pembayaran"));
                pembayaran.setNama_Pasien(result.getString("Nama_Pasien"));
                pembayaran.setTotal_USG(result.getInt("HARGA"));
                pembayaran.setTotal_Lab(result.getInt("Total_HARGA"));
                pembayaran.setTotal_Resep(result.getInt("Total_HARGA"));
                pembayaran.setTotal_Rekam(result.getInt("Total_HARGA"));
                pembayaran.setTotal_Kecantikan(result.getInt("Total_HARGA"));
                pembayaran.setTotal_Harga(result.getInt("Total_Harga"));
                pembayaran.setStatus(result.getString("Status"));
            }

            return pembayaran;

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
    
    public void updateStatusPembayaranTunai(String Id_Pembayaran, String Status) throws RemoteException {

        System.out.println("Client Melakukan Proses Update pada Tabel Pembayaran");

        PreparedStatement statement = null;
       try{
           statement = DatabaseUtilities.getConnection().prepareStatement(
                    "UPDATE pembayaran SET STATUS = ? " +
                    "WHERE ID_PEMBAYARAN = ?"
                   );
           statement.setString(1, Status);
           statement.setString(2, Id_Pembayaran);

           statement.executeUpdate();

       }catch(SQLException exception){
        exception.printStackTrace();
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
}
