/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Database.Service;

import Database.Entity.Kecantikan_detailLayanan;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Tiara Ratna Sari
 */
public interface Kecantikan_detailLayananService extends Remote {
    Kecantikan_detailLayanan insertKecantikan_detailLayanan(Kecantikan_detailLayanan detail_layanan) throws RemoteException;

    void updateKecantikan_detailLayanan(Kecantikan_detailLayanan detail_layanan) throws RemoteException;

    void deleteKecantikan_detailLayanan(int Id_Det_Kesehatan) throws RemoteException;

    Kecantikan_detailLayanan getKecantikan_detailLayanan(int Id_Det_Kesehatan) throws RemoteException;

    List<Kecantikan_detailLayanan> getKecantikan_detailLayanan() throws RemoteException;


}
