/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.Service;

import Database.Entity.Lab_detailLab;
import Database.Entity.Lab_tabelMaster;
import Database.Entity.Lab_transaksiLab;
import Database.Entity.Pembayaran;
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
 * @author acer
 */
public class LabServiceTest {
    
    public LabServiceTest() {
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
     * Test of getLaboratorium method, of class LabService.
     */
    @Test
    public void testGetLaboratorium() throws Exception {
        System.out.println("getLaboratorium");
        LabService instance = new LabServiceImpl();
        List expResult = null;
        List result = instance.getLaboratorium();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertLab_detailLab method, of class LabService.
     */
    @Test
    public void testInsertLab_detailLab() throws Exception {
        System.out.println("insertLab_detailLab");
        Lab_detailLab detail_lab = null;
        LabService instance = new LabServiceImpl();
        instance.insertLab_detailLab(detail_lab);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLab_detailLab method, of class LabService.
     */
    @Test
    public void testGetLab_detailLab_String() throws Exception {
        System.out.println("getLab_detailLab");
        String Id_Detail_Lab = "";
        LabService instance = new LabServiceImpl();
        Lab_detailLab expResult = null;
        Lab_detailLab result = instance.getLab_detailLab(Id_Detail_Lab);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLab_detailLab method, of class LabService.
     */
    @Test
    public void testGetLab_detailLab_0args() throws Exception {
        System.out.println("getLab_detailLab");
        LabService instance = new LabServiceImpl();
        List expResult = null;
        List result = instance.getLab_detailLab();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertLab_transaksiLab method, of class LabService.
     */
    @Test
    public void testInsertLab_transaksiLab() throws Exception {
        System.out.println("insertLab_transaksiLab");
        Lab_transaksiLab transaksi_lab = null;
        LabService instance = new LabServiceImpl();
        instance.insertLab_transaksiLab(transaksi_lab);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateLab_transaksiLab method, of class LabService.
     */
    @Test
    public void testUpdateLab_transaksiLab() throws Exception {
        System.out.println("updateLab_transaksiLab");
        Lab_transaksiLab transaksi_lab = null;
        LabService instance = new LabServiceImpl();
        instance.updateLab_transaksiLab(transaksi_lab);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteLab_transaksiLab method, of class LabService.
     */
    @Test
    public void testDeleteLab_transaksiLab() throws Exception {
        System.out.println("deleteLab_transaksiLab");
        int Id_Transaksi_Lab = 0;
        LabService instance = new LabServiceImpl();
        instance.deleteLab_transaksiLab(Id_Transaksi_Lab);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLab_transaksiLab method, of class LabService.
     */
    @Test
    public void testGetLab_transaksiLab_int() throws Exception {
        System.out.println("getLab_transaksiLab");
        int Id_Transaksi_Lab = 0;
        LabService instance = new LabServiceImpl();
        Lab_transaksiLab expResult = null;
        Lab_transaksiLab result = instance.getLab_transaksiLab(Id_Transaksi_Lab);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLab_transaksiLab method, of class LabService.
     */
    @Test
    public void testGetLab_transaksiLab_0args() throws Exception {
        System.out.println("getLab_transaksiLab");
        LabService instance = new LabServiceImpl();
        List expResult = null;
        List result = instance.getLab_transaksiLab();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mencariIdPembayaranDariPembayaran method, of class LabService.
     */
    @Test
    public void testMencariIdPembayaranDariPembayaran() throws Exception {
        System.out.println("mencariIdPembayaranDariPembayaran");
        String idPasien = "";
        LabService instance = new LabServiceImpl();
        String expResult = "";
        String result = instance.mencariIdPembayaranDariPembayaran(idPasien);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPembayaranDariPembayaran method, of class LabService.
     */
    @Test
    public void testGetPembayaranDariPembayaran() throws Exception {
        System.out.println("getPembayaranDariPembayaran");
        String idPembayaran = "";
        LabService instance = new LabServiceImpl();
        Pembayaran expResult = null;
        Pembayaran result = instance.getPembayaranDariPembayaran(idPembayaran);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePembayaranDariPembayaran method, of class LabService.
     */
    @Test
    public void testUpdatePembayaranDariPembayaran() throws Exception {
        System.out.println("updatePembayaranDariPembayaran");
        Pembayaran pembayaran = null;
        String idDetailLab = "";
        int Harga = 0;
        LabService instance = new LabServiceImpl();
        instance.updatePembayaranDariPembayaran(pembayaran, idDetailLab, Harga);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAutoNumberDariPembayaran method, of class LabService.
     */
    @Test
    public void testGetAutoNumberDariPembayaran() throws Exception {
        System.out.println("getAutoNumberDariPembayaran");
        LabService instance = new LabServiceImpl();
        String expResult = "";
        String result = instance.getAutoNumberDariPembayaran();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertPembayaranDariPembayaran method, of class LabService.
     */
    @Test
    public void testInsertPembayaranDariPembayaran() throws Exception {
        System.out.println("insertPembayaranDariPembayaran");
        String idPembayaran = "";
        String idPasien = "";
        String idDetailLab = "";
        int Harga = 0;
        LabService instance = new LabServiceImpl();
        instance.insertPembayaranDariPembayaran(idPembayaran, idPasien, idDetailLab, Harga);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class LabServiceImpl implements LabService {

        public List<Lab_tabelMaster> getLaboratorium() throws RemoteException {
            return null;
        }

        public void insertLab_detailLab(Lab_detailLab detail_lab) throws RemoteException {
        }

        public Lab_detailLab getLab_detailLab(String Id_Detail_Lab) throws RemoteException {
            return null;
        }

        public List<Lab_detailLab> getLab_detailLab() throws RemoteException {
            return null;
        }

        public void insertLab_transaksiLab(Lab_transaksiLab transaksi_lab) throws RemoteException {
        }

        public void updateLab_transaksiLab(Lab_transaksiLab transaksi_lab) throws RemoteException {
        }

        public void deleteLab_transaksiLab(int Id_Transaksi_Lab) throws RemoteException {
        }

        public Lab_transaksiLab getLab_transaksiLab(int Id_Transaksi_Lab) throws RemoteException {
            return null;
        }

        public List<Lab_transaksiLab> getLab_transaksiLab() throws RemoteException {
            return null;
        }

        public String mencariIdPembayaranDariPembayaran(String idPasien) throws RemoteException {
            return "";
        }

        public Pembayaran getPembayaranDariPembayaran(String idPembayaran) throws RemoteException {
            return null;
        }

        public void updatePembayaranDariPembayaran(Pembayaran pembayaran, String idDetailLab, int Harga) throws RemoteException {
        }

        public String getAutoNumberDariPembayaran() throws RemoteException {
            return "";
        }

        public void insertPembayaranDariPembayaran(String idPembayaran, String idPasien, String idDetailLab, int Harga) throws RemoteException {
        }
    }
}
