/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.Service;

import Database.Entity.Obat_detailResep;
import Database.Entity.Obat_resep;
import Database.Entity.Obat_tabelMaster;
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
 * @author RinduPW
 */
public class ApotekerServiceTest {
    
    public ApotekerServiceTest() {
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
     * Test of insertObat_tabelMaster method, of class ApotekerService.
     */
    @Test
    public void testInsertObat_tabelMaster() throws Exception {
        System.out.println("insertObat_tabelMaster");
        Obat_tabelMaster obat = null;
        ApotekerService instance = new ApotekerServiceImpl();
        Obat_tabelMaster expResult = null;
        Obat_tabelMaster result = instance.insertObat_tabelMaster(obat);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateObat_tabelMaster method, of class ApotekerService.
     */
    @Test
    public void testUpdateObat_tabelMaster() throws Exception {
        System.out.println("updateObat_tabelMaster");
        Obat_tabelMaster obat = null;
        ApotekerService instance = new ApotekerServiceImpl();
        instance.updateObat_tabelMaster(obat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteObat_tabelMaster method, of class ApotekerService.
     */
    @Test
    public void testDeleteObat_tabelMaster() throws Exception {
        System.out.println("deleteObat_tabelMaster");
        int Id_Obat = 0;
        ApotekerService instance = new ApotekerServiceImpl();
        instance.deleteObat_tabelMaster(Id_Obat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObat_tabelMaster method, of class ApotekerService.
     */
    @Test
    public void testGetObat_tabelMaster_int() throws Exception {
        System.out.println("getObat_tabelMaster");
        int Id_Obat = 0;
        ApotekerService instance = new ApotekerServiceImpl();
        Obat_tabelMaster expResult = null;
        Obat_tabelMaster result = instance.getObat_tabelMaster(Id_Obat);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObat_tabelMaster method, of class ApotekerService.
     */
    @Test
    public void testGetObat_tabelMaster_0args() throws Exception {
        System.out.println("getObat_tabelMaster");
        ApotekerService instance = new ApotekerServiceImpl();
        List expResult = null;
        List result = instance.getObat_tabelMaster();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertObat_detailResep method, of class ApotekerService.
     */
    @Test
    public void testInsertObat_detailResep() throws Exception {
        System.out.println("insertObat_detailResep");
        Obat_detailResep detail_resep = null;
        ApotekerService instance = new ApotekerServiceImpl();
        Obat_detailResep expResult = null;
        Obat_detailResep result = instance.insertObat_detailResep(detail_resep);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateObat_detailResep method, of class ApotekerService.
     */
    @Test
    public void testUpdateObat_detailResep() throws Exception {
        System.out.println("updateObat_detailResep");
        Obat_detailResep detail_resep = null;
        ApotekerService instance = new ApotekerServiceImpl();
        instance.updateObat_detailResep(detail_resep);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteObat_detailResep method, of class ApotekerService.
     */
    @Test
    public void testDeleteObat_detailResep() throws Exception {
        System.out.println("deleteObat_detailResep");
        int No_Detail_Resep = 0;
        ApotekerService instance = new ApotekerServiceImpl();
        instance.deleteObat_detailResep(No_Detail_Resep);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObat_detailResep method, of class ApotekerService.
     */
    @Test
    public void testGetObat_detailResep_int() throws Exception {
        System.out.println("getObat_detailResep");
        int No_Detail_Resep = 0;
        ApotekerService instance = new ApotekerServiceImpl();
        Obat_detailResep expResult = null;
        Obat_detailResep result = instance.getObat_detailResep(No_Detail_Resep);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObat_detailResep method, of class ApotekerService.
     */
    @Test
    public void testGetObat_detailResep_String() throws Exception {
        System.out.println("getObat_detailResep");
        String ID_RESEP = "";
        ApotekerService instance = new ApotekerServiceImpl();
        List expResult = null;
        List result = instance.getObat_detailResep(ID_RESEP);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertObat_resep method, of class ApotekerService.
     */
    @Test
    public void testInsertObat_resep() throws Exception {
        System.out.println("insertObat_resep");
        Obat_resep obat = null;
        ApotekerService instance = new ApotekerServiceImpl();
        Obat_resep expResult = null;
        Obat_resep result = instance.insertObat_resep(obat);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateObat_resep method, of class ApotekerService.
     */
    @Test
    public void testUpdateObat_resep() throws Exception {
        System.out.println("updateObat_resep");
        Obat_resep obat = null;
        ApotekerService instance = new ApotekerServiceImpl();
        instance.updateObat_resep(obat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteObat_resep method, of class ApotekerService.
     */
    @Test
    public void testDeleteObat_resep() throws Exception {
        System.out.println("deleteObat_resep");
        int Id_Resep = 0;
        ApotekerService instance = new ApotekerServiceImpl();
        instance.deleteObat_resep(Id_Resep);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObat_resep method, of class ApotekerService.
     */
    @Test
    public void testGetObat_resep_int() throws Exception {
        System.out.println("getObat_resep");
        int Id_Resep = 0;
        ApotekerService instance = new ApotekerServiceImpl();
        Obat_resep expResult = null;
        Obat_resep result = instance.getObat_resep(Id_Resep);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObat_resep method, of class ApotekerService.
     */
    @Test
    public void testGetObat_resep_0args() throws Exception {
        System.out.println("getObat_resep");
        ApotekerService instance = new ApotekerServiceImpl();
        List expResult = null;
        List result = instance.getObat_resep();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNamaObat method, of class ApotekerService.
     */
    @Test
    public void testGetNamaObat() throws Exception {
        System.out.println("getNamaObat");
        ApotekerService instance = new ApotekerServiceImpl();
        List expResult = null;
        List result = instance.getNamaObat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdObat method, of class ApotekerService.
     */
    @Test
    public void testGetIdObat() throws Exception {
        System.out.println("getIdObat");
        String namaObat = "";
        ApotekerService instance = new ApotekerServiceImpl();
        String expResult = "";
        String result = instance.getIdObat(namaObat);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTakaran method, of class ApotekerService.
     */
    @Test
    public void testGetTakaran() throws Exception {
        System.out.println("getTakaran");
        ApotekerService instance = new ApotekerServiceImpl();
        List expResult = null;
        List result = instance.getTakaran();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdTakaran method, of class ApotekerService.
     */
    @Test
    public void testGetIdTakaran() throws Exception {
        System.out.println("getIdTakaran");
        String takaran = "";
        ApotekerService instance = new ApotekerServiceImpl();
        String expResult = "";
        String result = instance.getIdTakaran(takaran);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPemakaian method, of class ApotekerService.
     */
    @Test
    public void testGetPemakaian() throws Exception {
        System.out.println("getPemakaian");
        ApotekerService instance = new ApotekerServiceImpl();
        List expResult = null;
        List result = instance.getPemakaian();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdPemakaian method, of class ApotekerService.
     */
    @Test
    public void testGetIdPemakaian() throws Exception {
        System.out.println("getIdPemakaian");
        String pemakaian = "";
        ApotekerService instance = new ApotekerServiceImpl();
        String expResult = "";
        String result = instance.getIdPemakaian(pemakaian);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHargaObat method, of class ApotekerService.
     */
    @Test
    public void testGetHargaObat() throws Exception {
        System.out.println("getHargaObat");
        String namaobat = "";
        ApotekerService instance = new ApotekerServiceImpl();
        int expResult = 0;
        int result = instance.getHargaObat(namaobat);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mencariIdPasienDariPembayaran method, of class ApotekerService.
     */
    @Test
    public void testMencariIdPasienDariPembayaran() throws Exception {
        System.out.println("mencariIdPasienDariPembayaran");
        String idResep = "";
        ApotekerService instance = new ApotekerServiceImpl();
        String expResult = "";
        String result = instance.mencariIdPasienDariPembayaran(idResep);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mencariIdPembayaranDariPembayaran method, of class ApotekerService.
     */
    @Test
    public void testMencariIdPembayaranDariPembayaran() throws Exception {
        System.out.println("mencariIdPembayaranDariPembayaran");
        String idPasien = "";
        ApotekerService instance = new ApotekerServiceImpl();
        String expResult = "";
        String result = instance.mencariIdPembayaranDariPembayaran(idPasien);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPembayaranDariPembayaran method, of class ApotekerService.
     */
    @Test
    public void testGetPembayaranDariPembayaran() throws Exception {
        System.out.println("getPembayaranDariPembayaran");
        String idPembayaran = "";
        ApotekerService instance = new ApotekerServiceImpl();
        Pembayaran expResult = null;
        Pembayaran result = instance.getPembayaranDariPembayaran(idPembayaran);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePembayaranDariPembayaran method, of class ApotekerService.
     */
    @Test
    public void testUpdatePembayaranDariPembayaran() throws Exception {
        System.out.println("updatePembayaranDariPembayaran");
        Pembayaran pembayaran = null;
        String idResep = "";
        int Harga = 0;
        ApotekerService instance = new ApotekerServiceImpl();
        instance.updatePembayaranDariPembayaran(pembayaran, idResep, Harga);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAutoNumberDariPembayaran method, of class ApotekerService.
     */
    @Test
    public void testGetAutoNumberDariPembayaran() throws Exception {
        System.out.println("getAutoNumberDariPembayaran");
        ApotekerService instance = new ApotekerServiceImpl();
        String expResult = "";
        String result = instance.getAutoNumberDariPembayaran();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertPembayaranDariPembayaran method, of class ApotekerService.
     */
    @Test
    public void testInsertPembayaranDariPembayaran() throws Exception {
        System.out.println("insertPembayaranDariPembayaran");
        String idPembayaran = "";
        String idPasien = "";
        String idResep = "";
        int Harga = 0;
        ApotekerService instance = new ApotekerServiceImpl();
        instance.insertPembayaranDariPembayaran(idPembayaran, idPasien, idResep, Harga);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ApotekerServiceImpl implements ApotekerService {

        public Obat_tabelMaster insertObat_tabelMaster(Obat_tabelMaster obat) throws RemoteException {
            return null;
        }

        public void updateObat_tabelMaster(Obat_tabelMaster obat) throws RemoteException {
        }

        public void deleteObat_tabelMaster(int Id_Obat) throws RemoteException {
        }

        public Obat_tabelMaster getObat_tabelMaster(int Id_Obat) throws RemoteException {
            return null;
        }

        public List<Obat_tabelMaster> getObat_tabelMaster() throws RemoteException {
            return null;
        }

        public Obat_detailResep insertObat_detailResep(Obat_detailResep detail_resep) throws RemoteException {
            return null;
        }

        public void updateObat_detailResep(Obat_detailResep detail_resep) throws RemoteException {
        }

        public void deleteObat_detailResep(int No_Detail_Resep) throws RemoteException {
        }

        public Obat_detailResep getObat_detailResep(int No_Detail_Resep) throws RemoteException {
            return null;
        }

        public List<Obat_detailResep> getObat_detailResep(String ID_RESEP) throws RemoteException {
            return null;
        }

        public Obat_resep insertObat_resep(Obat_resep obat) throws RemoteException {
            return null;
        }

        public void updateObat_resep(Obat_resep obat) throws RemoteException {
        }

        public void deleteObat_resep(int Id_Resep) throws RemoteException {
        }

        public Obat_resep getObat_resep(int Id_Resep) throws RemoteException {
            return null;
        }

        public List<Obat_resep> getObat_resep() throws RemoteException {
            return null;
        }

        public List getNamaObat() throws RemoteException {
            return null;
        }

        public String getIdObat(String namaObat) throws RemoteException {
            return "";
        }

        public List getTakaran() throws RemoteException {
            return null;
        }

        public String getIdTakaran(String takaran) throws RemoteException {
            return "";
        }

        public List getPemakaian() throws RemoteException {
            return null;
        }

        public String getIdPemakaian(String pemakaian) throws RemoteException {
            return "";
        }

        public int getHargaObat(String namaobat) throws RemoteException {
            return 0;
        }

        public String mencariIdPasienDariPembayaran(String idResep) throws RemoteException {
            return "";
        }

        public String mencariIdPembayaranDariPembayaran(String idPasien) throws RemoteException {
            return "";
        }

        public Pembayaran getPembayaranDariPembayaran(String idPembayaran) throws RemoteException {
            return null;
        }

        public void updatePembayaranDariPembayaran(Pembayaran pembayaran, String idResep, int Harga) throws RemoteException {
        }

        public String getAutoNumberDariPembayaran() throws RemoteException {
            return "";
        }

        public void insertPembayaranDariPembayaran(String idPembayaran, String idPasien, String idResep, int Harga) throws RemoteException {
        }
    }
}