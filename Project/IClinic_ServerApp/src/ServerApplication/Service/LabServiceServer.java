/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ServerApplication.Service;

import Database.Entity.Lab_detailLab;
//import Database.Entity.Lab_tabelMaster;
import java.sql.Blob;
import Database.Service.LabService;
import ServerApplication.Utilities.DatabaseUtilities;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author erin
 */
public class LabServiceServer extends UnicastRemoteObject implements LabService {

    public LabServiceServer() throws RemoteException {
    }

    public Lab_detailLab insertLab_detailLab(Lab_detailLab detail_lab) throws RemoteException {

        System.out.println("Client Melakukan Proses Insert pada Tabel Detail Lab");

        PreparedStatement statement = null;
       try{
           statement = DatabaseUtilities.getConnection().prepareStatement(
                   "INSERT INTO detail_lab (ID_DETAIL_LAB,ID_LAB,ID_PASIEN, KETERANGAN,HASIL,TANGGAL,TOTAL_HARGA) values(?,?,?,?,?,?,?)"
                   );
           statement.setString(1, detail_lab.getId_Detail_Lab());
           statement.setString(2, detail_lab.getId_Lab());
           statement.setString(3, detail_lab.getId_Pasien());
           //statement.setString(2, detail_lab.getnama_Pasien());
           statement.setString(4, detail_lab.getKeterangan());
           statement.setBlob(5, detail_lab.getHasil());
           statement.setDate(6, (Date) detail_lab.getTanggal());
           statement.setInt(7, detail_lab.getTotal_Harga());

           statement.executeUpdate();
           ResultSet result = statement.getGeneratedKeys();
           if(result.next()){
               detail_lab.setId_Lab(result.getString(1));
           }
        result.close();
        return detail_lab;
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
    
//    public Lab_tabelMaster insertLab_tabelMaster(Lab_tabelMaster lab) throws RemoteException {
//
//        System.out.println("Client Melakukan Proses Insert pada Tabel detail lab");
//
//        PreparedStatement statement = null;
//       try{
//           statement = DatabaseUtilities.getConnection().prepareStatement(
//                   "INSERT INTO laboratorium (ID_LAB,JENIS_PEMERIKSAAN,HARGA, DESKRIPSI) values(?,?,?,?)"
//                   );
//           statement.setString(1, lab.getId_Lab());
//           statement.setString(2, lab.getJenis_Pemeriksaan());
//           statement.setInt(3, lab.getHarga());
//           statement.setString(4, lab.getDeskripsi());
//          
//           statement.executeUpdate();
//           ResultSet result = statement.getGeneratedKeys();
//           if(result.next()){
//               lab.setId_Lab(result.getString(1));
//           }
//        result.close();
//        return lab;
//       }catch(SQLException exception){
//        exception.printStackTrace();
//            return null;
//       }finally{
//           if(statement != null){
//               try{
//                   statement.close();
//               }catch(SQLException exception){
//
//               }
//           }
//       }
//    }

//    
    public Lab_detailLab getLab_detailLab(String Id_Detail_Lab) throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel Detail Lab");

        PreparedStatement statement = null;
        try{
            statement = DatabaseUtilities.getConnection().prepareStatement(
                 "SELECT * FROM detail_lab WHERE Id_Lab = ?");

            ResultSet result = statement.executeQuery();

            Lab_detailLab Laboratorium = null;

            if(result.next()){
                Laboratorium = new Lab_detailLab();
                Laboratorium.setId_Lab(result.getString("Id_Detail_Lab"));
                Laboratorium.setId_Lab(result.getString("Id_Lab"));
                Laboratorium.setId_Pasien(result.getString("Id_Pasien"));
//                Laboratorium.setnama_Pasien(result.getString("nama_Pasien"));
                Laboratorium.setKeterangan(result.getString("Keterangan"));
                Laboratorium.setHasil(result.getBlob("Hasil"));
                Laboratorium.setTanggal(result.getDate("Tanggal"));
                Laboratorium.setTotal_Harga(result.getInt("Total_Harga"));
                
            }

            return Laboratorium;

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
    
//    public Lab_tabelMaster getLab_tabelMaster(String Id_Lab) throws RemoteException {
//
//        System.out.println("Client Melakukan Proses Get By Id pada Tabel Pembayaran");
//
//        PreparedStatement statement = null;
//        try{
//            statement = DatabaseUtilities.getConnection().prepareStatement(
//                 "SELECT * FROM detail_lab WHERE Id_Lab = ?");
//
//            ResultSet result = statement.executeQuery();
//
//            Lab_tabelMaster Laboratorium = null;
//
//            if(result.next()){
//                Laboratorium = new Lab_tabelMaster();
//                Laboratorium.setId_Lab(result.getString("Id_Lab"));
//                Laboratorium.setJenis_Pemeriksaan(result.getString("Jenis_Pemeriksaan"));
//                Laboratorium.setHarga(result.getInt("Harga"));
//                Laboratorium.setDeskripsi(result.getString("Deskripsi"));
//               
//            }
//
//            return Laboratorium;
//
//        }catch(SQLException exception){
//          exception.printStackTrace();
//          return null;
//        }finally{
//            if(statement != null){
//                try{
//                    statement.close();
//                }catch(SQLException exception){
//                   exception.printStackTrace();
//                }
//            }
//        }
//    }

    public List<Lab_detailLab> getLab_detailLab() throws RemoteException {
        
        System.out.println("Client Melakukan Proses Get All pada Tabel Pembayaran");

        Statement statement = null;
        try{
          statement = DatabaseUtilities.getConnection().createStatement();

          ResultSet result = statement.executeQuery("SELECT * FROM detail_lab");

          List<Lab_detailLab> list = new ArrayList<Lab_detailLab>();

          while(result.next()){
                Lab_detailLab laboratorium = new Lab_detailLab();
                laboratorium.setId_Detail_Lab(result.getString("Id_Detail_Lab"));
                laboratorium.setId_Lab(result.getString("Id_Lab"));
                laboratorium.setId_Pasien(result.getString("Id_Pasien"));
//                laboratorium.setId_Pasien(result.getString("nama_Pasien"));
                laboratorium.setKeterangan(result.getString("Keterangan"));
                //laboratorium.setHasil(result.getBlob()"Hasil"));
                laboratorium.setTanggal(result.getDate("Tanggal"));
                laboratorium.setTotal_Harga(result.getInt("Total_Harga"));
                
                list.add(laboratorium);
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
    }}



//public List<Lab_tabelMaster> getLab_tabelMaster() throws RemoteException {
//        
//        System.out.println("Client Melakukan Proses Get All pada Tabel Laboratorium");
//
//        Statement statement = null;
//        try{
//          statement = DatabaseUtilities.getConnection().createStatement();
//
//          ResultSet result = statement.executeQuery("SELECT * FROM laboratorium");
//
//          List<Lab_tabelMaster> list = new ArrayList<Lab_tabelMaster>();
//
//          while(result.next()){
//                Lab_tabelMaster laboratorium = new Lab_tabelMaster();
//                laboratorium.setId_Lab(result.getString("Id_Lab"));
//                laboratorium.setHarga(result.getInt("Harga"));
//                laboratorium.setDeskripsi(result.getString("Deskripsi"));
//               
//               
//                list.add(laboratorium);
//          }
//
//          result.close();
//
//          return list;
//
//        }catch(SQLException exception){
//          exception.printStackTrace();
//          return null;
//        }finally{
//            if(statement != null){
//                try{
//                    statement.close();
//                }catch(SQLException exception){
//                   exception.printStackTrace();
//                }
//            }
//        }
//    }
//
//}
