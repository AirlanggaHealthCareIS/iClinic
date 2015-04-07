/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ServerApplication.Service;

import Database.Entity.Lab_detailLab;
import Database.Entity.Lab_tabelMaster;
import Database.Service.LabService;
import Database.Service.LabService;
import ServerApplication.Utilities.DatabaseUtilities;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tiara Ratna Sari
 */
public class LabServiceServer extends UnicastRemoteObject implements LabService {

    public LabServiceServer() throws RemoteException {
    }

    public Lab_detailLab insertLab_detailLab(Lab_detailLab detail_lab) throws RemoteException {
        
        System.out.println("Client Melakukan Proses Insert pada Tabel Detail Laboratorium");
        return detail_lab;
    }

    public void updateLab_detailLab(Lab_detailLab detail_lab) throws RemoteException {

        System.out.println("Client Melakukan Proses Update pada Tabel Detail Laboratorium");
    }

    public void deleteLab_detailLab(int Id_Detail_Lab) throws RemoteException {

        System.out.println("Client Melakukan Proses Delete pada Tabel Detail Laboratorium");
    }

    public Lab_detailLab getLab_detailLab(int Id_Detail_Lab) throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel Detail Laboratorium");
        Lab_detailLab detail_lab = null;
        return detail_lab;
    }

    public List<Lab_detailLab> getLab_detailLab() throws RemoteException {

        System.out.println("Client Melakukan Proses Get All pada Tabel Detail Laboratorium");
        List<Lab_detailLab> list = new ArrayList<Lab_detailLab>();
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
}
