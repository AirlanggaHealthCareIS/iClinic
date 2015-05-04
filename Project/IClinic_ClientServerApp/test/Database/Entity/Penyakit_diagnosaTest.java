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
 * @author Afifah
 */
public class Penyakit_diagnosaTest {
    
    public Penyakit_diagnosaTest() {
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
     * Test of getId_Diagnosa method, of class Penyakit_diagnosa.
     */
    @Test
    public void testGetId_Diagnosa() {
        System.out.println("getId_Diagnosa");
        Penyakit_diagnosa instance = new Penyakit_diagnosa();
        String expResult = "";
        String result = instance.getId_Diagnosa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId_Penyakit method, of class Penyakit_diagnosa.
     */
    @Test
    public void testGetId_Penyakit() {
        System.out.println("getId_Penyakit");
        Penyakit_diagnosa instance = new Penyakit_diagnosa();
        String expResult = "";
        String result = instance.getId_Penyakit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDiagnosa method, of class Penyakit_diagnosa.
     */
    @Test
    public void testGetDiagnosa() {
        System.out.println("getDiagnosa");
        Penyakit_diagnosa instance = new Penyakit_diagnosa();
        String expResult = "";
        String result = instance.getDiagnosa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKeterangan method, of class Penyakit_diagnosa.
     */
    @Test
    public void testGetKeterangan() {
        System.out.println("getKeterangan");
        Penyakit_diagnosa instance = new Penyakit_diagnosa();
        String expResult = "";
        String result = instance.getKeterangan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_Diagnosa method, of class Penyakit_diagnosa.
     */
    @Test
    public void testSetId_Diagnosa() {
        System.out.println("setId_Diagnosa");
        String Id_Diagnosa = "";
        Penyakit_diagnosa instance = new Penyakit_diagnosa();
        instance.setId_Diagnosa(Id_Diagnosa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_Penyakit method, of class Penyakit_diagnosa.
     */
    @Test
    public void testSetId_Penyakit() {
        System.out.println("setId_Penyakit");
        String Id_Penyakit = "";
        Penyakit_diagnosa instance = new Penyakit_diagnosa();
        instance.setId_Penyakit(Id_Penyakit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDiagnosa method, of class Penyakit_diagnosa.
     */
    @Test
    public void testSetDiagnosa() {
        System.out.println("setDiagnosa");
        String Diagnosa = "";
        Penyakit_diagnosa instance = new Penyakit_diagnosa();
        instance.setDiagnosa(Diagnosa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setKeterangan method, of class Penyakit_diagnosa.
     */
    @Test
    public void testSetKeterangan() {
        System.out.println("setKeterangan");
        String Keterangan = "";
        Penyakit_diagnosa instance = new Penyakit_diagnosa();
        instance.setKeterangan(Keterangan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
