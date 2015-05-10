/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.Entity;

import java.sql.Blob;
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
public class Lab_detailLabTest {
    
    public Lab_detailLabTest() {
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
     * Test of getId_Detail_Lab method, of class Lab_detailLab.
     */
    @Test
    public void testGetId_Detail_Lab() {
        System.out.println("getId_Detail_Lab");
        Lab_detailLab instance = new Lab_detailLab();
        String expResult = "";
        String result = instance.getId_Detail_Lab();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId_Transaksi_Lab method, of class Lab_detailLab.
     */
    @Test
    public void testGetId_Transaksi_Lab() {
        System.out.println("getId_Transaksi_Lab");
        Lab_detailLab instance = new Lab_detailLab();
        String expResult = "";
        String result = instance.getId_Transaksi_Lab();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId_Lab method, of class Lab_detailLab.
     */
    @Test
    public void testGetId_Lab() {
        System.out.println("getId_Lab");
        Lab_detailLab instance = new Lab_detailLab();
        String expResult = "";
        String result = instance.getId_Lab();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHasil method, of class Lab_detailLab.
     */
    @Test
    public void testGetHasil() {
        System.out.println("getHasil");
        Lab_detailLab instance = new Lab_detailLab();
        byte[] expResult = null;
        byte[] result = instance.getHasil();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKeterangan method, of class Lab_detailLab.
     */
    @Test
    public void testGetKeterangan() {
        System.out.println("getKeterangan");
        Lab_detailLab instance = new Lab_detailLab();
        String expResult = "";
        String result = instance.getKeterangan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_Detail_Lab method, of class Lab_detailLab.
     */
    @Test
    public void testSetId_Detail_Lab() {
        System.out.println("setId_Detail_Lab");
        String Id_Detail_Lab = "";
        Lab_detailLab instance = new Lab_detailLab();
        instance.setId_Detail_Lab(Id_Detail_Lab);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_Lab method, of class Lab_detailLab.
     */
    @Test
    public void testSetId_Lab() {
        System.out.println("setId_Lab");
        String Id_Lab = "";
        Lab_detailLab instance = new Lab_detailLab();
        instance.setId_Lab(Id_Lab);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHasil method, of class Lab_detailLab.
     */
    @Test
    public void testSetHasil() {
        System.out.println("setHasil");
        byte[] Hasil = null;
        Lab_detailLab instance = new Lab_detailLab();
        instance.setHasil(Hasil);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setKeterangan method, of class Lab_detailLab.
     */
    @Test
    public void testSetKeterangan() {
        System.out.println("setKeterangan");
        String Keterangan = "";
        Lab_detailLab instance = new Lab_detailLab();
        instance.setKeterangan(Keterangan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_Transaksi_Lab method, of class Lab_detailLab.
     */
    @Test
    public void testSetId_Transaksi_Lab() {
        System.out.println("setId_Transaksi_Lab");
        String idtransaksi = "";
        Lab_detailLab instance = new Lab_detailLab();
        instance.setId_Transaksi_Lab(idtransaksi);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
