/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

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

/**
 *
 * @author Tiara Ratna Sari
 */
public class AdministratorServiceServer extends UnicastRemoteObject implements AdministratorService{

    public AdministratorServiceServer() throws RemoteException {
    }
    
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
        return user;
    }

    public void updateUser(User user) throws RemoteException {

        System.out.println("Client Melakukan Proses Update pada Tabel User");

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

        List<User> list = new ArrayList<User>();
        return list;
    }
    
    public Obat_tabelMaster insertObat_tabelMaster(Obat_tabelMaster obat) throws RemoteException {

        System.out.println("Client Melakukan Proses Insert pada Tabel Obat");
        return obat;
    }

    public void updateObat_tabelMaster(Obat_tabelMaster obat) throws RemoteException {

        System.out.println("Client Melakukan Proses Update pada Tabel Obat");

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
        return penyakit;
    }

    public void updatePenyakit_tabelMaster(Penyakit_tabelMaster penyakit) throws RemoteException {

        System.out.println("Client Melakukan Proses Update pada Tabel Penyakit_tabelMaster");
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
        List<Penyakit_tabelMaster> list = new ArrayList<Penyakit_tabelMaster>();
        return list;
    }
    
    public Tindakan_tabelMaster insertTindakan_tabelMaster(Tindakan_tabelMaster tindakan) throws RemoteException {
        
        System.out.println("Client Melakukan Proses Insert pada Tabel Tindakan");
        return tindakan;
    }

    public void updateTindakan_tabelMaster(Tindakan_tabelMaster tindakan) throws RemoteException {

        System.out.println("Client Melakukan Proses Update pada Tabel Tindakan");
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
        List<Tindakan_tabelMaster> list = new ArrayList<Tindakan_tabelMaster>();
        return list;
    }
    
    public Lab_tabelMaster insertLab_tabelMaster(Lab_tabelMaster lab) throws RemoteException {
        
        System.out.println("Client Melakukan Proses Insert pada Tabel Laboratorium");
        return lab;
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
        List<Lab_tabelMaster> list = new ArrayList<Lab_tabelMaster>();
        return list;
    }
    
    public Kecantikan_tabelMaster insertKecantikan_tabelMaster(Kecantikan_tabelMaster kecantikan) throws RemoteException {

        System.out.println("Client Melakukan Proses Insert pada Tabel Kecantikan");
        return kecantikan;
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

        List<Kecantikan_tabelMaster> list = new ArrayList<Kecantikan_tabelMaster>();
        return list;
    }
}
