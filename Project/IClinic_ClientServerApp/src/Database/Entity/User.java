/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Database.Entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Tiara Ratna Sari
 */
public class User implements Serializable {
    private int Id_User;
    private String Nama_User;
    private String Jabatan;
    private String Username;
    private String Password;

    public int getId_User() {
        return Id_User;
    }

    public String getNama_User() {
        return Nama_User;
    }

    public String getJabatan() {
        return Jabatan;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setId_User(int Id_User) {
        this.Id_User = Id_User;
    }

    public void setNama_User(String Nama_User) {
        this.Nama_User = Nama_User;
    }

    public void setJabatan(String Jabatan) {
        this.Jabatan = Jabatan;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

}