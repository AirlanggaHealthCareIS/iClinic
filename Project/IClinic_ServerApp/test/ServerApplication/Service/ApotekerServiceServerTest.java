/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ServerApplication.Service;

import Database.Entity.Obat_detailResep;
import Database.Entity.Obat_resep;
import Database.Entity.Obat_tabelMaster;
import Database.Entity.Pembayaran;
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
public class ApotekerServiceServerTest {
    
    public ApotekerServiceServerTest() {
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
     * Test of insertObat_tabelMaster method, of class ApotekerServiceServer.
     */
    @Test
    public void testInsertObat_tabelMaster() throws Exception {
        System.out.println("insertObat_tabelMaster");
        Obat_tabelMaster obat = null;
        ApotekerServiceServer instance = new ApotekerServiceServer();
        Obat_tabelMaster expResult = null;
        Obat_tabelMaster result = instance.insertObat_tabelMaster(obat);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateObat_tabelMaster method, of class ApotekerServiceServer.
     */
    @Test
    public void testUpdateObat_tabelMaster() throws Exception {
        System.out.println("updateObat_tabelMaster");
        Obat_tabelMaster obat = null;
        ApotekerServiceServer instance = new ApotekerServiceServer();
        instance.updateObat_tabelMaster(obat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteObat_tabelMaster method, of class ApotekerServiceServer.
     */
    @Test
    public void testDeleteObat_tabelMaster() throws Exception {
        System.out.println("deleteObat_tabelMaster");
        int Id_Obat = 0;
        ApotekerServiceServer instance = new ApotekerServiceServer();
        instance.deleteObat_tabelMaster(Id_Obat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObat_tabelMaster method, of class ApotekerServiceServer.
     */
    @Test
    public void testGetObat_tabelMaster_int() throws Exception {
        System.out.println("getObat_tabelMaster");
        int Id_Obat = 0;
        ApotekerServiceServer instance = new ApotekerServiceServer();
        Obat_tabelMaster expResult = null;
        Obat_tabelMaster result = instance.getObat_tabelMaster(Id_Obat);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObat_tabelMaster method, of class ApotekerServiceServer.
     */
    @Test
    public void testGetObat_tabelMaster_0args() throws Exception {
        System.out.println("getObat_tabelMaster");
        ApotekerServiceServer instance = new ApotekerServiceServer();
        List expResult = null;
        List result = instance.getObat_tabelMaster();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertObat_detailResep method, of class ApotekerServiceServer.
     */
    @Test
    public void testInsertObat_detailResep() throws Exception {
        System.out.println("insertObat_detailResep");
        Obat_detailResep detail_resep = null;
        ApotekerServiceServer instance = new ApotekerServiceServer();
        Obat_detailResep expResult = null;
        Obat_detailResep result = instance.insertObat_detailResep(detail_resep);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateObat_detailResep method, of class ApotekerServiceServer.
     */
    @Test
    public void testUpdateObat_detailResep() throws Exception {
        System.out.println("updateObat_detailResep");
        Obat_detailResep detail_resep = null;
        ApotekerServiceServer instance = new ApotekerServiceServer();
        instance.updateObat_detailResep(detail_resep);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteObat_detailResep method, of class ApotekerServiceServer.
     */
    @Test
    public void testDeleteObat_detailResep() throws Exception {
        System.out.println("deleteObat_detailResep");
        String Id_Obat = "";
        ApotekerServiceServer instance = new ApotekerServiceServer();
        instance.deleteObat_detailResep(Id_Obat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObat_detailResep method, of class ApotekerServiceServer.
     */
    @Test
    public void testGetObat_detailResep_int() throws Exception {
        System.out.println("getObat_detailResep");
        String Id_Obat = "";
        ApotekerServiceServer instance = new ApotekerServiceServer();
        Obat_detailResep expResult = null;
        Obat_detailResep result = instance.getObat_detailResep(Id_Obat);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObat_detailResep method, of class ApotekerServiceServer.
     */
    @Test
    public void testGetObat_detailResep_String() throws Exception {
        System.out.println("getObat_detailResep");
        String ID_RESEP = "";
        ApotekerServiceServer instance = new ApotekerServiceServer();
        List expResult = null;
        List result = instance.getObat_detailresep(ID_RESEP);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertObat_resep method, of class ApotekerServiceServer.
     */
    @Test
    public void testInsertObat_resep() throws Exception {
        System.out.println("insertObat_resep");
        Obat_resep resep = null;
        ApotekerServiceServer instance = new ApotekerServiceServer();
        Obat_resep expResult = null;
        Obat_resep result = instance.insertObat_resep(resep);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateObat_resep method, of class ApotekerServiceServer.
     */
    @Test
    public void testUpdateObat_resep() throws Exception {
        System.out.println("updateObat_resep");
        Obat_resep resep = null;
        ApotekerServiceServer instance = new ApotekerServiceServer();
        instance.updateObat_resep(resep);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteObat_resep method, of class ApotekerServiceServer.
     */
    @Test
    public void testDeleteObat_resep() throws Exception {
        System.out.println("deleteObat_resep");
        int Id_Obat = 0;
        ApotekerServiceServer instance = new ApotekerServiceServer();
        instance.deleteObat_resep(Id_Obat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObat_resep method, of class ApotekerServiceServer.
     */
    @Test
    public void testGetObat_resep_int() throws Exception {
        System.out.println("getObat_resep");
        int Id_Obat = 0;
        ApotekerServiceServer instance = new ApotekerServiceServer();
        Obat_resep expResult = null;
        Obat_resep result = instance.getObat_resep(Id_Obat);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObat_resep method, of class ApotekerServiceServer.
     */
    @Test
    public void testGetObat_resep_0args() throws Exception {
        System.out.println("getObat_resep");
        ApotekerServiceServer instance = new ApotekerServiceServer();
        List expResult = null;
        List result = instance.getObat_resep();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNamaObat method, of class ApotekerServiceServer.
     */
    @Test
    public void testGetNamaObat() throws Exception {
        System.out.println("getNamaObat");
        ApotekerServiceServer instance = new ApotekerServiceServer();
        List expResult = null;
        List result = instance.getNamaObat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdObat method, of class ApotekerServiceServer.
     */
    @Test
    public void testGetIdObat() throws Exception {
        System.out.println("getIdObat");
        String namaObat = "";
        ApotekerServiceServer instance = new ApotekerServiceServer();
        String expResult = "";
        String result = instance.getIdObat(namaObat);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTakaran method, of class ApotekerServiceServer.
     */
    @Test
    public void testGetTakaran() throws Exception {
        System.out.println("getTakaran");
        ApotekerServiceServer instance = new ApotekerServiceServer();
        List expResult = null;
        List result = instance.getTakaran();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdTakaran method, of class ApotekerServiceServer.
     */
    @Test
    public void testGetIdTakaran() throws Exception {
        System.out.println("getIdTakaran");
        String takaran = "";
        ApotekerServiceServer instance = new ApotekerServiceServer();
        String expResult = "";
        String result = instance.getIdTakaran(takaran);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPemakaian method, of class ApotekerServiceServer.
     */
    @Test
    public void testGetPemakaian() throws Exception {
        System.out.println("getPemakaian");
        ApotekerServiceServer instance = new ApotekerServiceServer();
        List expResult = null;
        List result = instance.getPemakaian();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdPemakaian method, of class ApotekerServiceServer.
     */
    @Test
    public void testGetIdPemakaian() throws Exception {
        System.out.println("getIdPemakaian");
        String pemakaian = "";
        ApotekerServiceServer instance = new ApotekerServiceServer();
        String expResult = "";
        String result = instance.getIdPemakaian(pemakaian);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHargaObat method, of class ApotekerServiceServer.
     */
    @Test
    public void testGetHargaObat() throws Exception {
        System.out.println("getHargaObat");
        String namaobat = "";
        ApotekerServiceServer instance = new ApotekerServiceServer();
        int expResult = 0;
        int result = instance.getHargaObat(namaobat);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mencariIdPasienDariPembayaran method, of class ApotekerServiceServer.
     */
    @Test
    public void testMencariIdPasienDariPembayaran() throws Exception {
        System.out.println("mencariIdPasienDariPembayaran");
        String idResep = "";
        ApotekerServiceServer instance = new ApotekerServiceServer();
        String expResult = "";
        String result = instance.mencariIdPasienDariPembayaran(idResep);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mencariIdPembayaranDariPembayaran method, of class ApotekerServiceServer.
     */
    @Test
    public void testMencariIdPembayaranDariPembayaran() throws Exception {
        System.out.println("mencariIdPembayaranDariPembayaran");
        String idPasien = "";
        ApotekerServiceServer instance = new ApotekerServiceServer();
        String expResult = "";
        String result = instance.mencariIdPembayaranDariPembayaran(idPasien);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPembayaranDariPembayaran method, of class ApotekerServiceServer.
     */
    @Test
    public void testGetPembayaranDariPembayaran() throws Exception {
        System.out.println("getPembayaranDariPembayaran");
        String idPembayaran = "";
        ApotekerServiceServer instance = new ApotekerServiceServer();
        Pembayaran expResult = null;
        Pembayaran result = instance.getPembayaranDariPembayaran(idPembayaran);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePembayaranDariPembayaran method, of class ApotekerServiceServer.
     */
    @Test
    public void testUpdatePembayaranDariPembayaran() throws Exception {
        System.out.println("updatePembayaranDariPembayaran");
        Pembayaran pembayaranDB = null;
        String idResep = "";
        int Harga = 0;
        ApotekerServiceServer instance = new ApotekerServiceServer();
        instance.updatePembayaranDariPembayaran(pembayaranDB, idResep, Harga);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAutoNumberDariPembayaran method, of class ApotekerServiceServer.
     */
    @Test
    public void testGetAutoNumberDariPembayaran() throws Exception {
        System.out.println("getAutoNumberDariPembayaran");
        ApotekerServiceServer instance = new ApotekerServiceServer();
        String expResult = "";
        String result = instance.getAutoNumberDariPembayaran();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertPembayaranDariPembayaran method, of class ApotekerServiceServer.
     */
    @Test
    public void testInsertPembayaranDariPembayaran() throws Exception {
        System.out.println("insertPembayaranDariPembayaran");
        String idPembayaran = "";
        String idPasien = "";
        String idResep = "";
        int Harga = 0;
        ApotekerServiceServer instance = new ApotekerServiceServer();
        instance.insertPembayaranDariPembayaran(idPembayaran, idPasien, idResep, Harga);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}