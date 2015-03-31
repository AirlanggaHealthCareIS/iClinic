/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Database.Entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Tiara Ratna Sari
 */
public class USG implements Serializable {
    private int Id_USG;
    private Long Hasil;
    private int Harga;

    public int getId_USG() {
        return Id_USG;
    }

    public Long getHasil() {
        return Hasil;
    }

    public int getHarga() {
        return Harga;
    }

    public void setId_USG(int Id_USG) {
        this.Id_USG = Id_USG;
    }

    public void setHasil(Long Hasil) {
        this.Hasil = Hasil;
    }

    public void setHarga(int Harga) {
        this.Harga = Harga;
    }

}
