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
public class Penyakit_tabelMaster implements Serializable {
    private int Id_Penyakit;
    private String Penyakit;
    private String Gejala;

    public int getId_Penyakit() {
        return Id_Penyakit;
    }

    public String getPenyakit() {
        return Penyakit;
    }

    public String getGejala() {
        return Gejala;
    }

    public void setId_Penyakit(int Id_Penyakit) {
        this.Id_Penyakit = Id_Penyakit;
    }

    public void setPenyakit(String Penyakit) {
        this.Penyakit = Penyakit;
    }

    public void setGejala(String Gejala) {
        this.Gejala = Gejala;
    }

}
