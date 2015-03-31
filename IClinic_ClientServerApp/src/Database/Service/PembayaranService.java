/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Database.Service;

import Database.Entity.Pembayaran;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Tiara Ratna Sari
 */
public interface PembayaranService extends Remote {
    Pembayaran insertPembayaran(Pembayaran pembayaran) throws RemoteException;

    void updatePembayaran(Pembayaran pembayaran) throws RemoteException;

    void deletePembayaran(int Id_Pembayaran) throws RemoteException;

    Pembayaran getPembayaran(int Id_Pembayaran) throws RemoteException;

    List<Pembayaran> getPembayaran() throws RemoteException;
}
