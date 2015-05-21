/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ServerApplication.Service;

import Database.Entity.Antrian;
import Database.Entity.Pasien;
import Database.Service.Bag_PendaftaranService;
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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tiara Ratna Sari
 */
public class Bag_PendaftaranServiceServer extends UnicastRemoteObject implements Bag_PendaftaranService {

    public Bag_PendaftaranServiceServer() throws RemoteException {
    }
    @Override
    public void insertPasien(Pasien pasien) throws RemoteException {
        System.out.println("Client Melakukan Proses Insert pada Tabel Pasien Lama");
         PreparedStatement statement = null;
       try{
           statement = DatabaseUtilities.getConnection().prepareStatement(
                   "INSERT INTO pasien (ID_PASIEN,NO_KTP, NAMA_PASIEN,ALAMAT,TGL_LAHIR,TGL_DAFTAR, USIA,NO_HP,JENIS_KELAMIN) values(?,?,?,?,?,?,?,?,?)"
                   );
           statement.setString(1, pasien.getId_Pasien());
           statement.setString(2, pasien.getNo_Ktp());
           statement.setString(3, pasien.getNama_Pasien());
           statement.setString(4, pasien.getAlamat());
           statement.setDate( 5,new Date(pasien.getTanggal_lahir().getTime()));
           statement.setDate( 6,new Date(pasien.getTanggal_Daftar().getTime()));
           statement.setInt(7, pasien.getUsia());
           statement.setString(8,pasien.getNo_HP());
           statement.setString(9, pasien.getJenis_Kelamin());
           
           statement.executeUpdate();
//           ResultSet result = statement.getGeneratedKeys();
//           if(result.next()){
//               pasien.setId_Pasien(result.getString(1));
//           }
//        result.close();
       }catch(SQLException exception){
        exception.printStackTrace();
       }finally{
           if(statement != null){
               try{
                   statement.close();
               }catch(SQLException exception){

               }
           }
       }
    
}

    public void updatePasien(Pasien pasien) throws RemoteException {
        System.out.println("Client Melakukan Proses Update pada Tabel Pasien Lama");

        PreparedStatement statement = null;
       try{
           statement = DatabaseUtilities.getConnection().prepareStatement(
                   " UPDATE pasien SET NO_KTP = ?, NAMA_PASIEN = ?, ALAMAT = ?,TGL_LAHIR=?,USIA=?,NO_HP=?,JENIS_KELAMIN=? WHERE ID_PASIEN = ?;"
                   );
           
           statement.setString(1, pasien.getNo_Ktp());
           statement.setString(2, pasien.getNama_Pasien());
           statement.setString(3, pasien.getAlamat());
           statement.setDate( 4,new Date(pasien.getTanggal_lahir().getTime()));
           statement.setInt(5, pasien.getUsia());
           statement.setString(6,pasien.getNo_HP());
           statement.setString(7, pasien.getJenis_Kelamin());
           statement.setString(8, pasien.getId_Pasien());

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

      

//    public void deletePasien(int Id_Pasien) throws RemoteException {
//         System.out.println("Client Melakukan Proses Delete pada Tabel Pasien");
//
//        PreparedStatement statement = null;
//       try{
//           statement = DatabaseUtilities.getConnection().prepareStatement(
//                    "DELETE FROM pasien WHERE ID_Pasien = ?");
//
//           statement.setLong(1, Id_Pasien);
//
//           statement.executeUpdate();
//
//       }catch(SQLException exception){
//        exception.printStackTrace();
//       }finally{
//           if(statement != null){
//               try{
//                   statement.close();
//               }catch(SQLException exception){
//                exception.printStackTrace();
//               }
//           }
//       }
//    }

    public Pasien getPasien(String Id_Pasien) throws RemoteException {
        System.out.println("Client Melakukan Proses Get By Id pada Tabel Pasien");

        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "SELECT * FROM pasien WHERE ID_PASIEN = '"+Id_Pasien+"'");

            ResultSet result = statement.executeQuery();

            Pasien pasien = null;

            if (result.next()) {
                pasien = new Pasien();
                pasien.setId_Pasien(result.getString("ID_PASIEN"));
                pasien.setNama_Pasien(result.getString("NAMA_PASIEN"));
                pasien.setAlamat(result.getString("ALAMAT"));
                pasien.setTanggal_Lahir(result.getDate("TGL_LAHIR"));
                pasien.setUsia(result.getInt("USIA"));
                pasien.setNo_HP(result.getString("NO_HP"));
                pasien.setJenis_Kelamin(result.getString("JENIS_KELAMIN"));
            }

            return pasien;

        } catch (SQLException exception) {
            exception.printStackTrace();
            return null;
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException exception) {
                    exception.printStackTrace();
                }
            }
        }
    }


        

    public Pasien getPasien(int Pasien) throws RemoteException {
        
        
       System.out.println("Client Melakukan Proses Get By Id pada Tabel Pasien");

        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "SELECT * FROM obat WHERE ID_PASIEN = '"+Pasien+"'");

            ResultSet result = statement.executeQuery();

            Pasien pasien = null;

            if (result.next()) {
                pasien = new Pasien();
                pasien.setId_Pasien(result.getString("ID_PASIEN"));
                pasien.setNama_Pasien(result.getString("NAMA_PASIEN"));
                pasien.setNo_Ktp(result.getString("NO_KTP"));
                pasien.setAlamat(result.getString("ALAMAT"));
                pasien.setUsia(result.getInt("USIA"));
                pasien.setJenis_Kelamin(result.getString("JENIS_KELAMIN"));
                pasien.setNo_HP(result.getString("NO_HP"));
                pasien.setTanggal_Daftar(result.getDate("TGL_DAFTAR"));
                pasien.setTanggal_Lahir(result.getDate("TGL_LAHIR"));
                
            }

            return pasien;

        } catch (SQLException exception) {
            exception.printStackTrace();
            return null;
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException exception) {
                    exception.printStackTrace();
                }
            }
        }
    }
    
    public Antrian insertAntrian(Antrian antrian) throws RemoteException {
        System.out.println("Client Melakukan Proses Insert pada Tabel Antrian");
         PreparedStatement statement = null;
       try{
           statement = DatabaseUtilities.getConnection().prepareStatement(
                   "INSERT INTO antrian (ID_ANTRIAN, ID_PASIEN, JENIS_ANTRIAN, KETERANGAN) "
                    + "VALUES (?,?,?,'BELUM')");
           statement.setString(1, antrian.getId_Antrian());
           statement.setString(2, antrian.getId_Pasien());
           statement.setString(3, antrian.getJenis_Antrian());
//           statement.setString(4, antrian.getKeterangan());
           
           statement.executeUpdate();
            return antrian;
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

    public void updateAntrian(Antrian antrian) throws RemoteException {
         System.out.println("Client Melakukan Proses Update pada Tabel Antrian");

        PreparedStatement statement = null;
       try{
           statement = DatabaseUtilities.getConnection().prepareStatement(
                    "UPDATE antrian SET Id_Antrian = ?," +
                 "Id_Pasien = ?, Jenis_Antrian = ?, Keterangan = ? " +
                 "WHERE Id_Antrian = ?"
                   );
           statement.setString(1, antrian.getId_Antrian());
           statement.setString(2, antrian.getId_Pasien());
           statement.setString(3, antrian.getJenis_Antrian());
           statement.setString(4, antrian.getKeterangan());
           

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

    public String getAutoNumberAntrian() throws RemoteException {
        System.out.println("Client Melakukan Proses Auto Number dengan Mengakses Tabel Antrian");
        Statement state = null;
        ResultSet rs = null;

        String number = "";
        String nomerBaru = "";
        int numberBaru = 0;
        try {
            state = (Statement) DatabaseUtilities.getConnection().createStatement();
            String sql = "SELECT ID_ANTRIAN FROM antrian ORDER BY ID_ANTRIAN DESC limit 1";
            rs = state.executeQuery(sql);
            while (rs.next()) {
                number = rs.getString(1);
            }
            System.out.println(number);
        } catch (Throwable ex) {
            System.out.println("masuk catch");
        }
        System.out.println(number);
        if (number.equals("")) {
            nomerBaru = "ANT0001";
        } else {
            String[] pisah = number.split("(?<=\\G.{1})");
            String numbersebelumnya = pisah[3] + pisah[4] + pisah[5] + pisah[6];
            numberBaru = Integer.parseInt(numbersebelumnya) + 1;
            String[] pisah1 = String.valueOf(numberBaru).split("(?<=\\G.{1})");
            String nol = "";
            if (pisah1.length == 1) {
                nol = "000";
            } else if (pisah1.length == 2) {
                nol = "00";
            } else if (pisah1.length == 3) {
                nol = "0";
            }
            nomerBaru = "ANT" + nol + numberBaru;
        }
        System.out.println(nomerBaru);
        return nomerBaru;

    }
       
        

    public void deleteAntrian(String Id_Antrian) throws RemoteException {
        System.out.println("Client Melakukan Proses Delete pada Tabel Pendaftaran");

        PreparedStatement statement = null;
       try{
           statement = DatabaseUtilities.getConnection().prepareStatement(
                    "DELETE FROM pembayaran WHERE ID_ANTRIAN = ?");

           statement.setString(1, Id_Antrian);

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

        

    public Antrian getAntrian(String Id_Antrian) throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel Antrian");
        Antrian antrian = null;
        return antrian;

    }

    public List<Antrian> getAntrian() throws RemoteException {

        System.out.println("Client Melakukan Proses Get All pada Tabel Antrian");
        List<Antrian> list = new ArrayList<Antrian>();
        return list;

    }

    public List<Pasien> getPasien() throws RemoteException {
        System.out.println("Client Melakukan Proses Get All pada Tabel Pasien");

        Statement statement = null;
        try{
          statement = DatabaseUtilities.getConnection().createStatement();

          ResultSet result = statement.executeQuery("SELECT * FROM pasien");

          List<Pasien> list = new ArrayList<Pasien>();

          while(result.next()){
                Pasien pasien = new Pasien();
                pasien.setId_Pasien(result.getString("ID_PASIEN"));
                pasien.setNo_Ktp(result.getString("NO_KTP"));
                pasien.setNama_Pasien(result.getString("NAMA_PASIEN"));
                pasien.setAlamat(result.getString("ALAMAT"));
                pasien.setTanggal_Lahir(result.getDate("TGL_LAHIR"));
                pasien.setTanggal_Daftar(result.getDate("TGL_DAFTAR"));
                pasien.setUsia(result.getInt("USIA"));
                pasien.setNo_HP(result.getString("NO_HP"));
                pasien.setJenis_Kelamin(result.getString("JENIS_KELAMIN"));
                list.add(pasien);
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
    public String getAutoNumber() throws RemoteException {
        System.out.println("Client Melakukan Proses Auto Number dengan Mengakses Tabel Pasien");
        Statement state = null;
        ResultSet rs = null;

        String number = "";
        String nomerBaru = "";
        int numberBaru = 0;
        try {
            state = (Statement) DatabaseUtilities.getConnection().createStatement();
            String sql = "SELECT ID_PASIEN FROM pasien ORDER BY ID_PASIEN DESC limit 1";
            rs = state.executeQuery(sql);
            while (rs.next()) {
                number = rs.getString(1);
            }
            System.out.println(number);
        } catch (Throwable ex) {
            System.out.println("masuk catch");
        }
        System.out.println(number);
        if (number.equals("")) {
            nomerBaru = "P0001";
        } else {
            String[] pisah = number.split("(?<=\\G.{1})");
            String numbersebelumnya = pisah[1] + pisah[2] + pisah[3]+ pisah[4];
            numberBaru = Integer.parseInt(numbersebelumnya) + 1;
            String[] pisah1 = String.valueOf(numberBaru).split("(?<=\\G.{1})");
            String nol = "";
            if (pisah1.length == 1) {
                nol = "000";
            } else if (pisah1.length == 2) {
                nol = "00";
            } else if(pisah1.length==3){
                nol = "0";
            }
            nomerBaru = "P" + nol + numberBaru;
        }
        System.out.println(nomerBaru);
        return nomerBaru;
    }
    }


