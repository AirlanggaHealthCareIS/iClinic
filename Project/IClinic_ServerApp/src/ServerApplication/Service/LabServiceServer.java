/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ServerApplication.Service;

import Database.Entity.Lab_detailLab;
import Database.Entity.Lab_tabelMaster;
import Database.Entity.Pembayaran;
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
        try {
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
            if (result.next()) {
                detail_lab.setId_Lab(result.getString(1));
            }
            result.close();
            return detail_lab;
        } catch (SQLException exception) {
            exception.printStackTrace();
            return null;
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException exception) {

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
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "SELECT * FROM detail_lab WHERE Id_Lab = ?");

            ResultSet result = statement.executeQuery();

            Lab_detailLab Laboratorium = null;

            if (result.next()) {
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

    public Lab_tabelMaster getLab_tabelMaster(String Id_Lab) throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel Pembayaran");

        PreparedStatement statement = null;
        try{
            statement = DatabaseUtilities.getConnection().prepareStatement(
                 "SELECT * FROM detail_lab WHERE Id_Lab = ?");

            ResultSet result = statement.executeQuery();

            Lab_tabelMaster Laboratorium = null;

            if(result.next()){
                Laboratorium = new Lab_tabelMaster();
                Laboratorium.setId_Lab(result.getString("Id_Lab"));
                Laboratorium.setJenis_Pemeriksaan(result.getString("Jenis_Pemeriksaan"));
                Laboratorium.setHarga(result.getInt("Harga"));
                Laboratorium.setDeskripsi(result.getString("Deskripsi"));
               
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
    public List<Lab_detailLab> getLab_detailLab() throws RemoteException {

        System.out.println("Client Melakukan Proses Get All pada Tabel Pembayaran");

        Statement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().createStatement();

            ResultSet result = statement.executeQuery("SELECT * FROM detail_lab");

            List<Lab_detailLab> list = new ArrayList<Lab_detailLab>();

            while (result.next()) {
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
public List<Lab_tabelMaster> getLab_tabelMaster() throws RemoteException {
        
        System.out.println("Client Melakukan Proses Get All pada Tabel Laboratorium");

        Statement statement = null;
        try{
          statement = DatabaseUtilities.getConnection().createStatement();

          ResultSet result = statement.executeQuery("SELECT * FROM laboratorium");

          List<Lab_tabelMaster> list = new ArrayList<Lab_tabelMaster>();

          while(result.next()){
                Lab_tabelMaster laboratorium = new Lab_tabelMaster();
                laboratorium.setId_Lab(result.getString("Id_Lab"));
                laboratorium.setHarga(result.getInt("Harga"));
                laboratorium.setDeskripsi(result.getString("Deskripsi"));
               
               
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
    

}

    //-----Pembayaran-----//
    public String mencariIdPembayaranDariPembayaran(String idPasien) throws RemoteException {
        System.out.println("Client Melakukan Proses Pencarian ID PEMBAYARAN dengan Mengakses Tabel Pembayaran");
        java.sql.Date date = new java.sql.Date(new java.util.Date().getTime());
        Statement state = null;
        ResultSet rs = null;
        String idPembayaran = "";
        try {
            state = (Statement) DatabaseUtilities.getConnection().createStatement();
            String sql = "SELECT `pembayaran`.ID_PEMBAYARAN \n"
                    + "FROM `pembayaran`,`detail_lab` \n"
                    + "WHERE `detail_lab`.ID_PASIEN = `pembayaran`.ID_PASIEN \n"
                    + "AND `pembayaran`.ID_PASIEN = '" + idPasien + "' \n"
                    + "AND `detail_lab`.TANGGAL = `pembayaran`.TANGGAL_BAYAR \n"
                    + "AND `pembayaran`.TANGGAL_BAYAR = '" + date + "' \n"
                    + "AND `pembayaran`.STATUS = 'HUTANG'";
            rs = state.executeQuery(sql);
            while (rs.next()) {
                idPembayaran = rs.getString(1);
            }
        } catch (Throwable ex) {
            System.out.println("masuk catch");
        }
        System.out.println(idPembayaran);
        return idPembayaran;
    }
    
    public Pembayaran getPembayaranDariPembayaran (String idPembayaran)throws RemoteException {
        System.out.println("Client Melakukan Proses Pencarian get PEMBAYARAN dengan Mengakses Tabel Pembayaran");
        java.sql.Date date = new java.sql.Date(new java.util.Date().getTime());
        System.out.println(date);
        PreparedStatement statement = null;
        Pembayaran pembayaranDB = null ;
        try{
            statement = DatabaseUtilities.getConnection().prepareStatement(
            "SELECT `pembayaran`.* \n" +
            "FROM `pembayaran` \n" +
            "WHERE `pembayaran`.ID_PEMBAYARAN = '"+idPembayaran+"'");
            
            ResultSet result = statement.executeQuery();

            if(result.next()){
                pembayaranDB = new Pembayaran();
                pembayaranDB.setId_Pembayaran(result.getString("Id_Pembayaran"));
                pembayaranDB.setId_Pasien(result.getString("Id_Pasien"));
                pembayaranDB.setId_USG(result.getString("Id_USG"));
                pembayaranDB.setId_Detail_Lab(result.getString("Id_Detail_Lab"));
                pembayaranDB.setId_Resep(result.getString("Id_Resep"));
                pembayaranDB.setId_Rekam(result.getString("Id_Rekam"));
                pembayaranDB.setId_Transaksi_Layanan(result.getString("Id_Transaksi_Layanan"));
                pembayaranDB.setTanggal_Bayar(result.getDate("Tanggal_Bayar"));
                pembayaranDB.setTotal_Harga(result.getInt("Total_Harga"));
                pembayaranDB.setStatus(result.getString("Status"));
            }
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
        return pembayaranDB;
    }
    
    public void updatePembayaranDariPembayaran(Pembayaran pembayaranDB, String idDetailLab, int Harga) throws RemoteException {
        System.out.println("Client Melakukan Proses Update pada Tabel Pembayaran");
        int totalHarga = pembayaranDB.getTotal_Harga() + Harga;
        PreparedStatement statement = null;
        try{
            statement = DatabaseUtilities.getConnection().prepareStatement(
                "UPDATE pembayaran SET ID_USG = ?, ID_DETAIL_LAB = ?, "+
                "ID_RESEP = ?, ID_REKAM = ?, ID_TRANSAKSI_LAYANAN = ?, "+
                "TOTAL_HARGA = ? " +
                "WHERE ID_PEMBAYARAN = ?");
            statement.setString(1, pembayaranDB.getId_USG());
            statement.setString(2, idDetailLab);
            statement.setString(3, pembayaranDB.getId_Resep());
            statement.setString(4, pembayaranDB.getId_Rekam());
            statement.setString(5, pembayaranDB.getId_Transaksi_Layanan());
            statement.setInt(6, totalHarga);
            statement.setString(7, pembayaranDB.getId_Pembayaran());

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
    
    public String getAutoNumberDariPembayaran() throws RemoteException {
        System.out.println("Client Melakukan Proses Auto Number dengan Mengakses Tabel Pembayaran");
        Statement state = null;
        ResultSet rs = null;
        
        String number = "";
        String nomerBaru = "";
        int numberBaru = 0;
	try {
            state = (Statement) DatabaseUtilities.getConnection().createStatement();
            String sql = "SELECT ID_PEMBAYARAN FROM pembayaran ORDER BY ID_PEMBAYARAN DESC limit 1";
            rs = state.executeQuery(sql);
            while (rs.next()){
                number = rs.getString(1);
            }
            System.out.println(number);
        }
        catch (Throwable ex) {
            System.out.println("masuk catch");
        }
        System.out.println(number);
        if(number.equals("")){
            nomerBaru ="BYR0001";
        }
        else{
            String [] pisah = number.split("(?<=\\G.{1})");
            String  numbersebelumnya = pisah[3]+pisah[4]+pisah[5]+pisah[6];
            numberBaru = Integer.parseInt(numbersebelumnya)+1;
            String [] pisah1 = String.valueOf(numberBaru).split("(?<=\\G.{1})");
            String nol= "";
            if(pisah1.length == 1){
                nol = "000";
            }
            else if (pisah1.length == 2){
                nol = "00";
            }
            else if (pisah1.length == 3){
                nol = "0";
            }
            nomerBaru = "BYR"+nol+numberBaru;
        }
        System.out.println(nomerBaru);
        return nomerBaru;
    }
    
    public void insertPembayaranDariPembayaran(String idPembayaran, String idPasien, String idDetailLab, int Harga) throws RemoteException {
        System.out.println("Client Melakukan Proses Insert pada Tabel Pembayaran");
        PreparedStatement statement = null;
        java.sql.Date date = new java.sql.Date(new java.util.Date().getTime());
        try{
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "INSERT INTO pembayaran (ID_PEMBAYARAN,ID_PASIEN,ID_USG,"+
                    "ID_DETAIL_LAB,ID_RESEP,ID_REKAM,ID_TRANSAKSI_LAYANAN,"+
                    "TANGGAL_BAYAR,TOTAL_HARGA,STATUS) values(?,?,?,?,?,?,?,?,?,?)");
            statement.setString(1, idPembayaran);
            statement.setString(2, idPasien);
            statement.setString(3, null);
            statement.setString(4, idDetailLab);
            statement.setString(5, null);
            statement.setString(6, null);
            statement.setString(7, null);
            statement.setDate(8, date);
            statement.setInt(9, Harga);
            statement.setString(10, "HUTANG");

            statement.executeUpdate();
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

 

}
