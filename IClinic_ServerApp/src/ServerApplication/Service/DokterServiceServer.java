/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ServerApplication.Service;

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
       return rekam_medis;
    }

    public void updateRekam_Medis(Rekam_Medis rekam_medis) throws RemoteException {

        System.out.println("Client Melakukan Proses Update pada Tabel Rekam Medis");
    }

    public void deleteRekam_Medis(int Id_Rekam) throws RemoteException {

        System.out.println("Client Melakukan Proses Delete pada Tabel Rekam Medis");
    }

    public Rekam_Medis getRekam_Medis(int Id_Rekam) throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel Rekam Medis");
        Rekam_Medis rekam_medis = null;
        return rekam_medis;
    }

    public List<Rekam_Medis> getRekam_Medis() throws RemoteException {

        System.out.println("Client Melakukan Proses Get All pada Tabel Rekam Medis");
        List<Rekam_Medis> list = new ArrayList<Rekam_Medis>();
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
    
    public Penyakit_diagnosa insertPenyakit_diagnosa(Penyakit_diagnosa diagnosa) throws RemoteException {
        
        System.out.println("Client Melakukan Proses Insert pada Tabel Penyakit_diagnosa");
        return diagnosa;
    }

    public void updatePenyakit_diagnosa(Penyakit_diagnosa diagnosa) throws RemoteException {

        System.out.println("Client Melakukan Proses Update pada Tabel Penyakit_diagnosa");
    }

    public void deletePenyakit_diagnosa(int Id_Penyakit_diagnosa) throws RemoteException {

        System.out.println("Client Melakukan Proses Delete pada Tabel Penyakit_diagnosa");
    }

    public Penyakit_diagnosa getPenyakit_diagnosa(int Id_Penyakit_diagnosa) throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel Penyakit_diagnosa");
        Penyakit_diagnosa diagnosa = null;
        return diagnosa;
    }

    public List<Penyakit_diagnosa> getPenyakit_diagnosa() throws RemoteException {

        System.out.println("Client Melakukan Proses Get All pada Tabel Penyakit_diagnosa");
        List<Penyakit_diagnosa> list = new ArrayList<Penyakit_diagnosa>();
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
    
    public Tindakan_detailTindakan insertTindakan_detailTindakan(Tindakan_detailTindakan detail_tindakan) throws RemoteException {
        
        System.out.println("Client Melakukan Proses Insert pada Tabel Tindakan");
        return detail_tindakan;
    }

    public void updateTindakan_detailTindakan(Tindakan_detailTindakan detail_tindakan) throws RemoteException {

        System.out.println("Client Melakukan Proses Update pada Tabel Tindakan");
    }

    public void deleteTindakan_detailTindakan(int No_Detail) throws RemoteException {

        System.out.println("Client Melakukan Proses Delete pada Tabel Tindakan");
    }

    public Tindakan_detailTindakan getTindakan_detailTindakan(int No_Detail) throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel Tindakan");
        Tindakan_detailTindakan detail_tindakan = null;
        return detail_tindakan;
    }

    public List<Tindakan_detailTindakan> getTindakan_detailTindakan() throws RemoteException {

        System.out.println("Client Melakukan Proses Get All pada Tabel Tindakan");
        List<Tindakan_detailTindakan> list = new ArrayList<Tindakan_detailTindakan>();
        return list;
    }
}
