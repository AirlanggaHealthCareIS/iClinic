/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ServerApplication.Service;

import Database.Entity.Antrian;
import Database.Entity.Kecantikan_detailLayanan;
import Database.Entity.Kecantikan_tabelMaster;
import Database.Entity.Kecantikan_transaksiLayanan;
import Database.Entity.Pembayaran;
import Database.Service.KecantikanService;
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
 * @author ayundhapus
 */
public class KecantikanServiceServer extends UnicastRemoteObject implements KecantikanService {

    public KecantikanServiceServer() throws RemoteException {
    }

    public boolean insertKecantikan_detailLayanan(Kecantikan_detailLayanan detail_layanan) throws RemoteException {
        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "INSERT INTO det_layanan_kecantikan (ID_DET_KESEHATAN, ID_TRANSAKSI_LAYANAN, ID_KECANTIKAN, KETERANGAN) values (?,?,?,?)"
            );
            statement.setString(1, detail_layanan.getId_Det_Kesehatan());
            statement.setString(2, detail_layanan.getId_Trans_Layanan());
            statement.setString(3, detail_layanan.getId_Kecantikan());
            statement.setString(4, detail_layanan.getKeterangan());
            statement.executeUpdate();
            System.out.println("Client Melakukan Proses Insert pada Table Detail Layanan Kecantikan");
            return true;
        } catch (SQLException exception) {
            System.out.println("Client Gagal Melakukan Proses Insert pada Table Detail Layanan Kecantikan");
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

    public void updateKecantikan_detailLayanan(Kecantikan_detailLayanan detail_layanan) throws RemoteException {

        System.out.println("Client Melakukan Proses Update pada Tabel Detail Layanan Kecantikan");

    }

    public void deleteKecantikan_detailLayanan(int Id_Obat) throws RemoteException {

        System.out.println("Client Melakukan Proses Delete pada Tabel Detail Layanan Kecantikan");

    }

    public Kecantikan_detailLayanan getKecantikan_detailLayanan(int Id_Obat) throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel Detail Layanan Kecantikan");

        Kecantikan_detailLayanan detail_layanan = null;
        return detail_layanan;
    }

    public List<Kecantikan_detailLayanan> getKecantikan_detailLayanan() throws RemoteException {

        System.out.println("Client Melakukan Proses Get All pada Tabel Detail Layanan Kecantikan");

        List<Kecantikan_detailLayanan> list = new ArrayList<Kecantikan_detailLayanan>();
        return list;
    }

    public boolean insertKecantikan_transaksiLayanan(Kecantikan_transaksiLayanan transaksi_layanan) throws RemoteException {
        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "INSERT INTO transaksi_layanan_kecantikan (ID_TRANSAKSI_LAYANAN, ID_PASIEN, TOTAL_HARGA, TANGGAL) values (?,?,?,?)"
            );
            statement.setString(1, transaksi_layanan.getId_Transaksi_Layanan());
            statement.setString(2, transaksi_layanan.getId_Pasien());
            statement.setInt(3, transaksi_layanan.getTotal_Harga());
            statement.setString(4,  transaksi_layanan.getTanggal());
            statement.executeUpdate();
            System.out.println("Client Melakukan Proses Insert pada Table Transaksi Layanan Kecantikan");
            return true;
        } catch (SQLException exception) {
            System.out.println("Client Gagal Melakukan Proses Insert pada Table Transaksi Layanan Kecantikan");
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

    public void updateKecantikan_transaksiLayanan(Kecantikan_transaksiLayanan transaksi_layanan) throws RemoteException {

        System.out.println("Client Melakukan Proses Update pada Tabel Transaksi Layanan Kesehatan");

    }

    public void deleteKecantikan_transaksiLayanan(int Id_Transaksi_Layanan) throws RemoteException {

        System.out.println("Client Melakukan Proses Delete pada Tabel Transaksi Layanan Kesehatan");

    }

    public Kecantikan_transaksiLayanan getKecantikan_transaksiLayanan(int Id_Transaksi_Layanan) throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel Transaksi Layanan Kesehatan");

        Kecantikan_transaksiLayanan transaksi_layanan = null;
        return transaksi_layanan;
    }

    public List<Kecantikan_transaksiLayanan> getKecantikan_transaksiLayanan() throws RemoteException {

        System.out.println("Client Melakukan Proses Get All pada Tabel Transaksi Layanan Kesehatan");

        List<Kecantikan_transaksiLayanan> list = new ArrayList<Kecantikan_transaksiLayanan>();
        return list;
    }

    public List<Kecantikan_tabelMaster> getLayananKecantikan() throws RemoteException {
        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "SELECT * FROM layanan_kecantikan");
            ResultSet result = statement.executeQuery();
            List<Kecantikan_tabelMaster> jenislayanan = new ArrayList<Kecantikan_tabelMaster>();
            while (result.next()) {
                Kecantikan_tabelMaster kec = new Kecantikan_tabelMaster();
                kec.setId_Kecantikan(result.getString("ID_KECANTIKAN"));
                kec.setJenis_Layanan(result.getString("JENIS_LAYANAN"));
                kec.setTarif(Integer.parseInt(result.getString("TARIF")));
                jenislayanan.add(kec);
            }
            return jenislayanan;
        } catch (SQLException exception) {
            System.out.println(exception);
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
            String sql = "SELECT `pembayaran`.ID_PEMBAYARAN\n"
                    + "FROM `pembayaran`,`transaksi_layanan_kecantikan`\n"
                    + "WHERE `pembayaran`.ID_PASIEN = `transaksi_layanan_kecantikan`.ID_PASIEN\n"
                    + "AND `pembayaran`.ID_PASIEN = '" + idPasien + "'\n"
                    + "AND `pembayaran`.TANGGAL_BAYAR = `transaksi_layanan_kecantikan`.TANGGAL\n"
                    + "AND `pembayaran`.TANGGAL_BAYAR = '" + date + "'\n"
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

    public Pembayaran getPembayaranDariPembayaran(String idPembayaran) throws RemoteException {
        System.out.println("Client Melakukan Proses Pencarian get PEMBAYARAN dengan Mengakses Tabel Pembayaran");
        java.sql.Date date = new java.sql.Date(new java.util.Date().getTime());
        System.out.println(date);
        PreparedStatement statement = null;
        Pembayaran pembayaranDB = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "SELECT `pembayaran`.* \n"
                    + "FROM `pembayaran` \n"
                    + "WHERE `pembayaran`.ID_PEMBAYARAN = '" + idPembayaran + "'");

            ResultSet result = statement.executeQuery();

            if (result.next()) {
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
        } catch (SQLException exception) {
            exception.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException exception) {
                    exception.printStackTrace();
                }
            }
        }
        return pembayaranDB;
    }

    public void updatePembayaranDariPembayaran(Pembayaran pembayaranDB, String idTransaksiLayananKecantikan, int Harga) throws RemoteException {
        System.out.println("Client Melakukan Proses Update pada Tabel Pembayaran");
        int totalHarga = pembayaranDB.getTOTAL_HARGA() + Harga;
        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "UPDATE pembayaran SET ID_USG = ?, ID_TRANSAKSI_LAB = ?, "
                    + "ID_RESEP = ?, ID_REKAM = ?, ID_TRANSAKSI_LAYANAN = ?, "
                    + "TOTAL_HARGA = ? "
                    + "WHERE ID_PEMBAYARAN = ?");
            statement.setString(1, pembayaranDB.getID_USG());
            statement.setString(2, pembayaranDB.getID_TRANSAKSI_LAB());
            statement.setString(3, pembayaranDB.getID_RESEP());
            statement.setString(4, pembayaranDB.getID_REKAM());
            statement.setString(5, idTransaksiLayananKecantikan);
            statement.setInt(6, totalHarga);
            statement.setString(7, pembayaranDB.getID_PEMBAYARAN());

            statement.executeUpdate();

        } catch (SQLException exception) {
            exception.printStackTrace();
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
            while (rs.next()) {
                number = rs.getString(1);
            }
            System.out.println(number);
        } catch (Throwable ex) {
            System.out.println("masuk catch");
        }
        System.out.println(number);
        if (number.equals("")) {
            nomerBaru = "BYR0001";
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
            nomerBaru = "BYR" + nol + numberBaru;
        }
        System.out.println(nomerBaru);
        return nomerBaru;
    }

    public void insertPembayaranDariPembayaran(String idPembayaran, String idPasien, String idTransaksiLayananKecantikan, int Harga) throws RemoteException {
        System.out.println("Client Melakukan Proses Insert pada Tabel Pembayaran");
        PreparedStatement statement = null;
        java.sql.Date date = new java.sql.Date(new java.util.Date().getTime());
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "INSERT INTO pembayaran (ID_PEMBAYARAN,ID_PASIEN,ID_USG,"
                    + "ID_TRANSAKSI_LAB,ID_RESEP,ID_REKAM,ID_TRANSAKSI_LAYANAN,"
                    + "TANGGAL_BAYAR,TOTAL_HARGA,STATUS) values(?,?,?,?,?,?,?,?,?,?)");
            statement.setString(1, idPembayaran);
            statement.setString(2, idPasien);
            statement.setString(3, null);
            statement.setString(4, null);
            statement.setString(5, null);
            statement.setString(6, null);
            statement.setString(7, idTransaksiLayananKecantikan);
            statement.setDate(8, date);
            statement.setInt(9, Harga);
            statement.setString(10, "HUTANG");

            statement.executeUpdate();
        } catch (SQLException exception) {
            exception.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException exception) {

                }
            }
        }
    }

    public Boolean getPasienbyId(String Id_Pasien) throws RemoteException {
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

    public Antrian getNextPasienKecantikan() throws RemoteException {
        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "SELECT * FROM `antrian` WHERE JENIS_ANTRIAN = 'kecantikan' AND KETERANGAN = 'belum'");
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

    public String getPasienName(String Id_Pasien) throws RemoteException {
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
            String sql = "SELECT ID_TRANSAKSI_LAYANAN FROM transaksi_layanan_kecantikan ORDER BY ID_TRANSAKSI_LAYANAN DESC limit 1";
            rs = state.executeQuery(sql);
            while (rs.next()){
                number = rs.getString(1);
            }
            System.out.println(number);
        }
        catch (SQLException exception) {
            exception.printStackTrace();
        }
        System.out.println(number);
        if(number.equals("")){
            nomerBaru ="C0001";
        }
        else{
            String [] pisah = number.split("(?<=\\G.{1})");
            String numbersebelumnya = pisah[1]+pisah[2]+pisah[3]+pisah[4];
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
            nomerBaru = "C"+nol+numberBaru;
        }
        System.out.println(nomerBaru);
        return nomerBaru;
    }

}
