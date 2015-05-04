/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServerApplication.Service;

import Database.Entity.Obat_detailResep;
import Database.Entity.Obat_resep;
import Database.Entity.Pembayaran;
import Database.Entity.Rekam_Medis;
import Database.Entity.Tindakan_detailTindakan;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Afifah
 */
public class DokterServiceServerTest {
    
    public DokterServiceServerTest() {
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
     * Test of insertRekam_Medis method, of class DokterServiceServer.
     */
    @Test
    public void testInsertRekam_Medis() throws Exception {
        System.out.println("insertRekam_Medis");
        Rekam_Medis rekam_medis = null;
        DokterServiceServer instance = new DokterServiceServer();
        Rekam_Medis expResult = null;
        Rekam_Medis result = instance.insertRekam_Medis(rekam_medis);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertDetailTindakan method, of class DokterServiceServer.
     */
    @Test
    public void testInsertDetailTindakan() throws Exception {
        System.out.println("insertDetailTindakan");
        Tindakan_detailTindakan detail_tindakan = null;
        DokterServiceServer instance = new DokterServiceServer();
        Tindakan_detailTindakan expResult = null;
        Tindakan_detailTindakan result = instance.insertDetailTindakan(detail_tindakan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateRekam_Medis method, of class DokterServiceServer.
     */
    @Test
    public void testUpdateRekam_Medis() throws Exception {
        System.out.println("updateRekam_Medis");
        Rekam_Medis rekam_medis = null;
        DokterServiceServer instance = new DokterServiceServer();
        instance.updateRekam_Medis(rekam_medis);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteRekam_Medis method, of class DokterServiceServer.
     */
    @Test
    public void testDeleteRekam_Medis() throws Exception {
        System.out.println("deleteRekam_Medis");
        String Id_Rekam = "";
        DokterServiceServer instance = new DokterServiceServer();
        instance.deleteRekam_Medis(Id_Rekam);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRekam_Medis method, of class DokterServiceServer.
     */
    @Test
    public void testGetRekam_Medis_String() throws Exception {
        System.out.println("getRekam_Medis");
        String Id_Rekam = "";
        DokterServiceServer instance = new DokterServiceServer();
        Rekam_Medis expResult = null;
        Rekam_Medis result = instance.getRekam_Medis(Id_Rekam);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRekam_Medis method, of class DokterServiceServer.
     */
    @Test
    public void testGetRekam_Medis_0args() throws Exception {
        System.out.println("getRekam_Medis");
        DokterServiceServer instance = new DokterServiceServer();
        List<Rekam_Medis> expResult = null;
        List<Rekam_Medis> result = instance.getRekam_Medis();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDetailTindakan method, of class DokterServiceServer.
     */
    @Test
    public void testGetDetailTindakan_0args() throws Exception {
        System.out.println("getDetailTindakan");
        DokterServiceServer instance = new DokterServiceServer();
        List<Tindakan_detailTindakan> expResult = null;
        List<Tindakan_detailTindakan> result = instance.getDetailTindakan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetRekam_MedisbyPasien method, of class DokterServiceServer.
     */
    @Test
    public void testGetRekam_MedisbyPasien() throws Exception {
        System.out.println("GetRekam_MedisbyPasien");
        String idpasien = "";
        DokterServiceServer instance = new DokterServiceServer();
        List<Rekam_Medis> expResult = null;
        List<Rekam_Medis> result = instance.GetRekam_MedisbyPasien(idpasien);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNamaDiagnosa method, of class DokterServiceServer.
     */
    @Test
    public void testGetNamaDiagnosa() throws Exception {
        System.out.println("getNamaDiagnosa");
        DokterServiceServer instance = new DokterServiceServer();
        List expResult = null;
        List result = instance.getNamaDiagnosa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdDiagnosa method, of class DokterServiceServer.
     */
    @Test
    public void testGetIdDiagnosa() throws Exception {
        System.out.println("getIdDiagnosa");
        String namaDiagnosa = "";
        DokterServiceServer instance = new DokterServiceServer();
        String expResult = "";
        String result = instance.getIdDiagnosa(namaDiagnosa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNamaTindakan method, of class DokterServiceServer.
     */
    @Test
    public void testGetNamaTindakan() throws Exception {
        System.out.println("getNamaTindakan");
        DokterServiceServer instance = new DokterServiceServer();
        List expResult = null;
        List result = instance.getNamaTindakan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdTindakan method, of class DokterServiceServer.
     */
    @Test
    public void testGetIdTindakan() throws Exception {
        System.out.println("getIdTindakan");
        String namaTindakan = "";
        DokterServiceServer instance = new DokterServiceServer();
        String expResult = "";
        String result = instance.getIdTindakan(namaTindakan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAutoNumberNoDetail method, of class DokterServiceServer.
     */
    @Test
    public void testGetAutoNumberNoDetail() throws Exception {
        System.out.println("getAutoNumberNoDetail");
        DokterServiceServer instance = new DokterServiceServer();
        String expResult = "";
        String result = instance.getAutoNumberNoDetail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAutoNumberIdRekam method, of class DokterServiceServer.
     */
    @Test
    public void testGetAutoNumberIdRekam() throws Exception {
        System.out.println("getAutoNumberIdRekam");
        DokterServiceServer instance = new DokterServiceServer();
        String expResult = "";
        String result = instance.getAutoNumberIdRekam();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTarif method, of class DokterServiceServer.
     */
    @Test
    public void testGetTarif() throws Exception {
        System.out.println("getTarif");
        String nama_tindakan = "";
        DokterServiceServer instance = new DokterServiceServer();
        int expResult = 0;
        int result = instance.getTarif(nama_tindakan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDetailTindakan method, of class DokterServiceServer.
     */
    @Test
    public void testGetDetailTindakan_String() throws Exception {
        System.out.println("getDetailTindakan");
        String No_Detail = "";
        DokterServiceServer instance = new DokterServiceServer();
        Tindakan_detailTindakan expResult = null;
        Tindakan_detailTindakan result = instance.getDetailTindakan(No_Detail);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRekamMedisbyID method, of class DokterServiceServer.
     */
    @Test
    public void testGetRekamMedisbyID() throws Exception {
        System.out.println("getRekamMedisbyID");
        DokterServiceServer instance = new DokterServiceServer();
        String expResult = "";
        String result = instance.getRekamMedisbyID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mencariIdPembayaranDariPembayaran method, of class DokterServiceServer.
     */
    @Test
    public void testMencariIdPembayaranDariPembayaran() throws Exception {
        System.out.println("mencariIdPembayaranDariPembayaran");
        String idPasien = "";
        DokterServiceServer instance = new DokterServiceServer();
        String expResult = "";
        String result = instance.mencariIdPembayaranDariPembayaran(idPasien);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPembayaranDariPembayaran method, of class DokterServiceServer.
     */
    @Test
    public void testGetPembayaranDariPembayaran() throws Exception {
        System.out.println("getPembayaranDariPembayaran");
        String idPembayaran = "";
        DokterServiceServer instance = new DokterServiceServer();
        Pembayaran expResult = null;
        Pembayaran result = instance.getPembayaranDariPembayaran(idPembayaran);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePembayaranDariPembayaran method, of class DokterServiceServer.
     */
    @Test
    public void testUpdatePembayaranDariPembayaran() throws Exception {
        System.out.println("updatePembayaranDariPembayaran");
        Pembayaran pembayaranDB = null;
        String idRekam = "";
        int Harga = 0;
        DokterServiceServer instance = new DokterServiceServer();
        instance.updatePembayaranDariPembayaran(pembayaranDB, idRekam, Harga);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAutoNumberDariPembayaran method, of class DokterServiceServer.
     */
    @Test
    public void testGetAutoNumberDariPembayaran() throws Exception {
        System.out.println("getAutoNumberDariPembayaran");
        DokterServiceServer instance = new DokterServiceServer();
        String expResult = "";
        String result = instance.getAutoNumberDariPembayaran();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertPembayaranDariPembayaran method, of class DokterServiceServer.
     */
    @Test
    public void testInsertPembayaranDariPembayaran() throws Exception {
        System.out.println("insertPembayaranDariPembayaran");
        String idPembayaran = "";
        String idPasien = "";
        String idRekam = "";
        int Harga = 0;
        DokterServiceServer instance = new DokterServiceServer();
        instance.insertPembayaranDariPembayaran(idPembayaran, idPasien, idRekam, Harga);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAutoNumberResep method, of class DokterServiceServer.
     */
    @Test
    public void testGetAutoNumberResep() throws Exception {
        System.out.println("getAutoNumberResep");
        DokterServiceServer instance = new DokterServiceServer();
        String expResult = "";
        String result = instance.getAutoNumberResep();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAutoNumberDetailResep method, of class DokterServiceServer.
     */
    @Test
    public void testGetAutoNumberDetailResep() throws Exception {
        System.out.println("getAutoNumberDetailResep");
        DokterServiceServer instance = new DokterServiceServer();
        String expResult = "";
        String result = instance.getAutoNumberDetailResep();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertDetailResep method, of class DokterServiceServer.
     */
    @Test
    public void testInsertDetailResep() throws Exception {
        System.out.println("insertDetailResep");
        Obat_detailResep detailResep = null;
        DokterServiceServer instance = new DokterServiceServer();
        Obat_detailResep expResult = null;
        Obat_detailResep result = instance.insertDetailResep(detailResep);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateDetailResep method, of class DokterServiceServer.
     */
    @Test
    public void testUpdateDetailResep() throws Exception {
        System.out.println("updateDetailResep");
        Obat_detailResep detailResep = null;
        DokterServiceServer instance = new DokterServiceServer();
        instance.updateDetailResep(detailResep);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteDetailResep method, of class DokterServiceServer.
     */
    @Test
    public void testDeleteDetailResep() throws Exception {
        System.out.println("deleteDetailResep");
        String No_Detail_Resep = "";
        DokterServiceServer instance = new DokterServiceServer();
        instance.deleteDetailResep(No_Detail_Resep);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllDetailResepByIDResep method, of class DokterServiceServer.
     */
    @Test
    public void testGetAllDetailResepByIDResep() throws Exception {
        System.out.println("getAllDetailResepByIDResep");
        String ID_RESEP = "";
        DokterServiceServer instance = new DokterServiceServer();
        List<Obat_detailResep> expResult = null;
        List<Obat_detailResep> result = instance.getAllDetailResepByIDResep(ID_RESEP);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertResep method, of class DokterServiceServer.
     */
    @Test
    public void testInsertResep() throws Exception {
        System.out.println("insertResep");
        Obat_resep resep = null;
        DokterServiceServer instance = new DokterServiceServer();
        instance.insertResep(resep);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNamaObat method, of class DokterServiceServer.
     */
    @Test
    public void testGetNamaObat() throws Exception {
        System.out.println("getNamaObat");
        DokterServiceServer instance = new DokterServiceServer();
        List expResult = null;
        List result = instance.getNamaObat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHargaObat method, of class DokterServiceServer.
     */
    @Test
    public void testGetHargaObat() throws Exception {
        System.out.println("getHargaObat");
        String namaObat = "";
        DokterServiceServer instance = new DokterServiceServer();
        int expResult = 0;
        int result = instance.getHargaObat(namaObat);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIDObat method, of class DokterServiceServer.
     */
    @Test
    public void testGetIDObat() throws Exception {
        System.out.println("getIDObat");
        String namaObat = "";
        DokterServiceServer instance = new DokterServiceServer();
        String expResult = "";
        String result = instance.getIDObat(namaObat);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateResep method, of class DokterServiceServer.
     */
    @Test
    public void testUpdateResep() throws Exception {
        System.out.println("updateResep");
        Obat_resep resep = null;
        String ID_RESEP = "";
        int TOTAL_HARGA = 0;
        DokterServiceServer instance = new DokterServiceServer();
        instance.updateResep(resep, ID_RESEP, TOTAL_HARGA);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastIDRekamMedis method, of class DokterServiceServer.
     */
    @Test
    public void testGetLastIDRekamMedis() throws Exception {
        System.out.println("getLastIDRekamMedis");
        DokterServiceServer instance = new DokterServiceServer();
        String expResult = "";
        String result = instance.getLastIDRekamMedis();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
