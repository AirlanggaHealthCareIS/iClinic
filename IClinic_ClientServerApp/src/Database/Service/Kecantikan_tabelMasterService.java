/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Database.Service;

import Database.Entity.Kecantikan_tabelMaster;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Tiara Ratna Sari
 */
public interface Kecantikan_tabelMasterService extends Remote {
    Kecantikan_tabelMaster insertKecantikan_tabelMaster(Kecantikan_tabelMaster kecantikan) throws RemoteException;

    void updateKecantikan_tabelMaster(Kecantikan_tabelMaster kecantikan) throws RemoteException;

    void deleteKecantikan_tabelMaster(int Id_Kecantikan) throws RemoteException;

    Kecantikan_tabelMaster getKecantikan_tabelMaster(int Id_Kecantikan) throws RemoteException;

    List<Kecantikan_tabelMaster> getKecantikan_tabelMaster() throws RemoteException;


}
