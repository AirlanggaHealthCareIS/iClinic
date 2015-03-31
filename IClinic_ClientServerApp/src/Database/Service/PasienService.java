/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Database.Service;

import Database.Entity.Pasien;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Tiara Ratna Sari
 */
public interface PasienService extends Remote {
    Pasien insertPasien(Pasien pasien) throws RemoteException;

    void updatePasien(Pasien pasien) throws RemoteException;

    void deletePasien(int Id_Pasien) throws RemoteException;

    Pasien getPasien(int Id_Pasien) throws RemoteException;

    List<Pasien> getPasien() throws RemoteException;
}
