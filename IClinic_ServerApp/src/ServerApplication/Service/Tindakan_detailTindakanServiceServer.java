/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ServerApplication.Service;

import Database.Entity.Tindakan_detailTindakan;
import Database.Service.Tindakan_detailTindakanService;
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
public class Tindakan_detailTindakanServiceServer extends UnicastRemoteObject implements Tindakan_detailTindakanService {

    public Tindakan_detailTindakanServiceServer() throws RemoteException {
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
