/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Database.Service;

import Database.Entity.Lab_detailLab;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Tiara Ratna Sari
 */
public interface Lab_detailLabService extends Remote {
    Lab_detailLab insertLab_detailLab(Lab_detailLab detail_lab) throws RemoteException;

    void updateLab_detailLab(Lab_detailLab detail_lab) throws RemoteException;

    void deleteLab_detailLab(int Id_Detail_Lab) throws RemoteException;

    Lab_detailLab getLab_detailLab(int Id_Detail_Lab) throws RemoteException;

    List<Lab_detailLab> getLab_detailLab() throws RemoteException;
}
