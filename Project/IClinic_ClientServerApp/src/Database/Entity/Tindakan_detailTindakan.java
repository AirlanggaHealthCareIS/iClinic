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
    private int No_Detail;
    private int Id_Tindakan;
    private String Keterangan;

    public int getNo_Detail() {
        return No_Detail;
    }

    public int getId_Tindakan() {
        return Id_Tindakan;
    }

    public String getKeterangan() {
        return Keterangan;
    }

    public void setNo_Detail(int No_Detail) {
        this.No_Detail = No_Detail;
    }

    public void setId_Tindakan(int Id_Tindakan) {
        this.Id_Tindakan = Id_Tindakan;
    }

    public void setKeterangan(String Keterangan) {
        this.Keterangan = Keterangan;
    }

}
