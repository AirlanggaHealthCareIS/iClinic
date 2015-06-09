/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ServerApplication.Service;

import Database.Entity.Obat_detailResep;
import Database.Entity.Obat_detailResepPembelian;
import Database.Entity.Obat_resep;
import Database.Entity.Obat_tabelMaster;
import Database.Entity.Pembayaran;
import Database.Service.ApotekerService;
import ServerApplication.Utilities.DatabaseUtilities;
import ServerApplication.entity.log;
import ServerApplication.model.TableModelLog;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Rindu Puspita
 */
public class ApotekerServiceServer extends UnicastRemoteObject implements ApotekerService {
    
    TableModelLog tableModelLog;

    public ApotekerServiceServer(TableModelLog tableModelLog1) throws RemoteException {
         this.tableModelLog = tableModelLog1;
    }

    public Obat_tabelMaster insertObat_tabelMaster(Obat_tabelMaster obat) throws RemoteException {

        log Log = new log();
        Log.setTanggal(Calendar.getInstance().getTime());
        Log.setKegiatan("Melakukan Proses Insert pada Tabel Obat");
        Log.setAktor("Bagian Apoteker");
        tableModelLog.insert(Log);
       
        
        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "INSERT INTO obat (ID_OBAT,NAMA_OBAT,JENIS_OBAT,HARGA_OBAT,SATUAN) values(?,?,?,?,?,?,?,?)"
            );
            statement.setString(1, obat.getId_Obat());
            statement.setString(2, obat.getNama_Obat());
            statement.setString(3, obat.getJenis_Obat());
            statement.setInt(4, obat.getHarga_Obat());
            statement.setString(5, obat.getSatuan());

            statement.executeUpdate();
            ResultSet result = statement.getGeneratedKeys();
            if (result.next()) {
                obat.setId_Obat(result.getString(1));
            }
            result.close();
            return obat;
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

    public void updateObat_tabelMaster(Obat_tabelMaster obat) throws RemoteException {

        log Log = new log();
        Log.setTanggal(Calendar.getInstance().getTime());
        Log.setKegiatan("Melakukan Proses Update pada Tabel Obat");
        Log.setAktor("Bagian Apoteker");
        tableModelLog.insert(Log);
        
        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "UPDATE obat SET NAMA_OBAT = ?,"
                    + "JENIS_OBAT = ?, HARGA_OBAT = ?, SATUAN = ?"
            );
            statement.setString(1, obat.getId_Obat());
            statement.setString(2, obat.getNama_Obat());
            statement.setString(3, obat.getJenis_Obat());
            statement.setInt(4, obat.getHarga_Obat());
            statement.setString(5, obat.getSatuan());

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

    public void deleteObat_tabelMaster(int Id_Obat) throws RemoteException {

        log Log = new log();
        Log.setTanggal(Calendar.getInstance().getTime());
        Log.setKegiatan("Melakukan Proses Delete pada Tabel Obat");
        Log.setAktor("Bagian Apoteker");
        tableModelLog.insert(Log);
        
        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "DELETE FROM obat WHERE ID_OBAT = ?");

            statement.setLong(1, Id_Obat);

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

    public Obat_tabelMaster getObat_tabelMaster(int Id_Obat) throws RemoteException {

        log Log = new log();
        Log.setTanggal(Calendar.getInstance().getTime());
        Log.setKegiatan("Melakukan Proses Get By Id pada Tabel Obat");
        Log.setAktor("Bagian Apoteker");
        tableModelLog.insert(Log);
        
        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "SELECT * FROM obat WHERE ID_Obat = ?");

            ResultSet result = statement.executeQuery();

            Obat_tabelMaster obat = null;

            if (result.next()) {
                obat = new Obat_tabelMaster();
                obat.setId_Obat(result.getString("Id_Obat"));
                obat.setNama_Obat(result.getString("Nama_Obat"));
                obat.setJenis_Obat(result.getString("Jenis_Obat"));
                obat.setHarga_Obat(result.getInt("Harga_Obat"));
                obat.setSatuan(result.getString("Satuan"));
            }

            return obat;

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

    public List<Obat_tabelMaster> getObat_tabelMaster() throws RemoteException {

        log Log = new log();
        Log.setTanggal(Calendar.getInstance().getTime());
        Log.setKegiatan("Melakukan Proses Get All pada Tabel Obat");
        Log.setAktor("Bagian Apoteker");
        tableModelLog.insert(Log);
        
        Statement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().createStatement();

            ResultSet result = statement.executeQuery("SELECT * FROM__obat");

            List<Obat_tabelMaster> list = new ArrayList<Obat_tabelMaster>();

            while (result.next()) {
                Obat_tabelMaster obat = new Obat_tabelMaster();
                obat.setId_Obat(result.getString("Id_Obat"));
                obat.setNama_Obat(result.getString("Nama_Obat"));
                obat.setJenis_Obat(result.getString("Jenis_Obat"));
                obat.setHarga_Obat(result.getInt("Harga_Obat"));
                obat.setSatuan(result.getString("Satuan"));
                list.add(obat);
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

    public Obat_detailResep insertObat_detailResep(Obat_detailResep detail_resep) throws RemoteException {

        log Log = new log();
        Log.setTanggal(Calendar.getInstance().getTime());
        Log.setKegiatan("Melakukan Proses Insert pada Tabel Detail Resep");
        Log.setAktor("Bagian Apoteker");
        tableModelLog.insert(Log);
        
        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "INSERT INTO detail_resep (NO_DETAIL_RESEP,ID_RESEP,ID_OBAT,TAKARAN,PEMAKAIAN,JUMLAH,KETERANGAN) values(?,?,?,?,?,?,?)"
            );
            statement.setString(1, detail_resep.getNo_Detail_Resep());
            statement.setString(2, detail_resep.getId_Resep());
            statement.setString(3, detail_resep.getId_Obat());
            statement.setString(4, detail_resep.getTakaran());
            statement.setString(5, detail_resep.getPemakaian());
            statement.setInt(6, detail_resep.getJumlah());
            statement.setString(7, detail_resep.getKeterangan());

            statement.executeUpdate();

            return detail_resep;
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

    public void updateObat_detailResep(Obat_detailResep detail_resep) throws RemoteException {

        log Log = new log();
        Log.setTanggal(Calendar.getInstance().getTime());
        Log.setKegiatan("Melakukan Proses Update pada Tabel Detail Resep");
        Log.setAktor("Bagian Apoteker");
        tableModelLog.insert(Log);

        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "UPDATE detail_resep SET NO_DETAIL_RESEP = ?,"
                    + "ID_RESEP = ?, ID_OBAT = ?, TAKARAN = ?, "
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

    public void deleteObat_detailResep(String Id_Obat) throws RemoteException {

        log Log = new log();
        Log.setTanggal(Calendar.getInstance().getTime());
        Log.setKegiatan("Melakukan Proses Delete pada Tabel Detail Resep");
        Log.setAktor("Bagian Apoteker");
        tableModelLog.insert(Log);
 
        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "DELETE FROM detail_resep WHERE NO_DETAIL_RESEP = '"+Id_Obat+"'");

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

    public Obat_detailResep getObat_detailResep(String Id_Obat) throws RemoteException {

        log Log = new log();
        Log.setTanggal(Calendar.getInstance().getTime());
        Log.setKegiatan("Melakukan Proses Get By Id pada Tabel Detail Resep");
        Log.setAktor("Bagian Apoteker");
        tableModelLog.insert(Log);

        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "SELECT * FROM detail_resep WHERE No_Detail_Resep = ?");

            ResultSet result = statement.executeQuery();

            Obat_detailResep detail_resep = null;

            if (result.next()) {
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

    public List<Obat_detailResepPembelian> getObat_detailResepPembelian(String Id_Resep) throws RemoteException {

        log Log = new log();
        Log.setTanggal(Calendar.getInstance().getTime());
        Log.setKegiatan("Melakukan Proses Get By Id pada Tabel Detail Resep");
        Log.setAktor("Bagian Apoteker");
        tableModelLog.insert(Log);

        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "SELECT detail_resep.*, obat.NAMA_OBAT AS Nama_Obat, obat.HARGA_OBAT AS harga FROM detail_resep , obat  WHERE Id_Resep = '"+Id_Resep+"' AND detail_resep.ID_OBAT = obat.ID_OBAT");

            ResultSet result = statement.executeQuery();

            Obat_detailResepPembelian detail_resep = null;
            
            List<Obat_detailResepPembelian> list = new ArrayList<Obat_detailResepPembelian>();

            while (result.next()) {
                detail_resep = new Obat_detailResepPembelian();
                detail_resep.setNo_Detail_Resep(result.getString("No_Detail_Resep"));
                System.out.println(detail_resep.getNo_Detail_Resep());
                detail_resep.setNama_Obat(result.getString("Nama_Obat"));
                System.out.println(detail_resep.getNama_Obat());
                detail_resep.setTakaran(result.getString("Takaran"));
                System.out.println(detail_resep.getTakaran());
                detail_resep.setPemakaian(result.getString("Pemakaian"));
                System.out.println(detail_resep.getPemakaian());
                detail_resep.setJumlah(result.getInt("Jumlah"));
                System.out.println(detail_resep.getJumlah());
                detail_resep.setHarga(result.getInt("Harga"));
                System.out.println(detail_resep.getHarga());
                int jumlah = result.getInt("JUMLAH");
                int harga = result.getInt("HARGA");
                detail_resep.setTotal(jumlah * harga);
                System.out.println("");
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
    
    public List<Obat_detailResep> getObat_detailresep(String ID_RESEP) throws RemoteException {

        log Log = new log();
        Log.setTanggal(Calendar.getInstance().getTime());
        Log.setKegiatan("Melakukan Proses Get All pada Tabel Detail Resep");
        Log.setAktor("Bagian Apoteker");
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

    public Obat_resep insertObat_resep(Obat_resep resep) throws RemoteException {

        log Log = new log();
        Log.setTanggal(Calendar.getInstance().getTime());
        Log.setKegiatan("Melakukan Proses Insert pada Tabel Obat");
        Log.setAktor("Bagian Apoteker");
        tableModelLog.insert(Log);
        
        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "INSERT INTO resep (ID_RESEP,ID_REKAM,TOTAL_HARGA) values(?,?,?)"
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

    public void updateObat_resep(Obat_resep resep) throws RemoteException {

        log Log = new log();
        Log.setTanggal(Calendar.getInstance().getTime());
        Log.setKegiatan("Melakukan Proses Update pada Tabel Obat");
        Log.setAktor("Bagian Apoteker");
        tableModelLog.insert(Log);
        
       
        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "UPDATE obat SET ID_RESEP = ?,"
                    + "ID_REKAM = ?, TOTAL_HARGA = ? "
            );
            statement.setString(1, resep.getId_Resep());
            statement.setString(2, resep.getId_Rekam());
            statement.setInt(3, resep.getTotal_Harga());

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

    public void deleteObat_resep(int Id_Obat) throws RemoteException {

        log Log = new log();
        Log.setTanggal(Calendar.getInstance().getTime());
        Log.setKegiatan("Melakukan Proses Delete pada Tabel Obat");
        Log.setAktor("Bagian Apoteker");
        tableModelLog.insert(Log);
        
        
        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "DELETE FROM resep WHERE ID_RESEP = ?");

            statement.setLong(1, Id_Obat);

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

    public Obat_resep getObat_resep(int Id_Obat) throws RemoteException {

        log Log = new log();
        Log.setTanggal(Calendar.getInstance().getTime());
        Log.setKegiatan("Melakukan Proses Get By Id pada Tabel Obat");
        Log.setAktor("Bagian Apoteker");
        tableModelLog.insert(Log);

        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "SELECT * FROM resep WHERE ID_Resep = ?");

            ResultSet result = statement.executeQuery();

            Obat_resep resep = null;

            if (result.next()) {
                resep = new Obat_resep();
                resep.setId_Resep(result.getString("Id_Resep"));
                resep.setId_Rekam(result.getString("Id_Rekam"));
                resep.setTotal_Harga(result.getInt("Total_Harga"));

            }
            return resep;
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

    public List<Obat_resep> getObat_resep() throws RemoteException {

        log Log = new log();
        Log.setTanggal(Calendar.getInstance().getTime());
        Log.setKegiatan("Melakukan Proses Get All pada Tabel Obat");
        Log.setAktor("Bagian Apoteker");
        tableModelLog.insert(Log);

        Statement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().createStatement();

            ResultSet result = statement.executeQuery("SELECT * FROM__detail_resep");

            List<Obat_resep> list = new ArrayList<Obat_resep>();
            while (result.next()) {
                Obat_resep resep = new Obat_resep();
                resep.setId_Resep(result.getString("Id_Resep"));
                resep.setId_Rekam(result.getString("Id_Rekam"));
                resep.setTotal_Harga(result.getInt("Total_Harga"));
                list.add(resep);
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

    public String mencocokan_IdResep (String Id_Resep){
        
        log Log = new log();
        Log.setTanggal(Calendar.getInstance().getTime());
        Log.setKegiatan("Melakukan Proses Pencocokan ID RESEP");
        Log.setAktor("Bagian Apoteker");
        tableModelLog.insert(Log);
       
         Statement state = null;
         ResultSet rs = null;
        
        String menemukan_Id = "";
       try{
           state = (Statement) DatabaseUtilities.getConnection().createStatement();
           String sql = "SELECT ID_RESEP FROM resep WHERE ID_RESEP = '"+Id_Resep+"'";
           rs = state.executeQuery(sql);
           while (rs.next()){
               menemukan_Id = rs.getString(1);
           }

       }catch(SQLException exception){
        exception.printStackTrace();
       }
        return menemukan_Id;
    }
    
    public List getNamaObat() throws RemoteException {
        
        log Log = new log();
        Log.setTanggal(Calendar.getInstance().getTime());
        Log.setKegiatan("Melakukan Get Nama Obat");
        Log.setAktor("Bagian Apoteker");
        tableModelLog.insert(Log);
        
        Statement statement = null;
        ResultSet resultSet = null;
        List product_code = new ArrayList();
        try {
            statement = (Statement) DatabaseUtilities.getConnection().createStatement();
            resultSet = statement.executeQuery("SELECT NAMA_OBAT from obat");
            while (resultSet.next()) {
                product_code.add(resultSet.getString("NAMA_OBAT"));
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

    public String getIdObat(String namaObat) throws RemoteException {
        
        log Log = new log();
        Log.setTanggal(Calendar.getInstance().getTime());
        Log.setKegiatan("Melakukan Proses Get Jenis Obat");
        Log.setAktor("Bagian Apoteker");
        tableModelLog.insert(Log);
        
        Statement state = null;
        ResultSet rs = null;
        String noDetail = "";
        try {
            state = (Statement) DatabaseUtilities.getConnection().createStatement();
            String sql = "SELECT ID_OBAT FROM obat WHERE  NAMA_OBAT = '" + namaObat + "'";
            rs = state.executeQuery(sql);
            while (rs.next()) {
                noDetail = rs.getString(1);
            }
        } catch (Throwable ex) {
            System.out.println(ex);
        }
        System.out.println(noDetail);
        return noDetail;
    }

    public List getTakaran() throws RemoteException {
        
        log Log = new log();
        Log.setTanggal(Calendar.getInstance().getTime());
        Log.setKegiatan("Melakukan Proses Get Takaran");
        Log.setAktor("Bagian Apoteker");
        tableModelLog.insert(Log);
        
        Statement statement = null;
        ResultSet resultSet = null;
        List product_code = new ArrayList();
        try {
            statement = (Statement) DatabaseUtilities.getConnection().createStatement();
            resultSet = statement.executeQuery("SELECT TAKARAN from detail_resep");
            while (resultSet.next()) {
                product_code.add(resultSet.getString("TAKARAN"));
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

    public String getIdTakaran(String takaran) throws RemoteException {
        
        log Log = new log();
        Log.setTanggal(Calendar.getInstance().getTime());
        Log.setKegiatan("Melakukan Proses Get ID Takaran");
        Log.setAktor("Bagian Apoteker");
        tableModelLog.insert(Log);
        
        System.out.println("");
        Statement state = null;
        ResultSet rs = null;
        String noDetail = "";
        try {
            state = (Statement) DatabaseUtilities.getConnection().createStatement();
            String sql = "SELECT TAKARAN FROM detail_resep WHERE  NO_DETAIL_RESEP = '" + takaran + "'";
            rs = state.executeQuery(sql);
            while (rs.next()) {
                noDetail = rs.getString(1);
            }
        } catch (Throwable ex) {
            System.out.println(ex);
        }
        System.out.println(noDetail);
        return noDetail;
    }

    public List getPemakaian() throws RemoteException {
        
        log Log = new log();
        Log.setTanggal(Calendar.getInstance().getTime());
        Log.setKegiatan("Melakukan Proses Get Pemakaian");
        Log.setAktor("Bagian Apoteker");
        tableModelLog.insert(Log);
        
        Statement statement = null;
        ResultSet resultSet = null;
        List product_code = new ArrayList();
        try {
            statement = (Statement) DatabaseUtilities.getConnection().createStatement();
            resultSet = statement.executeQuery("SELECT PEMAKAIAN from detail_resep");
            while (resultSet.next()) {
                product_code.add(resultSet.getString("PEMAKAIAN"));
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

    public String getIdPemakaian(String pemakaian) throws RemoteException {
        
        log Log = new log();
        Log.setTanggal(Calendar.getInstance().getTime());
        Log.setKegiatan("Melakukan Proses Get ID Pemakaian");
        Log.setAktor("Bagian Apoteker");
        tableModelLog.insert(Log);
        
        Statement state = null;
        ResultSet rs = null;
        String noDetail = "";
        try {
            state = (Statement) DatabaseUtilities.getConnection().createStatement();
            String sql = "SELECT PEMAKAIAN FROM detail_resep WHERE  NO_DETAIL_RESEP = '" + pemakaian + "'";
            rs = state.executeQuery(sql);
            while (rs.next()) {
                noDetail = rs.getString(1);
            }
        } catch (Throwable ex) {
            System.out.println(ex);
        }
        System.out.println(noDetail);
        return noDetail;
    }

    public int getHargaObat(String namaobat) throws RemoteException {
        
        log Log = new log();
        Log.setTanggal(Calendar.getInstance().getTime());
        Log.setKegiatan("Melakukan Proses Get Harga");
        Log.setAktor("Bagian Apoteker");
        tableModelLog.insert(Log);
        
        Statement state = null;
        ResultSet rs = null;
        int hargaObat = 0;
        try {
            state = (Statement) DatabaseUtilities.getConnection().createStatement();
            String sql = "SELECT HARGA_OBAT FROM obat WHERE  NAMA_OBAT = '" + namaobat + "'";
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
    
    public String getAutoNumberDariObat_detailResep() throws RemoteException {
        
        log Log = new log();
        Log.setTanggal(Calendar.getInstance().getTime());
        Log.setKegiatan("Melakukan Proses Auto Number dengan Mengakses Tabel detail_resep");
        Log.setAktor("Bagian Apoteker");
        tableModelLog.insert(Log);
        
        Statement state = null;
        ResultSet rs = null;

        String number = "";
        String nomerBaru = "";
        int numberBaru = 0;
        try {
            state = (Statement) DatabaseUtilities.getConnection().createStatement();
            String sql = "SELECT NO_DETAIL_RESEP FROM detail_resep ORDER BY NO_DETAIL_RESEP DESC limit 1";
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
            nomerBaru = "DR0001";
        } else {
            String[] pisah = number.split("(?<=\\G.{1})");
            String numbersebelumnya = pisah[2]+pisah[3] + pisah[4] + pisah[5];
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
            nomerBaru = "DR" + nol + numberBaru;
        }
        System.out.println(nomerBaru);
        return nomerBaru;
    }

    public String getAutoNumberDariResep() throws RemoteException {
        
        log Log = new log();
        Log.setTanggal(Calendar.getInstance().getTime());
        Log.setKegiatan("Melakukan Proses Auto Number dengan Mengakses Tabel detail_resep");
        Log.setAktor("Bagian Apoteker");
        tableModelLog.insert(Log);
        
        Statement state = null;
        ResultSet rs = null;

        String number = "";
        String nomerBaru = "";
        int numberBaru = 0;
        try {
            state = (Statement) DatabaseUtilities.getConnection().createStatement();
            String sql = "SELECT ID_RESEP FROM resep ORDER BY ID_RESEP DESC limit 1";
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
            nomerBaru = "RSP0001";
        } else {
            String[] pisah = number.split("(?<=\\G.{1})");
            for (int i = 0; i < pisah.length; i++) {
                System.out.println(pisah[i]);
            }
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
            nomerBaru = "RSP" + nol + numberBaru;
        }
        System.out.println(nomerBaru);
        return nomerBaru;
    }
    
    public void updateResep(Obat_resep resep, String ID_RESEP, int TOTAL_HARGA) throws RemoteException {
        
        log Log = new log();
        Log.setTanggal(Calendar.getInstance().getTime());
        Log.setKegiatan("Melakukan Proses Update pada Tabel Resep");
        Log.setAktor("Bagian Apoteker");
        tableModelLog.insert(Log);
        
        PreparedStatement statement = null;
        try{
            statement = DatabaseUtilities.getConnection().prepareStatement(
            "UPDATE resep SET TOTAL_HARGA = '"+TOTAL_HARGA+"' WHERE ID_RESEP = '"+ ID_RESEP +"'");
        
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
    
    public void updateJumlahPenukaranResep(int Jumlah, String No_Detail_Resep) throws RemoteException {
        
        log Log = new log();
        Log.setTanggal(Calendar.getInstance().getTime());
        Log.setKegiatan("Melakukan Proses Update pada Tabel Resep");
        Log.setAktor("Bagian Apoteker");
        tableModelLog.insert(Log);
        

        PreparedStatement statement = null;
       try{
           statement = DatabaseUtilities.getConnection().prepareStatement(
                    "UPDATE detail_resep SET JUMLAH = ? " +
                    "WHERE No_Deail_Resep = ?"
                   );
           statement.setInt(1, Jumlah); 
           statement.setString(2, No_Detail_Resep);

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
    
    public void updateHargaPadaResep(Obat_resep resep) throws RemoteException {
        
        log Log = new log();
        Log.setTanggal(Calendar.getInstance().getTime());
        Log.setKegiatan("Melakukan Proses Update pada Tabel Resep");
        Log.setAktor("Bagian Apoteker");
        tableModelLog.insert(Log);

        PreparedStatement statement = null;
       try{
           statement = DatabaseUtilities.getConnection().prepareStatement(
                    "UPDATE resep SET TOTAL_HARGA = ? " +
                    "WHERE ID_RESEP = ?"
                   );
           statement.setInt(1, resep.getTotal_Harga());
           statement.setString (2, resep.getId_Resep());

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
    
    //-----Pembayaran-----//
    public String mencariIdPasienDariPembayaran(String idResep) throws RemoteException {
        
        log Log = new log();
        Log.setTanggal(Calendar.getInstance().getTime());
        Log.setKegiatan("Melakukan Proses Pencarian ID PASIEN dengan Mengakses Tabel Rekam Medis");
        Log.setAktor("Bagian Apoteker");
        tableModelLog.insert(Log);

        Statement state = null;
        ResultSet rs = null;
        String idPasien = "";
        try {
            state = (Statement) DatabaseUtilities.getConnection().createStatement();
            String sql = "SELECT `rekam_medis`.ID_PASIEN \n"
                    + "FROM `rekam_medis`,`resep` \n"
                    + "WHERE `resep`.ID_REKAM = `rekam_medis`.ID_REKAM \n"
                    + "AND `resep`.ID_RESEP = '" + idResep + "'";
            rs = state.executeQuery(sql);
            while (rs.next()) {
                idPasien = rs.getString(1);
            }
            System.out.println(idPasien);
        } catch (Throwable ex) {
            System.out.println("masuk catch");
        }
        return idPasien;
    }

    public String mencariIdPembayaranDariPembayaran(String idPasien) throws RemoteException {
        
        log Log = new log();
        Log.setTanggal(Calendar.getInstance().getTime());
        Log.setKegiatan("Melakukan Proses Pencarian ID PEMBAYARAN dengan Mengakses Tabel Pembayaran");
        Log.setAktor("Bagian Apoteker");
        tableModelLog.insert(Log);
        
        java.sql.Date date = new java.sql.Date(new java.util.Date().getTime());
        Statement state = null;
        ResultSet rs = null;
        String idPembayaran = "";
        try {
            state = (Statement) DatabaseUtilities.getConnection().createStatement();
            String sql = "SELECT `pembayaran`.ID_PEMBAYARAN \n"
                    + "FROM `pembayaran`,`rekam_medis`,`resep` \n"
                    + "WHERE `resep`.ID_REKAM = `rekam_medis`.ID_REKAM \n"
                    + "AND `rekam_medis`.ID_PASIEN = `pembayaran`.ID_PASIEN \n"
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
        log Log = new log();
        Log.setTanggal(Calendar.getInstance().getTime());
        Log.setKegiatan("Melakukan Proses Pencarian get PEMBAYARAN dengan Mengakses Tabel Pembayaran");
        Log.setAktor("Bagian Apoteker");
        tableModelLog.insert(Log);
       
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

    public void updatePembayaranDariPembayaran(Pembayaran pembayaranDB, String idResep, int Harga) throws RemoteException {
        
        log Log = new log();
        Log.setTanggal(Calendar.getInstance().getTime());
        Log.setKegiatan("Melakukan Proses Update pada Tabel Pembayaran");
        Log.setAktor("Bagian Apoteker");
        tableModelLog.insert(Log);
        
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
            statement.setString(3, idResep);
            statement.setString(4, pembayaranDB.getID_REKAM());
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
        
        log Log = new log();
        Log.setTanggal(Calendar.getInstance().getTime());
        Log.setKegiatan("Melakukan Proses Auto Number dengan Mengakses Tabel Pembayaran");
        Log.setAktor("Bagian Apoteker");
        tableModelLog.insert(Log);

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

    public void insertPembayaranDariPembayaran(String idPembayaran, String idPasien, String idResep, int Harga) throws RemoteException {
        
        log Log = new log();
        Log.setTanggal(Calendar.getInstance().getTime());
        Log.setKegiatan("Melakukan Proses Insert pada Tabel Pembayaran");
        Log.setAktor("Bagian Apoteker");
        tableModelLog.insert(Log);

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
            statement.setString(5, idResep);
            statement.setString(6, null);
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
