/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Database.Entity;

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
public class USGTest {
    
    public USGTest() {
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
     * Test of getHasil method, of class USG.
     */
    @Test
    public void testGetHasil() {
        System.out.println("getHasil");
        USG instance = new USG();
        byte[] expResult = null;
        byte[] result = instance.getHasil();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHasil method, of class USG.
     */
    @Test
    public void testSetHasil() {
        System.out.println("setHasil");
        byte[] Hasil = null;
        USG instance = new USG();
        instance.setHasil(Hasil);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTanggal method, of class USG.
     */
    @Test
    public void testGetTanggal() {
        System.out.println("getTanggal");
        USG instance = new USG();
        String expResult = "";
        String result = instance.getTanggal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTanggal method, of class USG.
     */
    @Test
    public void testSetTanggal() {
        System.out.println("setTanggal");
        String Tanggal = "";
        USG instance = new USG();
        instance.setTanggal(Tanggal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId_pasien method, of class USG.
     */
    @Test
    public void testGetId_pasien() {
        System.out.println("getId_pasien");
        USG instance = new USG();
        String expResult = "";
        String result = instance.getId_pasien();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_pasien method, of class USG.
     */
    @Test
    public void testSetId_pasien() {
        System.out.println("setId_pasien");
        String Id_pasien = "";
        USG instance = new USG();
        instance.setId_pasien(Id_pasien);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeskripsi method, of class USG.
     */
    @Test
    public void testGetDeskripsi() {
        System.out.println("getDeskripsi");
        USG instance = new USG();
        String expResult = "";
        String result = instance.getDeskripsi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDeskripsi method, of class USG.
     */
    @Test
    public void testSetDeskripsi() {
        System.out.println("setDeskripsi");
        String Deskripsi = "";
        USG instance = new USG();
        instance.setDeskripsi(Deskripsi);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId_USG method, of class USG.
     */
    @Test
    public void testGetId_USG() {
        System.out.println("getId_USG");
        USG instance = new USG();
        String expResult = "";
        String result = instance.getId_USG();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHarga method, of class USG.
     */
    @Test
    public void testGetHarga() {
        System.out.println("getHarga");
        USG instance = new USG();
        int expResult = 0;
        int result = instance.getHarga();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_USG method, of class USG.
     */
    @Test
    public void testSetId_USG() {
        System.out.println("setId_USG");
        String Id_USG = "";
        USG instance = new USG();
        instance.setId_USG(Id_USG);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHarga method, of class USG.
     */
    @Test
    public void testSetHarga() {
        System.out.println("setHarga");
        int Harga = 0;
        USG instance = new USG();
        instance.setHarga(Harga);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
