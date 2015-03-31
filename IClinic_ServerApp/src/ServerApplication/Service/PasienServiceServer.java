/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ServerApplication.Service;

import Database.Entity.Pasien;
import Database.Service.PasienService;
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
public class PasienServiceServer extends UnicastRemoteObject implements PasienService {

    public PasienServiceServer() throws RemoteException {
    }

    public Pasien insertPasien(Pasien pasien) throws RemoteException {

        System.out.println("Client Melakukan Proses Insert pada Tabel Pasien");

        PreparedStatement statement = null;
       try{
           statement = DatabaseUtilities.getConnection().prepareStatement(
                   "INSERT INTO pasien (ID_PASIEN,NAMA_PASIEN,ALAMAT,TTL,USIA,NO_HP,JENIS_KELAMIN) values(?,?,?,?,?,?,?)"
                   );
           statement.setInt(1, pasien.getId_Pasien());
           statement.setString(2, pasien.getNama_Pasien());
           statement.setString(3, pasien.getAlamat());
           statement.setDate(4, (Date) pasien.getTTL());
           statement.setInt(5, pasien.getUsia());
           statement.setString(6, pasien.getNo_HP());
           statement.setString(7, pasien.getJenis_Kelamin());

           statement.executeUpdate();
           ResultSet result = statement.getGeneratedKeys();
           if(result.next()){
               pasien.setId_Pasien(result.getInt(1));
           }
        result.close();
        return pasien;
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

    public void updatePasien(Pasien pasien) throws RemoteException {

        System.out.println("Client Melakukan Proses Update pada Tabel Pasien");

        PreparedStatement statement = null;
       try{
           statement = DatabaseUtilities.getConnection().prepareStatement(
                    "UPDATE pasien SET NAMA_PASIEN = ?," +
                 "ALAMAT = ?, TTL = ?, USIA = ?, NO_HP = ?, JENIS_KELAMIN = ? " +
                 "WHERE ID_PASIEN = ?"
                   );
           statement.setString(1, pasien.getNama_Pasien());
           statement.setString(2, pasien.getAlamat());
           statement.setDate(3, (Date) pasien.getTTL());
           statement.setInt(4, pasien.getUsia());
           statement.setString(5, pasien.getNo_HP());
           statement.setString(6, pasien.getJenis_Kelamin());
           statement.setInt(7, pasien.getId_Pasien());

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
                    "DELETE FROM pasien WHERE ID_PASIEN = ?");

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

        System.out.println("Client Melakukan Proses Get By Id pada Tabel Pasien");

        PreparedStatement statement = null;
        try{
            statement = DatabaseUtilities.getConnection().prepareStatement(
                 "SELECT * FROM pasien WHERE ID_PASIEN = ?");

            ResultSet result = statement.executeQuery();

            Pasien pasien = null;

            if(result.next()){
                pasien = new Pasien();
                pasien.setId_Pasien(result.getInt("Id_Pasien"));
                pasien.setNama_Pasien(result.getString("Nama_Pasien"));
                pasien.setAlamat(result.getString("Alamat"));
                pasien.setTTL(result.getDate("TTL"));
                pasien.setUsia(result.getInt("Usia"));
                pasien.setNo_HP(result.getString("No_HP"));
                pasien.setJenis_Kelamin(result.getString("Jenis_Kelamin"));
            }

            return pasien;

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

    public List<Pasien> getPasien() throws RemoteException {
        
        System.out.println("Client Melakukan Proses Get All pada Tabel Pasien");

        Statement statement = null;
        try{
          statement = DatabaseUtilities.getConnection().createStatement();

          ResultSet result = statement.executeQuery("SELECT * FROM pasien");

          List<Pasien> list = new ArrayList<Pasien>();

          while(result.next()){
                Pasien pasien = new Pasien();
                pasien.setId_Pasien(result.getInt("Id_Pasien"));
                pasien.setNama_Pasien(result.getString("Nama_Pasien"));
                pasien.setAlamat(result.getString("Alamat"));
                pasien.setTTL(result.getDate("TTL"));
                pasien.setUsia(result.getInt("Usia"));
                pasien.setNo_HP(result.getString("No_HP"));
                pasien.setJenis_Kelamin(result.getString("Jenis_Kelamin"));
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

}
