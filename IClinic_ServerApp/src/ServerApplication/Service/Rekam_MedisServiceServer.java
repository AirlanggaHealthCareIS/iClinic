/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ServerApplication.Service;

import Database.Entity.Rekam_Medis;
import Database.Service.Rekam_MedisService;
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
public class Rekam_MedisServiceServer extends UnicastRemoteObject implements Rekam_MedisService {

    public Rekam_MedisServiceServer() throws RemoteException {
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

}
