/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MemasukkanDataRekamMedis_06;

import Database.Entity.Tindakan_detailTindakan;
import Database.Entity.Rekam_Medis;
import ServerApplication.Service.DokterServiceServer;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Afifah
 */
public class BerhasilMemasukkanRekamMedis implements Remote{
    DokterServiceServer dokterServiceServer;
    
    public BerhasilMemasukkanRekamMedis() throws RemoteException{
        this.dokterServiceServer = new DokterServiceServer();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws RemoteException {
    }

    @After
    public void tearDown() {
    }
    
    @Test
    public void testGetAutoNumberRekamMedis() throws Exception {
        System.out.println("getAutoNumberRekamMedis");
        
        String expResult = "REK0007";
        String result = dokterServiceServer.getAutoNumberIdRekam();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testInsertRekam() throws Exception {
        System.out.println("insertRekam");
        
        Rekam_Medis instance = new Rekam_Medis();
        instance.setId_Penyakit("P0001");
        instance.setTinggi(123);
        instance.setBerat(33);
        instance.setTekanan_Darah(33);
        instance.setHasil_Pemerikasaan("batuk akut");
        instance.setAlergi("batuk");
        instance.setLayanan_Tambahan("USG");
        Rekam_Medis expResult = new Rekam_Medis();
        expResult.setId_Rekam("REK0007");
        expResult.setId_Penyakit("P0001");
        expResult.setId_Pasien("P0001");
        expResult.setTgl_Rekam(new Date("2015-06-08"));
        expResult.setTinggi(123);
        expResult.setBerat(33);
        expResult.setTekanan_Darah(33);
        expResult.setHasil_Pemerikasaan("batuk akut");
        expResult.setAlergi("batuk");
        expResult.setTotal_Harga(50);
        expResult.setLayanan_Tambahan("USG");
                
        Rekam_Medis result = dokterServiceServer.insertRekam_Medis(instance);
        assertEquals(expResult.getId_Rekam(), result.getId_Rekam());
        assertEquals(expResult.getId_Penyakit(), result.getId_Penyakit());
        assertEquals(expResult.getId_Pasien(), result.getId_Pasien());
        assertEquals(expResult.getTgl_Rekam(),result.getTgl_Rekam());
        assertEquals(expResult.getTinggi(), result.getTinggi());
        assertEquals(expResult.getBerat(), result.getBerat());
        assertEquals(expResult.getTekanan_Darah(), result.getTekanan_Darah());
        assertEquals(expResult.getHasil_Pemerikasaan(),result.getHasil_Pemerikasaan());
        assertEquals(expResult.getAlergi(), result.getAlergi());
        assertEquals(expResult.getTotal_Harga(), result.getTotal_Harga());
        assertEquals(expResult.getLayanan_Tambahan(), result.getLayanan_Tambahan());

    }

    @Test
    public void testGetAutoNumberRekam() throws Exception {
        System.out.println("getAutoNumberRekam");
        
        String expResult = "REK0007";
        String result = dokterServiceServer.getAutoNumberIdRekam();
        assertEquals(expResult, result);
    }
    
//    
//    @Test
//    public void testUpdateResep() throws Exception {
//        System.out.println("updateResep");
//        
//        Obat_resep resep = null;
//        String ID_RESEP = "";
//        int TOTAL_HARGA = 0;
//        
//        DokterServiceServer instance = new DokterServiceServer();
//        instance.updateResep(resep, ID_RESEP, TOTAL_HARGA);
//    }
}

    

