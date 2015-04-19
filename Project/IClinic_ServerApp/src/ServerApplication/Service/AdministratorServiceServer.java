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
            String sql = "SELECT JABATAN FROM user WHERE USERNAME = '"+Username+"' and PASSWORD = '"+Password+"'";
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

    public void deleteUser(int Id_User) throws RemoteException {

        System.out.println("Client Melakukan Proses Delete pada Tabel User");

    }

    public User getUser(int Id_User) throws RemoteException {

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
    
    public Obat_tabelMaster insertObat_tabelMaster(Obat_tabelMaster obat) throws RemoteException {

        System.out.println("Client Melakukan Proses Insert pada Tabel Obat");
        return obat;
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

    public void deleteObat_tabelMaster(int Id_Obat) throws RemoteException {

        System.out.println("Client Melakukan Proses Delete pada Tabel Obat");

    }

    public Obat_tabelMaster getObat_tabelMaster(int Id_Obat) throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel Obat");

        Obat_tabelMaster obat = null;
        return obat;
    }

    public List<Obat_tabelMaster> getObat_tabelMaster() throws RemoteException {

        System.out.println("Client Melakukan Proses Get All pada Tabel Obat");

        List<Obat_tabelMaster> list = new ArrayList<Obat_tabelMaster>();
        return list;
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

    public void deletePenyakit_tabelMaster(int Id_Penyakit) throws RemoteException {

        System.out.println("Client Melakukan Proses Delete pada Tabel Penyakit_tabelMaster");
    }

    public Penyakit_tabelMaster getPenyakit_tabelMaster(int Id_Penyakit) throws RemoteException {

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
    
    public Tindakan_tabelMaster insertTindakan_tabelMaster(Tindakan_tabelMaster tindakan) throws RemoteException {
        System.out.println("Client Melakukan Proses Insert pada Tabel Tindakan");
        
        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
            "INSERT INTO tindakan (ID_TINDAKAN, SPESIALISI, NAMA_TINDAKAN, TARIF, KETERANGAN)" + "VALUES (?,?,?,?,?)");
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

    public void deleteTindakan_tabelMaster(int Id_Tindakan) throws RemoteException {

        System.out.println("Client Melakukan Proses Delete pada Tabel Tindakan");
    }

    public Tindakan_tabelMaster getTindakan_tabelMaster(int Id_Tindakan) throws RemoteException {

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
        
        
    }

    public void deleteLab_tabelMaster(int Id_Lab) throws RemoteException {

        System.out.println("Client Melakukan Proses Delete pada Tabel Laboratorium");
    }

    public Lab_tabelMaster getLab_tabelMaster(int Id_Lab) throws RemoteException {

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
    
    public Kecantikan_tabelMaster insertKecantikan_tabelMaster(Kecantikan_tabelMaster kecantikan) throws RemoteException {
        System.out.println("Client Melakukan Proses Insert pada Tabel Kecantikan");
        
        PreparedStatement statement = null;
        try{
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "INSERT INTO layanan_kecantikan (ID_KECANTIKAN, LAYANAN_KECANTIKAN, TARIF, DESKRIPSI)" + 
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
        
        
    }

    public void deleteKecantikan_tabelMaster(int Id_Kecantikan) throws RemoteException {

        System.out.println("Client Melakukan Proses Delete pada Tabel Kecantikan");

    }

    public Kecantikan_tabelMaster getKecantikan_tabelMaster(int Id_Kecantikan) throws RemoteException {

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
}
