/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Database.Entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author none
 */
public class Antrian implements Serializable {
    private String Id_Antrian;
    private String Id_Pasien;
    private String Jenis_Antrian;
    private String Keterangan;

    public String getId_Antrian() {
        return Id_Antrian;
    }

    public String getId_Pasien() {
        return Id_Pasien;
    }

    public String getJenis_Antrian() {
        return Jenis_Antrian;
    }

    public String getKeterangan() {
        return Keterangan;
    }

    public void setId_Antrian(String Id_Antrian) {
        this.Id_Antrian = Id_Antrian;
    }

    public void setId_Pasien(String Id_Pasien) {
        this.Id_Pasien = Id_Pasien;
    }

    public void setJenis_Antrian(String Jenis_Antrian) {
        this.Jenis_Antrian = Jenis_Antrian;
    }

    public void setKeterangan(String Keterangan) {
        this.Keterangan = Keterangan;
    }

}
