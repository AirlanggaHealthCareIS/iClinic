/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ServerApplication.Service;

import Database.Entity.Obat_tabelMaster;
import Database.Service.Obat_tabelMasterService;
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
public class Obat_tabelMasterServiceServer extends UnicastRemoteObject implements Obat_tabelMasterService{

    public Obat_tabelMasterServiceServer() throws RemoteException {
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

}
