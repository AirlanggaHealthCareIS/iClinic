package ServerApplication.Service;

import Database.Entity.Kecantikan_tabelMaster;
import Database.Entity.Lab_tabelMaster;
import Database.Entity.Obat_tabelMaster;
import Database.Entity.Penyakit_tabelMaster;
import Database.Entity.Tindakan_tabelMaster;
import Database.Entity.User;
import Database.Service.AdministratorService;
import ServerApplication.Utilities.DatabaseUtilities;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AdministratorServiceServer extends UnicastRemoteObject implements AdministratorService{

    public AdministratorServiceServer() throws RemoteException {}
    
    public String loginUser(String Username, String Password) throws RemoteException {
        System.out.println("Client Melakukan Proses Login dengan Mengakses Tabel User");
        Statement state = null;
        ResultSet rs = null;
        String fn = "0";
	try {
            state = (Statement) DatabaseUtilities.getConnection().createStatement();
            String sql = "SELECT JABATAN FROM user WHERE USERNAME = '" + Username + "' and PASSWORD = '" + Password + "'";
            rs = state.executeQuery(sql);
            while (rs.next()){
                fn = rs.getString(1);
            }
        }
        catch (Throwable ex) {
            System.out.println("masuk catch");
        }
        System.out.println(fn);
        return fn;
    }
    
     public User insertUser(User user) throws RemoteException {
        System.out.println("Client Melakukan Proses Insert pada Tabel User");
        
        PreparedStatement statement = null;
        try{
            statement = DatabaseUtilities.getConnection().prepareStatement(
            "INSERT INTO user(ID_USER, NAMA_USER, JABATAN, USERNAME, PASSWORD)" + "VALUES(?,?,?,?,?)");
            statement.setString(1, user.getId_User());
            statement.setString(2, user.getNama_User());
            statement.setString(3, user.getJabatan());
            statement.setString(4, user.getUsername());
            statement.setString(5, user.getPassword());
            
            statement.executeUpdate();
            return user;
        } catch(SQLException exception){
            exception.printStackTrace();
            return null;
        } finally{
            if(statement != null){
                try{
                    statement.close();
                }
                catch(SQLException exception){}
            }
        }
    }

    public void updateUser(User user) throws RemoteException {
        System.out.println("Client Melakukan Proses Update pada Tabel User");
        
        PreparedStatement statement = null;
        try{
            statement = DatabaseUtilities.getConnection().prepareStatement(
            "UPDATE user SET NAMA_USER = ?, JABATAN = ?, USERNAME = ?, PASSWORD = ?" + "WHERE ID_USER = ?");
        
            statement.setString(1, user.getNama_User());
            statement.setString(2, user.getJabatan());
            statement.setString(3, user.getUsername());
            statement.setString(4, user.getPassword());
            statement.setString(5, user.getId_User());
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

    public void deleteUser(String Id_User) throws RemoteException {
        System.out.println("Client Melakukan Proses Delete pada Tabel User");

        PreparedStatement statement = null;
        try{
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "DELETE FROM user WHERE ID_USER = ?");
            
            statement.setString(1, Id_User);
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

    public User getUser(String Id_User) throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel User");

        User user = null;
        return user;
    }

    public List<User> getUser() throws RemoteException {
        System.out.println("Client Melakukan Proses Get All pada Tabel User");

        Statement statement = null;
        try{
            statement = DatabaseUtilities.getConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM user");
            
            List<User> list = new ArrayList<User>();
            while(result.next()){
                User user = new User();
                user.setId_User(result.getString("ID_USER"));
                user.setNama_User(result.getString("NAMA_USER"));
                user.setJabatan(result.getString("JABATAN"));
                user.setUsername(result.getString("USERNAME"));
                user.setPassword(result.getString("PASSWORD"));
                list.add(user);
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
    
    public String getAutoNumberUser() throws RemoteException{
        System.out.println("Client Melakukan Proses Auto Number dengan Mengakses Tabel User");
        Statement state = null;
        ResultSet rs = null;
        
        String number = "";
        String nomerBaru = "";
        int numberBaru = 0;
	try {
            state = (Statement) DatabaseUtilities.getConnection().createStatement();
            String sql = "SELECT ID_USER FROM user ORDER BY ID_USER DESC limit 1";
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
            nomerBaru ="U0001";
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
            nomerBaru = "U"+nol+numberBaru;
        }
        System.out.println(nomerBaru);
        return nomerBaru;
    }
    
    public Obat_tabelMaster insertObat_tabelMaster(Obat_tabelMaster obat) throws RemoteException {
        System.out.println("Client Melakukan Proses Insert pada Tabel Obat");
        
        PreparedStatement statement = null;
        try{
            statement = DatabaseUtilities.getConnection().prepareStatement(
            "INSERT INTO obat(ID_OBAT, NAMA_OBAT, JENIS_OBAT, HARGA_OBAT, SATUAN)" + "VALUES(?,?,?,?,?)");
            statement.setString(1, obat.getId_Obat());
            statement.setString(2, obat.getNama_Obat());
            statement.setString(3, obat.getJenis_Obat());
            statement.setInt(4, obat.getHarga_Obat());
            statement.setString(5, obat.getSatuan());
            
            statement.executeUpdate();
            return obat;
        } catch(SQLException exception){
            exception.printStackTrace();
            return null;
        } finally{
            if(statement != null){
                try{
                    statement.close();
                }
                catch(SQLException exception){}
            }
        }
    }

    public void updateObat_tabelMaster(Obat_tabelMaster obat) throws RemoteException {
        System.out.println("Client Melakukan Proses Update pada Tabel Obat");
        
        PreparedStatement statement = null;
        try{
            statement = DatabaseUtilities.getConnection().prepareStatement(
            "UPDATE obat SET NAMA_OBAT = ?, JENIS_OBAT = ?, HARGA_OBAT = ?, SATUAN = ?" + "WHERE ID_OBAT = ?");
            
            statement.setString(1, obat.getNama_Obat());
            statement.setString(2, obat.getJenis_Obat());
            statement.setInt(3, obat.getHarga_Obat());
            statement.setString(4, obat.getSatuan());
            statement.setString(5, obat.getId_Obat());
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

    public void deleteObat_tabelMaster(String Id_Obat) throws RemoteException {
        System.out.println("Client Melakukan Proses Delete pada Tabel Obat");

        PreparedStatement statement = null;
        try{
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "DELETE FROM obat WHERE ID_OBAT = ?");
            
            statement.setString(1, Id_Obat);
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

    public Obat_tabelMaster getObat_tabelMaster(String Id_Obat) throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel Obat");

        Obat_tabelMaster obat = null;
        return obat;
    }

    public List<Obat_tabelMaster> getObat_tabelMaster() throws RemoteException {
        System.out.println("Client Melakukan Proses Get All pada Tabel Obat");

        Statement statement = null;
        try{
            statement = DatabaseUtilities.getConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM obat");
            List<Obat_tabelMaster> list = new ArrayList<Obat_tabelMaster>();
            
            while(result.next()){
                Obat_tabelMaster obat = new Obat_tabelMaster();
                obat.setId_Obat(result.getString("ID_OBAT"));
                obat.setNama_Obat(result.getString("NAMA_OBAT"));
                obat.setJenis_Obat(result.getString("JENIS_OBAT"));
                obat.setHarga_Obat(result.getInt("HARGA_OBAT"));
                obat.setSatuan(result.getString("SATUAN"));
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
    
    public int cekPemakaianObat(String Id_Obat) throws RemoteException{
        System.out.println("Client Melakukan Proses Cek Pemakaian Obat dengan Mengakses Tabel Obat");
        
        Statement statement = null;
        ResultSet result = null;
        
        int jumlahPenggunaan = 0;
        try{
            statement = DatabaseUtilities.getConnection().createStatement();
            result = statement.executeQuery("SELECT COUNT(NO_DETAIL_RESEP) FROM detail_resep WHERE ID_OBAT = '" + Id_Obat +"'");
            while(result.next()){
                jumlahPenggunaan = result.getInt(1);
            }
            System.out.println(jumlahPenggunaan);
        }catch(SQLException exception){
            exception.printStackTrace();
        }
        return jumlahPenggunaan;
    }
    
    public String getAutoNumberObat() throws RemoteException{
        System.out.println("Client Melakukan Proses Auto Number dengan Mengakses Tabel Obat");
        Statement state = null;
        ResultSet rs = null;
        
        String number = "";
        String nomerBaru = "";
        int numberBaru = 0;
	try {
            state = (Statement) DatabaseUtilities.getConnection().createStatement();
            String sql = "SELECT ID_OBAT FROM obat ORDER BY ID_OBAT DESC limit 1";
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
            nomerBaru ="OBT0001";
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
            nomerBaru = "OBT"+nol+numberBaru;
        }
        System.out.println(nomerBaru);
        return nomerBaru;
    }
    
    public Penyakit_tabelMaster insertPenyakit_tabelMaster(Penyakit_tabelMaster penyakit) throws RemoteException {
        System.out.println("Client Melakukan Proses Insert pada Tabel Penyakit_tabelMaster");
        
        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
            "INSERT INTO penyakit (ID_PENYAKIT, PENYAKIT, GEJALA)" + "VALUES (?,?,?)");
            statement.setString(1, penyakit.getId_Penyakit());
            statement.setString(2, penyakit.getPenyakit());
            statement.setString(3, penyakit.getGejala());
            
            statement.executeUpdate();
        } catch(SQLException exception){
            exception.printStackTrace();
            return null;
        } finally {
            if(statement != null){
                try {
                    statement.close();
                } catch(SQLException exception){}
            }
        }
        return penyakit;
    }

    public void updatePenyakit_tabelMaster(Penyakit_tabelMaster penyakit) throws RemoteException {
        System.out.println("Client Melakukan Proses Update pada Tabel Penyakit_tabelMaster");
        
        PreparedStatement statement = null;
        try{
            statement = DatabaseUtilities.getConnection().prepareStatement(
            "UPDATE penyakit SET NAMA_PENYAKIT = ?, GEJALA = ?" + "WHERE ID_PENYAKIT = ?");
            
            statement.setString(1, penyakit.getPenyakit());
            statement.setString(2, penyakit.getGejala());
            statement.setString(3, penyakit.getId_Penyakit());
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

    public void deletePenyakit_tabelMaster(String Id_Penyakit) throws RemoteException {
        System.out.println("Client Melakukan Proses Delete pada Tabel Penyakit_tabelMaster");

        PreparedStatement statement = null;
        try{
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "DELETE FROM penyakit WHERE ID_PENYAKIT = ?");
            
            statement.setString(1, Id_Penyakit);
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

    public Penyakit_tabelMaster getPenyakit_tabelMaster(String Id_Penyakit) throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel Penyakit_tabelMaster");
        Penyakit_tabelMaster penyakit = null;
        return penyakit;
    }

    public List<Penyakit_tabelMaster> getPenyakit_tabelMaster() throws RemoteException {
        System.out.println("Client Melakukan Proses Get All pada Tabel Penyakit_tabelMaster");
        
        Statement statement = null;
        try{
            statement = DatabaseUtilities.getConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM penyakit");
            
            List<Penyakit_tabelMaster> list = new ArrayList<Penyakit_tabelMaster>();
            while(result.next()){
                Penyakit_tabelMaster penyakit = new Penyakit_tabelMaster();
                penyakit.setId_Penyakit(result.getString("ID_PENYAKIT"));
                penyakit.setPenyakit(result.getString("PENYAKIT"));
                penyakit.setGejala(result.getString("GEJALA"));
                list.add(penyakit);
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
    
    public int cekPemakaianPenyakit(String Id_Penyakit) throws RemoteException{
        System.out.println("Client Melakukan Proses Cek Pemakaian Penyakit dengan Mengakses Tabel Penyakit");
        
        Statement statement = null;
        ResultSet result = null;
        
        int jumlahPenggunaan = 0;
        try{
            statement = DatabaseUtilities.getConnection().createStatement();
            result = statement.executeQuery("SELECT COUNT(ID_DIAGNOSA) FROM diagnosa WHERE ID_PENYAKIT = '" + Id_Penyakit +"'");
            while(result.next()){
                jumlahPenggunaan = result.getInt(1);
            }
            System.out.println(jumlahPenggunaan);
        }catch(SQLException exception){
            exception.printStackTrace();
        }
        return jumlahPenggunaan;
    }
    
    public String getAutoNumberPenyakit() throws RemoteException{
        System.out.println("Client Melakukan Proses Auto Number dengan Mengakses Tabel Penyakit");
        Statement state = null;
        ResultSet rs = null;
        
        String number = "";
        String nomerBaru = "";
        int numberBaru = 0;
	try {
            state = (Statement) DatabaseUtilities.getConnection().createStatement();
            String sql = "SELECT ID_PENYAKIT FROM penyakit ORDER BY ID_PENYAKIT DESC limit 1";
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
            nomerBaru ="P0001";
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
            nomerBaru = "P"+nol+numberBaru;
        }
        System.out.println(nomerBaru);
        return nomerBaru;
    }
    
    public Tindakan_tabelMaster insertTindakan_tabelMaster(Tindakan_tabelMaster tindakan) throws RemoteException {
        System.out.println("Client Melakukan Proses Insert pada Tabel Tindakan");
        
        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
            "INSERT INTO tindakan (ID_TINDAKAN, SPESIALISASI, NAMA_TINDAKAN, TARIF, KETERANGAN)" + "VALUES (?,?,?,?,?)");
            statement.setString(1, tindakan.getId_Tindakan());
            statement.setString(2, tindakan.getSpesialisasi());
            statement.setString(3, tindakan.getNama_Tindakan());
            statement.setInt(4, tindakan.getTarif());
            statement.setString(5, tindakan.getKeterangan());
            
            statement.executeUpdate();
        } catch(SQLException exception){
            exception.printStackTrace();
            return null;
        } finally {
            if(statement != null){
                try {
                    statement.close();
                } catch(SQLException exception){}
            }
        }
        return tindakan;
    }

    public void updateTindakan_tabelMaster(Tindakan_tabelMaster tindakan) throws RemoteException {
        System.out.println("Client Melakukan Proses Update pada Tabel Tindakan");
        
        PreparedStatement statement = null;
        try{
            statement = DatabaseUtilities.getConnection().prepareStatement(
            "UPDATE tindakan SET SPESIALISASI = ?, NAMA_TINDAKAN = ?, TARIF = ?, KETERANGAN = ?" + "WHERE ID_TINDAKAN = ?");
        
            statement.setString(1, tindakan.getSpesialisasi());
            statement.setString(2, tindakan.getNama_Tindakan());
            statement.setInt(3, tindakan.getTarif());
            statement.setString(4, tindakan.getKeterangan());
            statement.setString(5, tindakan.getId_Tindakan());
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

    public void deleteTindakan_tabelMaster(String Id_Tindakan) throws RemoteException {
        System.out.println("Client Melakukan Proses Delete pada Tabel Tindakan");
        
        PreparedStatement statement = null;
        try{
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "DELETE FROM tindakan WHERE ID_TINDAKAN = ?");
            
            statement.setString(1, Id_Tindakan);
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

    public Tindakan_tabelMaster getTindakan_tabelMaster(String Id_Tindakan) throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel Tindakan");
        Tindakan_tabelMaster tindakan = null;
        return tindakan;
    }

    public List<Tindakan_tabelMaster> getTindakan_tabelMaster() throws RemoteException {
        System.out.println("Client Melakukan Proses Get All pada Tabel Tindakan");
        
        Statement statement = null;
        try{
            statement = DatabaseUtilities.getConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM tindakan");
            
            List<Tindakan_tabelMaster> list = new ArrayList<Tindakan_tabelMaster>();
            while(result.next()){
                Tindakan_tabelMaster tindakan = new Tindakan_tabelMaster();
                tindakan.setId_Tindakan(result.getString("ID_TINDAKAN"));
                tindakan.setSpesialisasi(result.getString("SPESIALISASI"));
                tindakan.setNama_Tindakan(result.getString("NAMA_TINDAKAN"));
                tindakan.setTarif(result.getInt("TARIF"));
                tindakan.setKeterangan(result.getString("KETERANGAN"));
                list.add(tindakan);
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
    
    public int cekPemakaianTindakan(String Id_Tindakan) throws RemoteException{
        System.out.println("Client Melakukan Proses Cek Pemakaian Tindakan dengan Mengakses Tabel Tindakan");
        
        Statement statement = null;
        ResultSet result = null;
        
        int jumlahPenggunaan = 0;
        try{
            statement = DatabaseUtilities.getConnection().createStatement();
            result = statement.executeQuery("SELECT COUNT(NO_DETAIL) FROM detail_tindakan WHERE ID_TINDAKAN = '" + Id_Tindakan +"'");
            while(result.next()){
                jumlahPenggunaan = result.getInt(1);
            }
            System.out.println(jumlahPenggunaan);
        }catch(SQLException exception){
            exception.printStackTrace();
        }
        return jumlahPenggunaan;
    }
    
    public String getAutoNumberTindakan() throws RemoteException{
        System.out.println("Client Melakukan Proses Auto Number dengan Mengakses Tabel Tindakan");
        Statement state = null;
        ResultSet rs = null;
        
        String number = "";
        String nomerBaru = "";
        int numberBaru = 0;
	try {
            state = (Statement) DatabaseUtilities.getConnection().createStatement();
            String sql = "SELECT ID_TINDAKAN FROM tindakan ORDER BY ID_TINDAKAN DESC limit 1";
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
            nomerBaru ="T0001";
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
            nomerBaru = "T"+nol+numberBaru;
        }
        System.out.println(nomerBaru);
        return nomerBaru;
    }
    
    public Lab_tabelMaster insertLab_tabelMaster(Lab_tabelMaster lab) throws RemoteException {
        System.out.println("Client Melakukan Proses Insert pada Tabel Laboratorium");
        
        PreparedStatement statement = null;
        try{
            statement = DatabaseUtilities.getConnection().prepareStatement(
            "INSERT INTO laboratorium (ID_LAB, JENIS_PEMERIKSAAN, HARGA, DESKRIPSI)" + "VALUES (?,?,?,?)");
            statement.setString(1, lab.getId_Lab());
            statement.setString(2, lab.getJenis_Pemeriksaan());
            statement.setInt(3, lab.getHarga());
            statement.setString(4, lab.getDeskripsi());
            
            statement.executeUpdate();
            return lab;
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

    public void updateLab_tabelMaster(Lab_tabelMaster lab) throws RemoteException {
        System.out.println("Client Melakukan Proses Update pada Tabel Laboratorium");
        
        PreparedStatement statement = null;
        try{
            statement = DatabaseUtilities.getConnection().prepareStatement(
            "UPDATE laboratorium SET JENIS_PEMERIKSAAN = ?, HARGA = ?, DESKRIPSI = ?" + "WHERE ID_LAB = ?");
            
            statement.setString(1, lab.getJenis_Pemeriksaan());
            statement.setInt(2, lab.getHarga());
            statement.setString(3, lab.getDeskripsi());
            statement.setString(4, lab.getId_Lab());
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

    public void deleteLab_tabelMaster(String Id_Lab) throws RemoteException {
        System.out.println("Client Melakukan Proses Delete pada Tabel Laboratorium");

        PreparedStatement statement = null;
        try{
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "DELETE FROM laboratorium WHERE ID_LAB = ?");
            
            statement.setString(1, Id_Lab);
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

    public Lab_tabelMaster getLab_tabelMaster(String Id_Lab) throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel Laboratorium");
        Lab_tabelMaster lab = null;
        return lab;
    }

    public List<Lab_tabelMaster> getLab_tabelMaster() throws RemoteException {
        System.out.println("Client Melakukan Proses Get All pada Tabel Laboratorium");

        Statement statement = null;
        try{
            statement = DatabaseUtilities.getConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM laboratorium");
            
            List<Lab_tabelMaster> list = new ArrayList<Lab_tabelMaster>();
            while(result.next()){
                Lab_tabelMaster lab = new Lab_tabelMaster();
                lab.setId_Lab(result.getString("ID_LAB"));
                lab.setJenis_Pemeriksaan(result.getString("JENIS_PEMERIKSAAN"));
                lab.setHarga(result.getInt("HARGA"));
                lab.setDeskripsi(result.getString("DESKRIPSI"));
                list.add(lab);
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
    
    public int cekPemakaianLab(String Id_Lab) throws RemoteException{
        System.out.println("Client Melakukan Proses Cek Pemakaian Obat dengan Mengakses Tabel Obat");
        
        Statement statement = null;
        ResultSet result = null;
        
        int jumlahPenggunaan = 0;
        try{
            statement = DatabaseUtilities.getConnection().createStatement();
            result = statement.executeQuery("SELECT COUNT(NO_DETAIL_LAB) FROM detail_lab WHERE ID_LAB = '" + Id_Lab +"'");
            while(result.next()){
                jumlahPenggunaan = result.getInt(1);
            }
            System.out.println(jumlahPenggunaan);
        }catch(SQLException exception){
            exception.printStackTrace();
        }
        return jumlahPenggunaan;
    }
    
    public String getAutoNumberLab() throws RemoteException{
        System.out.println("Client Melakukan Proses Auto Number dengan Mengakses Tabel Lab");
        Statement state = null;
        ResultSet rs = null;
        
        String number = "";
        String nomerBaru = "";
        int numberBaru = 0;
	try {
            state = (Statement) DatabaseUtilities.getConnection().createStatement();
            String sql = "SELECT ID_LAB FROM laboratorium ORDER BY ID_LAB DESC limit 1";
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
            nomerBaru ="LAB0001";
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
            nomerBaru = "LAB"+nol+numberBaru;
        }
        System.out.println(nomerBaru);
        return nomerBaru;
    }
    
    public Kecantikan_tabelMaster insertKecantikan_tabelMaster(Kecantikan_tabelMaster kecantikan) throws RemoteException {
        System.out.println("Client Melakukan Proses Insert pada Tabel Kecantikan");
        
        PreparedStatement statement = null;
        try{
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "INSERT INTO layanan_kecantikan (ID_KECANTIKAN, JENIS_LAYANAN, TARIF, DESKRIPSI)" + 
                            "VALUES (?,?,?,?)");
            statement.setString(1, kecantikan.getId_Kecantikan());
            statement.setString(2, kecantikan.getJenis_Layanan());
            statement.setInt(3, kecantikan.getTarif());
            statement.setString(4, kecantikan.getDeskripsi());
            
            statement.executeUpdate();
            return kecantikan;
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

    public void updateKecantikan_tabelMaster(Kecantikan_tabelMaster kecantikan) throws RemoteException {
        System.out.println("Client Melakukan Proses Update pada Tabel Kecantikan");
        
        PreparedStatement statement = null;
        try{
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "UPDATE layanan_kecantikan SET JENIS_LAYANAN = ?, TARIF = ?, DESKRIPSI = ?" + "WHERE ID_KECANTIKAN = ?");
            
            statement.setString(1, kecantikan.getJenis_Layanan());
            statement.setInt(2, kecantikan.getTarif());
            statement.setString(3, kecantikan.getDeskripsi());
            statement.setString(4, kecantikan.getId_Kecantikan());
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

    public void deleteKecantikan_tabelMaster(String Id_Kecantikan) throws RemoteException {
        System.out.println("Client Melakukan Proses Delete pada Tabel Kecantikan");

        PreparedStatement statement = null;
        try{
            statement = DatabaseUtilities.getConnection().prepareStatement(
                "DELETE FROM layanan_kecantikan WHERE ID_KECANTIKAN = ?");

            statement.setString(1, Id_Kecantikan);
            statement.executeUpdate();
        }
        catch(SQLException exception){
            exception.printStackTrace();
        }
        finally{
            if(statement != null){
                try{
                    statement.close();
                }
                catch(SQLException exception){
                    exception.printStackTrace();
                }
           }
       }
    }

    public Kecantikan_tabelMaster getKecantikan_tabelMaster(String Id_Kecantikan) throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel Kecantikan");

        Kecantikan_tabelMaster kecantikan = null;
        return kecantikan;
    }

    public List<Kecantikan_tabelMaster> getKecantikan_tabelMaster() throws RemoteException {
        System.out.println("Client Melakukan Proses Get All pada Tabel Kecantikan");

        Statement statement = null;
        try{
            statement = DatabaseUtilities.getConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM layanan_kecantikan");
            
            List<Kecantikan_tabelMaster> list = new ArrayList<Kecantikan_tabelMaster>();
            while(result.next()){
                Kecantikan_tabelMaster kecantikan = new Kecantikan_tabelMaster();
                kecantikan.setId_Kecantikan(result.getString("ID_KECANTIKAN"));
                kecantikan.setJenis_Layanan(result.getString("JENIS_LAYANAN"));
                kecantikan.setTarif(result.getInt("TARIF"));
                kecantikan.setDeskripsi(result.getString("DESKRIPSI"));
                list.add(kecantikan);
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

    public int cekPemakaianKecantikan(String Id_Kecantikan) throws RemoteException{
        System.out.println("Client Melakukan Proses Cek Pemakaian Kecantikan dengan Mengakses Tabel Kecantikan");
        
        Statement statement = null;
        ResultSet result = null;
        
        int jumlahPenggunaan = 0;
        try{
            statement = DatabaseUtilities.getConnection().createStatement();
            result = statement.executeQuery("SELECT COUNT(ID_DET_KESEHATAN) FROM det_layanan_kecantikan WHERE ID_KECANTIKAN = '" + Id_Kecantikan +"'");
            while(result.next()){
                jumlahPenggunaan = result.getInt(1);
            }
            System.out.println(jumlahPenggunaan);
        }catch(SQLException exception){
            exception.printStackTrace();
        }
        return jumlahPenggunaan;
    }
    
    public String getAutoNumberKecantikan() throws RemoteException{
        System.out.println("Client Melakukan Proses Auto Number dengan Mengakses Tabel Kecantikan");
        Statement state = null;
        ResultSet rs = null;
        
        String number = "";
        String nomerBaru = "";
        int numberBaru = 0;
	try {
            state = (Statement) DatabaseUtilities.getConnection().createStatement();
            String sql = "SELECT ID_KECANTIKAN FROM layanan_kecantikan ORDER BY ID_KECANTIKAN DESC limit 1";
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
            nomerBaru ="KEC0001";
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
            nomerBaru = "KEC"+nol+numberBaru;
        }
        System.out.println(nomerBaru);
        return nomerBaru;
    }
}
