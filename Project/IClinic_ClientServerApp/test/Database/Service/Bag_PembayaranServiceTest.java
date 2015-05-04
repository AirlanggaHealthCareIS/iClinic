/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.Service;

import Database.Entity.Pembayaran;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus X455L
 */
public class Bag_PembayaranServiceTest {
    
    public Bag_PembayaranServiceTest() {
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
     * Test of insertPembayaran method, of class Bag_PembayaranService.
     */
    @Test
    public void testInsertPembayaran() throws Exception {
        System.out.println("insertPembayaran");
        Pembayaran pembayaran = null;
        Bag_PembayaranService instance = new Bag_PembayaranServiceImpl();
        Pembayaran expResult = null;
        Pembayaran result = instance.insertPembayaran(pembayaran);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePembayaran method, of class Bag_PembayaranService.
     */
    @Test
    public void testUpdatePembayaran() throws Exception {
        System.out.println("updatePembayaran");
        Pembayaran pembayaran = null;
        Bag_PembayaranService instance = new Bag_PembayaranServiceImpl();
        instance.updatePembayaran(pembayaran);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletePembayaran method, of class Bag_PembayaranService.
     */
    @Test
    public void testDeletePembayaran() throws Exception {
        System.out.println("deletePembayaran");
        String ID_PEMBAYARAN = "";
        Bag_PembayaranService instance = new Bag_PembayaranServiceImpl();
        instance.deletePembayaran(ID_PEMBAYARAN);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPembayaran method, of class Bag_PembayaranService.
     */
    @Test
    public void testGetPembayaran_String() throws Exception {
        System.out.println("getPembayaran");
        String ID_PEMBAYARAN = "";
        Bag_PembayaranService instance = new Bag_PembayaranServiceImpl();
        Pembayaran expResult = null;
        Pembayaran result = instance.getPembayaran(ID_PEMBAYARAN);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPembayaran method, of class Bag_PembayaranService.
     */
    @Test
    public void testGetPembayaran_0args() throws Exception {
        System.out.println("getPembayaran");
        Bag_PembayaranService instance = new Bag_PembayaranServiceImpl();
        List<Pembayaran> expResult = null;
        List<Pembayaran> result = instance.getPembayaran();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MeihatTotalTagihanPembayaran method, of class Bag_PembayaranService.
     */
    @Test
    public void testMeihatTotalTagihanPembayaran() throws Exception {
        System.out.println("MeihatTotalTagihanPembayaran");
        String ID_PASIEN = "";
        Date TANGGAL = null;
        Bag_PembayaranService instance = new Bag_PembayaranServiceImpl();
        Pembayaran expResult = null;
        Pembayaran result = instance.MeihatTotalTagihanPembayaran(ID_PASIEN, TANGGAL);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateStatusPembayaran method, of class Bag_PembayaranService.
     */
    @Test
    public void testUpdateStatusPembayaran() throws Exception {
        System.out.println("updateStatusPembayaran");
        String ID_PEMBAYARAN = "";
        String Status = "";
        Bag_PembayaranService instance = new Bag_PembayaranServiceImpl();
        instance.updateStatusPembayaran(ID_PEMBAYARAN, Status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class Bag_PembayaranService.
     */
    @Test
    public void testGetStatus() throws Exception {
        System.out.println("getStatus");
        String ID_PEMBAYARAN = "";
        Bag_PembayaranService instance = new Bag_PembayaranServiceImpl();
        String expResult = "";
        String result = instance.getStatus(ID_PEMBAYARAN);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class Bag_PembayaranServiceImpl implements Bag_PembayaranService {

        public Pembayaran insertPembayaran(Pembayaran pembayaran) throws RemoteException {
            return null;
        }

        public void updatePembayaran(Pembayaran pembayaran) throws RemoteException {
        }

        public void deletePembayaran(String ID_PEMBAYARAN) throws RemoteException {
        }

        public Pembayaran getPembayaran(String ID_PEMBAYARAN) throws RemoteException {
            return null;
        }

        public List<Pembayaran> getPembayaran() throws RemoteException {
            return null;
        }

        public Pembayaran MeihatTotalTagihanPembayaran(String ID_PASIEN, Date TANGGAL) throws RemoteException {
            return null;
        }

        public void updateStatusPembayaran(String ID_PEMBAYARAN, String Status) throws RemoteException {
        }

        public String getStatus(String ID_PEMBAYARAN) throws RemoteException {
            return "";
        }
    }
    
}
