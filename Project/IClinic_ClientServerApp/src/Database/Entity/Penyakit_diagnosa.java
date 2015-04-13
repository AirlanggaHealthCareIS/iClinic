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
    private String Id_Diagnosa;
    private String Id_Penyakit;
    private String Diagnosa;
    private String Keterangan;

    public String getId_Diagnosa() {
        return Id_Diagnosa;
    }

    public String getId_Penyakit() {
        return Id_Penyakit;
    }

    public String getDiagnosa() {
        return Diagnosa;
    }

    public String getKeterangan() {
        return Keterangan;
    }

    public void setId_Diagnosa(String Id_Diagnosa) {
        this.Id_Diagnosa = Id_Diagnosa;
    }

    public void setId_Penyakit(String Id_Penyakit) {
        this.Id_Penyakit = Id_Penyakit;
    }

    public void setDiagnosa(String Diagnosa) {
        this.Diagnosa = Diagnosa;
    }

    public void setKeterangan(String Keterangan) {
        this.Keterangan = Keterangan;
    }

}
