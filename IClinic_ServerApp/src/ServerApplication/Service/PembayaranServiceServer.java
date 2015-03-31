/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ServerApplication.Service;

import Database.Entity.Pembayaran;
import Database.Service.PembayaranService;
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
public class PembayaranServiceServer extends UnicastRemoteObject implements PembayaranService {

    public PembayaranServiceServer() throws RemoteException {
    }

    public Pembayaran insertPembayaran(Pembayaran pembayaran) throws RemoteException {

        System.out.println("Client Melakukan Proses Insert pada Tabel Pembayaran");

        PreparedStatement statement = null;
       try{
           statement = DatabaseUtilities.getConnection().prepareStatement(
                   "INSERT INTO pembayaran (ID_PEMBAYARAN,ID_USG,ID_DETAIL_LAB,ID_REKAM,ID_TRANSAKSI_LAYANAN,TANGGAL_BAYAR,TOTAL_HARGA) values(?,?,?,?,?,?,?)"
                   );
           statement.setInt(1, pembayaran.getId_Pembayaran());
           statement.setInt(2, pembayaran.getId_USG());
           statement.setInt(3, pembayaran.getId_Detail_Lab());
           statement.setInt(4, pembayaran.getId_Rekam());
           statement.setInt(5, pembayaran.getId_Transaksi_Layanan());
           statement.setDate(6, (Date) pembayaran.getTanggal_Bayar());
           statement.setInt(7, pembayaran.getTotal_Harga());

           statement.executeUpdate();
           ResultSet result = statement.getGeneratedKeys();
           if(result.next()){
               pembayaran.setId_Pembayaran(result.getInt(1));
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
                 "ID_DETAIL_LAB = ?, ID_REKAM = ?, ID_TRANSAKSI_LAYANAN = ?, TANGGAL_BAYAR = ?, TOTAL_HARGA = ? " +
                 "WHERE ID_PEMBAYARAN = ?"
                   );
           statement.setInt(1, pembayaran.getId_USG());
           statement.setInt(2, pembayaran.getId_Detail_Lab());
           statement.setInt(3, pembayaran.getId_Rekam());
           statement.setInt(4, pembayaran.getId_Transaksi_Layanan());
           statement.setDate(5, (Date) pembayaran.getTanggal_Bayar());
           statement.setInt(6, pembayaran.getTotal_Harga());
           statement.setInt(7, pembayaran.getId_Pembayaran());

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

    public void deletePembayaran(int Id_Pembayaran) throws RemoteException {

        System.out.println("Client Melakukan Proses Delete pada Tabel Pembayaran");

        PreparedStatement statement = null;
       try{
           statement = DatabaseUtilities.getConnection().prepareStatement(
                    "DELETE FROM pembayaran WHERE ID_PEMBAYARAN = ?");

           statement.setLong(1, Id_Pembayaran);

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

    public Pembayaran getPembayaran(int Id_Pembayaran) throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel Pembayaran");

        PreparedStatement statement = null;
        try{
            statement = DatabaseUtilities.getConnection().prepareStatement(
                 "SELECT * FROM pembayaran WHERE ID_PEMBAYARAN = ?");

            ResultSet result = statement.executeQuery();

            Pembayaran pembayaran = null;

            if(result.next()){
                pembayaran = new Pembayaran();
                pembayaran.setId_Pembayaran(result.getInt("Id_Pembayaran"));
                pembayaran.setId_USG(result.getInt("Id_USG"));
                pembayaran.setId_Detail_Lab(result.getInt("Id_Detail_Lab"));
                pembayaran.setId_Rekam(result.getInt("Id_Rekam"));
                pembayaran.setId_Transaksi_Layanan(result.getInt("Id_Transaksi_Layanan"));
                pembayaran.setTanggal_Bayar(result.getDate("Tanggal_Bayar"));
                pembayaran.setTotal_Harga(result.getInt("Total_Harga"));
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
                pembayaran.setId_Pembayaran(result.getInt("Id_Pembayaran"));
                pembayaran.setId_USG(result.getInt("Id_USG"));
                pembayaran.setId_Detail_Lab(result.getInt("Id_Detail_Lab"));
                pembayaran.setId_Rekam(result.getInt("Id_Rekam"));
                pembayaran.setId_Transaksi_Layanan(result.getInt("Id_Transaksi_Layanan"));
                pembayaran.setTanggal_Bayar(result.getDate("Tanggal_Bayar"));
                pembayaran.setTotal_Harga(result.getInt("Total_Harga"));
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

}
