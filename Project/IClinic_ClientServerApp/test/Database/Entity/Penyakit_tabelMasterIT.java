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
public class Penyakit_tabelMasterIT {
    
    public Penyakit_tabelMasterIT() {
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
     * Test of getId_Penyakit method, of class Penyakit_tabelMaster.
     */
    @Test
    public void testGetId_Penyakit() {
        System.out.println("getId_Penyakit");
        Penyakit_tabelMaster instance = new Penyakit_tabelMaster();
        String expResult = "";
        String result = instance.getId_Penyakit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPenyakit method, of class Penyakit_tabelMaster.
     */
    @Test
    public void testGetPenyakit() {
        System.out.println("getPenyakit");
        Penyakit_tabelMaster instance = new Penyakit_tabelMaster();
        String expResult = "";
        String result = instance.getPenyakit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGejala method, of class Penyakit_tabelMaster.
     */
    @Test
    public void testGetGejala() {
        System.out.println("getGejala");
        Penyakit_tabelMaster instance = new Penyakit_tabelMaster();
        String expResult = "";
        String result = instance.getGejala();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_Penyakit method, of class Penyakit_tabelMaster.
     */
    @Test
    public void testSetId_Penyakit() {
        System.out.println("setId_Penyakit");
        String Id_Penyakit = "";
        Penyakit_tabelMaster instance = new Penyakit_tabelMaster();
        instance.setId_Penyakit(Id_Penyakit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPenyakit method, of class Penyakit_tabelMaster.
     */
    @Test
    public void testSetPenyakit() {
        System.out.println("setPenyakit");
        String Penyakit = "";
        Penyakit_tabelMaster instance = new Penyakit_tabelMaster();
        instance.setPenyakit(Penyakit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGejala method, of class Penyakit_tabelMaster.
     */
    @Test
    public void testSetGejala() {
        System.out.println("setGejala");
        String Gejala = "";
        Penyakit_tabelMaster instance = new Penyakit_tabelMaster();
        instance.setGejala(Gejala);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
