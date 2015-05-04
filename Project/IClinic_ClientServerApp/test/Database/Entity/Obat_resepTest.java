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
 * @author RinduPW
 */
public class Obat_resepTest {
    
    public Obat_resepTest() {
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
     * Test of getId_Resep method, of class Obat_resep.
     */
    @Test
    public void testGetId_Resep() {
        System.out.println("getId_Resep");
        Obat_resep instance = new Obat_resep();
        String expResult = "";
        String result = instance.getId_Resep();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId_Rekam method, of class Obat_resep.
     */
    @Test
    public void testGetId_Rekam() {
        System.out.println("getId_Rekam");
        Obat_resep instance = new Obat_resep();
        String expResult = "";
        String result = instance.getId_Rekam();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotal_Harga method, of class Obat_resep.
     */
    @Test
    public void testGetTotal_Harga() {
        System.out.println("getTotal_Harga");
        Obat_resep instance = new Obat_resep();
        int expResult = 0;
        int result = instance.getTotal_Harga();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_Resep method, of class Obat_resep.
     */
    @Test
    public void testSetId_Resep() {
        System.out.println("setId_Resep");
        String Id_Resep = "";
        Obat_resep instance = new Obat_resep();
        instance.setId_Resep(Id_Resep);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_Rekam method, of class Obat_resep.
     */
    @Test
    public void testSetId_Rekam() {
        System.out.println("setId_Rekam");
        String Id_Rekam = "";
        Obat_resep instance = new Obat_resep();
        instance.setId_Rekam(Id_Rekam);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotal_Harga method, of class Obat_resep.
     */
    @Test
    public void testSetTotal_Harga() {
        System.out.println("setTotal_Harga");
        int Total_Harga = 0;
        Obat_resep instance = new Obat_resep();
        instance.setTotal_Harga(Total_Harga);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}