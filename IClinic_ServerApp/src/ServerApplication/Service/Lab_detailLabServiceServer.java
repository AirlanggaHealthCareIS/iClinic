/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ServerApplication.Service;

import Database.Entity.Lab_detailLab;
import Database.Service.Lab_detailLabService;
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
public class Lab_detailLabServiceServer extends UnicastRemoteObject implements Lab_detailLabService {

    public Lab_detailLabServiceServer() throws RemoteException {
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
}
