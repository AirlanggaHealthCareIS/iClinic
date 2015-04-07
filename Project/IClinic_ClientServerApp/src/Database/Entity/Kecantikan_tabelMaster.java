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
public class Kecantikan_tabelMaster implements Serializable{

    private int Id_Kecantikan;
    private String Jenis_Layanan;
    private String Tarif;

    public int getId_Kecantikan() {
        return Id_Kecantikan;
    }

    public String getJenis_Layanan() {
        return Jenis_Layanan;
    }

    public String getTarif() {
        return Tarif;
    }

    public void setId_Kecantikan(int Id_Kecantikan) {
        this.Id_Kecantikan = Id_Kecantikan;
    }

    public void setJenis_Layanan(String Jenis_Layanan) {
        this.Jenis_Layanan = Jenis_Layanan;
    }

    public void setTarif(String Tarif) {
        this.Tarif = Tarif;
    }

}
