/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ServerApplication.Service;

import Database.Entity.Antrian;
import Database.Entity.Pasien;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author TOSHIBA
 */
public class Bag_PendaftaranServiceServerTest {
    
    public Bag_PendaftaranServiceServerTest() {
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
     * Test of insertPasien method, of class Bag_PendaftaranServiceServer.
     */
    @Test
    public void testInsertPasien() throws Exception {
        System.out.println("insertPasien");
        Pasien pasien = null;
        Bag_PendaftaranServiceServer instance = new Bag_PendaftaranServiceServer();
        instance.insertPasien(pasien);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePasien method, of class Bag_PendaftaranServiceServer.
     */
    @Test
    public void testUpdatePasien() throws Exception {
        System.out.println("updatePasien");
        Pasien pasien = null;
        Bag_PendaftaranServiceServer instance = new Bag_PendaftaranServiceServer();
        instance.updatePasien(pasien);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPasien method, of class Bag_PendaftaranServiceServer.
     */
    @Test
    public void testGetPasien_String() throws Exception {
        System.out.println("getPasien");
        String Id_Pasien = "";
        Bag_PendaftaranServiceServer instance = new Bag_PendaftaranServiceServer();
        Pasien expResult = null;
        Pasien result = instance.getPasien(Id_Pasien);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPasien method, of class Bag_PendaftaranServiceServer.
     */
    @Test
    public void testGetPasien_int() throws Exception {
        System.out.println("getPasien");
        int Pasien = 0;
        Bag_PendaftaranServiceServer instance = new Bag_PendaftaranServiceServer();
        Pasien expResult = null;
        Pasien result = instance.getPasien(Pasien);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertAntrian method, of class Bag_PendaftaranServiceServer.
     */
    @Test
    public void testInsertAntrian() throws Exception {
        System.out.println("insertAntrian");
        Antrian antrian = null;
        Bag_PendaftaranServiceServer instance = new Bag_PendaftaranServiceServer();
        Antrian expResult = null;
        Antrian result = instance.insertAntrian(antrian);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateAntrian method, of class Bag_PendaftaranServiceServer.
     */
    @Test
    public void testUpdateAntrian() throws Exception {
        System.out.println("updateAntrian");
        Antrian antrian = null;
        Bag_PendaftaranServiceServer instance = new Bag_PendaftaranServiceServer();
        instance.updateAntrian(antrian);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAntrian method, of class Bag_PendaftaranServiceServer.
     */
    @Test
    public void testDeleteAntrian() throws Exception {
        System.out.println("deleteAntrian");
        String Id_Antrian = "";
        Bag_PendaftaranServiceServer instance = new Bag_PendaftaranServiceServer();
        instance.deleteAntrian(Id_Antrian);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAntrian method, of class Bag_PendaftaranServiceServer.
     */
    @Test
    public void testGetAntrian_String() throws Exception {
        System.out.println("getAntrian");
        String Id_Antrian = "";
        Bag_PendaftaranServiceServer instance = new Bag_PendaftaranServiceServer();
        Antrian expResult = null;
        Antrian result = instance.getAntrian(Id_Antrian);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAntrian method, of class Bag_PendaftaranServiceServer.
     */
    @Test
    public void testGetAntrian_0args() throws Exception {
        System.out.println("getAntrian");
        Bag_PendaftaranServiceServer instance = new Bag_PendaftaranServiceServer();
        List<Antrian> expResult = null;
        List<Antrian> result = instance.getAntrian();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPasien method, of class Bag_PendaftaranServiceServer.
     */
    @Test
    public void testGetPasien_0args() throws Exception {
        System.out.println("getPasien");
        Bag_PendaftaranServiceServer instance = new Bag_PendaftaranServiceServer();
        List<Pasien> expResult = null;
        List<Pasien> result = instance.getPasien();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
