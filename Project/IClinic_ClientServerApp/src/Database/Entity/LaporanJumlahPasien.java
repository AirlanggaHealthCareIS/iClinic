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
public class LaporanJumlahPasien implements Serializable  {
    private int PASIEN;
    private int DOKTER;
    private int LAB;
    private int KECANTIKAN;
    private int USG;

    public void setPASIEN(int PASIEN) {
        this.PASIEN = PASIEN;
    }

    public void setDOKTER(int DOKTER) {
        this.DOKTER = DOKTER;
    }

    public void setLAB(int LAB) {
        this.LAB = LAB;
    }

    public void setKECANTIKAN(int KECANTIKAN) {
        this.KECANTIKAN = KECANTIKAN;
    }

    public void setUSG(int USG) {
        this.USG = USG;
    }

    public int getPASIEN() {
        return PASIEN;
    }

    public int getDOKTER() {
        return DOKTER;
    }

    public int getLAB() {
        return LAB;
    }

    public int getKECANTIKAN() {
        return KECANTIKAN;
    }

    public int getUSG() {
        return USG;
    }
    
}
