/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ServerApplication.Service;

import Database.Entity.Antrian;
import Database.Entity.Obat_detailResep;
import Database.Entity.Obat_resep;
import Database.Entity.Pasien;
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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Afifah, piudt, Ayundha
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
    
    public Antrian Id_pasien(Antrian antrian)throws RemoteException {
        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "SELECT * FROM antrian WHERE JENIS_ANTRIAN = 'DOKTER UMUM' AND KETERANGAN = 'BELUM' ");
            ResultSet result = statement.executeQuery();
            if(result.first()==false){
                antrian.setId_Pasien("kosong");
                return antrian;
            }
            else{
               result.first();
               antrian.setId_Antrian(result.getString("ID_ANTRIAN"));
               antrian.setId_Pasien(result.getString("ID_PASIEN"));
               antrian.setJenis_Antrian(result.getString("JENIS_ANTRIAN"));
               antrian.setKeterangan(result.getString("KETERANGAN"));
               return antrian;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DokterServiceServer.class.getName()).log(Level.SEVERE, null, ex);
            antrian.setId_Pasien("salah");
            return antrian;  
        }
     }
    
    public Antrian insertAntrian(Antrian antrian) throws RemoteException {

        System.out.println("Client Melakukan Proses Insert pada Antrian");
        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "INSERT INTO antrian (ID_ANTRIAN, ID_PASIEN, JENIS_ANTRIAN, KETERANGAN) "
                    + " values(?,?,?,'BELUM')"
            );
            statement.setString(1, antrian.getId_Antrian());
            statement.setString(2, antrian.getId_Pasien());
            statement.setString(3,antrian.getJenis_Antrian());
//            statement.setString(4, antrian.getKeterangan());

            statement.executeUpdate();
//           ResultSet result = statement.getGeneratedKeys();
//           if(result.next()){
//               rekam_medis.setId_Rekam_Medis(result.getString(1));
//           }
            //      result.close();
            return antrian;
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
        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "UPDATE rekam_medis SET TOTAL_HARGA = ? "
                    + "WHERE ID_REKAM = ?");
            statement.setInt(1, rekam_medis.getTotal_Harga());
            statement.setString(2, rekam_medis.getId_Rekam());
            
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

public void updateAntrian(String IDAntrianSaatIni) throws RemoteException {

        System.out.println("Client Melakukan Proses Update pada Antrian");
        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "UPDATE antrian SET KETERANGAN = 'SUDAH' "
                    + "WHERE ID_ANTRIAN = '" + IDAntrianSaatIni + "'");
            
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
    
    
    public void deleteRekam_Medis(String Id_Rekam) throws RemoteException {

        System.out.println("Client Melakukan Proses Delete pada Tabel Rekam Medis");
    }

    public Rekam_Medis getRekam_Medis(String Id_Rekam) throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel Rekam Medis");
        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "SELECT * FROM rekam_medis WHERE ID_REKAM = '"+Id_Rekam+"'");

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

    public List<Tindakan_detailTindakan> getDetailTindakanById(String ID_Rekam) throws RemoteException {

        System.out.println("Client Melakukan Proses Get All sesuai ID Rekam pada Tabel Detail Tindakan");
        Statement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().createStatement();

            ResultSet result = statement.executeQuery("SELECT * FROM DETAIL_TINDAKAN WHERE ID_REKAM = '" + ID_Rekam + "'");

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
            statement.setString(1, idpasien);
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
public String getAutoNumberAntrian() throws RemoteException {
        System.out.println("Client Melakukan Proses Auto Number dengan Mengakses Tabel Antrian");
        Statement state = null;
        ResultSet rs = null;

        String number = "";
        String nomerBaru = "";
        int numberBaru = 0;
        try {
            state = (Statement) DatabaseUtilities.getConnection().createStatement();
            String sql = "SELECT ID_ANTRIAN FROM antrian ORDER BY ID_ANTRIAN DESC limit 1";
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
            nomerBaru = "ANT0001";
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
            nomerBaru = "ANT" + nol + numberBaru;
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
                    "SELECT * FROM detail_tindakan WHERE NO_DETAIL = '"+No_Detail+"'");

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
    public String getNamaPasien (String Id_Pasien) throws RemoteException{
         System.out.println("Client Melakukan Proses Get Nama Pasien");
        Statement state = null;
        ResultSet rs = null;
        String idPasien = "";
        try {
            state = (Statement) DatabaseUtilities.getConnection().createStatement();
            String sql = "SELECT NAMA_PASIEN FROM PASIEN WHERE  ID_PASIEN = '" + Id_Pasien + "'";
            rs = state.executeQuery(sql);
            while (rs.next()) {
                idPasien = rs.getString(1);
            }
        } catch (Throwable ex) {
            System.out.println(ex);
        }
        System.out.println(idPasien);
        return idPasien;
    }
    
    
    public String getRekamMedisbyID(String Jabatan) throws RemoteException {
        System.out.println("Client Melakukan Proses Pengambilan ID_PASIEN Pertama dalam Antrian dengan Mengakses Tabel Antrian");
        Statement state = null;
        ResultSet rs = null;
        
        String idPasienPertama = null;

        try {
            state = (Statement) DatabaseUtilities.getConnection().createStatement();
            String sql = "SELECT ID_PASIEN FROM ANTRIAN WHERE JENIS_ANTRIAN = '" + Jabatan + "' DESC limit 1";
            rs = state.executeQuery(sql);
            while (rs.next()){
                idPasienPertama = rs.getString(1);
            }
            System.out.println(idPasienPertama);
        }
        catch (SQLException exception) {
            exception.printStackTrace();
        }
        return idPasienPertama;
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

    public void updatePembayaranDariPembayaran(Pembayaran pembayaranDB, String idRekam, int Harga) throws RemoteException {
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
            statement.setString(4, idRekam);
            statement.setString(5, pembayaranDB.getID_TRANSAKSI_LAYANAN());
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

    public void insertPembayaranDariPembayaran(String idPembayaran, String idPasien, String idRekam, int Harga) throws RemoteException {
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

        //--------------------------RESEP----------------------------//
    
    public String getAutoNumberResep() throws RemoteException {
        System.out.println("Client Melakukan Proses Auto Number dengan Mengakses Tabel Resep");
        Statement state = null;
        ResultSet rs = null;
        
        String number = "";
        String nomerBaru = "";
        int numberBaru = 0;
	try {
            state = (Statement) DatabaseUtilities.getConnection().createStatement();
            String sql = "SELECT ID_RESEP FROM resep ORDER BY ID_RESEP DESC limit 1";
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
            nomerBaru ="RSP0001";
        }
        else{
            String [] pisah = number.split("(?<=\\G.{1})");
            String numbersebelumnya = pisah[3]+pisah[4]+pisah[5]+pisah[6];
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
            nomerBaru = "RSP"+nol+numberBaru;
        }
        System.out.println(nomerBaru);
        return nomerBaru;
    }

    public String getAutoNumberDetailResep() throws RemoteException {
        System.out.println("Client Melakukan Proses Auto Number dengan Mengakses Tabel Detail Resep");
        Statement state = null;
        ResultSet rs = null;
        
        String number = "";
        String nomerBaru = "";
        int numberBaru = 0;
	try {
            state = (Statement) DatabaseUtilities.getConnection().createStatement();
            String sql = "SELECT NO_DETAIL_RESEP FROM detail_resep ORDER BY NO_DETAIL_RESEP DESC limit 1";
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
            nomerBaru ="DR0001";
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
            nomerBaru = "DR"+nol+numberBaru;
        }
        System.out.println(nomerBaru);
        return nomerBaru;
    }

    public Obat_detailResep insertDetailResep(Obat_detailResep detailResep) throws RemoteException {
        System.out.println("Client Melakukan Proses Insert pada Tabel Detail Resep");
        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "INSERT INTO detail_resep (NO_DETAIL_RESEP, ID_RESEP, ID_OBAT,TAKARAN, PEMAKAIAN, JUMLAH, KETERANGAN)"
                            + "VALUES(?,?,?,?,?,?,?)"
            );
            statement.setString(1, detailResep.getNo_Detail_Resep());
            statement.setString(2, detailResep.getId_Resep());
            statement.setString(3, detailResep.getId_Obat());
            statement.setString(4, detailResep.getTakaran());
            statement.setString(5, detailResep.getPemakaian());
            statement.setString(6, detailResep.getJumlah());
            statement.setString(7, detailResep.getKeterangan());

            statement.executeUpdate();

            return detailResep;
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

    public void updateDetailResep(Obat_detailResep detailResep) throws RemoteException {
        System.out.println("Client Melakukan Proses Update pada Tabel Detail Resep");

        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "UPDATE detail_resep SET ID_RESEP = ?, ID_OBAT = ?, TAKARAN = ?,"
                    + "PEMAKAIAN = ?, JUMLAH = ?, KETERANGAN = ?"
                            + "WHERE NO_DETAIL_RESEP = ?"
            );
            statement.setString(1, detailResep.getId_Resep());
            statement.setString(2, detailResep.getId_Obat());
            statement.setString(3, detailResep.getTakaran());
            statement.setString(4, detailResep.getPemakaian());
            statement.setString(5, detailResep.getJumlah());
            statement.setString(6, detailResep.getKeterangan());
            statement.setString(7, detailResep.getNo_Detail_Resep());

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

    public void deleteDetailResep(String No_Detail_Resep) throws RemoteException {
        System.out.println("Client Melakukan Proses Delete pada Tabel Detail Resep");

        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "DELETE FROM detail_resep WHERE NO_DETAIL_RESEP = ?");

            statement.setString(1, No_Detail_Resep);

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

    public List<Obat_detailResep> getAllDetailResepByIDResep(String ID_RESEP) throws RemoteException {
        System.out.println("Client Melakukan Proses Get All pada Tabel Detail Resep");

        Statement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM detail_resep WHERE ID_RESEP = '" + ID_RESEP + "'");
            List<Obat_detailResep> list = new ArrayList<Obat_detailResep>();

            while (result.next()) {
                Obat_detailResep detail_resep = new Obat_detailResep();
                detail_resep.setNo_Detail_Resep(result.getString("No_Detail_Resep"));
                detail_resep.setId_Resep(result.getString("Id_Resep"));
                detail_resep.setId_Obat(result.getString("Id_Obat"));
                detail_resep.setTakaran(result.getString("Takaran"));
                detail_resep.setPemakaian(result.getString("Pemakaian"));
                detail_resep.setJumlah(result.getString("Jumlah"));
                detail_resep.setKeterangan(result.getString("Keterangan"));
                list.add(detail_resep);
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

    public Obat_resep insertResep(Obat_resep resep) throws RemoteException {
        System.out.println("Client Melakukan Proses Insert pada Tabel Obat");
        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "INSERT INTO resep (ID_RESEP, ID_REKAM, TOTAL_HARGA) VALUES(?,?,?)"
            );
            statement.setString(1, resep.getId_Resep());
            statement.setString(2, resep.getId_Rekam());
            statement.setInt(3, resep.getTotal_Harga());

            statement.executeUpdate();
            
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
        return resep;
    }
    
    public List getNamaObat() throws RemoteException {
        Statement statement = null;
        ResultSet resultSet = null;
        List namaObatList = new ArrayList();
        try {
            statement = (Statement) DatabaseUtilities.getConnection().createStatement();
            resultSet = statement.executeQuery("SELECT NAMA_OBAT from obat");
            while (resultSet.next()) {
                namaObatList.add(resultSet.getString("NAMA_OBAT"));
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
        return namaObatList;
    }

    public int getHargaObat(String namaObat) throws RemoteException {
        System.out.println("Client Melakukan Proses Get Harga");
        Statement state = null;
        ResultSet rs = null;
        int hargaObat = 0;
        try {
            state = (Statement) DatabaseUtilities.getConnection().createStatement();
            String sql = "SELECT HARGA_OBAT FROM obat WHERE  NAMA_OBAT = '" + namaObat + "'";
            rs = state.executeQuery(sql);
            while (rs.next()) {
                hargaObat = rs.getInt(1);
            }
        } catch (Throwable ex) {
            System.out.println(ex);
        }
        System.out.println(hargaObat);
        return hargaObat;
    }

    public String getIDObat(String namaObat) throws RemoteException {
        System.out.println("Client Melakukan Proses Get Jenis Obat");
        Statement state = null;
        ResultSet rs = null;
        String idObat = "";
        try {
            state = (Statement) DatabaseUtilities.getConnection().createStatement();
            String sql = "SELECT ID_OBAT FROM obat WHERE  NAMA_OBAT = '" + namaObat + "'";
            rs = state.executeQuery(sql);
            while (rs.next()) {
                idObat = rs.getString(1);
            }
        } catch (Throwable ex) {
            System.out.println(ex);
        }
        return idObat;
    }

    public void updateResep(Obat_resep resep, String ID_RESEP, int TOTAL_HARGA) throws RemoteException {
        System.out.println("Client Melakukan Proses Update pada Tabel Resep");
        
        PreparedStatement statement = null;
        try{
            statement = DatabaseUtilities.getConnection().prepareStatement(
            "UPDATE user SET TOTAL_HARGA = " + TOTAL_HARGA 
                    + " WHERE ID_RESEP =  " + ID_RESEP + "'");
        
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

    public String getLastIDRekamMedis() throws RemoteException {
        System.out.println("Client Melakukan Proses Pengambilan ID_REKAM_MEDIS Terakhir dengan Mengakses Tabel Rekam Medis");
        Statement state = null;
        ResultSet rs = null;
        
        String idRekamTerakhir = null;

        try {
            state = (Statement) DatabaseUtilities.getConnection().createStatement();
            String sql = "SELECT ID_REKAM FROM rekam_medis ORDER BY ID_REKAM DESC limit 1";
            rs = state.executeQuery(sql);
            while (rs.next()){
                idRekamTerakhir = rs.getString(1);
            }
            System.out.println(idRekamTerakhir);
        }
        catch (SQLException exception) {
            exception.printStackTrace();
        }
        return idRekamTerakhir;
    }

}
