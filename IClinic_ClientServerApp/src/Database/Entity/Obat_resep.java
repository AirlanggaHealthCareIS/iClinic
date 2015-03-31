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
public class Obat_resep implements Serializable{

    private int Id_Resep;
    private int Total_Harga;

    public int getId_Resep() {
        return Id_Resep;
    }

    public int getTotal_Harga() {
        return Total_Harga;
    }

    public void setId_Resep(int Id_Resep) {
        this.Id_Resep = Id_Resep;
    }

    public void setTotal_Harga(int Total_Harga) {
        this.Total_Harga = Total_Harga;
    }

}
