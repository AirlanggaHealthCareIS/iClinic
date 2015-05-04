/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ServerApplication.Service;

import Database.Entity.Antrian;
import Database.Entity.Pembayaran;
import Database.Entity.USG;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author S550
 */
public class USGServiceServerTest {
    
    public USGServiceServerTest() {
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
     * Test of insertUSG method, of class USGServiceServer.
     */
    @Test
    public void testInsertUSG() throws Exception {
        System.out.println("insertUSG");
        USG usg = null;
        USGServiceServer instance = new USGServiceServer();
        USG expResult = null;
        USG result = instance.insertUSG(usg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Id_pasien method, of class USGServiceServer.
     */
    @Test
    public void testId_pasien() throws Exception {
        System.out.println("Id_pasien");
        Antrian antrian = null;
        USGServiceServer instance = new USGServiceServer();
        Antrian expResult = null;
        Antrian result = instance.Id_pasien(antrian);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ubahstatus method, of class USGServiceServer.
     */
    @Test
    public void testUbahstatus() throws Exception {
        System.out.println("ubahstatus");
        String ID_ANTRIAN = "";
        USGServiceServer instance = new USGServiceServer();
        instance.ubahstatus(ID_ANTRIAN);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Id_usg method, of class USGServiceServer.
     */
    @Test
    public void testId_usg() throws Exception {
        System.out.println("Id_usg");
        USGServiceServer instance = new USGServiceServer();
        String expResult = "";
        String result = instance.Id_usg();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUSG method, of class USGServiceServer.
     */
    @Test
    public void testGetUSG_String() throws Exception {
        System.out.println("getUSG");
        String Id_USG = "";
        USGServiceServer instance = new USGServiceServer();
        USG expResult = null;
        USG result = instance.getUSG(Id_USG);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUSG method, of class USGServiceServer.
     */
    @Test
    public void testGetUSG_0args() throws Exception {
        System.out.println("getUSG");
        USGServiceServer instance = new USGServiceServer();
        List<USG> expResult = null;
        List<USG> result = instance.getUSG();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mencariIdPembayaranDariPembayaran method, of class USGServiceServer.
     */
    @Test
    public void testMencariIdPembayaranDariPembayaran() throws Exception {
        System.out.println("mencariIdPembayaranDariPembayaran");
        String idPasien = "";
        USGServiceServer instance = new USGServiceServer();
        String expResult = "";
        String result = instance.mencariIdPembayaranDariPembayaran(idPasien);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPembayaranDariPembayaran method, of class USGServiceServer.
     */
    @Test
    public void testGetPembayaranDariPembayaran() throws Exception {
        System.out.println("getPembayaranDariPembayaran");
        String idPembayaran = "";
        USGServiceServer instance = new USGServiceServer();
        Pembayaran expResult = null;
        Pembayaran result = instance.getPembayaranDariPembayaran(idPembayaran);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePembayaranDariPembayaran method, of class USGServiceServer.
     */
    @Test
    public void testUpdatePembayaranDariPembayaran() throws Exception {
        System.out.println("updatePembayaranDariPembayaran");
        Pembayaran pembayaranDB = null;
        String idTransaksiUSG = "";
        int Harga = 0;
        USGServiceServer instance = new USGServiceServer();
        instance.updatePembayaranDariPembayaran(pembayaranDB, idTransaksiUSG, Harga);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAutoNumberDariPembayaran method, of class USGServiceServer.
     */
    @Test
    public void testGetAutoNumberDariPembayaran() throws Exception {
        System.out.println("getAutoNumberDariPembayaran");
        USGServiceServer instance = new USGServiceServer();
        String expResult = "";
        String result = instance.getAutoNumberDariPembayaran();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertPembayaranDariPembayaran method, of class USGServiceServer.
     */
    @Test
    public void testInsertPembayaranDariPembayaran() throws Exception {
        System.out.println("insertPembayaranDariPembayaran");
        String idPembayaran = "";
        String idPasien = "";
        String idTransaksiUSG = "";
        int Harga = 0;
        USGServiceServer instance = new USGServiceServer();
        instance.insertPembayaranDariPembayaran(idPembayaran, idPasien, idTransaksiUSG, Harga);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
