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
 * @author Acer
 */
public class Kecantikan_transaksiLayananTest {
    
    public Kecantikan_transaksiLayananTest() {
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
     * Test of getId_Transaksi_Layanan method, of class Kecantikan_transaksiLayanan.
     */
    @Test
    public void testGetId_Transaksi_Layanan() {
        System.out.println("getId_Transaksi_Layanan");
        Kecantikan_transaksiLayanan instance = new Kecantikan_transaksiLayanan();
        String expResult = "";
        String result = instance.getId_Transaksi_Layanan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotal_Harga method, of class Kecantikan_transaksiLayanan.
     */
    @Test
    public void testGetTotal_Harga() {
        System.out.println("getTotal_Harga");
        Kecantikan_transaksiLayanan instance = new Kecantikan_transaksiLayanan();
        int expResult = 0;
        int result = instance.getTotal_Harga();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_Transaksi_Layanan method, of class Kecantikan_transaksiLayanan.
     */
    @Test
    public void testSetId_Transaksi_Layanan() {
        System.out.println("setId_Transaksi_Layanan");
        String Id_Transaksi_Layanan = "";
        Kecantikan_transaksiLayanan instance = new Kecantikan_transaksiLayanan();
        instance.setId_Transaksi_Layanan(Id_Transaksi_Layanan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotal_Harga method, of class Kecantikan_transaksiLayanan.
     */
    @Test
    public void testSetTotal_Harga() {
        System.out.println("setTotal_Harga");
        int Total_Harga = 0;
        Kecantikan_transaksiLayanan instance = new Kecantikan_transaksiLayanan();
        instance.setTotal_Harga(Total_Harga);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId_Pasien method, of class Kecantikan_transaksiLayanan.
     */
    @Test
    public void testGetId_Pasien() {
        System.out.println("getId_Pasien");
        Kecantikan_transaksiLayanan instance = new Kecantikan_transaksiLayanan();
        String expResult = "";
        String result = instance.getId_Pasien();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_Pasien method, of class Kecantikan_transaksiLayanan.
     */
    @Test
    public void testSetId_Pasien() {
        System.out.println("setId_Pasien");
        String Id_Pasien = "";
        Kecantikan_transaksiLayanan instance = new Kecantikan_transaksiLayanan();
        instance.setId_Pasien(Id_Pasien);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTanggal method, of class Kecantikan_transaksiLayanan.
     */
    @Test
    public void testGetTanggal() {
        System.out.println("getTanggal");
        Kecantikan_transaksiLayanan instance = new Kecantikan_transaksiLayanan();
        String expResult = "";
        String result = instance.getTanggal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTanggal method, of class Kecantikan_transaksiLayanan.
     */
    @Test
    public void testSetTanggal() {
        System.out.println("setTanggal");
        String Tanggal = "";
        Kecantikan_transaksiLayanan instance = new Kecantikan_transaksiLayanan();
        instance.setTanggal(Tanggal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
