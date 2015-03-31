/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ServerApplication.Service;

import Database.Entity.Penyakit_tabelMaster;
import Database.Service.Penyakit_tabelMasterService;
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
public class Penyakit_tabelMasterServiceServer extends UnicastRemoteObject implements Penyakit_tabelMasterService {

    public Penyakit_tabelMasterServiceServer() throws RemoteException {
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

}
