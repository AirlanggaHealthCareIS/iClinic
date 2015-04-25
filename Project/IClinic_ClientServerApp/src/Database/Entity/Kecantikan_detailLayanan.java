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

    private String Id_Det_Kesehatan;
    private String Id_Trans_Layanan;
    private String Id_Kecantikan;
    private String Keterangan;

    public String getId_Det_Kesehatan() {
        return Id_Det_Kesehatan;
    }

    public String getId_Kecantikan() {
        return Id_Kecantikan;
    }

    public String getKeterangan() {
        return Keterangan;
    }

    public void setId_Det_Kesehatan(String Id_Det_Kesehatan) {
        this.Id_Det_Kesehatan = Id_Det_Kesehatan;
    }

    public void setId_Kecantikan(String Id_Kecantikan) {
        this.Id_Kecantikan = Id_Kecantikan;
    }

    public void setKeterangan(String Keterangan) {
        this.Keterangan = Keterangan;
    }

    public String getId_Trans_Layanan() {
        return Id_Trans_Layanan;
    }

    public void setId_Trans_Layanan(String Id_Trans_Layanan) {
        this.Id_Trans_Layanan = Id_Trans_Layanan;
    }

}
