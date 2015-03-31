/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Database.Service;

import Database.Entity.Lab_tabelMaster;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Tiara Ratna Sari
 */
public interface Lab_tabelMasterService extends Remote {
    Lab_tabelMaster insertLab_tabelMaster(Lab_tabelMaster lab) throws RemoteException;

    void updateLab_tabelMaster(Lab_tabelMaster lab) throws RemoteException;

    void deleteLab_tabelMaster(int Id_Lab) throws RemoteException;

    Lab_tabelMaster getLab_tabelMaster(int Id_Lab) throws RemoteException;

    List<Lab_tabelMaster> getLab_tabelMaster() throws RemoteException;
}
