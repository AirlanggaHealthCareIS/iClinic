/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Database.Entity;

import java.io.Serializable;

/**
 *
 * @author erin
 */
public class Lab_tabelMaster implements Serializable{
    private String Id_Lab;
    private String Jenis_Pemeriksaan;
    private String Harga;
    private String Deskripsi;

    public String getId_Lab() {
        return Id_Lab;
    }

    public String getJenis_Pemeriksaan() {
        return Jenis_Pemeriksaan;
    }

    public String getHarga() {
        return Harga;
    }
    public String getDeskripsi() {
        return Deskripsi;
    }
    public void setId_Lab(String Id_Lab) {
        this.Id_Lab = Id_Lab;
    }

    public void setJenis_Pemeriksaan(String Jenis_Pemeriksaan) {
        this.Jenis_Pemeriksaan = Jenis_Pemeriksaan;
    }

    public void setHarga(String Harga) {
        this.Harga = Harga;
    }
 public void setDeskripsi(String Deskripsi) {
        this.Deskripsi = Deskripsi;
    }

}
