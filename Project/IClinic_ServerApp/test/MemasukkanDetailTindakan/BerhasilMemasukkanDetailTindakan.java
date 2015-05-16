/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MemasukkanDetailTindakan;

import Database.Entity.Rekam_Medis;
import Database.Entity.Tindakan_detailTindakan;
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
public class BerhasilMemasukkanDetailTindakan implements Remote{
    DokterServiceServer DokterServiceServer;

    public BerhasilMemasukkanDetailTindakan() throws RemoteException {
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
    public void testGetDetailTindakan_String() throws Exception { 
        System.out.println("getDetailTindakan");
        DokterServiceServer = new DokterServiceServer();
        Tindakan_detailTindakan detail_tindakan = new Tindakan_detailTindakan();
        Tindakan_detailTindakan instance = DokterServiceServer.insertDetailTindakan(detail_tindakan);
        
        System.out.println(instance.getNo_Detail());
        System.out.println(instance.getId_Tindakan());
        System.out.println(instance.getId_Rekam());
        System.out.println(instance.getKeterangan());
        
        Tindakan_detailTindakan expResult = new Tindakan_detailTindakan();
        expResult.setNo_Detail("DET0001");
        expResult.setId_Tindakan("T0001");
        expResult.setId_Rekam("REK0001");
        expResult.setKeterangan("Antibiotik generik");
        
        assertEquals(expResult.getNo_Detail(), instance.getNo_Detail());
        assertEquals(expResult.getId_Tindakan(), instance.getId_Tindakan());
        assertEquals(expResult.getId_Rekam(), instance.getId_Rekam());
        assertEquals(expResult.getKeterangan(), instance.getKeterangan());
    }
    @Test
    public void testInsertDetailTindakan() throws Exception {
        System.out.println("insertDetailTindakan");
        Tindakan_detailTindakan detail_tindakan = new Tindakan_detailTindakan();
        detail_tindakan.getNo_Detail();
        detail_tindakan.getId_Tindakan();
        detail_tindakan.getId_Rekam();
        detail_tindakan.getKeterangan();
        DokterServiceServer instance = new DokterServiceServer();
        Tindakan_detailTindakan expResult = new Tindakan_detailTindakan();
        Tindakan_detailTindakan result = instance.insertDetailTindakan(detail_tindakan);
        assertEquals(expResult, result);
     //    TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

        @Test
    public void testGetDetailTindakan_0args() throws Exception {
        System.out.println("getDetailTindakan");
        DokterServiceServer instance = new DokterServiceServer();
        List<Tindakan_detailTindakan> expResult = null;
    //    List<Tindakan_detailTindakan> result = instance.getDetailTindakanById(String ID_Rekam);
      //  assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
    public void testGetAutoNumberNoDetail() throws Exception {
        System.out.println("getAutoNumberNoDetail");
        DokterServiceServer instance = new DokterServiceServer();
        String expResult = "DET0001";
        String result = instance.getAutoNumberNoDetail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
    public void testGetTarif() throws Exception {
        System.out.println("getTarif");
        String nama_tindakan = "Pemeriksaan";
        DokterServiceServer instance = new DokterServiceServer();
        int expResult = 0;
        int result = instance.getTarif(nama_tindakan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
