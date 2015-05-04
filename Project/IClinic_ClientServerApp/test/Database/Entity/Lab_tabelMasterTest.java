/*
 * To change this template, choose Tools | Templates
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
 * @author acer
 */
public class Lab_tabelMasterTest {
    
    public Lab_tabelMasterTest() {
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
     * Test of getId_Lab method, of class Lab_tabelMaster.
     */
    @Test
    public void testGetId_Lab() {
        System.out.println("getId_Lab");
        Lab_tabelMaster instance = new Lab_tabelMaster();
        String expResult = "";
        String result = instance.getId_Lab();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJenis_Pemeriksaan method, of class Lab_tabelMaster.
     */
    @Test
    public void testGetJenis_Pemeriksaan() {
        System.out.println("getJenis_Pemeriksaan");
        Lab_tabelMaster instance = new Lab_tabelMaster();
        String expResult = "";
        String result = instance.getJenis_Pemeriksaan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHarga method, of class Lab_tabelMaster.
     */
    @Test
    public void testGetHarga() {
        System.out.println("getHarga");
        Lab_tabelMaster instance = new Lab_tabelMaster();
        int expResult = 0;
        int result = instance.getHarga();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeskripsi method, of class Lab_tabelMaster.
     */
    @Test
    public void testGetDeskripsi() {
        System.out.println("getDeskripsi");
        Lab_tabelMaster instance = new Lab_tabelMaster();
        String expResult = "";
        String result = instance.getDeskripsi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_Lab method, of class Lab_tabelMaster.
     */
    @Test
    public void testSetId_Lab() {
        System.out.println("setId_Lab");
        String Id_Lab = "";
        Lab_tabelMaster instance = new Lab_tabelMaster();
        instance.setId_Lab(Id_Lab);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJenis_Pemeriksaan method, of class Lab_tabelMaster.
     */
    @Test
    public void testSetJenis_Pemeriksaan() {
        System.out.println("setJenis_Pemeriksaan");
        String Jenis_Pemeriksaan = "";
        Lab_tabelMaster instance = new Lab_tabelMaster();
        instance.setJenis_Pemeriksaan(Jenis_Pemeriksaan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHarga method, of class Lab_tabelMaster.
     */
    @Test
    public void testSetHarga() {
        System.out.println("setHarga");
        int Harga = 0;
        Lab_tabelMaster instance = new Lab_tabelMaster();
        instance.setHarga(Harga);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDeskripsi method, of class Lab_tabelMaster.
     */
    @Test
    public void testSetDeskripsi() {
        System.out.println("setDeskripsi");
        String Deskripsi = "";
        Lab_tabelMaster instance = new Lab_tabelMaster();
        instance.setDeskripsi(Deskripsi);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
