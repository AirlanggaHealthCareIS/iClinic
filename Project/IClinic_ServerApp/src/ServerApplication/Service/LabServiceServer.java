/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ServerApplication.Service;

import Database.Entity.Antrian;
import Database.Entity.Lab_detailLab;
import Database.Entity.Lab_tabelMaster;
import Database.Entity.Lab_transaksiLab;
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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author erin
 */

public class LabServiceServer extends UnicastRemoteObject implements LabService {

    public LabServiceServer() throws RemoteException {
    }

    
    public boolean insertLab_detailLab (Lab_detailLab detail_lab) throws RemoteException {

        System.out.println("Client Melakukan Proses Insert pada Tabel Detail Lab");

        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "INSERT INTO detail_lab (ID_DETAIL_LAB,ID_TRANSAKSI_LAB,ID_LAB,HASIL,KETERANGAN) values(?,?,?,?,?)"
            );
            statement.setString(1, detail_lab.getId_Detail_Lab());
            statement.setString(2, detail_lab.getId_Transaksi_Lab());
            statement.setString(3, detail_lab.getId_Lab());
            statement.setString(4, detail_lab.getHasil());
            statement.setString(5, detail_lab.getKeterangan());
            statement.executeUpdate();
            System.out.println("Client Melakukan Proses Insert pada Table Detail Laboratorium");
            return true;
        } catch (SQLException exception) {
            System.out.println("Client Gagal Melakukan Proses Insert pada Table Detail Laboratorium");
            System.out.println(exception.toString());
            return false;
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException exception) {

                }
            }
        }

    }
    
    public Lab_detailLab getLab_detailLab(String Id_Detail_Lab) throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel Detail Lab");

        Lab_detailLab detail_lab = null;
        return detail_lab;
        }
    
     public List<Lab_detailLab> getLab_detailLab() throws RemoteException {

        System.out.println("Client Melakukan Proses Get All pada Tabel Detail Lab");
        
        List<Lab_detailLab> list = new ArrayList<Lab_detailLab>();
        return list;
    }
     
    public boolean insertLab_transaksiLab(Lab_transaksiLab transaksi_lab) throws RemoteException {
    PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "INSERT INTO transaksi_lab (ID_TRANSAKSI_LAB, ID_PASIEN, TOTAL_HARGA, TANGGAL) values (?,?,?,?)"
            );
            statement.setString(1, transaksi_lab.getId_Transaksi_Lab());
            statement.setString(2, transaksi_lab.getId_Pasien());
            statement.setInt(3, transaksi_lab.getTotal_Harga());
            statement.setString(4,  transaksi_lab.getTanggal());
            statement.executeUpdate();
            System.out.println("Client Melakukan Proses Insert pada Table Transaksi Laboratorium");
            return true;
        } catch (SQLException exception) {
            System.out.println("Client Gagal Melakukan Proses Insert pada Table Transaksi Laboratorium");
            System.out.println(exception.toString());
            return false;
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException exception) {

                }
            }
        }
    }
    public void updateLab_transaksiLab(Lab_transaksiLab transaksi_lab) throws RemoteException {

        System.out.println("Client Melakukan Proses Update pada Tabel Transaksi Layanan Laboratorium");

    }

    public void deleteLab_transaksiLab(int Id_Transaksi_Lab) throws RemoteException {

        System.out.println("Client Melakukan Proses Delete pada Tabel Transaksi Layanan Laboratorium");

    }

    
     public Lab_transaksiLab getLab_transaksiLab (int Id_Transaksi_Lab) throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel Transaksi Laboratorium");

        Lab_transaksiLab transaksi_lab = null;
        return transaksi_lab;
     
    }
   
      public List<Lab_transaksiLab> getLab_transaksiLab() throws RemoteException {
        
        System.out.println("Client Melakukan Proses Get All pada Tabel Transaksi Laboratorium");

        List<Lab_transaksiLab> list = new ArrayList<Lab_transaksiLab>();
        return list;
}

   
    public List<Lab_tabelMaster> getLaboratorium() throws RemoteException {
        
        System.out.println("Client Melakukan Proses Get All pada Tabel Laboratorium");

        PreparedStatement statement = null;
        try{
          statement = DatabaseUtilities.getConnection().prepareStatement(
                 "SELECT * FROM laboratorium");
                      
          ResultSet result = statement.executeQuery();
          List<Lab_tabelMaster> jenis = new ArrayList<Lab_tabelMaster>();

          while(result.next()){
                Lab_tabelMaster lab = new Lab_tabelMaster();
                lab.setId_Lab(result.getString("ID_LAB"));
                lab.setJenis_Pemeriksaan(result.getString("JENIS_PEMERIKSAAN"));
                lab.setHarga(result.getInt("HARGA"));
                lab.setDeskripsi(result.getString("DESKRIPSI"));
                jenis.add(lab);
          }
          return jenis;

        }catch(SQLException exception){
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
                    + "FROM `pembayaran`,`transaksi_lab` \n"
                    + "WHERE `transaksi_lab`.ID_PASIEN = `pembayaran`.ID_PASIEN \n"
                    + "AND `pembayaran`.ID_PASIEN = '" + idPasien + "' \n"
                    + "AND `transaksi_lab`.TANGGAL = `pembayaran`.TANGGAL_BAYAR \n"
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
                pembayaranDB = new Pembayaran();
                pembayaranDB.setID_PEMBAYARAN(result.getString("ID_PEMBAYARAN"));
                pembayaranDB.setID_PASIEN(result.getString("ID_PASIEN"));
                pembayaranDB.setID_USG(result.getString("ID_USG"));
                pembayaranDB.setID_TRANSAKSI_LAB(result.getString("ID_TRANSAKSI_LAB"));
                pembayaranDB.setID_RESEP(result.getString("ID_RESEP"));
                pembayaranDB.setID_REKAM(result.getString("Id_REKAM"));
                pembayaranDB.setID_TRANSAKSI_LAYANAN(result.getString("ID_TRANSAKSI_LAYANAN"));
                pembayaranDB.setTANGGAL_BAYAR(result.getDate("TANGGAL_BAYAR"));
                pembayaranDB.setTOTAL_HARGA(result.getInt("TOTAL_HARGA"));
                pembayaranDB.setSTATUS(result.getString("STATUS"));
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
    
    public void updatePembayaranDariPembayaran(Pembayaran pembayaranDB, String idTransaksiLab, int Harga) throws RemoteException {
        System.out.println("Client Melakukan Proses Update pada Tabel Pembayaran");
        int totalHarga = pembayaranDB.getTOTAL_HARGA() + Harga;
        PreparedStatement statement = null;
        try{
            statement = DatabaseUtilities.getConnection().prepareStatement(
                "UPDATE pembayaran SET ID_USG = ?, ID_TRANSAKSI_LAB = ?, "+
                "ID_RESEP = ?, ID_REKAM = ?, ID_TRANSAKSI_LAYANAN = ?, "+
                "TOTAL_HARGA = ? " +
                "WHERE ID_PEMBAYARAN = ?");
            statement.setString(1, pembayaranDB.getID_USG());
            statement.setString(2, idTransaksiLab);
            statement.setString(3, pembayaranDB.getID_RESEP());
            statement.setString(4, pembayaranDB.getID_REKAM());
            statement.setString(5, pembayaranDB.getID_TRANSAKSI_LAYANAN());
            statement.setInt(6, totalHarga);
            statement.setString(7, pembayaranDB.getID_PEMBAYARAN());

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
    
    public void insertPembayaranDariPembayaran(String idPembayaran, String idPasien, String idTransaksiLab, int Harga) throws RemoteException {
        System.out.println("Client Melakukan Proses Insert pada Tabel Pembayaran");
        PreparedStatement statement = null;
        java.sql.Date date = new java.sql.Date(new java.util.Date().getTime());
        try{
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "INSERT INTO pembayaran (ID_PEMBAYARAN,ID_PASIEN,ID_USG,"+
                    "ID_TRANSAKSI_LAB,ID_RESEP,ID_REKAM,ID_TRANSAKSI_LAYANAN,"+
                    "TANGGAL_BAYAR,TOTAL_HARGA,STATUS) values(?,?,?,?,?,?,?,?,?,?)");
            statement.setString(1, idPembayaran);
            statement.setString(2, idPasien);
            statement.setString(3, null);
            statement.setString(4, idTransaksiLab);
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

     public Antrian getPasienSelanjutnya() throws RemoteException {
        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "SELECT * FROM `antrian` WHERE JENIS_ANTRIAN = 'LABORATORIUM' AND KETERANGAN = 'BELUM'");
            ResultSet result = statement.executeQuery();
            Antrian antrian = null;
            if (result.next()) {
                antrian = new Antrian();
                antrian.setId_Antrian(result.getString("ID_ANTRIAN"));
                antrian.setId_Pasien(result.getString("ID_PASIEN"));
                antrian.setJenis_Antrian(result.getString("JENIS_ANTRIAN"));
                antrian.setKeterangan(result.getString("KETERANGAN"));
                return antrian;
            }
            else{
                return null;    
            }
        } catch (SQLException exception) {
            System.out.println(exception.toString());
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
      public Boolean getPasienId(String Id_Pasien) throws RemoteException {
        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "SELECT * FROM pasien WHERE ID_PASIEN = ?");
            statement.setString(1, Id_Pasien);
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                return true;
            }
            else{
                return false;
            }
            
        } catch (SQLException exception) {

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

    public String getNamaPasien(String Id_Pasien) throws RemoteException {
        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "SELECT NAMA_PASIEN FROM `pasien` WHERE ID_PASIEN = ?");
            statement.setString(1, Id_Pasien);
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                String nama = result.getString(1);
                return nama;
            }
            else{
                return null;    
            }
        } catch (SQLException exception) {
            System.out.println(exception.toString());
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

    public Boolean updateAntrian(Antrian antrian) throws RemoteException {
        PreparedStatement statement = null;
        try{
            statement = DatabaseUtilities.getConnection().prepareStatement(
            "UPDATE `antrian` SET `ID_PASIEN`= ?,`JENIS_ANTRIAN`= ?,`KETERANGAN`= ? WHERE `ID_ANTRIAN` = ?");    
            statement.setString(1, antrian.getId_Pasien());
            statement.setString(2, antrian.getJenis_Antrian());
            statement.setString(3, antrian.getKeterangan());
            statement.setString(4, antrian.getId_Antrian());
            statement.executeUpdate();
            return true;
        }catch(SQLException exception){
            exception.printStackTrace();
            return false;
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

    public String getAutoNumberTransaksi() throws RemoteException {
        System.out.println("Client Melakukan Proses Auto Number dengan Mengakses Tabel Transaksi");
        Statement state = null;
        ResultSet rs = null;
        String number = "";
        String nomerBaru = "";
        int numberBaru = 0;
	try {
            state = (Statement) DatabaseUtilities.getConnection().createStatement();
            String sql = "SELECT ID_TRANSAKSI_LAB FROM transaksi_lab ORDER BY ID_TRANSAKSI_LAB DESC limit 1";
            rs = state.executeQuery(sql);
            while (rs.next()){
                number = rs.getString(1);
            }
        }
        catch (SQLException exception) {
            exception.printStackTrace();
        } 
        try {
            if(number.equals("")){
                nomerBaru ="TL0001";
            }
            else{
                String [] pisah = number.split("(?<=\\G.{1})");
                String numbersebelumnya = pisah[2]+pisah[3]+pisah[4]+pisah[5];
                numberBaru = Integer.parseInt(numbersebelumnya)+1;
                String [] pisah1 = String.valueOf(numberBaru).split("(?<=\\G.{1})");
                String nol= "";
                if(pisah1.length == 1){
                    nol = "000";
                }
                else if (pisah1.length == 2){
                    nol = "00";
                }
                else if(pisah1.length == 3){
                    nol = "0";
                }
                nomerBaru = "TL"+nol+numberBaru;
            }
            System.out.println(nomerBaru);
            return nomerBaru;
        } catch (NumberFormatException e) {
            return null;
        } catch (ArrayIndexOutOfBoundsException e) {
            return null;
        }           
    }

    public String getAutoNumberDetailTransaksi() throws RemoteException {
        System.out.println("Client Melakukan Proses Auto Number dengan Mengakses Tabel Detail Transaksi");
        Statement state = null;
        ResultSet rs = null;
        String number = "";
        String nomerBaru = "";
        int numberBaru = 0;
	try {
            state = (Statement) DatabaseUtilities.getConnection().createStatement();
            String sql = "SELECT ID_DETAIL_LAB FROM det_lab ORDER BY ID_DETAIL_LAB DESC limit 1";
            rs = state.executeQuery(sql);
            while (rs.next()){
                number = rs.getString(1);
            }
        }
        catch (SQLException exception) {
            exception.printStackTrace();
        } 
        try {
            if(number.equals("")){
                nomerBaru ="DL0001";
            }
            else{
                String [] pisah = number.split("(?<=\\G.{1})");
                String numbersebelumnya = pisah[2]+pisah[3]+pisah[4]+pisah[5];
                numberBaru = Integer.parseInt(numbersebelumnya)+1;
                String [] pisah1 = String.valueOf(numberBaru).split("(?<=\\G.{1})");
                String nol= "";
                if(pisah1.length == 1){
                    nol = "000";
                }
                else if (pisah1.length == 2){
                    nol = "00";
                }
                else if(pisah1.length == 3){
                    nol = "0";
                }
                nomerBaru = "DL"+nol+numberBaru;
            }
            System.out.println(nomerBaru);
            return nomerBaru;
        } catch (NumberFormatException e) {
            return null;
        } catch (ArrayIndexOutOfBoundsException e) {
            return null;
        }
    }

 public void updateLab_detailLab(Lab_detailLab detail_lab) throws RemoteException {

        System.out.println("Client Melakukan Proses Update pada Tabel Detail Layanan Laboratorium");

    }

    public void deleteLab_detailLab(int Id_Detail_Lab) throws RemoteException {

        System.out.println("Client Melakukan Proses Delete pada Tabel Detail Layanan Laboratorium");

        
         
    }

    }

