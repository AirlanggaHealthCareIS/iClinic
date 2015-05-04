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
public class Tindakan_tabelMasterIT {
    
    public Tindakan_tabelMasterIT() {
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
     * Test of getId_Tindakan method, of class Tindakan_tabelMaster.
     */
    @Test
    public void testGetId_Tindakan() {
        System.out.println("getId_Tindakan");
        Tindakan_tabelMaster instance = new Tindakan_tabelMaster();
        String expResult = "";
        String result = instance.getId_Tindakan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSpesialisasi method, of class Tindakan_tabelMaster.
     */
    @Test
    public void testGetSpesialisasi() {
        System.out.println("getSpesialisasi");
        Tindakan_tabelMaster instance = new Tindakan_tabelMaster();
        String expResult = "";
        String result = instance.getSpesialisasi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNama_Tindakan method, of class Tindakan_tabelMaster.
     */
    @Test
    public void testGetNama_Tindakan() {
        System.out.println("getNama_Tindakan");
        Tindakan_tabelMaster instance = new Tindakan_tabelMaster();
        String expResult = "";
        String result = instance.getNama_Tindakan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTarif method, of class Tindakan_tabelMaster.
     */
    @Test
    public void testGetTarif() {
        System.out.println("getTarif");
        Tindakan_tabelMaster instance = new Tindakan_tabelMaster();
        int expResult = 0;
        int result = instance.getTarif();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKeterangan method, of class Tindakan_tabelMaster.
     */
    @Test
    public void testGetKeterangan() {
        System.out.println("getKeterangan");
        Tindakan_tabelMaster instance = new Tindakan_tabelMaster();
        String expResult = "";
        String result = instance.getKeterangan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_Tindakan method, of class Tindakan_tabelMaster.
     */
    @Test
    public void testSetId_Tindakan() {
        System.out.println("setId_Tindakan");
        String Id_Tindakan = "";
        Tindakan_tabelMaster instance = new Tindakan_tabelMaster();
        instance.setId_Tindakan(Id_Tindakan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSpesialisasi method, of class Tindakan_tabelMaster.
     */
    @Test
    public void testSetSpesialisasi() {
        System.out.println("setSpesialisasi");
        String Spesialisasi = "";
        Tindakan_tabelMaster instance = new Tindakan_tabelMaster();
        instance.setSpesialisasi(Spesialisasi);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNama_Tindakan method, of class Tindakan_tabelMaster.
     */
    @Test
    public void testSetNama_Tindakan() {
        System.out.println("setNama_Tindakan");
        String Nama_Tindakan = "";
        Tindakan_tabelMaster instance = new Tindakan_tabelMaster();
        instance.setNama_Tindakan(Nama_Tindakan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTarif method, of class Tindakan_tabelMaster.
     */
    @Test
    public void testSetTarif() {
        System.out.println("setTarif");
        int Tarif = 0;
        Tindakan_tabelMaster instance = new Tindakan_tabelMaster();
        instance.setTarif(Tarif);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setKeterangan method, of class Tindakan_tabelMaster.
     */
    @Test
    public void testSetKeterangan() {
        System.out.println("setKeterangan");
        String Keterangan = "";
        Tindakan_tabelMaster instance = new Tindakan_tabelMaster();
        instance.setKeterangan(Keterangan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
