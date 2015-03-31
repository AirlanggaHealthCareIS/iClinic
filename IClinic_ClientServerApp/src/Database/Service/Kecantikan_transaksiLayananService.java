/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Database.Service;

import Database.Entity.Kecantikan_transaksiLayanan;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Tiara Ratna Sari
 */
public interface Kecantikan_transaksiLayananService extends Remote {
    Kecantikan_transaksiLayanan insertKecantikan_transaksiLayanan(Kecantikan_transaksiLayanan transaksi_layanan) throws RemoteException;

    void updateKecantikan_transaksiLayanan(Kecantikan_transaksiLayanan transaksi_layanan) throws RemoteException;

    void deleteKecantikan_transaksiLayanan(int Id_Transaksi_Layanan) throws RemoteException;

    Kecantikan_transaksiLayanan getKecantikan_transaksiLayanan(int Id_Transaksi_Layanan) throws RemoteException;

    List<Kecantikan_transaksiLayanan> getKecantikan_transaksiLayanan() throws RemoteException;


}
