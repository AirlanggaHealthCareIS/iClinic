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
public class Antrian implements Serializable {
    private int Id_Antrian;
    private int Id_Pasien;
    private String Jenis_Antrian;
    private String Keterangan;

    public int getId_Antrian() {
        return Id_Antrian;
    }

    public int getId_Pasien() {
        return Id_Pasien;
    }

    public String getJenis_Antrian() {
        return Jenis_Antrian;
    }

    public String getKeterangan() {
        return Keterangan;
    }

    public void setId_Antrian(int Id_Antrian) {
        this.Id_Antrian = Id_Antrian;
    }

    public void setId_Pasien(int Id_Pasien) {
        this.Id_Pasien = Id_Pasien;
    }

    public void setJenis_Antrian(String Jenis_Antrian) {
        this.Jenis_Antrian = Jenis_Antrian;
    }

    public void setKeterangan(String Keterangan) {
        this.Keterangan = Keterangan;
    }

}
