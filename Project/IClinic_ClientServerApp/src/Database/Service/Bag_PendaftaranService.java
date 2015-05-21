/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Database.Service;

import Database.Entity.Antrian;
import Database.Entity.Pasien;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Tiara Ratna Sari
 */
public interface Bag_PendaftaranService extends Remote {
    void insertPasien(Pasien pasien) throws RemoteException;

    void updatePasien(Pasien pasien) throws RemoteException;

   // void deletePasien(String Id_Pasien) throws RemoteException;

    Pasien getPasien(String Id_Pasien) throws RemoteException;

    List<Pasien> getPasien() throws RemoteException;
    
    Antrian insertAntrian(Antrian antrian) throws RemoteException;

    void updateAntrian(Antrian antrian) throws RemoteException;

    void deleteAntrian(String Id_Antrian) throws RemoteException;
    
    String getAutoNumberAntrian() throws RemoteException;

    Antrian getAntrian(String Id_Antrian) throws RemoteException;

    List<Antrian> getAntrian() throws RemoteException;
    String getAutoNumber() throws RemoteException;
}
