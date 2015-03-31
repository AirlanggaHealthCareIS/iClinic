/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ServerApplication.Service;

import Database.Entity.Kecantikan_tabelMaster;
import Database.Service.Kecantikan_tabelMasterService;
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
public class Kecantikan_tabelMasterServiceServer extends UnicastRemoteObject implements Kecantikan_tabelMasterService{

    public Kecantikan_tabelMasterServiceServer() throws RemoteException {
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
