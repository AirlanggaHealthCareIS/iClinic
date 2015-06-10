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
import ServerApplication.model.TableModelLog;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Arline
 */
public class BerhasilMemasukkanDataTransaksi implements Remote{
        USGServiceServer usgServiceServer;
        TableModelLog tableModelLog = new TableModelLog();
    
     public BerhasilMemasukkanDataTransaksi ()throws RemoteException {
        this.usgServiceServer = new USGServiceServer(tableModelLog);
    }
     
     
     /**
     * Test of getUSG method, of class USGServiceServer.
     */
    @Test
    public void testGetUSG_String() throws Exception {
        System.out.println("getUSG");
        this.usgServiceServer = new USGServiceServer(tableModelLog);
        USG usg=new USG();
        usg.setId_USG("USG0001");
        usg.setId_pasien("P0001");
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
        String Id_USG = "USG0001";
        USG instance = usgServiceServer.getUSG(Id_USG);
        System.out.println(instance);
//        USGServiceServer instance = new USGServiceServer();
//        instance.insertUSG(usg);
        USG expResult = usg;
//        USG result = instance.getUSG(Id_USG);
        assertEquals(expResult.getId_USG(),instance.getId_USG());
        assertEquals(expResult.getId_pasien(),instance.getId_pasien());
        assertEquals(expResult.getTanggal(),instance.getTanggal());
        assertEquals(expResult.getHasil(),instance.getHasil());
        assertEquals(expResult.getDeskripsi(),instance.getDeskripsi());
        assertEquals(expResult.getHarga(),instance.getHarga());
    }
    
}