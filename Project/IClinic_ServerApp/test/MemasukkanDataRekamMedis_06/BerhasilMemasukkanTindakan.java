/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MemasukkanDataRekamMedis_06;

import Database.Entity.Tindakan_detailTindakan;
import ServerApplication.Service.DokterServiceServer;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
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
public class BerhasilMemasukkanTindakan implements Remote{
    DokterServiceServer dokterServiceServer;
    
    public BerhasilMemasukkanTindakan() throws RemoteException{
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
    public void testGetAutoNumberDetail() throws Exception {
        System.out.println("getAutoNumberDetail");
        
        String expResult = "DET0001";
        String result = dokterServiceServer.getAutoNumberNoDetail();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testInsertDetail() throws Exception {
        System.out.println("insertDetail");
        
        Tindakan_detailTindakan instance = new Tindakan_detailTindakan();
//        instance.setNo_Detail("DET0001");
  //      instance.setId_Rekam("REK0006");
        instance.setId_Tindakan("T0002");
        instance.setKeterangan("BPJS");
        
        Tindakan_detailTindakan expResult = new Tindakan_detailTindakan();
        expResult.setNo_Detail("DET0001");
        expResult.setId_Rekam("REK0006");
        expResult.setId_Tindakan("T0002");
        expResult.setKeterangan("BPJS");
                
        Tindakan_detailTindakan result = dokterServiceServer.insertDetailTindakan(instance);
        assertEquals(expResult.getNo_Detail(), result.getNo_Detail());
        assertEquals(expResult.getId_Rekam(), result.getId_Rekam());
        assertEquals(expResult.getId_Tindakan(), result.getId_Tindakan());
        assertEquals(expResult.getKeterangan(),result.getKeterangan());
    }

    @Test
    public void testGetAutoNumberDetailTindakan() throws Exception {
        System.out.println("getAutoNumberDetailTindakan");
        
        String expResult = "DET0001";
        String result = dokterServiceServer.getAutoNumberNoDetail();
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
