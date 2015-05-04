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
public class Obat_tabelMasterIT {
    
    public Obat_tabelMasterIT() {
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
     * Test of getId_Obat method, of class Obat_tabelMaster.
     */
    @Test
    public void testGetId_Obat() {
        System.out.println("getId_Obat");
        Obat_tabelMaster instance = new Obat_tabelMaster();
        String expResult = "";
        String result = instance.getId_Obat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNama_Obat method, of class Obat_tabelMaster.
     */
    @Test
    public void testGetNama_Obat() {
        System.out.println("getNama_Obat");
        Obat_tabelMaster instance = new Obat_tabelMaster();
        String expResult = "";
        String result = instance.getNama_Obat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJenis_Obat method, of class Obat_tabelMaster.
     */
    @Test
    public void testGetJenis_Obat() {
        System.out.println("getJenis_Obat");
        Obat_tabelMaster instance = new Obat_tabelMaster();
        String expResult = "";
        String result = instance.getJenis_Obat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHarga_Obat method, of class Obat_tabelMaster.
     */
    @Test
    public void testGetHarga_Obat() {
        System.out.println("getHarga_Obat");
        Obat_tabelMaster instance = new Obat_tabelMaster();
        int expResult = 0;
        int result = instance.getHarga_Obat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSatuan method, of class Obat_tabelMaster.
     */
    @Test
    public void testGetSatuan() {
        System.out.println("getSatuan");
        Obat_tabelMaster instance = new Obat_tabelMaster();
        String expResult = "";
        String result = instance.getSatuan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_Obat method, of class Obat_tabelMaster.
     */
    @Test
    public void testSetId_Obat() {
        System.out.println("setId_Obat");
        String Id_Obat = "";
        Obat_tabelMaster instance = new Obat_tabelMaster();
        instance.setId_Obat(Id_Obat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNama_Obat method, of class Obat_tabelMaster.
     */
    @Test
    public void testSetNama_Obat() {
        System.out.println("setNama_Obat");
        String Nama_Obat = "";
        Obat_tabelMaster instance = new Obat_tabelMaster();
        instance.setNama_Obat(Nama_Obat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJenis_Obat method, of class Obat_tabelMaster.
     */
    @Test
    public void testSetJenis_Obat() {
        System.out.println("setJenis_Obat");
        String Jenis_Obat = "";
        Obat_tabelMaster instance = new Obat_tabelMaster();
        instance.setJenis_Obat(Jenis_Obat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHarga_Obat method, of class Obat_tabelMaster.
     */
    @Test
    public void testSetHarga_Obat() {
        System.out.println("setHarga_Obat");
        int Harga_Obat = 0;
        Obat_tabelMaster instance = new Obat_tabelMaster();
        instance.setHarga_Obat(Harga_Obat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSatuan method, of class Obat_tabelMaster.
     */
    @Test
    public void testSetSatuan() {
        System.out.println("setSatuan");
        String Satuan = "";
        Obat_tabelMaster instance = new Obat_tabelMaster();
        instance.setSatuan(Satuan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
