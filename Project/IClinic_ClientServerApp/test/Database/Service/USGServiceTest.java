/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Database.Service;

import Database.Entity.Antrian;
import Database.Entity.Pembayaran;
import Database.Entity.USG;
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
 * @author S550
 */
public class USGServiceTest {
    
    public USGServiceTest() {
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
     * Test of insertUSG method, of class USGService.
     */
//    @Test
//    public void testInsertUSG() throws Exception {
//        System.out.println("insertUSG");
//        USG usg = null;
//        USGService instance = new USGServiceImpl();
//        USG expResult = null;
//        USG result = instance.insertUSG(usg);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getUSG method, of class USGService.
     */
//    @Test
//    public void testGetUSG_String() throws Exception {
//        System.out.println("getUSG");
//        String Id_USG = "";
//        USGService instance = new USGServiceImpl();
//        USG expResult = null;
//        USG result = instance.getUSG(Id_USG);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getUSG method, of class USGService.
//     */
//    @Test
//    public void testGetUSG_0args() throws Exception {
//        System.out.println("getUSG");
//        USGService instance = new USGServiceImpl();
//        List<USG> expResult = null;
//        List<USG> result = instance.getUSG();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of mencariIdPembayaranDariPembayaran method, of class USGService.
//     */
//    @Test
//    public void testMencariIdPembayaranDariPembayaran() throws Exception {
//        System.out.println("mencariIdPembayaranDariPembayaran");
//        String idPasien = "";
//        USGService instance = new USGServiceImpl();
//        String expResult = "";
//        String result = instance.mencariIdPembayaranDariPembayaran(idPasien);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getPembayaranDariPembayaran method, of class USGService.
//     */
//    @Test
//    public void testGetPembayaranDariPembayaran() throws Exception {
//        System.out.println("getPembayaranDariPembayaran");
//        String idPembayaran = "";
//        USGService instance = new USGServiceImpl();
//        Pembayaran expResult = null;
//        Pembayaran result = instance.getPembayaranDariPembayaran(idPembayaran);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of updatePembayaranDariPembayaran method, of class USGService.
//     */
//    @Test
//    public void testUpdatePembayaranDariPembayaran() throws Exception {
//        System.out.println("updatePembayaranDariPembayaran");
//        Pembayaran pembayaran = null;
//        String idTransaksiUSG = "";
//        int Harga = 0;
//        USGService instance = new USGServiceImpl();
//        instance.updatePembayaranDariPembayaran(pembayaran, idTransaksiUSG, Harga);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getAutoNumberDariPembayaran method, of class USGService.
//     */
//    @Test
//    public void testGetAutoNumberDariPembayaran() throws Exception {
//        System.out.println("getAutoNumberDariPembayaran");
//        USGService instance = new USGServiceImpl();
//        String expResult = "";
//        String result = instance.getAutoNumberDariPembayaran();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of insertPembayaranDariPembayaran method, of class USGService.
//     */
//    @Test
//    public void testInsertPembayaranDariPembayaran() throws Exception {
//        System.out.println("insertPembayaranDariPembayaran");
//        String idPembayaran = "";
//        String idPasien = "";
//        String idTransaksiUSG = "";
//        int Harga = 0;
//        USGService instance = new USGServiceImpl();
//        instance.insertPembayaranDariPembayaran(idPembayaran, idPasien, idTransaksiUSG, Harga);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of Id_pasien method, of class USGService.
//     */
//    @Test
//    public void testId_pasien() throws Exception {
//        System.out.println("Id_pasien");
//        Antrian antrian = null;
//        USGService instance = new USGServiceImpl();
//        Antrian expResult = null;
//        Antrian result = instance.Id_pasien(antrian);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of Id_usg method, of class USGService.
//     */
//    @Test
//    public void testId_usg() throws Exception {
//        System.out.println("Id_usg");
//        USGService instance = new USGServiceImpl();
//        String expResult = "";
//        String result = instance.Id_usg();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of ubahstatus method, of class USGService.
//     */
//    @Test
//    public void testUbahstatus() throws Exception {
//        System.out.println("ubahstatus");
//        String ID_ANTRIAN = "";
//        USGService instance = new USGServiceImpl();
//        instance.ubahstatus(ID_ANTRIAN);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    public class USGServiceImpl implements USGService {
//
//        public USG insertUSG(USG usg) throws RemoteException {
//            return null;
//        }
//
//        public USG getUSG(String Id_USG) throws RemoteException {
//            return null;
//        }
//
//        public List<USG> getUSG() throws RemoteException {
//            return null;
//        }
//
//        public String mencariIdPembayaranDariPembayaran(String idPasien) throws RemoteException {
//            return "";
//        }
//
//        public Pembayaran getPembayaranDariPembayaran(String idPembayaran) throws RemoteException {
//            return null;
//        }
//
//        public void updatePembayaranDariPembayaran(Pembayaran pembayaran, String idTransaksiUSG, int Harga) throws RemoteException {
//        }
//
//        public String getAutoNumberDariPembayaran() throws RemoteException {
//            return "";
//        }
//
//        public void insertPembayaranDariPembayaran(String idPembayaran, String idPasien, String idTransaksiUSG, int Harga) throws RemoteException {
//        }
//
//        public Antrian Id_pasien(Antrian antrian) throws RemoteException {
//            return null;
//        }
//
//        public String Id_usg() throws RemoteException {
//            return "";
//        }
//
//        public void ubahstatus(String ID_ANTRIAN) throws RemoteException {
//        }
//    }
//    
}
