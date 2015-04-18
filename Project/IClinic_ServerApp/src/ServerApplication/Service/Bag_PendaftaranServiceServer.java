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
           ResultSet result = statement.getGeneratedKeys();
           if(result.next()){
               pasien.setId_Pasien(result.getString(1));
           }
        result.close();
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
                    "UPDATE pasien SET Id_Pasien = ?," +
                 "Nama_Pasien = ?, Alamat = ?, TTL = ?, Usia = ?, No_Hp = ? " +
                 "WHERE Id_Pasien = ?"
                   );
           statement.setString(1, pasien.getId_Pasien());
           statement.setString(2, pasien.getNama_Pasien());
           statement.setString(3, pasien.getAlamat());
           statement.setDate( 4, new Date(pasien.getTanggal_lahir().getTime()));
           statement.setInt(5, pasien.getUsia());
           statement.setString(6,pasien.getNo_HP());
           statement.setString(7, pasien.getJenis_Kelamin());

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

      

    public void deletePasien(int Id_Pasien) throws RemoteException {
         System.out.println("Client Melakukan Proses Delete pada Tabel Pasien");

        PreparedStatement statement = null;
       try{
           statement = DatabaseUtilities.getConnection().prepareStatement(
                    "DELETE FROM pasien WHERE ID_Pasien = ?");

           statement.setLong(1, Id_Pasien);

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

        
    public Pasien getPasien(int Id_Pasien) throws RemoteException {
         System.out.println("Client Melakukan Proses Get Status dengan Mengakses Tabel Pasien");
        Statement state = null;
        ResultSet rs = null;
        String newStatus = "0";
	try {
            state = (Statement) DatabaseUtilities.getConnection().createStatement();
            String sql = "SELECT STATUS FROM pembayaran WHERE ID_PASIEN = '"+Id_Pasien+"'";
            rs = state.executeQuery(sql);
            while (rs.next()){
                newStatus = rs.getString(1);
            }
        }
        catch (Throwable ex) {
            System.out.println("masuk catch");
        }
       System.out.println("Client Melakukan Proses Get By Id pada Tabel Pasien");
        Pasien pasien = null;
        return pasien;
    }



        

    public List<Pasien> getPasien() throws RemoteException {
        
        
        System.out.println("Client Melakukan Proses Get All pada Tabel Pasien");
        List<Pasien> list = new ArrayList<Pasien>();
        return list;
    }
    
    public Antrian insertAntrian(Antrian antrian) throws RemoteException {
        System.out.println("Client Melakukan Proses Insert pada Tabel Pasien Lama");
         PreparedStatement statement = null;
       try{
           statement = DatabaseUtilities.getConnection().prepareStatement(
                   "INSERT INTO pasien (Id_Pasien,Nama_Pasien,Alamat,TTL,Usia,No_Hp,Jenis_Kelamin) values(?,?,?,?,?,?,?,?)"
                   );
           statement.setInt(1, antrian.getId_Antrian());
           statement.setInt(2, antrian.getId_Pasien());
           statement.setString(3, antrian.getJenis_Antrian());
           statement.setString( 4, antrian.getKeterangan());
           
           
           statement.executeUpdate();
           ResultSet result = statement.getGeneratedKeys();
           if(result.next()){
               antrian.setId_Pasien(result.getInt(1));
           }
        result.close();
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
           statement.setInt(1, antrian.getId_Antrian());
           statement.setInt(2, antrian.getId_Pasien());
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

       
        

    public void deleteAntrian(int Id_Antrian) throws RemoteException {
        System.out.println("Client Melakukan Proses Delete pada Tabel Pendaftaran");

        PreparedStatement statement = null;
       try{
           statement = DatabaseUtilities.getConnection().prepareStatement(
                    "DELETE FROM pembayaran WHERE ID_ANTRIAN = ?");

           statement.setInt(1, Id_Antrian);

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

        

    public Antrian getAntrian(int Id_Antrian) throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel Antrian");
        Antrian antrian = null;
        return antrian;

    }

    public List<Antrian> getAntrian() throws RemoteException {

        System.out.println("Client Melakukan Proses Get All pada Tabel Antrian");
        List<Antrian> list = new ArrayList<Antrian>();
        return list;

    }

}
