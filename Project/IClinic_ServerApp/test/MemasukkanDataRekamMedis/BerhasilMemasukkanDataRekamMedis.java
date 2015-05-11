/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MemasukkanDataRekamMedis;

import Database.Entity.Rekam_Medis;
import ServerApplication.Service.DokterServiceServer;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Afifah
 */
public class BerhasilMemasukkanDataRekamMedis implements Remote{
    DokterServiceServer DokterServiceServer;

    public BerhasilMemasukkanDataRekamMedis() throws RemoteException {
        this.DokterServiceServer = new DokterServiceServer();
    }
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
@Test
    public void testGetRekam_Medis_String() throws Exception {
        System.out.println("getRekamMedis");
        DokterServiceServer = new DokterServiceServer();
        Rekam_Medis rekam_medis = new Rekam_Medis();
        Rekam_Medis instance = DokterServiceServer.insertRekam_Medis(rekam_medis);
        
        System.out.println(instance.getId_Rekam());
        System.out.println(instance.getId_Diagnosa());
        System.out.println(instance.getId_Pasien());
        System.out.println(instance.getTgl_Rekam());
        System.out.println(instance.getTinggi());
        System.out.println(instance.getBerat());
        System.out.println(instance.getTekanan_Darah());
        System.out.println(instance.getHasil_Pemerikasaan());
        System.out.println(instance.getAlergi());
        System.out.println(instance.getTotal_Harga());
        System.out.println(instance.getLayanan_Tambahan());
        
        Rekam_Medis expResult = new Rekam_Medis();
        expResult.setId_Rekam("REK0001");
        expResult.setId_Diagnosa("D0001");
        expResult.setId_Pasien("PAS0001");
        expResult.setTgl_Rekam(new Date(2015-05-01));
        expResult.setTinggi(123);
        expResult.setBerat(40);
        expResult.setTekanan_Darah(123);
        expResult.setHasil_Pemerikasaan("Campak");
        expResult.setAlergi("Tidak ada");
        expResult.setTotal_Harga(129999);
        expResult.setLayanan_Tambahan("tidak ada");
 
        assertEquals(expResult.getId_Rekam(), instance.getId_Rekam());
        assertEquals(expResult.getId_Diagnosa(), instance.getId_Diagnosa());
        assertEquals(expResult.getId_Pasien(), instance.getId_Pasien());
        assertEquals(expResult.getTgl_Rekam(), instance.getTgl_Rekam());
        assertEquals(expResult.getTinggi(), instance.getTinggi());
        assertEquals(expResult.getBerat(), instance.getBerat());
        assertEquals(expResult.getTekanan_Darah(), instance.getTekanan_Darah());
        assertEquals(expResult.getHasil_Pemerikasaan(), instance.getHasil_Pemerikasaan());
        assertEquals(expResult.getAlergi(), instance.getAlergi());
        assertEquals(expResult.getTotal_Harga(), instance.getTotal_Harga());
        assertEquals(expResult.getLayanan_Tambahan(), instance.getLayanan_Tambahan());    
    }
    
@Test
    public void testInsertRekam_Medis() throws Exception {
        System.out.println("insertRekam_Medis");
        Rekam_Medis rekam_medis = new Rekam_Medis();
        rekam_medis.getId_Rekam();
        rekam_medis.getId_Diagnosa();
        rekam_medis.getId_Pasien();
        rekam_medis.getId_Rekam();
        rekam_medis.getTinggi();
        rekam_medis.getBerat();
        rekam_medis.getTekanan_Darah();
        rekam_medis.getHasil_Pemerikasaan();
        rekam_medis.getAlergi();
        rekam_medis.getTotal_Harga();
        rekam_medis.getLayanan_Tambahan();
      
        DokterServiceServer instance = new DokterServiceServer();
        Rekam_Medis result = instance.insertRekam_Medis(rekam_medis);
        Rekam_Medis expResult = new Rekam_Medis();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetRekam_Medis_0args() throws Exception {
        System.out.println("getRekam_Medis");
        DokterServiceServer instance = new DokterServiceServer();
        List<Rekam_Medis> expResult = null;
        List<Rekam_Medis> result = instance.getRekam_Medis();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
    public void testGetNamaDiagnosa() throws Exception {
        System.out.println("getNamaDiagnosa");
        DokterServiceServer instance = new DokterServiceServer();
        List expResult = null;
        List result = instance.getNamaDiagnosa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetIdDiagnosa() throws Exception {
        System.out.println("getIdDiagnosa");
        String namaDiagnosa = "flu berat";
        DokterServiceServer instance = new DokterServiceServer();
        String expResult = "D0001";
        String result = instance.getIdDiagnosa(namaDiagnosa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
    public void testGetNamaTindakan() throws Exception {
        System.out.println("getNamaTindakan");
        DokterServiceServer instance = new DokterServiceServer();
        List expResult = null;
        expResult.add("Pemeriksaan");
        expResult.add("Pemberian vaksin");
        expResult.add("Pemberian imunisasi");
        List result = instance.getNamaTindakan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdTindakan method, of class DokterServiceServer.
     */
    @Test
    public void testGetIdTindakan() throws Exception {
        System.out.println("getIdTindakan");
        String namaTindakan = "Pemeriksaan";
        DokterServiceServer instance = new DokterServiceServer();
        String expResult = "T0001";
        String result = instance.getIdTindakan(namaTindakan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
    public void testGetAutoNumberIdRekam() throws Exception {
        System.out.println("getAutoNumberIdRekam");
        DokterServiceServer instance = new DokterServiceServer();
        String expResult = "REK0001";
        String result = instance.getAutoNumberIdRekam();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


}
