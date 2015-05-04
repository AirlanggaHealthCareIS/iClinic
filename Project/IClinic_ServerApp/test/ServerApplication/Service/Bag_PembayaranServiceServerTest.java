/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServerApplication.Service;

import Database.Entity.Pembayaran;
import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus X455L
 */
public class Bag_PembayaranServiceServerTest {
    
    public Bag_PembayaranServiceServerTest() {
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

    /**
     * Test of insertPembayaran method, of class Bag_PembayaranServiceServer.
     */
    @Test
    public void testInsertPembayaran() throws Exception {
        System.out.println("insertPembayaran");
        Pembayaran pembayaran = null;
        Bag_PembayaranServiceServer instance = new Bag_PembayaranServiceServer();
        Pembayaran expResult = null;
        Pembayaran result = instance.insertPembayaran(pembayaran);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePembayaran method, of class Bag_PembayaranServiceServer.
     */
    @Test
    public void testUpdatePembayaran() throws Exception {
        System.out.println("updatePembayaran");
        Pembayaran pembayaran = null;
        Bag_PembayaranServiceServer instance = new Bag_PembayaranServiceServer();
        instance.updatePembayaran(pembayaran);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletePembayaran method, of class Bag_PembayaranServiceServer.
     */
    @Test
    public void testDeletePembayaran() throws Exception {
        System.out.println("deletePembayaran");
        String Id_Pembayaran = "";
        Bag_PembayaranServiceServer instance = new Bag_PembayaranServiceServer();
        instance.deletePembayaran(Id_Pembayaran);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPembayaran method, of class Bag_PembayaranServiceServer.
     */
    @Test
    public void testGetPembayaran_String() throws Exception {
        System.out.println("getPembayaran");
        String Id_Pembayaran = "";
        Bag_PembayaranServiceServer instance = new Bag_PembayaranServiceServer();
        Pembayaran expResult = null;
        Pembayaran result = instance.getPembayaran(Id_Pembayaran);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPembayaran method, of class Bag_PembayaranServiceServer.
     */
    @Test
    public void testGetPembayaran_0args() throws Exception {
        System.out.println("getPembayaran");
        Bag_PembayaranServiceServer instance = new Bag_PembayaranServiceServer();
        List<Pembayaran> expResult = null;
        List<Pembayaran> result = instance.getPembayaran();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MeihatTotalTagihanPembayaran method, of class Bag_PembayaranServiceServer.
     */
    @Test
    public void testMeihatTotalTagihanPembayaran() throws Exception {
        System.out.println("MeihatTotalTagihanPembayaran");
        String Id_Pasien = "";
        Date tanggal = null;
        Bag_PembayaranServiceServer instance = new Bag_PembayaranServiceServer();
        Pembayaran expResult = null;
        Pembayaran result = instance.MeihatTotalTagihanPembayaran(Id_Pasien, tanggal);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateStatusPembayaran method, of class Bag_PembayaranServiceServer.
     */
    @Test
    public void testUpdateStatusPembayaran() throws Exception {
        System.out.println("updateStatusPembayaran");
        String Id_Pembayaran = "";
        String Status = "";
        Bag_PembayaranServiceServer instance = new Bag_PembayaranServiceServer();
        instance.updateStatusPembayaran(Id_Pembayaran, Status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class Bag_PembayaranServiceServer.
     */
    @Test
    public void testGetStatus() throws Exception {
        System.out.println("getStatus");
        String Id_Pembayaran = "";
        Bag_PembayaranServiceServer instance = new Bag_PembayaranServiceServer();
        String expResult = "";
        String result = instance.getStatus(Id_Pembayaran);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
