/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ServerApplication.Service;

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

    public void insertKecantikan_detailLayanan(Kecantikan_detailLayanan detail_layanan) throws RemoteException {
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
        } catch (SQLException exception) {
            System.out.println("Client Gagal Melakukan Proses Insert pada Table Detail Layanan Kecantikan");
            System.out.println(exception.toString());
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

    public void insertKecantikan_transaksiLayanan(Kecantikan_transaksiLayanan transaksi_layanan) throws RemoteException {
PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "INSERT INTO transaksi_layanan_kecantikan (ID_TRANSAKSI_KESEHATAN, ID_PASIEN, TOTAL_HARGA, TANGGAL) values (?,?,?,?)"
            );
            statement.setString(1, transaksi_layanan.getId_Transaksi_Layanan());
            statement.setString(2, transaksi_layanan.getId_Pasien());
            statement.setInt(3, transaksi_layanan.getTotal_Harga());
            statement.setDate(4, (Date) transaksi_layanan.getTanggal());
            statement.executeUpdate();
            System.out.println("Client Melakukan Proses Insert pada Table Transaksi Layanan Kecantikan");
        } catch (SQLException exception) {
            System.out.println("Client Gagal Melakukan Proses Insert pada Table Transaksi Layanan Kecantikan");
            System.out.println(exception.toString());
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
        int totalHarga = pembayaranDB.getTotal_Harga() + Harga;
        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "UPDATE pembayaran SET ID_USG = ?, ID_DETAIL_LAB = ?, "
                    + "ID_RESEP = ?, ID_REKAM = ?, ID_TRANSAKSI_LAYANAN = ?, "
                    + "TOTAL_HARGA = ? "
                    + "WHERE ID_PEMBAYARAN = ?");
            statement.setString(1, pembayaranDB.getId_USG());
            statement.setString(2, pembayaranDB.getId_Detail_Lab());
            statement.setString(3, pembayaranDB.getId_Resep());
            statement.setString(4, pembayaranDB.getId_Rekam());
            statement.setString(5, idTransaksiLayananKecantikan);
            statement.setInt(6, totalHarga);
            statement.setString(7, pembayaranDB.getId_Pembayaran());

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
                    + "ID_DETAIL_LAB,ID_RESEP,ID_REKAM,ID_TRANSAKSI_LAYANAN,"
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

}
