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
public class Obat_detailResepPembelian implements Serializable{

    private String No_Detail_Resep;
    private String Nama_Obat;
    private String Takaran;
    private String Pemakaian;
    private int Jumlah;
    private int Harga;
    private int Total;

    public void setNama_Obat(String Nama_Obat) {
        this.Nama_Obat = Nama_Obat;
    }

    public void setTotal(int Total) {
        this.Total = Total;
    }

    public String getNama_Obat() {
        return Nama_Obat;
    }

    public int getTotal() {
        return Total;
    }

    public void setHarga(int Harga) {
        this.Harga = Harga;
    }

    public int getHarga() {
        return Harga;
    }

    public String getNo_Detail_Resep() {
        return No_Detail_Resep;
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

    public void setNo_Detail_Resep(String No_Detail_Resep) {
        this.No_Detail_Resep = No_Detail_Resep;
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
}