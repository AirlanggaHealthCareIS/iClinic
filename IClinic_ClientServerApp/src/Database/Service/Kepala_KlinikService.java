/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Database.Service;

import Database.Entity.Antrian;
import Database.Entity.Obat_detailResep;
import Database.Entity.Pasien;
import Database.Entity.Pembayaran;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Tiara Ratna Sari
 */
public interface Kepala_KlinikService extends Remote {
    
    Pembayaran getPembayaran(int Id_Pembayaran) throws RemoteException;

    List<Pembayaran> getPembayaran() throws RemoteException;
    
    Pasien getPasien(int Id_Pasien) throws RemoteException;

    List<Pasien> getPasien() throws RemoteException;
    
    Antrian getAntrian(int Id_Antrian) throws RemoteException;

    List<Antrian> getAntrian() throws RemoteException;
    
    Obat_detailResep getObat_detailResep(int No_Detail_Resep) throws RemoteException;

    List<Obat_detailResep> getObat_detailResep() throws RemoteException;
}
