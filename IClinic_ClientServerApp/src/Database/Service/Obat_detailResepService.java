/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Database.Service;

import Database.Entity.Obat_detailResep;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Tiara Ratna Sari
 */
public interface Obat_detailResepService extends Remote {
    Obat_detailResep insertObat_detailResep(Obat_detailResep detail_resep) throws RemoteException;

    void updateObat_detailResep(Obat_detailResep detail_resep) throws RemoteException;

    void deleteObat_detailResep(int No_Detail_Resep) throws RemoteException;

    Obat_detailResep getObat_detailResep(int No_Detail_Resep) throws RemoteException;

    List<Obat_detailResep> getObat_detailResep() throws RemoteException;


}
