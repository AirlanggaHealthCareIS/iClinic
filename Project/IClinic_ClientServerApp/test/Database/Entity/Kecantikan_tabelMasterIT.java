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
 * @author User
 */
public class Kecantikan_tabelMasterIT {
    
    public Kecantikan_tabelMasterIT() {
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
     * Test of getId_Kecantikan method, of class Kecantikan_tabelMaster.
     */
    @Test
    public void testGetId_Kecantikan() {
        System.out.println("getId_Kecantikan");
        Kecantikan_tabelMaster instance = new Kecantikan_tabelMaster();
        String expResult = "";
        String result = instance.getId_Kecantikan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJenis_Layanan method, of class Kecantikan_tabelMaster.
     */
    @Test
    public void testGetJenis_Layanan() {
        System.out.println("getJenis_Layanan");
        Kecantikan_tabelMaster instance = new Kecantikan_tabelMaster();
        String expResult = "";
        String result = instance.getJenis_Layanan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTarif method, of class Kecantikan_tabelMaster.
     */
    @Test
    public void testGetTarif() {
        System.out.println("getTarif");
        Kecantikan_tabelMaster instance = new Kecantikan_tabelMaster();
        int expResult = 0;
        int result = instance.getTarif();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_Kecantikan method, of class Kecantikan_tabelMaster.
     */
    @Test
    public void testSetId_Kecantikan() {
        System.out.println("setId_Kecantikan");
        String Id_Kecantikan = "";
        Kecantikan_tabelMaster instance = new Kecantikan_tabelMaster();
        instance.setId_Kecantikan(Id_Kecantikan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJenis_Layanan method, of class Kecantikan_tabelMaster.
     */
    @Test
    public void testSetJenis_Layanan() {
        System.out.println("setJenis_Layanan");
        String Jenis_Layanan = "";
        Kecantikan_tabelMaster instance = new Kecantikan_tabelMaster();
        instance.setJenis_Layanan(Jenis_Layanan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTarif method, of class Kecantikan_tabelMaster.
     */
    @Test
    public void testSetTarif() {
        System.out.println("setTarif");
        int Tarif = 0;
        Kecantikan_tabelMaster instance = new Kecantikan_tabelMaster();
        instance.setTarif(Tarif);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeskripsi method, of class Kecantikan_tabelMaster.
     */
    @Test
    public void testGetDeskripsi() {
        System.out.println("getDeskripsi");
        Kecantikan_tabelMaster instance = new Kecantikan_tabelMaster();
        String expResult = "";
        String result = instance.getDeskripsi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDeskripsi method, of class Kecantikan_tabelMaster.
     */
    @Test
    public void testSetDeskripsi() {
        System.out.println("setDeskripsi");
        String Deskripsi = "";
        Kecantikan_tabelMaster instance = new Kecantikan_tabelMaster();
        instance.setDeskripsi(Deskripsi);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
