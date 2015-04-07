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
public class Obat_tabelMaster implements Serializable{

    private int Id_Obat;
    private String Nama_Obat;
    private String Jenis_Obat;
    private int Harga_Obat;
    private int Satuan;

    public int getId_Obat() {
        return Id_Obat;
    }

    public String getNama_Obat() {
        return Nama_Obat;
    }

    public String getJenis_Obat() {
        return Jenis_Obat;
    }

    public int getHarga_Obat() {
        return Harga_Obat;
    }

    public int getSatuan() {
        return Satuan;
    }

    public void setId_Obat(int Id_Obat) {
        this.Id_Obat = Id_Obat;
    }

    public void setNama_Obat(String Nama_Obat) {
        this.Nama_Obat = Nama_Obat;
    }

    public void setJenis_Obat(String Jenis_Obat) {
        this.Jenis_Obat = Jenis_Obat;
    }

    public void setHarga_Obat(int Harga_Obat) {
        this.Harga_Obat = Harga_Obat;
    }

    public void setSatuan(int Satuan) {
        this.Satuan = Satuan;
    }
    
}
