/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ServerApplication.Service;

import Database.Entity.Obat_detailResep;
import Database.Entity.Obat_resep;
import Database.Entity.Obat_tabelMaster;
import Database.Service.ApotekerService;
import ServerApplication.Utilities.DatabaseUtilities;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rindu Puspita
 */
public class ApotekerServiceServer extends UnicastRemoteObject implements ApotekerService{

    public ApotekerServiceServer() throws RemoteException {
    }

    public Obat_tabelMaster insertObat_tabelMaster(Obat_tabelMaster obat) throws RemoteException {

        System.out.println("Client Melakukan Proses Insert pada Tabel Obat");
        PreparedStatement statement = null;
       try{
           statement = DatabaseUtilities.getConnection().prepareStatement(
                   "INSERT INTO obat (ID_OBAT,NAMA_OBAT,JENIS_OBAT,HARGA_OBAT,SATUAN) values(?,?,?,?,?,?,?,?)"
                   );
           statement.setString(1, obat.getId_Obat());
           statement.setString(2, obat.getNama_Obat());
           statement.setString(3, obat.getJenis_Obat());
           statement.setInt(4, obat.getHarga_Obat());
           statement.setInt(5, obat.getSatuan());
           
           statement.executeUpdate();
           ResultSet result = statement.getGeneratedKeys();
           if(result.next()){
               obat.setId_Obat(result.getString(1));
           }
        result.close();
        return obat;
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
    
    public void updateObat_tabelMaster(Obat_tabelMaster obat) throws RemoteException {

        System.out.println("Client Melakukan Proses Update pada Tabel Obat");
        PreparedStatement statement = null;
       try{
           statement = DatabaseUtilities.getConnection().prepareStatement(
                    "UPDATE obat SET NAMA_OBAT = ?," +
                 "JENIS_OBAT = ?, HARGA_OBAT = ?, SATUAN = ?"
                   );
           statement.setString(1, obat.getId_Obat());
           statement.setString(2, obat.getNama_Obat());
           statement.setString(3, obat.getJenis_Obat());
           statement.setInt(4, obat.getHarga_Obat());
           statement.setInt(5, obat.getSatuan());

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
    
    public void deleteObat_tabelMaster(int Id_Obat) throws RemoteException {

        System.out.println("Client Melakukan Proses Delete pada Tabel Obat");
        PreparedStatement statement = null;
       try{
           statement = DatabaseUtilities.getConnection().prepareStatement(
                    "DELETE FROM obat WHERE ID_OBAT = ?");

           statement.setLong(1, Id_Obat);

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

    public Obat_tabelMaster getObat_tabelMaster(int Id_Obat) throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel Obat");

        PreparedStatement statement = null;
        try{
            statement = DatabaseUtilities.getConnection().prepareStatement(
                 "SELECT * FROM obat WHERE ID_Obat = ?");

            ResultSet result = statement.executeQuery();
            
        Obat_tabelMaster obat = null;
        
        if(result.next()){
                obat = new Obat_tabelMaster();
                obat.setId_Obat(result.getString("Id_Obat"));
                obat.setNama_Obat(result.getString("Nama_Obat"));
                obat.setJenis_Obat(result.getString("Jenis_Obat"));
                obat.setHarga_Obat(result.getInt("Harga_Obat"));
                obat.setSatuan(result.getInt("Satuan"));
            }
        
        return obat;
        
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

    public List<Obat_tabelMaster> getObat_tabelMaster() throws RemoteException {

        System.out.println("Client Melakukan Proses Get All pada Tabel Obat");

        Statement statement = null;
        try{
          statement = DatabaseUtilities.getConnection().createStatement();

          ResultSet result = statement.executeQuery("SELECT * FROM__obat");

        List<Obat_tabelMaster> list = new ArrayList<Obat_tabelMaster>();
        
         while(result.next()){
                Obat_tabelMaster obat = new Obat_tabelMaster();
                obat.setId_Obat(result.getString("Id_Obat"));
                obat.setNama_Obat(result.getString("Nama_Obat"));
                obat.setJenis_Obat(result.getString("Jenis_Obat"));
                obat.setHarga_Obat(result.getInt("Harga_Obat"));
                obat.setSatuan(result.getInt("Satuan"));
                list.add(obat);
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
    public Obat_detailResep insertObat_detailResep(Obat_detailResep detail_resep) throws RemoteException {

        System.out.println("Client Melakukan Proses Insert pada Tabel Detail Resep");
        PreparedStatement statement = null;
       try{
           statement = DatabaseUtilities.getConnection().prepareStatement(
                   "INSERT INTO detail_resep (NO_DETAIL_RESEP,ID_RESEP,ID_OBAT,TAKARAN,PEMAKAIAN,JUMLAH,KETERANGAN) values(?,?,?,?,?,?,?,?)"
                   );
           statement.setString(1, detail_resep.getNo_Detail_Resep());
           statement.setString(2, detail_resep.getId_Resep());
           statement.setString(3, detail_resep.getId_Obat());
           statement.setString(4, detail_resep.getTakaran());
           statement.setString(5, detail_resep.getPemakaian());
           statement.setInt(6, detail_resep.getJumlah());
           statement.setString(7, detail_resep.getKeterangan());
           
           statement.executeUpdate();
           ResultSet result = statement.getGeneratedKeys();
           if(result.next()){
               detail_resep.setNo_Detail_Resep(result.getString(1));
           }
        result.close();
        return detail_resep;
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
    

    public void updateObat_detailResep(Obat_detailResep detail_resep) throws RemoteException {

        System.out.println("Client Melakukan Proses Update pada Tabel Detail Resep");

        PreparedStatement statement = null;
       try{
           statement = DatabaseUtilities.getConnection().prepareStatement(
                    "UPDATE detail_resep SET NO_DETAIL_RESEP = ?," +
                 "ID_RESEP = ?, ID_OBAT = ?, TAKARAN = ?, "
                   + "PEMAKAIAN = ?, JUMLAH = ?, KETERANGAN = ?"
                   );
           statement.setString(1, detail_resep.getNo_Detail_Resep());
           statement.setString(2, detail_resep.getId_Resep());
           statement.setString(3, detail_resep.getId_Obat());
           statement.setString(4, detail_resep.getTakaran());
           statement.setString(5, detail_resep.getPemakaian());
           statement.setInt(6, detail_resep.getJumlah());
           statement.setString(7, detail_resep.getKeterangan());

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

    public void deleteObat_detailResep(int Id_Obat) throws RemoteException {

        System.out.println("Client Melakukan Proses Delete pada Tabel Detail Resep");

        PreparedStatement statement = null;
       try{
           statement = DatabaseUtilities.getConnection().prepareStatement(
                    "DELETE FROM detail_resep WHERE NO_DETAIL_RESEP = ?");

           statement.setLong(1, Id_Obat);

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

    public Obat_detailResep getObat_detailResep(int Id_Obat) throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel Detail Resep");

        PreparedStatement statement = null;
        try{
            statement = DatabaseUtilities.getConnection().prepareStatement(
                 "SELECT * FROM detail_resep WHERE No_Detail_Resep = ?");

            ResultSet result = statement.executeQuery();
            
        Obat_detailResep detail_resep = null;
        
        if(result.next()){
                detail_resep = new Obat_detailResep();
                detail_resep.setNo_Detail_Resep(result.getString("No_Detail_Resep"));
                detail_resep.setId_Resep(result.getString("Id_Resep"));
                detail_resep.setId_Obat(result.getString("Id_Obat"));
                detail_resep.setTakaran(result.getString("Takaran"));
                detail_resep.setPemakaian(result.getString("Pemakaian"));
                detail_resep.setJumlah(result.getInt("Jumlah"));
                detail_resep.setKeterangan(result.getString("Keterangan"));
            }
        
        return detail_resep;
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

    public List<Obat_detailResep> getObat_detailResep(String ID_RESEP) throws RemoteException {

        System.out.println("Client Melakukan Proses Get All pada Tabel Detail Resep");

         Statement statement = null;
        try{
          statement = DatabaseUtilities.getConnection().createStatement();

          ResultSet result = statement.executeQuery("SELECT * FROM detail_resep WHERE ID_RESEP = '"+ID_RESEP+"'");

        List<Obat_detailResep> list = new ArrayList<Obat_detailResep>();
        
        while(result.next()){
                Obat_detailResep detail_resep = new Obat_detailResep();
                detail_resep.setNo_Detail_Resep(result.getString("No_Detail_Resep"));
                detail_resep.setId_Resep(result.getString("Id_Resep"));
                detail_resep.setId_Obat(result.getString("Id_Obat"));
                detail_resep.setTakaran(result.getString("Takaran"));
                detail_resep.setPemakaian(result.getString("Pemakaian"));
                detail_resep.setJumlah(result.getInt("Jumlah"));
                detail_resep.setKeterangan(result.getString("Keterangan"));
                list.add(detail_resep);
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
    
    public Obat_resep insertObat_resep(Obat_resep resep) throws RemoteException {

        System.out.println("Client Melakukan Proses Insert pada Tabel Obat");
         PreparedStatement statement = null;
       try{
           statement = DatabaseUtilities.getConnection().prepareStatement(
                   "INSERT INTO resep (ID_RESEP,ID_REKAM,TOTAL_HARGA) values(?,?,?,?,?,?,?,?)"
                   );
           statement.setString(1, resep.getId_Resep());
           statement.setString(2, resep.getId_Rekam());
           statement.setInt(3, resep.getTotal_Harga());
     
           statement.executeUpdate();
           ResultSet result = statement.getGeneratedKeys();
           if(result.next()){
               resep.setId_Resep(result.getString(1));
           }
        result.close();
        return resep;
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

    public void updateObat_resep(Obat_resep resep) throws RemoteException {

        System.out.println("Client Melakukan Proses Update pada Tabel Obat");
PreparedStatement statement = null;
       try{
           statement = DatabaseUtilities.getConnection().prepareStatement(
                    "UPDATE obat SET ID_RESEP = ?," +
                 "ID_REKAM = ?, TOTAL_HARGA = ? "
                   );
           statement.setString(1, resep.getId_Resep());
           statement.setString(2, resep.getId_Rekam());
           statement.setInt(3, resep.getTotal_Harga());

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

    public void deleteObat_resep(int Id_Obat) throws RemoteException {

        System.out.println("Client Melakukan Proses Delete pada Tabel Obat");
PreparedStatement statement = null;
       try{
           statement = DatabaseUtilities.getConnection().prepareStatement(
                    "DELETE FROM resep WHERE ID_RESEP = ?");

           statement.setLong(1, Id_Obat);

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

    public Obat_resep getObat_resep(int Id_Obat) throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel Obat");

        PreparedStatement statement = null;
        try{
            statement = DatabaseUtilities.getConnection().prepareStatement(
                 "SELECT * FROM resep WHERE ID_Resep = ?");

            ResultSet result = statement.executeQuery();
            
        Obat_resep resep = null;
        
        if(result.next()){
                resep = new Obat_resep();
                resep.setId_Resep(result.getString("Id_Resep"));
                resep.setId_Rekam(result.getString("Id_Rekam"));
                resep.setTotal_Harga(result.getInt("Total_Harga"));
                
            }
        return resep;
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

    public List<Obat_resep> getObat_resep() throws RemoteException {

        System.out.println("Client Melakukan Proses Get All pada Tabel Obat");

        Statement statement = null;
        try{
          statement = DatabaseUtilities.getConnection().createStatement();

          ResultSet result = statement.executeQuery("SELECT * FROM__detail_resep");

        List<Obat_resep> list = new ArrayList<Obat_resep>();
         while(result.next()){
                Obat_resep resep = new Obat_resep();
                resep.setId_Resep(result.getString("Id_Resep"));
                resep.setId_Rekam(result.getString("Id_Rekam"));
                resep.setTotal_Harga(result.getInt("Total_Harga"));
                list.add(resep);
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
