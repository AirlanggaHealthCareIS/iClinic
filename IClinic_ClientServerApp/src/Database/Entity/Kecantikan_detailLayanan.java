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
public class Kecantikan_detailLayanan implements Serializable{

    private int Id_Det_Kesehatan;
    private int Id_Kecantikan;
    private String Keterangan;

    public int getId_Det_Kesehatan() {
        return Id_Det_Kesehatan;
    }

    public int getId_Kecantikan() {
        return Id_Kecantikan;
    }

    public String getKeterangan() {
        return Keterangan;
    }

    public void setId_Det_Kesehatan(int Id_Det_Kesehatan) {
        this.Id_Det_Kesehatan = Id_Det_Kesehatan;
    }

    public void setId_Kecantikan(int Id_Kecantikan) {
        this.Id_Kecantikan = Id_Kecantikan;
    }

    public void setKeterangan(String Keterangan) {
        this.Keterangan = Keterangan;
    }

}
