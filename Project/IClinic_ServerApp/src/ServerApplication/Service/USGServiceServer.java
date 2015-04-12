/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ServerApplication.Service;

import Database.Entity.USG;
import Database.Service.USGService;
import ServerApplication.Utilities.DatabaseUtilities;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
//import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Arlin
 */
public class USGServiceServer extends UnicastRemoteObject implements USGService {
 

    public USGServiceServer() throws RemoteException {
    }

    public USG insertUSG(USG usg) throws RemoteException {
   

        System.out.println("Client Melakukan Proses Insert pada Tabel usg");

        PreparedStatement statement = null;
       try{
           statement = DatabaseUtilities.getConnection().prepareStatement(
                   "INSERT INTO usg (ID_USG,ID_PASIEN,HASIL,HARGA,DESKRIPSI) values(?,?,?,?,?)"
                   );
           statement.setString(1, usg.getId_USG());
           statement.setString(2, usg.getId_pasien());
           statement.setLong(3, usg.getHasil());
           statement.setInt(4, usg.getHarga());
           statement.setString(5, usg.getDeskripsi());

           statement.executeUpdate();
           ResultSet result = statement.getGeneratedKeys();
           if(result.next()){
               usg.setId_USG(result.getString(1));
           }
        result.close();
        return usg;
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

//    public void updateUSG(USG usg) throws RemoteException {
//
//        System.out.println("Client Melakukan Proses Update pada Tabel USG");
//
//        PreparedStatement statement = null;
//       try{
//           statement = DatabaseUtilities.getConnection().prepareStatement(
//                 "UPDATE pembayaran SET ID_PASIEN = ?," +
//                 "HASIL = ?, HARGA = ?, DESKRIPSI = ? " +
//                 "WHERE ID_USG = ?"
//                   );
//           statement.setString(1, usg.getId_USG());
//           statement.setString(2, usg.getId_pasien());
//           statement.setLong(3, usg.getHasil());
//           statement.setInt(4, usg.getHarga());
//           statement.setString(5, usg.getDeskripsi());
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

//    public void deleteUSG(String Id_USG) throws RemoteException {
//
//        System.out.println("Client Melakukan Proses Delete pada Tabel USG");
//
//        PreparedStatement statement = null;
//       try{
//           statement = DatabaseUtilities.getConnection().prepareStatement(
//                    "DELETE FROM usg WHERE ID_USG = ?");
//
//           statement.setLong(1, Id_USG);
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

    public USG getUSG(String Id_USG) throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel Pembayaran");

        PreparedStatement statement = null;
        try{
            statement = DatabaseUtilities.getConnection().prepareStatement(
                 "SELECT * FROM usg WHERE ID_USG = ?");

            ResultSet result = statement.executeQuery();

            USG usg = null;

            if(result.next()){
                usg = new USG();
                usg.setId_USG(result.getString("Id_USG"));
                usg.setId_pasien(result.getString("Id_Pasien"));
                usg.setHasil(result.getLong("Hasil"));
                usg.setHarga(result.getInt("Harga"));
                usg.setDeskripsi(result.getString("Deskripsi"));
            }

            return usg;

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

    public List<USG> getUSG() throws RemoteException {
        
        System.out.println("Client Melakukan Proses Get All pada Tabel USG");

        Statement statement = null;
        try{
          statement = DatabaseUtilities.getConnection().createStatement();

          ResultSet result = statement.executeQuery("SELECT * FROM USG");

          List<USG> list = new ArrayList<USG>();

          while(result.next()){
                USG usg = new USG();
                usg.setId_USG(result.getString("ID_USG"));
                usg.setId_pasien(result.getString("Id_PASIEN"));
                usg.setHasil(result.getLong("HASIL"));
                usg.setHarga(result.getInt("HARGA"));
                usg.setDeskripsi(result.getString("DESKRIPSI"));
                list.add(usg);
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

//    public USG getUSG(int Id_USG) throws RemoteException {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

   

}
