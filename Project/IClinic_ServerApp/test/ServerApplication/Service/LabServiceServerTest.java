/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ServerApplication.Service;

import Database.Entity.Lab_detailLab;
import Database.Entity.Lab_transaksiLab;
import Database.Entity.Pembayaran;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author acer
 */
public class LabServiceServerTest {
    
    public LabServiceServerTest() {
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
     * Test of insertLab_detailLab method, of class LabServiceServer.
     */
    @Test
    public void testInsertLab_detailLab() throws Exception {
        System.out.println("insertLab_detailLab");
        Lab_detailLab detail_lab = null;
        LabServiceServer instance = new LabServiceServer();
        instance.insertLab_detailLab(detail_lab);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLab_detailLab method, of class LabServiceServer.
     */
    @Test
    public void testGetLab_detailLab_String() throws Exception {
        System.out.println("getLab_detailLab");
        String Id_Detail_Lab = "";
        LabServiceServer instance = new LabServiceServer();
        Lab_detailLab expResult = null;
        Lab_detailLab result = instance.getLab_detailLab(Id_Detail_Lab);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLab_detailLab method, of class LabServiceServer.
     */
    @Test
    public void testGetLab_detailLab_0args() throws Exception {
        System.out.println("getLab_detailLab");
        LabServiceServer instance = new LabServiceServer();
        List expResult = null;
        List result = instance.getLab_detailLab();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertLab_transaksiLab method, of class LabServiceServer.
     */
    @Test
    public void testInsertLab_transaksiLab() throws Exception {
        System.out.println("insertLab_transaksiLab");
        Lab_transaksiLab transaksi_lab = null;
        LabServiceServer instance = new LabServiceServer();
        instance.insertLab_transaksiLab(transaksi_lab);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLab_transaksiLab method, of class LabServiceServer.
     */
    @Test
    public void testGetLab_transaksiLab_String() throws Exception {
        System.out.println("getLab_transaksiLab");
        String Transaksi_Lab = "";
        LabServiceServer instance = new LabServiceServer();
        Lab_transaksiLab expResult = null;
        Lab_transaksiLab result = instance.getLab_transaksiLab(Transaksi_Lab);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLab_transaksiLab method, of class LabServiceServer.
     */
    @Test
    public void testGetLab_transaksiLab_0args() throws Exception {
        System.out.println("getLab_transaksiLab");
        LabServiceServer instance = new LabServiceServer();
        List expResult = null;
        List result = instance.getLab_transaksiLab();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLaboratorium method, of class LabServiceServer.
     */
    @Test
    public void testGetLaboratorium() throws Exception {
        System.out.println("getLaboratorium");
        LabServiceServer instance = new LabServiceServer();
        List expResult = null;
        List result = instance.getLaboratorium();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mencariIdPembayaranDariPembayaran method, of class LabServiceServer.
     */
    @Test
    public void testMencariIdPembayaranDariPembayaran() throws Exception {
        System.out.println("mencariIdPembayaranDariPembayaran");
        String idPasien = "";
        LabServiceServer instance = new LabServiceServer();
        String expResult = "";
        String result = instance.mencariIdPembayaranDariPembayaran(idPasien);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPembayaranDariPembayaran method, of class LabServiceServer.
     */
    @Test
    public void testGetPembayaranDariPembayaran() throws Exception {
        System.out.println("getPembayaranDariPembayaran");
        String idPembayaran = "";
        LabServiceServer instance = new LabServiceServer();
        Pembayaran expResult = null;
        Pembayaran result = instance.getPembayaranDariPembayaran(idPembayaran);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePembayaranDariPembayaran method, of class LabServiceServer.
     */
    @Test
    public void testUpdatePembayaranDariPembayaran() throws Exception {
        System.out.println("updatePembayaranDariPembayaran");
        Pembayaran pembayaranDB = null;
        String idDetailLab = "";
        int Harga = 0;
        LabServiceServer instance = new LabServiceServer();
        instance.updatePembayaranDariPembayaran(pembayaranDB, idDetailLab, Harga);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAutoNumberDariPembayaran method, of class LabServiceServer.
     */
    @Test
    public void testGetAutoNumberDariPembayaran() throws Exception {
        System.out.println("getAutoNumberDariPembayaran");
        LabServiceServer instance = new LabServiceServer();
        String expResult = "";
        String result = instance.getAutoNumberDariPembayaran();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertPembayaranDariPembayaran method, of class LabServiceServer.
     */
    @Test
    public void testInsertPembayaranDariPembayaran() throws Exception {
        System.out.println("insertPembayaranDariPembayaran");
        String idPembayaran = "";
        String idPasien = "";
        String idDetailLab = "";
        int Harga = 0;
        LabServiceServer instance = new LabServiceServer();
        instance.insertPembayaranDariPembayaran(idPembayaran, idPasien, idDetailLab, Harga);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateLab_transaksiLab method, of class LabServiceServer.
     */
    @Test
    public void testUpdateLab_transaksiLab() throws Exception {
        System.out.println("updateLab_transaksiLab");
        Lab_transaksiLab transaksi_lab = null;
        LabServiceServer instance = new LabServiceServer();
        instance.updateLab_transaksiLab(transaksi_lab);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteLab_transaksiLab method, of class LabServiceServer.
     */
    @Test
    public void testDeleteLab_transaksiLab() throws Exception {
        System.out.println("deleteLab_transaksiLab");
        int Id_Transaksi_Lab = 0;
        LabServiceServer instance = new LabServiceServer();
        instance.deleteLab_transaksiLab(Id_Transaksi_Lab);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLab_transaksiLab method, of class LabServiceServer.
     */
    @Test
    public void testGetLab_transaksiLab_int() throws Exception {
        System.out.println("getLab_transaksiLab");
        int Id_Transaksi_Lab = 0;
        LabServiceServer instance = new LabServiceServer();
        Lab_transaksiLab expResult = null;
        Lab_transaksiLab result = instance.getLab_transaksiLab(Id_Transaksi_Lab);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
