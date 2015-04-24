/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ServerApplication.Service;

import Database.Entity.Pembayaran;
import Database.Entity.Penyakit_diagnosa;
import Database.Entity.Penyakit_tabelMaster;
import Database.Entity.Rekam_Medis;
import Database.Entity.Tindakan_detailTindakan;
import Database.Entity.Tindakan_tabelMaster;
import Database.Service.DokterService;
import ServerApplication.Utilities.DatabaseUtilities;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tiara Ratna Sari
 */
public class DokterServiceServer extends UnicastRemoteObject implements DokterService {

    public DokterServiceServer() throws RemoteException {
    }

    public Rekam_Medis insertRekam_Medis(Rekam_Medis rekam_medis) throws RemoteException {

        System.out.println("Client Melakukan Proses Insert pada Tabel Rekam Medis");
        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "INSERT INTO rekam_medis (ID_REKAM, ID_DIAGNOSA, ID_PASIEN, TGL_REKAM, TINGGI, "
                    + "BERAT, TEKANAN_DARAH, HASIL_PEMERIKSAAN, ALERGI, TOTAL_HARGA, LAYANAN_TAMBAHAN) values(?,?,?,?,?,?,?,?,?,?,?)"
            );
            statement.setString(1, rekam_medis.getId_Rekam());
            statement.setString(2, rekam_medis.getId_Diagnosa());
            statement.setString(3, rekam_medis.getId_Pasien());
            statement.setDate(4, new Date(rekam_medis.getTgl_Rekam().getTime()));
            statement.setInt(5, rekam_medis.getTinggi());
            statement.setInt(6, rekam_medis.getBerat());
            statement.setInt(7, rekam_medis.getTekanan_Darah());
            statement.setString(8, rekam_medis.getHasil_Pemerikasaan());
            statement.setString(9, rekam_medis.getAlergi());
            statement.setInt(10, rekam_medis.getTotal_Harga());
            statement.setString(11, rekam_medis.getLayanan_Tambahan());

            statement.executeUpdate();
//           ResultSet result = statement.getGeneratedKeys();
//           if(result.next()){
//               rekam_medis.setId_Rekam_Medis(result.getString(1));
//           }
            //      result.close();
            return rekam_medis;
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

    public Tindakan_detailTindakan insertDetailTindakan(Tindakan_detailTindakan detail_tindakan) throws RemoteException {

        System.out.println("Client Melakukan Proses Insert pada Tindakan");
        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "INSERT INTO detail_tindakan (NO_DETAIL, ID_TINDAKAN, ID_REKAM, KETERANGAN) "
                    + " values(?,?,?,?)"
            );
            statement.setString(1, detail_tindakan.getNo_Detail());
            statement.setString(2, detail_tindakan.getId_Tindakan());
            statement.setString(3, detail_tindakan.getId_Rekam());
            statement.setString(4, detail_tindakan.getKeterangan());

            statement.executeUpdate();
//           ResultSet result = statement.getGeneratedKeys();
//           if(result.next()){
//               rekam_medis.setId_Rekam_Medis(result.getString(1));
//           }
            //      result.close();
            return detail_tindakan;
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

    public void updateRekam_Medis(Rekam_Medis rekam_medis) throws RemoteException {

        System.out.println("Client Melakukan Proses Update pada Tabel Rekam Medis");
    }

    public void deleteRekam_Medis(String Id_Rekam) throws RemoteException {

        System.out.println("Client Melakukan Proses Delete pada Tabel Rekam Medis");
    }

    public Rekam_Medis getRekam_Medis(String Id_Rekam) throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel Rekam Medis");
        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "SELECT * FROM rekam_medis WHERE ID_REKAM = ?");

            ResultSet result = statement.executeQuery();

            Rekam_Medis rekam_medis = null;

            if (result.next()) {
                rekam_medis = new Rekam_Medis();

                rekam_medis.setId_Rekam(result.getString("Id_Rekam"));
                rekam_medis.setId_Diagnosa(result.getString("Id_Diagnosa"));
                rekam_medis.setId_Pasien(result.getString("Id_Pasien"));
                rekam_medis.setTgl_Rekam(result.getDate("Tgl_Rekam"));
                rekam_medis.setTinggi(result.getInt("Tinggi"));
                rekam_medis.setBerat(result.getInt("Berat"));
                rekam_medis.setTekanan_Darah(result.getInt("Tekanan_Darah"));
                rekam_medis.setHasil_Pemerikasaan(result.getString("Hasil_Pemeriksaan"));
                rekam_medis.setAlergi(result.getString("Alergi"));
                rekam_medis.setTotal_Harga(result.getInt("Total_Harga"));
                rekam_medis.setLayanan_Tambahan(result.getString("Layanan_Tambahan"));

            }

            return rekam_medis;

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

//    public Tindakan_detailTindakan getTindakan(String No_Detail) throws RemoteException {
//
//        }
    public List<Rekam_Medis> getRekam_Medis() throws RemoteException {

        System.out.println("Client Melakukan Proses Get All pada Tabel Rekam Medis");
        Statement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().createStatement();

            ResultSet result = statement.executeQuery("SELECT * FROM rekam_medis");

            List<Rekam_Medis> list = new ArrayList<Rekam_Medis>();

            while (result.next()) {
                Rekam_Medis rekam_medis = new Rekam_Medis();

                rekam_medis.setId_Rekam(result.getString("Id_Rekam"));
                rekam_medis.setId_Diagnosa(result.getString("Id_Diagnosa"));
                rekam_medis.setId_Pasien(result.getString("Id_Pasien"));
                rekam_medis.setTgl_Rekam(result.getDate("Tgl_Rekam"));
                rekam_medis.setTinggi(result.getInt("Tinggi"));
                rekam_medis.setBerat(result.getInt("Berat"));
                rekam_medis.setTekanan_Darah(result.getInt("Tekanan_Darah"));
                rekam_medis.setHasil_Pemerikasaan(result.getString("Hasil_Pemeriksaan"));
                rekam_medis.setAlergi(result.getString("Alergi"));
                rekam_medis.setTotal_Harga(result.getInt("Total_Harga"));
                rekam_medis.setLayanan_Tambahan(result.getString("Layanan_Tambahan"));
                list.add(rekam_medis);
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

    public List<Tindakan_detailTindakan> getDetailTindakan() throws RemoteException {

        System.out.println("Client Melakukan Proses Get All pada Tabel Rekam Medis");
        Statement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().createStatement();

            ResultSet result = statement.executeQuery("SELECT * FROM DETAIL_TINDAKAN");

            List<Tindakan_detailTindakan> list = new ArrayList<Tindakan_detailTindakan>();

            while (result.next()) {
                Tindakan_detailTindakan detail_tindakan = new Tindakan_detailTindakan();

                detail_tindakan.setNo_Detail(result.getString("No_Detail"));
                detail_tindakan.setId_Tindakan(result.getString("Id_Tindakan"));
                detail_tindakan.setId_Rekam(result.getString("Id_Rekam"));
                detail_tindakan.setKeterangan(result.getString("Keterangan"));
                list.add(detail_tindakan);
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

    public List<Rekam_Medis> GetRekam_MedisbyPasien(String idpasien) throws RemoteException {
        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "SELECT * FROM rekam_medis WHERE ID_PASIEN = ?");
            statement.setInt(1, Integer.parseInt(idpasien));
            ResultSet result = statement.executeQuery();
            List<Rekam_Medis> rms = new ArrayList<Rekam_Medis>();
            while (result.next()) {
                Rekam_Medis rm = new Rekam_Medis();
                rm.setId_Rekam(result.getString("ID_REKAM"));
                rm.setId_Diagnosa(result.getString("ID_DIAGNOSA"));
                rm.setId_Pasien(result.getString("ID_PASIEN"));
                rm.setTgl_Rekam(result.getDate("TGL_REKAM"));
                rm.setTinggi(result.getInt("TINGGI"));
                rm.setBerat(result.getInt("BERAT"));
                rm.setTekanan_Darah(result.getInt("TEKANAN_DARAH"));
                rm.setHasil_Pemerikasaan(result.getString("HASIL_PEMERIKSAAN"));
                rm.setAlergi(result.getString("ALERGI"));
                rm.setTotal_Harga(result.getInt("TOTAL_HARGA"));
                rm.setLayanan_Tambahan(result.getString("LAYANAN_TAMBAHAN"));
                rms.add(rm);
            }
            return rms;
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

    public List getNamaDiagnosa() throws RemoteException {
        Statement statement = null;
        ResultSet resultSet = null;
        List product_code = new ArrayList();
        try {
            statement = (Statement) DatabaseUtilities.getConnection().createStatement();
            resultSet = statement.executeQuery("SELECT DIAGNOSA from diagnosa");
            while (resultSet.next()) {
                product_code.add(resultSet.getString("DIAGNOSA"));
            }
        } catch (SQLException ex) {
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
            } catch (SQLException ex) {
            }
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException ex) {
            }
        }
        return product_code;
    }

    public String getIdDiagnosa(String namaDiagnosa) throws RemoteException {
        System.out.println("Client Melakukan Proses Get Nama Diagnosa");
        Statement state = null;
        ResultSet rs = null;
        String idDiagnosa = "";
        try {
            state = (Statement) DatabaseUtilities.getConnection().createStatement();
            String sql = "SELECT ID_DIAGNOSA FROM DIAGNOSA WHERE  DIAGNOSA = '" + namaDiagnosa + "'";
            rs = state.executeQuery(sql);
            while (rs.next()) {
                idDiagnosa = rs.getString(1);
            }
        } catch (Throwable ex) {
            System.out.println(ex);
        }
        System.out.println(idDiagnosa);
        return idDiagnosa;
    }

    public List getNamaTindakan() throws RemoteException {
        Statement statement = null;
        ResultSet resultSet = null;
        List product_code = new ArrayList();
        try {
            statement = (Statement) DatabaseUtilities.getConnection().createStatement();
            resultSet = statement.executeQuery("SELECT NAMA_TINDAKAN from tindakan");
            while (resultSet.next()) {
                product_code.add(resultSet.getString("NAMA_TINDAKAN"));
            }
        } catch (SQLException ex) {
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
            } catch (SQLException ex) {
            }
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException ex) {
            }
        }
        return product_code;
    }

    public String getIdTindakan(String namaTindakan) throws RemoteException {
        System.out.println("Client Melakukan Proses Get Jenis Tindakan");
        Statement state = null;
        ResultSet rs = null;
        String idTindakan = "";
        try {
            state = (Statement) DatabaseUtilities.getConnection().createStatement();
            String sql = "SELECT ID_TINDAKAN FROM TINDAKAN WHERE  NAMA_TINDAKAN = '" + namaTindakan + "'";
            rs = state.executeQuery(sql);
            while (rs.next()) {
                idTindakan = rs.getString(1);
            }
        } catch (Throwable ex) {
            System.out.println(ex);
        }
        System.out.println(idTindakan);
        return idTindakan;
    }

    public String getAutoNumberNoDetail() throws RemoteException {
        System.out.println("Client Melakukan Proses Auto Number dengan Mengakses Tabel Pemasukan");
        Statement state = null;
        ResultSet rs = null;

        String number = "";
        String nomerBaru = "";
        int numberBaru = 0;
        try {
            state = (Statement) DatabaseUtilities.getConnection().createStatement();
            String sql = "SELECT NO_DETAIL FROM detail_tindakan ORDER BY NO_DETAIL DESC limit 1";
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
            nomerBaru = "DET0001";
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
            nomerBaru = "DET" + nol + numberBaru;
        }
        System.out.println(nomerBaru);
        return nomerBaru;

    }

    public String getAutoNumberIdRekam() throws RemoteException {
        System.out.println("Client Melakukan Proses Auto Number dengan Mengakses Tabel Pemasukan");
        Statement state = null;
        ResultSet rs = null;

        String number = "";
        String nomerBaru = "";
        int numberBaru = 0;
        try {
            state = (Statement) DatabaseUtilities.getConnection().createStatement();
            String sql = "SELECT ID_REKAM FROM rekam_medis ORDER BY ID_REKAM DESC limit 1";
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
            nomerBaru = "REK0001";
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
            nomerBaru = "REK" + nol + numberBaru;
        }
        System.out.println(nomerBaru);
        return nomerBaru;

    }

    public int getTarif(String nama_tindakan) throws RemoteException {
        System.out.println("Client Melakukan Proses Get Jenis Tarif");
        Statement state = null;
        ResultSet rs = null;
        int idTindakan = 0;
        try {
            state = (Statement) DatabaseUtilities.getConnection().createStatement();
            String sql = "SELECT TARIF FROM TINDAKAN WHERE  NAMA_TINDAKAN = '" + nama_tindakan + "'";
            rs = state.executeQuery(sql);
            while (rs.next()) {
                idTindakan = rs.getInt(1);
            }
        } catch (Throwable ex) {
            System.out.println(ex);
        }
        System.out.println(idTindakan);
        return idTindakan;
    }

    public Tindakan_detailTindakan getDetailTindakan(String No_Detail) throws RemoteException {
        System.out.println("Client Melakukan Proses Get By Id pada Tabel Tindakan");
        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "SELECT * FROM detail_tindakan WHERE NO_DETAIL = ?");

            ResultSet result = statement.executeQuery();

            Tindakan_detailTindakan detail_tindakan = null;

            if (result.next()) {
                detail_tindakan = new Tindakan_detailTindakan();

                detail_tindakan.setNo_Detail(result.getString("No_Detail"));
                detail_tindakan.setId_Tindakan(result.getString("Id_Tindakan"));
                detail_tindakan.setId_Rekam(result.getString("Id_Rekam"));
                detail_tindakan.setKeterangan(result.getString("Keterangan"));

            }

            return detail_tindakan;

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
                    + "FROM `pembayaran`,`rekam_medis` \n"
                    + "WHERE `rekam_medis`.ID_PASIEN = `pembayaran`.ID_PASIEN \n"
                    + "AND `pembayaran`.ID_PASIEN = '" + idPasien + "' \n"
                    + "AND `rekam_medis`.TGL_REKAM = `pembayaran`.TANGGAL_BAYAR \n"
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

    public void updatePembayaranDariPembayaran(Pembayaran pembayaranDB, String idRekam, int Harga) throws RemoteException {
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
            statement.setString(4, idRekam);
            statement.setString(5, pembayaranDB.getId_Transaksi_Layanan());
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

    public void insertPembayaranDariPembayaran(String idPembayaran, String idPasien, String idRekam, int Harga) throws RemoteException {
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
            statement.setString(6, idRekam);
            statement.setString(7, null);
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
