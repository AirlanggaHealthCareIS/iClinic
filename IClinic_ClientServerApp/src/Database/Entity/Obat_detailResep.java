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
public class Obat_detailResep implements Serializable{

    private int No_Detail_Resep;
    private int Id_Resep;
    private int Id_Obat;
    private String Takaran;
    private String Pemakaian;
    private int Jumlah;
    private String Keterangan;

    public int getNo_Detail_Resep() {
        return No_Detail_Resep;
    }

    public int getId_Resep() {
        return Id_Resep;
    }

    public int getId_Obat() {
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

    public void setNo_Detail_Resep(int No_Detail_Resep) {
        this.No_Detail_Resep = No_Detail_Resep;
    }

    public void setId_Resep(int Id_Resep) {
        this.Id_Resep = Id_Resep;
    }

    public void setId_Obat(int Id_Obat) {
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
