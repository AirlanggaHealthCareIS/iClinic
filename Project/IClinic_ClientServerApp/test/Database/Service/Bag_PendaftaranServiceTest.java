/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Database.Service;

import Database.Entity.Antrian;
import Database.Entity.Pasien;
import java.rmi.RemoteException;
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
public class Bag_PendaftaranServiceTest {
    
    public Bag_PendaftaranServiceTest() {
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
     * Test of insertPasien method, of class Bag_PendaftaranService.
     */
    @Test
    public void testInsertPasien() throws Exception {
        System.out.println("insertPasien");
        Pasien pasien = null;
        Bag_PendaftaranService instance = new Bag_PendaftaranServiceImpl();
        instance.insertPasien(pasien);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePasien method, of class Bag_PendaftaranService.
     */
    @Test
    public void testUpdatePasien() throws Exception {
        System.out.println("updatePasien");
        Pasien pasien = null;
        Bag_PendaftaranService instance = new Bag_PendaftaranServiceImpl();
        instance.updatePasien(pasien);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPasien method, of class Bag_PendaftaranService.
     */
    @Test
    public void testGetPasien_String() throws Exception {
        System.out.println("getPasien");
        String Id_Pasien = "";
        Bag_PendaftaranService instance = new Bag_PendaftaranServiceImpl();
        Pasien expResult = null;
        Pasien result = instance.getPasien(Id_Pasien);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPasien method, of class Bag_PendaftaranService.
     */
    @Test
    public void testGetPasien_0args() throws Exception {
        System.out.println("getPasien");
        Bag_PendaftaranService instance = new Bag_PendaftaranServiceImpl();
        List<Pasien> expResult = null;
        List<Pasien> result = instance.getPasien();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertAntrian method, of class Bag_PendaftaranService.
     */
    @Test
    public void testInsertAntrian() throws Exception {
        System.out.println("insertAntrian");
        Antrian antrian = null;
        Bag_PendaftaranService instance = new Bag_PendaftaranServiceImpl();
        Antrian expResult = null;
        Antrian result = instance.insertAntrian(antrian);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateAntrian method, of class Bag_PendaftaranService.
     */
    @Test
    public void testUpdateAntrian() throws Exception {
        System.out.println("updateAntrian");
        Antrian antrian = null;
        Bag_PendaftaranService instance = new Bag_PendaftaranServiceImpl();
        instance.updateAntrian(antrian);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAntrian method, of class Bag_PendaftaranService.
     */
    @Test
    public void testDeleteAntrian() throws Exception {
        System.out.println("deleteAntrian");
        String Id_Antrian = "";
        Bag_PendaftaranService instance = new Bag_PendaftaranServiceImpl();
        instance.deleteAntrian(Id_Antrian);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAntrian method, of class Bag_PendaftaranService.
     */
    @Test
    public void testGetAntrian_String() throws Exception {
        System.out.println("getAntrian");
        String Id_Antrian = "";
        Bag_PendaftaranService instance = new Bag_PendaftaranServiceImpl();
        Antrian expResult = null;
        Antrian result = instance.getAntrian(Id_Antrian);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAntrian method, of class Bag_PendaftaranService.
     */
    @Test
    public void testGetAntrian_0args() throws Exception {
        System.out.println("getAntrian");
        Bag_PendaftaranService instance = new Bag_PendaftaranServiceImpl();
        List<Antrian> expResult = null;
        List<Antrian> result = instance.getAntrian();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class Bag_PendaftaranServiceImpl implements Bag_PendaftaranService {

        public void insertPasien(Pasien pasien) throws RemoteException {
        }

        public void updatePasien(Pasien pasien) throws RemoteException {
        }

        public Pasien getPasien(String Id_Pasien) throws RemoteException {
            return null;
        }

        public List<Pasien> getPasien() throws RemoteException {
            return null;
        }

        public Antrian insertAntrian(Antrian antrian) throws RemoteException {
            return null;
        }

        public void updateAntrian(Antrian antrian) throws RemoteException {
        }

        public void deleteAntrian(String Id_Antrian) throws RemoteException {
        }

        public Antrian getAntrian(String Id_Antrian) throws RemoteException {
            return null;
        }

        public List<Antrian> getAntrian() throws RemoteException {
            return null;
        }
    }
    
}
