/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Database.Entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Arline
 */
public class USG implements Serializable {
    private String Id_USG;
    private Long Hasil;
    private int Harga;
    private String Id_pasien;
    private String Deskripsi;

    public String getId_pasien() {
        return Id_pasien;
    }

    public void setId_pasien(String Id_pasien) {
        this.Id_pasien = Id_pasien;
    }

    public String getDeskripsi() {
        return Deskripsi;
    }

    public void setDeskripsi(String Deskripsi) {
        this.Deskripsi = Deskripsi;
    }
            
    public String getId_USG() {
        return Id_USG;
    }

    public Long getHasil() {
        return Hasil;
    }

    public int getHarga() {
        return Harga;
    }

    public void setId_USG(String Id_USG) {
        this.Id_USG = Id_USG;
    }

    public void setHasil(Long Hasil) {
        this.Hasil = Hasil;
    }

    public void setHarga(int Harga) {
        this.Harga = Harga;
    }

}
