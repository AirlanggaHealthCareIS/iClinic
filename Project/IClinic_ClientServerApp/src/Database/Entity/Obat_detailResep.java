/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.Entity;

import java.io.Serializable;

/**
 *
 * @author Rindu Puspita
 */
public class Obat_detailResep implements Serializable{

    private String No_Detail_Resep;
    private String Id_Resep;
    private String Id_Obat;
    private String Takaran;
    private String Pemakaian;
    private int Jumlah;
    private String Keterangan;

    public String getNo_Detail_Resep() {
        return No_Detail_Resep;
    }

    public String getId_Resep() {
        return Id_Resep;
    }

    public String getId_Obat() {
        return Id_Obat;
    }

    public String getTakaran() {
        return Takaran;
    }

    public String getPemakaian() {
        return Pemakaian;
    }

    public int getJumlah() {
        return Jumlah;
    }

    public String getKeterangan() {
        return Keterangan;
    }

    public void setNo_Detail_Resep(String No_Detail_Resep) {
        this.No_Detail_Resep = No_Detail_Resep;
    }

    public void setId_Resep(String Id_Resep) {
        this.Id_Resep = Id_Resep;
    }

    public void setId_Obat(String Id_Obat) {
        this.Id_Obat = Id_Obat;
    }

    public void setTakaran(String Takaran) {
        this.Takaran = Takaran;
    }

    public void setPemakaian(String Pemakaian) {
        this.Pemakaian = Pemakaian;
    }

    public void setJumlah(int Jumlah) {
        this.Jumlah = Jumlah;
    }

    public void setKeterangan(String Keterangan) {
        this.Keterangan = Keterangan;
    }

}
