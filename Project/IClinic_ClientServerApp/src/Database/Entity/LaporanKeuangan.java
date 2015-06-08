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
public class LaporanKeuangan implements Serializable  {
    
    private int DOKTER;
    private int RESEP;
    private int LAB;
    private int USG;
    private int KECANTIKAN;

    public void setDOKTER(int DOKTER) {
        this.DOKTER = DOKTER;
    }

    public void setRESEP(int RESEP) {
        this.RESEP = RESEP;
    }

    public void setLAB(int LAB) {
        this.LAB = LAB;
    }

    public void setUSG(int USG) {
        this.USG = USG;
    }

    public void setKECANTIKAN(int KECANTIKAN) {
        this.KECANTIKAN = KECANTIKAN;
    }

    public int getDOKTER() {
        return DOKTER;
    }

    public int getRESEP() {
        return RESEP;
    }

    public int getLAB() {
        return LAB;
    }

    public int getUSG() {
        return USG;
    }

    public int getKECANTIKAN() {
        return KECANTIKAN;
    }

}
