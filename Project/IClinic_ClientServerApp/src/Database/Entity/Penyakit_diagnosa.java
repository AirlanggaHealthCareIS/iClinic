/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Database.Entity;

import java.io.Serializable;

/**
 *
 * @author Tiara Ratna Sari
 */
public class Penyakit_diagnosa implements Serializable {
    private int Id_Diagnosa;
    private int Id_Penyakit;
    private String Diagnosa;
    private String Keterangan;

    public int getId_Diagnosa() {
        return Id_Diagnosa;
    }

    public int getId_Penyakit() {
        return Id_Penyakit;
    }

    public String getDiagnosa() {
        return Diagnosa;
    }

    public String getKeterangan() {
        return Keterangan;
    }

    public void setId_Diagnosa(int Id_Diagnosa) {
        this.Id_Diagnosa = Id_Diagnosa;
    }

    public void setId_Penyakit(int Id_Penyakit) {
        this.Id_Penyakit = Id_Penyakit;
    }

    public void setDiagnosa(String Diagnosa) {
        this.Diagnosa = Diagnosa;
    }

    public void setKeterangan(String Keterangan) {
        this.Keterangan = Keterangan;
    }

}
