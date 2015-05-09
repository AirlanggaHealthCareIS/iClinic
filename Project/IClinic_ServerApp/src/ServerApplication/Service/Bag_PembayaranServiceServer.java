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
           statement.setString(1, pembayaran.getID_PEMBAYARAN());
           statement.setString(2, pembayaran.getID_USG());
           statement.setString(3, pembayaran.getID_TRANSAKSI_LAB());
           statement.setString(4, pembayaran.getID_RESEP());
           statement.setString(5, pembayaran.getID_REKAM());
           statement.setString(6, pembayaran.getID_TRANSAKSI_LAYANAN());
           statement.setDate(7, new Date(pembayaran.getTANGGAL_BAYAR().getTime()));
           statement.setInt(8, pembayaran.getTOTAL_HARGA());
           statement.setString(9, pembayaran.getSTATUS());

           statement.executeUpdate();
           ResultSet result = statement.getGeneratedKeys();
           if(result.next()){
               pembayaran.setID_PEMBAYARAN(result.getString(1));
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
           statement.setString(1, pembayaran.getID_USG());
           statement.setString(2, pembayaran.getID_TRANSAKSI_LAB());
           statement.setString(3, pembayaran.getID_RESEP());
           statement.setString(4, pembayaran.getID_REKAM());
           statement.setString(5, pembayaran.getID_TRANSAKSI_LAYANAN());
           statement.setDate(6, new Date(pembayaran.getTANGGAL_BAYAR().getTime()));
           statement.setInt(7, pembayaran.getTOTAL_HARGA());
           statement.setString(8, pembayaran.getSTATUS());
           statement.setString(9, pembayaran.getID_PEMBAYARAN());

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
                 "SELECT * FROM pembayaran WHERE ID_PEMBAYARAN = '"+Id_Pembayaran+"'");
//            statement.setString(1, Id_Pembayaran);
            ResultSet result = statement.executeQuery();

            Pembayaran pembayaran = null;

            if(result.next()){
                pembayaran = new Pembayaran();
                pembayaran.setID_PEMBAYARAN(result.getString("ID_PEMBAYARAN"));
                pembayaran.setID_PASIEN(result.getString("ID_PASIEN"));
                pembayaran.setID_USG(result.getString("ID_USG"));
                pembayaran.setID_TRANSAKSI_LAB(result.getString("ID_TRANSAKSI_LAB"));
                pembayaran.setID_RESEP(result.getString("ID_RESEP"));
                pembayaran.setID_REKAM(result.getString("ID_REKAM"));
                pembayaran.setID_TRANSAKSI_LAYANAN(result.getString("ID_TRANSAKSI_LAYANAN"));
                pembayaran.setTANGGAL_BAYAR(result.getDate("TANGGAL_BAYAR"));
                pembayaran.setTOTAL_HARGA(result.getInt("TOTAL_HARGA"));
                pembayaran.setSTATUS(result.getString("STATUS"));
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

            ResultSet result = statement.executeQuery(
                "SELECT pasien.NAMA_PASIEN, pembayaran.*, transaksi_usg.HARGA AS TOTAL_USG, "+
                "transaksi_lab.TOTAL_HARGA AS TOTAL_LAB, resep.TOTAL_HARGA AS TOTAL_RESEP, "+
                "rekam_medis.TOTAL_HARGA AS TOTAL_REKAM, transaksi_layanan_kecantikan.TOTAL_HARGA AS TOTAL_KECANTIKAN \n" +
                "FROM pasien,transaksi_usg,transaksi_lab,resep,rekam_medis,transaksi_layanan_kecantikan,pembayaran\n" +
                "WHERE pasien.ID_PASIEN = pembayaran.ID_PASIEN\n" +
                "AND pembayaran.ID_USG = transaksi_usg.ID_USG\n" +
                "AND pembayaran.ID_TRANSAKSI_LAB = transaksi_lab.ID_TRANSAKSI_LAB\n" +
                "AND pembayaran.ID_RESEP = resep.ID_RESEP\n" +
                "AND pembayaran.ID_REKAM = rekam_medis.ID_REKAM\n" +
                "AND pembayaran.ID_TRANSAKSI_LAYANAN = transaksi_layanan_kecantikan.ID_TRANSAKSI_LAYANAN");


          List<Pembayaran> list = new ArrayList<Pembayaran>();

          while(result.next()){
                Pembayaran pembayaran = new Pembayaran();
                pembayaran.setID_PEMBAYARAN(result.getString("ID_PEMBAYARAN"));
                pembayaran.setID_PASIEN(result.getString("ID_PASIEN"));
                pembayaran.setNAMA_PASIEN(result.getString("NAMA_PASIEN"));
                pembayaran.setID_USG(result.getString("ID_USG"));
                pembayaran.setTOTAL_USG(result.getInt("TOTAL_USG"));
                pembayaran.setID_TRANSAKSI_LAB(result.getString("ID_TRANSAKSI_LAB"));
                pembayaran.setTOTAL_LAB(result.getInt("TOTAL_LAB"));
                pembayaran.setID_RESEP(result.getString("ID_RESEP"));
                pembayaran.setTOTAL_RESEP(result.getInt("TOTAL_RESEP"));
                pembayaran.setID_REKAM(result.getString("ID_REKAM"));
                pembayaran.setTOTAL_REKAM(result.getInt("TOTAL_REKAM"));
                pembayaran.setID_TRANSAKSI_LAYANAN(result.getString("ID_TRANSAKSI_LAYANAN"));
                pembayaran.setTOTAL_KECANTIKAN(result.getInt("TOTAL_KECANTIKAN"));
                pembayaran.setTANGGAL_BAYAR(result.getDate("TANGGAL_BAYAR"));
                pembayaran.setTOTAL_HARGA(result.getInt("TOTAL_HARGA"));
                pembayaran.setSTATUS(result.getString("STATUS"));
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
    public Pembayaran MeihatTotalTagihanPembayaran(String Id_Pasien, java.util.Date tanggal) throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel Pembayaran");

        PreparedStatement statement = null;
        try{
            statement = DatabaseUtilities.getConnection().prepareStatement(
                "SELECT pasien.NAMA_PASIEN, pembayaran.ID_PEMBAYARAN, transaksi_usg.HARGA AS USG, transaksi_lab.TOTAL_HARGA AS LAB, resep.TOTAL_HARGA AS RESEP, rekam_medis.TOTAL_HARGA AS REKAM, transaksi_layanan_kecantikan.TOTAL_HARGA AS KECANTIKAN, pembayaran.TOTAL_HARGA AS TOTAL_HARGA, pembayaran.STATUS \n" +
                "FROM pasien,transaksi_usg,transaksi_lab,resep,rekam_medis,transaksi_layanan_kecantikan,pembayaran\n" +
                "WHERE pembayaran.ID_PASIEN = '"+Id_Pasien+"' \n" +
                "AND pembayaran.TANGGAL_BAYAR = '"+new Date(tanggal.getTime())+"'\n" +
                "AND pembayaran.STATUS = 'HUTANG'\n" +
                "AND pasien.ID_PASIEN = pembayaran.ID_PASIEN\n" +
                "AND pembayaran.ID_USG = transaksi_usg.ID_USG\n" +
                "AND pembayaran.ID_TRANSAKSI_LAB = transaksi_lab.ID_TRANSAKSI_LAB\n" +
                "AND pembayaran.ID_RESEP = resep.ID_RESEP\n" +
                "AND pembayaran.ID_REKAM = rekam_medis.ID_REKAM\n" +
                "AND pembayaran.ID_TRANSAKSI_LAYANAN = transaksi_layanan_kecantikan.ID_TRANSAKSI_LAYANAN");

            ResultSet result = statement.executeQuery();

            Pembayaran pembayaran = null;

            if(result.next()){
                pembayaran = new Pembayaran();
                pembayaran.setID_PEMBAYARAN(result.getString("ID_PEMBAYARAN"));
                pembayaran.setNAMA_PASIEN(result.getString("NAMA_PASIEN"));
                pembayaran.setTOTAL_USG(result.getInt("USG"));
                pembayaran.setTOTAL_LAB(result.getInt("LAB"));
                pembayaran.setTOTAL_RESEP(result.getInt("RESEP"));
                pembayaran.setTOTAL_REKAM(result.getInt("REKAM"));
                pembayaran.setTOTAL_KECANTIKAN(result.getInt("KECANTIKAN"));
                pembayaran.setTOTAL_HARGA(result.getInt("TOTAL_HARGA"));
                pembayaran.setSTATUS(result.getString("STATUS"));
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
    
    public void updateStatusPembayaran(String Id_Pembayaran, String Status) throws RemoteException {

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
    
    public String getStatus(String Id_Pembayaran) throws RemoteException{
        System.out.println("Client Melakukan Proses Get Status dengan Mengakses Tabel Pembayaran");
        Statement state = null;
        ResultSet rs = null;
        String newStatus = "0";
	try {
            state = (Statement) DatabaseUtilities.getConnection().createStatement();
            String sql = "SELECT STATUS FROM pembayaran WHERE ID_PEMBAYARAN = '"+Id_Pembayaran+"'";
            rs = state.executeQuery(sql);
            while (rs.next()){
                newStatus = rs.getString(1);
            }
        }
        catch (Throwable ex) {
            System.out.println("masuk catch");
        }
        System.out.println(newStatus);
        return newStatus;
    }

}
