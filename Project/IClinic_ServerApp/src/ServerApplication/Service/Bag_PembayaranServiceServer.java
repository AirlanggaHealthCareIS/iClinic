/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ServerApplication.Service;

import Database.Entity.Obat_detailResep;
import Database.Entity.Obat_detailResepPrint;
import Database.Entity.Pembayaran;
import Database.Service.Bag_PembayaranService;
import ServerApplication.Utilities.DatabaseUtilities;
import ServerApplication.entity.log;
import ServerApplication.model.TableModelLog;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Tiara Ratna Sari
 */
public class Bag_PembayaranServiceServer extends UnicastRemoteObject implements Bag_PembayaranService {

    TableModelLog tableModelLog;

    public Bag_PembayaranServiceServer(TableModelLog tableModelLog1) throws RemoteException {
        this.tableModelLog = tableModelLog1;
    }

    public Pembayaran insertPembayaran(Pembayaran pembayaran) throws RemoteException {
        log Log = new log();
        Log.setTanggal(Calendar.getInstance().getTime());
        Log.setKegiatan("Melakukan Proses Insert pada Tabel Pembayaran");
        Log.setAktor("Bagian Pembayaran");
        tableModelLog.insert(Log);

        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "INSERT INTO pembayaran (ID_PEMBAYARAN,ID_USG,ID_DETAIL_LAB,ID_RESEP,ID_REKAM,ID_TRANSAKSI_LAYANAN,TANGGAL_BAYAR,TOTAL_HARGA,STATUS) values(?,?,?,?,?,?,?,?,?)"
            );
            statement.setString(1, pembayaran.getID_PEMBAYARAN());
            statement.setString(2, pembayaran.getID_USG());
            statement.setString(3, pembayaran.getID_TRANSAKSI_LAB());
            statement.setString(4, pembayaran.getID_RESEP());
            statement.setString(5, pembayaran.getID_REKAM());
            statement.setString(6, pembayaran.getID_TRANSAKSI_LAYANAN());
            statement.setDate(7, new Date(pembayaran.getTANGGAL_BAYAR().getTime()));
            statement.setInt(8, pembayaran.getTOTAL_HARGA());
            statement.setString(9, pembayaran.getSTATUS());

            statement.executeUpdate();
            ResultSet result = statement.getGeneratedKeys();
            if (result.next()) {
                pembayaran.setID_PEMBAYARAN(result.getString(1));
            }
            result.close();
            return pembayaran;
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

    public void updatePembayaran(Pembayaran pembayaran) throws RemoteException {
        log Log = new log();
        Log.setTanggal(Calendar.getInstance().getTime());
        Log.setKegiatan("Melakukan Proses Update pada Tabel Pembayaran");
        Log.setAktor("Bagian Pembayaran");
        tableModelLog.insert(Log);

        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "UPDATE pembayaran SET ID_USG = ?,"
                    + "ID_DETAIL_LAB = ?, ID_RESEP = ?, ID_REKAM = ?, ID_TRANSAKSI_LAYANAN = ?, TANGGAL_BAYAR = ?, TOTAL_HARGA = ? "
                    + "WHERE ID_PEMBAYARAN = ?"
            );
            statement.setString(1, pembayaran.getID_USG());
            statement.setString(2, pembayaran.getID_TRANSAKSI_LAB());
            statement.setString(3, pembayaran.getID_RESEP());
            statement.setString(4, pembayaran.getID_REKAM());
            statement.setString(5, pembayaran.getID_TRANSAKSI_LAYANAN());
            statement.setDate(6, new Date(pembayaran.getTANGGAL_BAYAR().getTime()));
            statement.setInt(7, pembayaran.getTOTAL_HARGA());
            statement.setString(8, pembayaran.getSTATUS());
            statement.setString(9, pembayaran.getID_PEMBAYARAN());

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

    public void deletePembayaran(String Id_Pembayaran) throws RemoteException {
        log Log = new log();
        Log.setTanggal(Calendar.getInstance().getTime());
        Log.setKegiatan("Melakukan Proses Delete pada Tabel Pembayaran");
        Log.setAktor("Bagian Pembayaran");
        tableModelLog.insert(Log);

        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "DELETE FROM pembayaran WHERE ID_PEMBAYARAN = ?");

            statement.setString(1, Id_Pembayaran);

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

    public Pembayaran getPembayaran(String Id_Pembayaran) throws RemoteException {
        log Log = new log();
        Log.setTanggal(Calendar.getInstance().getTime());
        Log.setKegiatan("Melakukan Proses Get By Id pada Tabel Pembayaran");
        Log.setAktor("Bagian Pembayaran");
        tableModelLog.insert(Log);

        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "SELECT * FROM pembayaran WHERE ID_PEMBAYARAN = '" + Id_Pembayaran + "'");
//            statement.setString(1, Id_Pembayaran);
            ResultSet result = statement.executeQuery();

            Pembayaran pembayaran = null;

            if (result.next()) {
                pembayaran = new Pembayaran();
                pembayaran.setID_PEMBAYARAN(result.getString("ID_PEMBAYARAN"));
                pembayaran.setID_PASIEN(result.getString("ID_PASIEN"));
                pembayaran.setID_USG(result.getString("ID_USG"));
                pembayaran.setID_TRANSAKSI_LAB(result.getString("ID_TRANSAKSI_LAB"));
                pembayaran.setID_RESEP(result.getString("ID_RESEP"));
                pembayaran.setID_REKAM(result.getString("ID_REKAM"));
                pembayaran.setID_TRANSAKSI_LAYANAN(result.getString("ID_TRANSAKSI_LAYANAN"));
                pembayaran.setTANGGAL_BAYAR(result.getDate("TANGGAL_BAYAR"));
                pembayaran.setTOTAL_HARGA(result.getInt("TOTAL_HARGA"));
                pembayaran.setSTATUS(result.getString("STATUS"));
            }

            return pembayaran;

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
        log Log = new log();
        Log.setTanggal(Calendar.getInstance().getTime());
        Log.setKegiatan("Melakukan Proses Get All pada Tabel Pembayaran");
        Log.setAktor("Bagian Pembayaran");
        tableModelLog.insert(Log);

        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "SELECT pasien.ID_PASIEN AS ID_PASIEN, pasien.NAMA_PASIEN AS NAMA, pembayaran.ID_PEMBAYARAN AS ID, pembayaran.TANGGAL_BAYAR AS TANGGAL, pembayaran.TOTAL_HARGA AS TOTAL_HARGA, pembayaran.STATUS AS STATUS\n"
                    + "FROM pasien,pembayaran\n"
                    + "WHERE pasien.ID_PASIEN = pembayaran.ID_PASIEN");
            result = statement.executeQuery();
            List<Pembayaran> list = new ArrayList<Pembayaran>();
            Pembayaran pembayaran = null;
            while (result.next()) {
                pembayaran = new Pembayaran();
                pembayaran.setID_PEMBAYARAN(result.getString("ID"));
                pembayaran.setID_PASIEN(result.getString("ID_PASIEN"));
                pembayaran.setNAMA_PASIEN(result.getString("NAMA"));
                pembayaran.setTANGGAL_BAYAR(result.getDate("TANGGAL"));
                pembayaran.setTOTAL_HARGA(result.getInt("TOTAL_HARGA"));
                pembayaran.setSTATUS(result.getString("STATUS"));

                System.out.println(pembayaran.getID_PEMBAYARAN());
                statement = DatabaseUtilities.getConnection().prepareStatement(
                        "SELECT rekam_medis.TOTAL_HARGA AS REKAM "
                        + "FROM rekam_medis,pembayaran "
                        + "WHERE pembayaran.ID_PEMBAYARAN = '" + pembayaran.getID_PEMBAYARAN() + "' "
                        + "AND pembayaran.ID_REKAM = rekam_medis.ID_REKAM");
                result = statement.executeQuery();
                if (result.next()) {
                    pembayaran.setTOTAL_REKAM(result.getInt("REKAM"));
                }

                statement = DatabaseUtilities.getConnection().prepareStatement(
                        "SELECT resep.TOTAL_HARGA AS RESEP "
                        + "FROM resep,pembayaran "
                        + "WHERE pembayaran.ID_PEMBAYARAN = '" + pembayaran.getID_PEMBAYARAN() + "' "
                        + "AND pembayaran.ID_RESEP = resep.ID_RESEP");
                result = statement.executeQuery();
                if (result.next()) {
                    pembayaran.setTOTAL_RESEP(result.getInt("RESEP"));
                }

                statement = DatabaseUtilities.getConnection().prepareStatement(
                        "SELECT transaksi_usg.HARGA AS USG "
                        + "FROM transaksi_usg,pembayaran "
                        + "WHERE pembayaran.ID_PEMBAYARAN = '" + pembayaran.getID_PEMBAYARAN() + "' "
                        + "AND pembayaran.ID_USG = transaksi_usg.ID_USG");
                result = statement.executeQuery();
                if (result.next()) {
                    pembayaran.setTOTAL_USG(result.getInt("USG"));
                }

                statement = DatabaseUtilities.getConnection().prepareStatement(
                        "SELECT transaksi_lab.TOTAL_HARGA AS LAB "
                        + "FROM transaksi_lab,pembayaran "
                        + "WHERE pembayaran.ID_PEMBAYARAN = '" + pembayaran.getID_PEMBAYARAN() + "' "
                        + "AND pembayaran.ID_TRANSAKSI_LAB = transaksi_lab.ID_TRANSAKSI_LAB");
                result = statement.executeQuery();
                if (result.next()) {
                    pembayaran.setTOTAL_LAB(result.getInt("LAB"));
                }

                statement = DatabaseUtilities.getConnection().prepareStatement(
                        "SELECT transaksi_layanan_kecantikan.TOTAL_HARGA AS KECANTIKAN "
                        + "FROM transaksi_layanan_kecantikan,pembayaran "
                        + "WHERE pembayaran.ID_PEMBAYARAN = '" + pembayaran.getID_PEMBAYARAN() + "' "
                        + "AND pembayaran.ID_TRANSAKSI_LAYANAN = transaksi_layanan_kecantikan.ID_TRANSAKSI_LAYANAN");
                result = statement.executeQuery();
                if (result.next()) {
                    pembayaran.setTOTAL_KECANTIKAN(result.getInt("KECANTIKAN"));
                }
                list.add(pembayaran);
            }
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

    public List<Pembayaran> getPembayaranPrint(String idPembayaran) throws RemoteException {
        log Log = new log();
        Log.setTanggal(Calendar.getInstance().getTime());
        Log.setKegiatan("Melakukan Proses Get All pada Tabel Pembayaran");
        Log.setAktor("Bagian Pembayaran");
        tableModelLog.insert(Log);

        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "SELECT pasien.ID_PASIEN AS ID_PASIEN, pasien.NAMA_PASIEN AS NAMA, pembayaran.ID_PEMBAYARAN AS ID, pembayaran.TANGGAL_BAYAR AS TANGGAL, pembayaran.TOTAL_HARGA AS TOTAL_HARGA, pembayaran.STATUS AS STATUS\n"
                    + "FROM pasien,pembayaran\n"
                    + "WHERE pasien.ID_PASIEN = pembayaran.ID_PASIEN AND pembayaran.ID_PEMBAYARAN = '" + idPembayaran + "'");
            result = statement.executeQuery();
            List<Pembayaran> list = new ArrayList<Pembayaran>();
            Pembayaran pembayaran = null;
            while (result.next()) {
                pembayaran = new Pembayaran();
                pembayaran.setID_PEMBAYARAN(result.getString("ID"));
                pembayaran.setID_PASIEN(result.getString("ID_PASIEN"));
                pembayaran.setNAMA_PASIEN(result.getString("NAMA"));
                pembayaran.setTANGGAL_BAYAR(result.getDate("TANGGAL"));
                pembayaran.setTOTAL_HARGA(result.getInt("TOTAL_HARGA"));
                pembayaran.setSTATUS(result.getString("STATUS"));

                System.out.println(pembayaran.getID_PEMBAYARAN());
                statement = DatabaseUtilities.getConnection().prepareStatement(
                        "SELECT rekam_medis.TOTAL_HARGA AS REKAM "
                        + "FROM rekam_medis,pembayaran "
                        + "WHERE pembayaran.ID_PEMBAYARAN = '" + pembayaran.getID_PEMBAYARAN() + "' "
                        + "AND pembayaran.ID_REKAM = rekam_medis.ID_REKAM");
                result = statement.executeQuery();
                if (result.next()) {
                    pembayaran.setTOTAL_REKAM(result.getInt("REKAM"));
                }

                statement = DatabaseUtilities.getConnection().prepareStatement(
                        "SELECT resep.TOTAL_HARGA AS RESEP "
                        + "FROM resep,pembayaran "
                        + "WHERE pembayaran.ID_PEMBAYARAN = '" + pembayaran.getID_PEMBAYARAN() + "' "
                        + "AND pembayaran.ID_RESEP = resep.ID_RESEP");
                result = statement.executeQuery();
                if (result.next()) {
                    pembayaran.setTOTAL_RESEP(result.getInt("RESEP"));
                }

                statement = DatabaseUtilities.getConnection().prepareStatement(
                        "SELECT transaksi_usg.HARGA AS USG "
                        + "FROM transaksi_usg,pembayaran "
                        + "WHERE pembayaran.ID_PEMBAYARAN = '" + pembayaran.getID_PEMBAYARAN() + "' "
                        + "AND pembayaran.ID_USG = transaksi_usg.ID_USG");
                result = statement.executeQuery();
                if (result.next()) {
                    pembayaran.setTOTAL_USG(result.getInt("USG"));
                }

                statement = DatabaseUtilities.getConnection().prepareStatement(
                        "SELECT transaksi_lab.TOTAL_HARGA AS LAB "
                        + "FROM transaksi_lab,pembayaran "
                        + "WHERE pembayaran.ID_PEMBAYARAN = '" + pembayaran.getID_PEMBAYARAN() + "' "
                        + "AND pembayaran.ID_TRANSAKSI_LAB = transaksi_lab.ID_TRANSAKSI_LAB");
                result = statement.executeQuery();
                if (result.next()) {
                    pembayaran.setTOTAL_LAB(result.getInt("LAB"));
                }

                statement = DatabaseUtilities.getConnection().prepareStatement(
                        "SELECT transaksi_layanan_kecantikan.TOTAL_HARGA AS KECANTIKAN "
                        + "FROM transaksi_layanan_kecantikan,pembayaran "
                        + "WHERE pembayaran.ID_PEMBAYARAN = '" + pembayaran.getID_PEMBAYARAN() + "' "
                        + "AND pembayaran.ID_TRANSAKSI_LAYANAN = transaksi_layanan_kecantikan.ID_TRANSAKSI_LAYANAN");
                result = statement.executeQuery();
                if (result.next()) {
                    pembayaran.setTOTAL_KECANTIKAN(result.getInt("KECANTIKAN"));
                }
                list.add(pembayaran);
            }
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
    public List<Obat_detailResep> getObat_detailresep(String ID_RESEP) throws RemoteException {
        log Log = new log();
        Log.setTanggal(Calendar.getInstance().getTime());
        Log.setKegiatan("Melakukan Proses Get All pada Tabel Detail Resep");
        Log.setAktor("Bagian Pembayaran");
        tableModelLog.insert(Log);

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
                detail_resep.setJumlah(result.getInt("Jumlah"));
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
    public List<Obat_detailResepPrint> getObat_detailresepPrint(String ID_RESEP) throws RemoteException {
        log Log = new log();
        Log.setTanggal(Calendar.getInstance().getTime());
        Log.setKegiatan("Melakukan Proses Meihat Total Tagihan Pembelian Obat");
        Log.setAktor("Bagian Pembayaran");
        tableModelLog.insert(Log);

        Statement statement = null;
        ResultSet result = null;
        try {
            statement = DatabaseUtilities.getConnection().createStatement();
            result = statement.executeQuery("SELECT * FROM pembayaran WHERE ID_RESEP = '" + ID_RESEP + "'");
            List<Obat_detailResepPrint> list = new ArrayList<Obat_detailResepPrint>();
            Obat_detailResepPrint obat_detailResepPrint = new Obat_detailResepPrint();
            if (result.next()) {
                obat_detailResepPrint.setID_PEMBAYARAN(result.getString("ID_PEMBAYARAN"));
                obat_detailResepPrint.setTANGGAL_BAYAR(result.getDate("TANGGAL_BAYAR"));
                obat_detailResepPrint.setTOTAL_HARGA(result.getInt("TOTAL_HARGA"));
                obat_detailResepPrint.setSTATUS(result.getString("STATUS"));
            }
            statement = DatabaseUtilities.getConnection().createStatement();
            result = statement.executeQuery("SELECT * FROM detail_resep WHERE ID_RESEP = '" + ID_RESEP + "'");

            while (result.next()) {
                obat_detailResepPrint.setNo_Detail_Resep(result.getString("No_Detail_Resep"));
                obat_detailResepPrint.setId_Resep(result.getString("Id_Resep"));
                obat_detailResepPrint.setId_Obat(result.getString("Id_Obat"));
                obat_detailResepPrint.setTakaran(result.getString("Takaran"));
                obat_detailResepPrint.setPemakaian(result.getString("Pemakaian"));
                obat_detailResepPrint.setJumlah(result.getInt("Jumlah"));
                obat_detailResepPrint.setKeterangan(result.getString("Keterangan"));
                list.add(obat_detailResepPrint);
                obat_detailResepPrint = new Obat_detailResepPrint();
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

    public Pembayaran MeihatTotalTagihanPembayaran(String Id_Pasien) throws RemoteException {
        log Log = new log();
        Log.setTanggal(Calendar.getInstance().getTime());
        Log.setKegiatan("Melakukan Proses Get By Id dan Get by Date pada Tabel Pembayaran");
        Log.setAktor("Bagian Pembayaran");
        tableModelLog.insert(Log);

        java.sql.Date date = new java.sql.Date(new java.util.Date().getTime());
        System.out.println(date);
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "SELECT pasien.NAMA_PASIEN AS NAMA, pembayaran.ID_PEMBAYARAN AS ID, pembayaran.TOTAL_HARGA AS TOTAL_HARGA, pembayaran.STATUS AS STATUS\n"
                    + "FROM pasien,pembayaran\n"
                    + "WHERE pembayaran.ID_PASIEN = '" + Id_Pasien + "'\n"
                    + "AND pembayaran.TANGGAL_BAYAR = '" + date + "'\n"
                    + "AND pembayaran.STATUS = 'HUTANG'\n"
                    + "AND pasien.ID_PASIEN = pembayaran.ID_PASIEN");
            result = statement.executeQuery();
            Pembayaran pembayaran = null;
            if (result.next()) {
                pembayaran = new Pembayaran();
                pembayaran.setID_PEMBAYARAN(result.getString("ID"));
                pembayaran.setNAMA_PASIEN(result.getString("NAMA"));
                pembayaran.setTOTAL_HARGA(result.getInt("TOTAL_HARGA"));
                pembayaran.setSTATUS(result.getString("STATUS"));

                statement = DatabaseUtilities.getConnection().prepareStatement(
                        "SELECT rekam_medis.TOTAL_HARGA AS REKAM "
                        + "FROM rekam_medis,pembayaran "
                        + "WHERE pembayaran.ID_PEMBAYARAN = '" + pembayaran.getID_PEMBAYARAN() + "' "
                        + "AND pembayaran.ID_REKAM = rekam_medis.ID_REKAM");
                result = statement.executeQuery();
                if (result.next()) {
                    pembayaran.setTOTAL_REKAM(result.getInt("REKAM"));
                }

                statement = DatabaseUtilities.getConnection().prepareStatement(
                        "SELECT resep.TOTAL_HARGA AS RESEP "
                        + "FROM resep,pembayaran "
                        + "WHERE pembayaran.ID_PEMBAYARAN = '" + pembayaran.getID_PEMBAYARAN() + "' "
                        + "AND pembayaran.ID_RESEP = resep.ID_RESEP");
                result = statement.executeQuery();
                if (result.next()) {
                    pembayaran.setTOTAL_RESEP(result.getInt("RESEP"));
                }

                statement = DatabaseUtilities.getConnection().prepareStatement(
                        "SELECT transaksi_usg.HARGA AS USG "
                        + "FROM transaksi_usg,pembayaran "
                        + "WHERE pembayaran.ID_PEMBAYARAN = '" + pembayaran.getID_PEMBAYARAN() + "' "
                        + "AND pembayaran.ID_USG = transaksi_usg.ID_USG");
                result = statement.executeQuery();
                if (result.next()) {
                    pembayaran.setTOTAL_USG(result.getInt("USG"));
                }

                statement = DatabaseUtilities.getConnection().prepareStatement(
                        "SELECT transaksi_lab.TOTAL_HARGA AS LAB "
                        + "FROM transaksi_lab,pembayaran "
                        + "WHERE pembayaran.ID_PEMBAYARAN = '" + pembayaran.getID_PEMBAYARAN() + "' "
                        + "AND pembayaran.ID_TRANSAKSI_LAB = transaksi_lab.ID_TRANSAKSI_LAB");
                result = statement.executeQuery();
                if (result.next()) {
                    pembayaran.setTOTAL_LAB(result.getInt("LAB"));
                }

                statement = DatabaseUtilities.getConnection().prepareStatement(
                        "SELECT transaksi_layanan_kecantikan.TOTAL_HARGA AS KECANTIKAN "
                        + "FROM transaksi_layanan_kecantikan,pembayaran "
                        + "WHERE pembayaran.ID_PEMBAYARAN = '" + pembayaran.getID_PEMBAYARAN() + "' "
                        + "AND pembayaran.ID_TRANSAKSI_LAYANAN = transaksi_layanan_kecantikan.ID_TRANSAKSI_LAYANAN");
                result = statement.executeQuery();
                if (result.next()) {
                    pembayaran.setTOTAL_KECANTIKAN(result.getInt("KECANTIKAN"));
                }
            }

            return pembayaran;
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

    public Pembayaran MeihatTotalTagihanPembelianObat(String Id_Resep) throws RemoteException {
        log Log = new log();
        Log.setTanggal(Calendar.getInstance().getTime());
        Log.setKegiatan("Melakukan Proses Get By Id pada Tabel Resep");
        Log.setAktor("Bagian Pembayaran");
        tableModelLog.insert(Log);

        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "SELECT * FROM pembayaran WHERE ID_RESEP = '" + Id_Resep + "'");
            ResultSet result = statement.executeQuery();

            Pembayaran pembayaran = null;

            if (result.next()) {
                pembayaran = new Pembayaran();
                pembayaran.setID_PEMBAYARAN(result.getString("ID_PEMBAYARAN"));
                pembayaran.setTANGGAL_BAYAR(result.getDate("TANGGAL_BAYAR"));
                pembayaran.setTOTAL_HARGA(result.getInt("TOTAL_HARGA"));
                pembayaran.setSTATUS(result.getString("STATUS"));
            }

            return pembayaran;

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

    public String updateStatusPembayaran(String Id_Pembayaran, String Status) throws RemoteException {
        log Log = new log();
        Log.setTanggal(Calendar.getInstance().getTime());
        Log.setKegiatan("Melakukan Proses Update Status pada Tabel Pembayaran");
        Log.setAktor("Bagian Pembayaran");
        tableModelLog.insert(Log);

        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "UPDATE pembayaran SET STATUS = ? "
                    + "WHERE ID_PEMBAYARAN = ?"
            );
            statement.setString(1, Status);
            statement.setString(2, Id_Pembayaran);

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
        return Status;
    }

    public String getStatus(String Id_Pembayaran) throws RemoteException {
        log Log = new log();
        Log.setTanggal(Calendar.getInstance().getTime());
        Log.setKegiatan("Melakukan Proses Get Status dengan Mengakses Tabel Pembayaran");
        Log.setAktor("Bagian Pembayaran");
        tableModelLog.insert(Log);

        Statement state = null;
        ResultSet rs = null;
        String newStatus = "0";
        try {
            state = (Statement) DatabaseUtilities.getConnection().createStatement();
            String sql = "SELECT STATUS FROM pembayaran WHERE ID_PEMBAYARAN = '" + Id_Pembayaran + "'";
            rs = state.executeQuery(sql);
            while (rs.next()) {
                newStatus = rs.getString(1);
            }
        } catch (Throwable ex) {
            System.out.println("masuk catch");
        }
        System.out.println(newStatus);
        return newStatus;
    }

}
