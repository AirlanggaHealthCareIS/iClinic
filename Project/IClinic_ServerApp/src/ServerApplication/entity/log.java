/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ServerApplication.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author none
 */
public class log implements Serializable {
    private Date Tanggal;
    private String Kegiatan;
    private String Aktor;

    public void setTanggal(Date Tanggal) {
        this.Tanggal = Tanggal;
    }

    public void setKegiatan(String Kegiatan) {
        this.Kegiatan = Kegiatan;
    }

    public void setAktor(String Aktor) {
        this.Aktor = Aktor;
    }

    public Date getTanggal() {
        return Tanggal;
    }

    public String getKegiatan() {
        return Kegiatan;
    }

    public String getAktor() {
        return Aktor;
    }

}
