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
public class Tindakan_detailTindakan implements Serializable{
    private String No_Detail;
    private String Id_Tindakan;
    private String Id_Rekam;
    private String Keterangan;

    public String getNo_Detail() {
        return No_Detail;
    }

    public String getId_Tindakan() {
        return Id_Tindakan;
    }

    public String getId_Rekam() {
        return Id_Rekam;
    }
            
    public String getKeterangan() {
        return Keterangan;
    }

    public void setNo_Detail(String No_Detail) {
        this.No_Detail = No_Detail;
    }

    public void setId_Rekam(String Id_Rekam) {
        this.Id_Rekam = Id_Rekam;
    }

    public void setId_Tindakan(String Id_Tindakan) {
        this.Id_Tindakan = Id_Tindakan;
    }

    public void setKeterangan(String Keterangan) {
        this.Keterangan = Keterangan;
    }

}
