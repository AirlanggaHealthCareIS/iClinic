/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.Entity;

import java.util.Date;
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
public class Lab_transaksiLabTest {
    
    public Lab_transaksiLabTest() {
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
     * Test of getId_Transaksi_Lab method, of class Lab_transaksiLab.
     */
    @Test
    public void testGetId_Transaksi_Lab() {
        System.out.println("getId_Transaksi_Lab");
        Lab_transaksiLab instance = new Lab_transaksiLab();
        String expResult = "";
        String result = instance.getId_Transaksi_Lab();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId_Pasien method, of class Lab_transaksiLab.
     */
    @Test
    public void testGetId_Pasien() {
        System.out.println("getId_Pasien");
        Lab_transaksiLab instance = new Lab_transaksiLab();
        String expResult = "";
        String result = instance.getId_Pasien();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotal_Harga method, of class Lab_transaksiLab.
     */
    @Test
    public void testGetTotal_Harga() {
        System.out.println("getTotal_Harga");
        Lab_transaksiLab instance = new Lab_transaksiLab();
        int expResult = 0;
        int result = instance.getTotal_Harga();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTanggal method, of class Lab_transaksiLab.
     */
    @Test
    public void testGetTanggal() {
        System.out.println("getTanggal");
        Lab_transaksiLab instance = new Lab_transaksiLab();
        Date expResult = null;
        Date result = instance.getTanggal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_Transaksi_Lab method, of class Lab_transaksiLab.
     */
    @Test
    public void testSetId_Transaksi_Lab() {
        System.out.println("setId_Transaksi_Lab");
        String Id_Transaksi_Lab = "";
        Lab_transaksiLab instance = new Lab_transaksiLab();
        instance.setId_Transaksi_Lab(Id_Transaksi_Lab);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotal_Harga method, of class Lab_transaksiLab.
     */
    @Test
    public void testSetTotal_Harga() {
        System.out.println("setTotal_Harga");
        int Total_Harga = 0;
        Lab_transaksiLab instance = new Lab_transaksiLab();
        instance.setTotal_Harga(Total_Harga);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_Pasien method, of class Lab_transaksiLab.
     */
    @Test
    public void testSetId_Pasien() {
        System.out.println("setId_Pasien");
        String Id_Pasien = "";
        Lab_transaksiLab instance = new Lab_transaksiLab();
        instance.setId_Pasien(Id_Pasien);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTanggal method, of class Lab_transaksiLab.
     */
    @Test
    public void testSetTanggal_Date() {
        System.out.println("setTanggal");
        Date Tanggal = null;
        Lab_transaksiLab instance = new Lab_transaksiLab();
        instance.setTanggal(Tanggal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTanggal method, of class Lab_transaksiLab.
     */
    @Test
    public void testSetTanggal_String() {
        System.out.println("setTanggal");
        String now = "";
        Lab_transaksiLab instance = new Lab_transaksiLab();
        instance.setTanggal(now);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
