/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Database.Service;

import Database.Entity.Tindakan_detailTindakan;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Tiara Ratna Sari
 */
public interface Tindakan_detailTindakanService extends Remote {
    Tindakan_detailTindakan insertTindakan_detailTindakan(Tindakan_detailTindakan detail_tindakan) throws RemoteException;

    void updateTindakan_detailTindakan(Tindakan_detailTindakan detail_tindakan) throws RemoteException;

    void deleteTindakan_detailTindakan(int No_Detail) throws RemoteException;

    Tindakan_detailTindakan getTindakan_detailTindakan(int No_Detail) throws RemoteException;

    List<Tindakan_detailTindakan> getTindakan_detailTindakan() throws RemoteException;
}
