/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Database.Service;

import Database.Entity.Obat_resep;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Tiara Ratna Sari
 */
public interface Obat_resepService extends Remote {
    Obat_resep insertObat_resep(Obat_resep obat) throws RemoteException;

    void updateObat_resep(Obat_resep obat) throws RemoteException;

    void deleteObat_resep(int Id_Resep) throws RemoteException;

    Obat_resep getObat_resep(int Id_Resep) throws RemoteException;

    List<Obat_resep> getObat_resep() throws RemoteException;


}
