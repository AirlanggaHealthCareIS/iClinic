/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Database.Service;

import Database.Entity.User;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Tiara Ratna Sari
 */
public interface UserService extends Remote {
    User insertUser(User user) throws RemoteException;

    void updateUser(User user) throws RemoteException;

    void deleteUser(int Id_User) throws RemoteException;

    User getUser(int Id_User) throws RemoteException;

    List<User> getUser() throws RemoteException;
}
