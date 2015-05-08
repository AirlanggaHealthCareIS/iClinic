/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ServerApplication.Service;

import Database.Entity.Antrian;
import Database.Entity.Obat_detailResep;
import Database.Entity.Pasien;
import Database.Entity.Pembayaran;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Dell
 */
public class KepalaKlinikServiceServerTest {
    
    public KepalaKlinikServiceServerTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPembayaran method, of class KepalaKlinikServiceServer.
     */
    @Test
    public void testGetPembayaran_int() throws Exception {
        System.out.println("getPembayaran");
        int Id_Pembayaran = 0;
        KepalaKlinikServiceServer instance = new KepalaKlinikServiceServer();
        Pembayaran expResult = null;
        Pembayaran result = instance.getPembayaran(Id_Pembayaran);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPembayaran method, of class KepalaKlinikServiceServer.
     */
    @Test
    public void testGetPembayaran() throws Exception {
        System.out.println("getPembayaran");
        KepalaKlinikServiceServer instance = new KepalaKlinikServiceServer();
        List expResult = null;
        List result = instance.getPembayaran();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPasien method, of class KepalaKlinikServiceServer.
     */
    @Test
    public void testGetPasien_int() throws Exception {
        System.out.println("getPasien");
        int Id_Pasien = 0;
        KepalaKlinikServiceServer instance = new KepalaKlinikServiceServer();
        Pasien expResult = null;
        Pasien result = instance.getPasien(Id_Pasien);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPasien method, of class KepalaKlinikServiceServer.
     */
    @Test
    public void testGetPasien() throws Exception {
        System.out.println("getPasien");
        KepalaKlinikServiceServer instance = new KepalaKlinikServiceServer();
        List expResult = null;
        List result = instance.getPasien();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAntrian method, of class KepalaKlinikServiceServer.
     */
    @Test
    public void testGetAntrian_int() throws Exception {
        System.out.println("getAntrian");
        int Id_Antrian = 0;
        KepalaKlinikServiceServer instance = new KepalaKlinikServiceServer();
        Antrian expResult = null;
        Antrian result = instance.getAntrian(Id_Antrian);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAntrian method, of class KepalaKlinikServiceServer.
     */
    @Test
    public void testGetAntrian() throws Exception {
        System.out.println("getAntrian");
        KepalaKlinikServiceServer instance = new KepalaKlinikServiceServer();
        List expResult = null;
        List result = instance.getAntrian();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObat_detailResep method, of class KepalaKlinikServiceServer.
     */
    @Test
    public void testGetObat_detailResep_int() throws Exception {
        System.out.println("getObat_detailResep");
        int Id_Obat = 0;
        KepalaKlinikServiceServer instance = new KepalaKlinikServiceServer();
        Obat_detailResep expResult = null;
        Obat_detailResep result = instance.getObat_detailResep(Id_Obat);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObat_detailResep method, of class KepalaKlinikServiceServer.
     */
    @Test
    public void testGetObat_detailResep() throws Exception {
        System.out.println("getObat_detailResep");
        KepalaKlinikServiceServer instance = new KepalaKlinikServiceServer();
        List expResult = null;
        List result = instance.getObat_detailResep();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
