/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MemasukkanDataTransaksiPasienUSG;

import Database.Entity.USG;
import ServerApplication.Service.USGServiceServer;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Arline
 */
public class BerhasilMemasukkanDataTransaksi {
    
     /**
     * Test of getUSG method, of class USGServiceServer.
     */
    @Test
    public void testGetUSG_String() throws Exception {
        System.out.println("getUSG");
        USG usg=new USG();
        usg.setId_USG("USG0007");
        usg.setId_pasien("P0003");
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
          Date date = new Date();
          String now = dateFormat.format(date);
        try {
            Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse(now);
            usg.setTanggal(date2);
        } catch (ParseException ex) {
            Logger.getLogger(BerhasilMemasukkanDataTransaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        usg.setHasil(null);
        usg.setDeskripsi("sehat");
        usg.setHarga(100000);
        String Id_USG = "USG0007";
        USGServiceServer instance = new USGServiceServer();
        instance.insertUSG(usg);
        USG expResult = usg;
        USG result = instance.getUSG(Id_USG);
        assertEquals(expResult.getId_USG(),result.getId_USG());
        assertEquals(expResult.getId_pasien(),result.getId_pasien());
        assertEquals(expResult.getTanggal(),result.getTanggal());
        assertEquals(expResult.getHasil(),result.getHasil());
        assertEquals(expResult.getDeskripsi(),result.getDeskripsi());
        assertEquals(expResult.getHarga(),result.getHarga());
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
