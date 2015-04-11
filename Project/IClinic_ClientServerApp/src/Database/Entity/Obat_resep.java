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
public class Obat_resep implements Serializable{

    private String Id_Resep;
    private String Id_Rekam;
    private int Total_Harga;

    public String getId_Resep() {
        return Id_Resep;
    }
    
    public String getId_Rekam() {
        return Id_Rekam;
    }
    
    public int getTotal_Harga() {
        return Total_Harga;
    }

    public void setId_Resep(String Id_Resep) {
        this.Id_Resep = Id_Resep;
    }

    public void setId_Rekam(String Id_Rekam) {
        this.Id_Rekam = Id_Rekam;
    }
    
    public void setTotal_Harga(int Total_Harga) {
        this.Total_Harga = Total_Harga;
    }

}
