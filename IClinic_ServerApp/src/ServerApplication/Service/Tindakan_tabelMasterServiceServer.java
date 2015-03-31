/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ServerApplication.Service;

import Database.Entity.Tindakan_tabelMaster;
import Database.Service.Tindakan_tabelMasterService;
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
public class Tindakan_tabelMasterServiceServer extends UnicastRemoteObject implements Tindakan_tabelMasterService {

    public Tindakan_tabelMasterServiceServer() throws RemoteException {
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
}
