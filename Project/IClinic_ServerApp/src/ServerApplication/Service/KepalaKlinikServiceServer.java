/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ServerApplication.Service;

import Database.Entity.Antrian;
import Database.Entity.LaporanJumlahPasien;
import Database.Entity.LaporanKeuangan;
import Database.Entity.Obat_detailResep;
import Database.Entity.Pasien;
import Database.Entity.Pembayaran;
import Database.Service.Kepala_KlinikService;
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
public class KepalaKlinikServiceServer extends UnicastRemoteObject implements Kepala_KlinikService {

    public KepalaKlinikServiceServer() throws RemoteException {
    }

    public List<LaporanKeuangan> getLaporanKeuangan() throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel Pembayaran");
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "SELECT SUM(`rekam_medis`.TOTAL_HARGA) AS DOKTER\n"
                    + "FROM `rekam_medis`,`pembayaran` "
                    + "WHERE\n"
                    + "MONTH(`pembayaran`.TANGGAL_BAYAR) = MONTH(CURDATE())");
            result = statement.executeQuery();
            List<LaporanKeuangan> list = new ArrayList<LaporanKeuangan>();
            LaporanKeuangan laporanKeuangan = new LaporanKeuangan();
            if (result.next()) {
                laporanKeuangan.setDOKTER(result.getInt("DOKTER"));
            }
            System.out.println(laporanKeuangan.getDOKTER());
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "SELECT SUM(`resep`.TOTAL_HARGA) AS RESEP\n"
                    + "FROM\n"
                    + "`pembayaran`,`resep` "
                    + "WHERE\n"
                    + "MONTH(`pembayaran`.TANGGAL_BAYAR) = MONTH(CURDATE())");
            result = statement.executeQuery();
            if (result.next()) {
                laporanKeuangan.setRESEP(result.getInt("RESEP"));
            }
            System.out.println(laporanKeuangan.getRESEP());
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "SELECT SUM(`transaksi_lab`.TOTAL_HARGA) AS LAB\n"
                    + "FROM\n"
                    + "`pembayaran`,`transaksi_lab`"
                    + "WHERE\n"
                    + "MONTH(`pembayaran`.TANGGAL_BAYAR) = MONTH(CURDATE())");
            result = statement.executeQuery();
            if (result.next()) {
                laporanKeuangan.setLAB(result.getInt("LAB"));
            }
            System.out.println(laporanKeuangan.getLAB());
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "SELECT SUM(`transaksi_usg`.HARGA) AS USG\n"
                    + "FROM\n"
                    + "`transaksi_usg`,`pembayaran`"
                    + "WHERE\n"
                    + "MONTH(`pembayaran`.TANGGAL_BAYAR) = MONTH(CURDATE())");
            result = statement.executeQuery();
            if (result.next()) {
                laporanKeuangan.setUSG(result.getInt("USG"));
            }
            System.out.println(laporanKeuangan.getUSG());
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "SELECT SUM(`transaksi_layanan_kecantikan`.TOTAL_HARGA) AS KECANTIKAN\n"
                    + "FROM\n"
                    + "`pembayaran`,`transaksi_layanan_kecantikan` "
                    + "WHERE\n"
                    + "MONTH(`pembayaran`.TANGGAL_BAYAR) = MONTH(CURDATE())");
            result = statement.executeQuery();
            if (result.next()) {
                laporanKeuangan.setKECANTIKAN(result.getInt("KECANTIKAN"));
            }
            System.out.println(laporanKeuangan.getKECANTIKAN());
            list.add(laporanKeuangan);
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

    public List<LaporanJumlahPasien> getLaporanJumlahPasien() throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel Pembayaran");
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "SELECT COUNT(`pasien`.ID_PASIEN) AS PASIEN "
                    + "FROM `pasien` "
                    + "WHERE MONTH(`pasien`.TGL_DAFTAR) = MONTH(CURDATE())");
            result = statement.executeQuery();
            List<LaporanJumlahPasien> list = new ArrayList<LaporanJumlahPasien>();
            LaporanJumlahPasien laporanJumlahPasien = new LaporanJumlahPasien();
            if (result.next()) {
                laporanJumlahPasien.setPASIEN(result.getInt("PASIEN"));
            }
            System.out.println(laporanJumlahPasien.getPASIEN());
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "SELECT COUNT(`rekam_medis`.ID_PASIEN) AS DOKTER "
                    + "FROM `rekam_medis` "
                    + "WHERE MONTH(`rekam_medis`.TGL_REKAM) = MONTH(CURDATE())");
            result = statement.executeQuery();
            if (result.next()) {
                laporanJumlahPasien.setDOKTER(result.getInt("DOKTER"));
            }
            System.out.println(laporanJumlahPasien.getDOKTER());
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "SELECT COUNT(`transaksi_lab`.ID_PASIEN) AS LAB "
                    + "FROM `transaksi_lab` "
                    + "WHERE MONTH(`transaksi_lab`.TANGGAL) = MONTH(CURDATE())");
            result = statement.executeQuery();
            if (result.next()) {
                laporanJumlahPasien.setLAB(result.getInt("LAB"));
            }
            System.out.println(laporanJumlahPasien.getLAB());
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "SELECT COUNT(`transaksi_layanan_kecantikan`.ID_PASIEN) AS KECANTIKAN "
                    + "FROM `transaksi_layanan_kecantikan` "
                    + "WHERE MONTH(`transaksi_layanan_kecantikan`.TANGGAL) = MONTH(CURDATE())");
            result = statement.executeQuery();
            if (result.next()) {
                laporanJumlahPasien.setKECANTIKAN(result.getInt("KECANTIKAN"));
            }
            System.out.println(laporanJumlahPasien.getKECANTIKAN());
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "SELECT COUNT(`transaksi_usg`.ID_PASIEN) AS USG "
                    + "FROM `transaksi_usg` "
                    + "WHERE MONTH(`transaksi_usg`.TANGGAL) = MONTH(CURDATE())");
            result = statement.executeQuery();
            if (result.next()) {
                laporanJumlahPasien.setUSG(result.getInt("USG"));
            }
            System.out.println(laporanJumlahPasien.getUSG());
            list.add(laporanJumlahPasien);
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

    public Pembayaran getPembayaran(int Id_Pembayaran) throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel Pembayaran");
        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "SELECT * FROM pembayaran WHERE ID_PEMBAYARAN = ?");

            ResultSet result = statement.executeQuery();

            Pembayaran pembayaranDB = null;

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

            return pembayaranDB;
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

    public List<Pembayaran> getPembayaran() throws RemoteException {

        System.out.println("Client Melakukan Proses Get All pada Tabel Pembayaran");
        List<Pembayaran> list = new ArrayList<Pembayaran>();
        return list;
    }

    public Pasien getPasien(int Id_Pasien) throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel Pasien");
        Pasien pasien = null;
        return pasien;
    }

    public List<Pasien> getPasien() throws RemoteException {

        System.out.println("Client Melakukan Proses Get All pada Tabel Pasien");
        List<Pasien> list = new ArrayList<Pasien>();
        return list;
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

    public Obat_detailResep getObat_detailResep(int Id_Obat) throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel Detail Resep");
        Obat_detailResep detail_resep = null;
        return detail_resep;
    }

    public List<Obat_detailResep> getObat_detailResep() throws RemoteException {

        System.out.println("Client Melakukan Proses Get All pada Tabel Detail Resep");
        List<Obat_detailResep> list = new ArrayList<Obat_detailResep>();
        return list;
    }
}
