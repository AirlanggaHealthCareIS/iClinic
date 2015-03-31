/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ServerApplication.Service;

import Database.Entity.Penyakit_diagnosa;
import Database.Service.Penyakit_diagnosaService;
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
public class Penyakit_diagnosaServiceServer extends UnicastRemoteObject implements Penyakit_diagnosaService {

    public Penyakit_diagnosaServiceServer() throws RemoteException {
    }

    public Penyakit_diagnosa insertPenyakit_diagnosa(Penyakit_diagnosa diagnosa) throws RemoteException {
        
        System.out.println("Client Melakukan Proses Insert pada Tabel Penyakit_diagnosa");
        return diagnosa;
    }

    public void updatePenyakit_diagnosa(Penyakit_diagnosa diagnosa) throws RemoteException {

        System.out.println("Client Melakukan Proses Update pada Tabel Penyakit_diagnosa");
    }

    public void deletePenyakit_diagnosa(Long Id_Barang, Long Id_Pembelian) throws RemoteException {

        System.out.println("Client Melakukan Proses Delete pada Tabel Penyakit_diagnosa");
    }

    public Penyakit_diagnosa getPenyakit_diagnosa(Long Id_Barang, Long Id_Pembelian) throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel Penyakit_diagnosa");
        Penyakit_diagnosa diagnosa = null;
        return diagnosa;
    }

    public List<Penyakit_diagnosa> getPenyakit_diagnosa() throws RemoteException {

        System.out.println("Client Melakukan Proses Get All pada Tabel Penyakit_diagnosa");
        List<Penyakit_diagnosa> list = new ArrayList<Penyakit_diagnosa>();
        return list;
    }

    public void deletePenyakit_diagnosa(int Id_Penyakit_diagnosa) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Penyakit_diagnosa getPenyakit_diagnosa(int Id_Penyakit_diagnosa) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
