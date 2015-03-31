/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ServerApplication.Service;

import Database.Entity.Lab_tabelMaster;
import Database.Service.Lab_tabelMasterService;
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
public class Lab_tabelMasterServiceServer extends UnicastRemoteObject implements Lab_tabelMasterService {

    public Lab_tabelMasterServiceServer() throws RemoteException {
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
