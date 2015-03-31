/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ServerApplication.Service;

import Database.Entity.User;
import Database.Service.UserService;
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
public class UserServiceServer extends UnicastRemoteObject implements UserService{

    public UserServiceServer() throws RemoteException {
    }

    public User insertUser(User user) throws RemoteException {
       
       System.out.println("Client Melakukan Proses Insert pada Tabel User");

       PreparedStatement statement = null;
       try{
           statement = DatabaseUtilities.getConnection().prepareStatement(
                   "INSERT INTO user (ID_USER,NAMA_USER,JABATAN,USERNAME,PASSWORD) values(?,?,?,?,?)"
                   );
           statement.setInt(1, user.getId_User());
           statement.setString(2,user.getNama_User());
           statement.setString(3, user.getJabatan());
           statement.setString(4, user.getUsername());
           statement.setString(5, user.getPassword());

           statement.executeUpdate();
           ResultSet result = statement.getGeneratedKeys();
           if(result.next()){
               user.setId_User(result.getInt(1));
           }
        result.close();
        return user;
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

    public void updateUser(User user) throws RemoteException {

        System.out.println("Client Melakukan Proses Update pada Tabel User");

        PreparedStatement statement = null;
       try{
           statement = DatabaseUtilities.getConnection().prepareStatement(
                    "UPDATE user SET NAMA_USER = ?," +
                 "JABATAN = ?, USERNAME = ?, PASSWORD = ? " +
                 "WHERE ID_USER = ?"
                   );

           statement.setString(1, user.getNama_User());
           statement.setString(2, user.getJabatan());
           statement.setString(3, user.getUsername());
           statement.setString(4, user.getPassword());
           statement.setInt(5, user.getId_User());
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

    public void deleteUser(int Id_User) throws RemoteException {

        System.out.println("Client Melakukan Proses Delete pada Tabel User");

        PreparedStatement statement = null;
       try{
           statement = DatabaseUtilities.getConnection().prepareStatement(
                    "DELETE FROM user WHERE ID_USER = ?");


           statement.setLong(1, Id_User);
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

    public User getUser(int Id_User) throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel User");

        PreparedStatement statement = null;
        try{
            statement = DatabaseUtilities.getConnection().prepareStatement(
                 "SELECT * FROM user WHERE ID_USER = ?");

            ResultSet result = statement.executeQuery();

            User user = null;

            if(result.next()){
                user = new User();
                user.setId_User(result.getInt("Id_User"));
                user.setNama_User(result.getString("Nama_User"));
                user.setJabatan(result.getString("Jabatan"));
                user.setUsername(result.getString("Username"));
                user.setPassword(result.getString("Password"));
            }

            return user;

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

    public List<User> getUser() throws RemoteException {

        System.out.println("Client Melakukan Proses Get All pada Tabel User");

        Statement statement = null;
        try{
          statement = DatabaseUtilities.getConnection().createStatement();

          ResultSet result = statement.executeQuery("SELECT * FROM user");

          List<User> list = new ArrayList<User>();

          while(result.next()){
                User user = new User();
                user.setId_User(result.getInt("Id_User"));
                user.setNama_User(result.getString("Nama_User"));
                user.setJabatan(result.getString("Jabatan"));
                user.setUsername(result.getString("Username"));
                user.setPassword(result.getString("Password"));
                list.add(user);
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
