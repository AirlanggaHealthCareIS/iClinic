/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ServerApplication.Service;

import Database.Entity.Kecantikan_detailLayanan;
import Database.Service.Kecantikan_detailLayananService;
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
public class Kecantikan_detailLayananServiceServer extends UnicastRemoteObject implements Kecantikan_detailLayananService{

    public Kecantikan_detailLayananServiceServer() throws RemoteException {
    }

    public Kecantikan_detailLayanan insertKecantikan_detailLayanan(Kecantikan_detailLayanan detail_layanan) throws RemoteException {

        System.out.println("Client Melakukan Proses Insert pada Tabel Detail Layanan Kecantikan");
        return detail_layanan;
    }

    public void updateKecantikan_detailLayanan(Kecantikan_detailLayanan detail_layanan) throws RemoteException {

        System.out.println("Client Melakukan Proses Update pada Tabel Detail Layanan Kecantikan");

    }

    public void deleteKecantikan_detailLayanan(int Id_Obat) throws RemoteException {

        System.out.println("Client Melakukan Proses Delete pada Tabel Detail Layanan Kecantikan");

    }

    public Kecantikan_detailLayanan getKecantikan_detailLayanan(int Id_Obat) throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel Detail Layanan Kecantikan");

        Kecantikan_detailLayanan detail_layanan = null;
        return detail_layanan;
    }

    public List<Kecantikan_detailLayanan> getKecantikan_detailLayanan() throws RemoteException {

        System.out.println("Client Melakukan Proses Get All pada Tabel Detail Layanan Kecantikan");

        List<Kecantikan_detailLayanan> list = new ArrayList<Kecantikan_detailLayanan>();
        return list;
    }

}
