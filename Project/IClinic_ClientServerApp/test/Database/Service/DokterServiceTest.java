/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.Service;

import Database.Entity.Obat_detailResep;
import Database.Entity.Obat_resep;
import Database.Entity.Pembayaran;
import Database.Entity.Rekam_Medis;
import Database.Entity.Tindakan_detailTindakan;
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
 * @author Afifah
 */
public class DokterServiceTest {
    
    public DokterServiceTest() {
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
     * Test of insertRekam_Medis method, of class DokterService.
     */
    @Test
    public void testInsertRekam_Medis() throws Exception {
        System.out.println("insertRekam_Medis");
        Rekam_Medis rekam_medis = null;
        DokterService instance = new DokterServiceImpl();
        Rekam_Medis expResult = null;
        Rekam_Medis result = instance.insertRekam_Medis(rekam_medis);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertDetailTindakan method, of class DokterService.
     */
    @Test
    public void testInsertDetailTindakan() throws Exception {
        System.out.println("insertDetailTindakan");
        Tindakan_detailTindakan detail_tindakan = null;
        DokterService instance = new DokterServiceImpl();
        Tindakan_detailTindakan expResult = null;
        Tindakan_detailTindakan result = instance.insertDetailTindakan(detail_tindakan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDetailTindakan method, of class DokterService.
     */
    @Test
    public void testGetDetailTindakan_String() throws Exception {
        System.out.println("getDetailTindakan");
        String No_Detail = "";
        DokterService instance = new DokterServiceImpl();
        Tindakan_detailTindakan expResult = null;
        Tindakan_detailTindakan result = instance.getDetailTindakan(No_Detail);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDetailTindakan method, of class DokterService.
     */
    @Test
    public void testGetDetailTindakan_0args() throws Exception {
        System.out.println("getDetailTindakan");
        DokterService instance = new DokterServiceImpl();
        List<Tindakan_detailTindakan> expResult = null;
        List<Tindakan_detailTindakan> result = instance.getDetailTindakan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateRekam_Medis method, of class DokterService.
     */
    @Test
    public void testUpdateRekam_Medis() throws Exception {
        System.out.println("updateRekam_Medis");
        Rekam_Medis rekam_medis = null;
        DokterService instance = new DokterServiceImpl();
        instance.updateRekam_Medis(rekam_medis);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteRekam_Medis method, of class DokterService.
     */
    @Test
    public void testDeleteRekam_Medis() throws Exception {
        System.out.println("deleteRekam_Medis");
        String Id_Rekam = "";
        DokterService instance = new DokterServiceImpl();
        instance.deleteRekam_Medis(Id_Rekam);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRekam_Medis method, of class DokterService.
     */
    @Test
    public void testGetRekam_Medis_String() throws Exception {
        System.out.println("getRekam_Medis");
        String Id_Rekam = "";
        DokterService instance = new DokterServiceImpl();
        Rekam_Medis expResult = null;
        Rekam_Medis result = instance.getRekam_Medis(Id_Rekam);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRekam_Medis method, of class DokterService.
     */
    @Test
    public void testGetRekam_Medis_0args() throws Exception {
        System.out.println("getRekam_Medis");
        DokterService instance = new DokterServiceImpl();
        List<Rekam_Medis> expResult = null;
        List<Rekam_Medis> result = instance.getRekam_Medis();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNamaDiagnosa method, of class DokterService.
     */
    @Test
    public void testGetNamaDiagnosa() throws Exception {
        System.out.println("getNamaDiagnosa");
        DokterService instance = new DokterServiceImpl();
        List expResult = null;
        List result = instance.getNamaDiagnosa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdDiagnosa method, of class DokterService.
     */
    @Test
    public void testGetIdDiagnosa() throws Exception {
        System.out.println("getIdDiagnosa");
        String namaDiagnosa = "";
        DokterService instance = new DokterServiceImpl();
        String expResult = "";
        String result = instance.getIdDiagnosa(namaDiagnosa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRekamMedisbyID method, of class DokterService.
     */
    @Test
    public void testGetRekamMedisbyID() throws Exception {
        System.out.println("getRekamMedisbyID");
        DokterService instance = new DokterServiceImpl();
        String expResult = "";
        String result = instance.getRekamMedisbyID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNamaTindakan method, of class DokterService.
     */
    @Test
    public void testGetNamaTindakan() throws Exception {
        System.out.println("getNamaTindakan");
        DokterService instance = new DokterServiceImpl();
        List expResult = null;
        List result = instance.getNamaTindakan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdTindakan method, of class DokterService.
     */
    @Test
    public void testGetIdTindakan() throws Exception {
        System.out.println("getIdTindakan");
        String namaTindakan = "";
        DokterService instance = new DokterServiceImpl();
        String expResult = "";
        String result = instance.getIdTindakan(namaTindakan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetRekam_MedisbyPasien method, of class DokterService.
     */
    @Test
    public void testGetRekam_MedisbyPasien() throws Exception {
        System.out.println("GetRekam_MedisbyPasien");
        String idpasien = "";
        DokterService instance = new DokterServiceImpl();
        List<Rekam_Medis> expResult = null;
        List<Rekam_Medis> result = instance.GetRekam_MedisbyPasien(idpasien);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAutoNumberNoDetail method, of class DokterService.
     */
    @Test
    public void testGetAutoNumberNoDetail() throws Exception {
        System.out.println("getAutoNumberNoDetail");
        DokterService instance = new DokterServiceImpl();
        String expResult = "";
        String result = instance.getAutoNumberNoDetail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAutoNumberIdRekam method, of class DokterService.
     */
    @Test
    public void testGetAutoNumberIdRekam() throws Exception {
        System.out.println("getAutoNumberIdRekam");
        DokterService instance = new DokterServiceImpl();
        String expResult = "";
        String result = instance.getAutoNumberIdRekam();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTarif method, of class DokterService.
     */
    @Test
    public void testGetTarif() throws Exception {
        System.out.println("getTarif");
        String nama_tindakan = "";
        DokterService instance = new DokterServiceImpl();
        int expResult = 0;
        int result = instance.getTarif(nama_tindakan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mencariIdPembayaranDariPembayaran method, of class DokterService.
     */
    @Test
    public void testMencariIdPembayaranDariPembayaran() throws Exception {
        System.out.println("mencariIdPembayaranDariPembayaran");
        String idPasien = "";
        DokterService instance = new DokterServiceImpl();
        String expResult = "";
        String result = instance.mencariIdPembayaranDariPembayaran(idPasien);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPembayaranDariPembayaran method, of class DokterService.
     */
    @Test
    public void testGetPembayaranDariPembayaran() throws Exception {
        System.out.println("getPembayaranDariPembayaran");
        String idPembayaran = "";
        DokterService instance = new DokterServiceImpl();
        Pembayaran expResult = null;
        Pembayaran result = instance.getPembayaranDariPembayaran(idPembayaran);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePembayaranDariPembayaran method, of class DokterService.
     */
    @Test
    public void testUpdatePembayaranDariPembayaran() throws Exception {
        System.out.println("updatePembayaranDariPembayaran");
        Pembayaran pembayaran = null;
        String idRekam = "";
        int Harga = 0;
        DokterService instance = new DokterServiceImpl();
        instance.updatePembayaranDariPembayaran(pembayaran, idRekam, Harga);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAutoNumberDariPembayaran method, of class DokterService.
     */
    @Test
    public void testGetAutoNumberDariPembayaran() throws Exception {
        System.out.println("getAutoNumberDariPembayaran");
        DokterService instance = new DokterServiceImpl();
        String expResult = "";
        String result = instance.getAutoNumberDariPembayaran();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertPembayaranDariPembayaran method, of class DokterService.
     */
    @Test
    public void testInsertPembayaranDariPembayaran() throws Exception {
        System.out.println("insertPembayaranDariPembayaran");
        String idPembayaran = "";
        String idPasien = "";
        String idRekam = "";
        int Harga = 0;
        DokterService instance = new DokterServiceImpl();
        instance.insertPembayaranDariPembayaran(idPembayaran, idPasien, idRekam, Harga);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAutoNumberResep method, of class DokterService.
     */
    @Test
    public void testGetAutoNumberResep() throws Exception {
        System.out.println("getAutoNumberResep");
        DokterService instance = new DokterServiceImpl();
        String expResult = "";
        String result = instance.getAutoNumberResep();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAutoNumberDetailResep method, of class DokterService.
     */
    @Test
    public void testGetAutoNumberDetailResep() throws Exception {
        System.out.println("getAutoNumberDetailResep");
        DokterService instance = new DokterServiceImpl();
        String expResult = "";
        String result = instance.getAutoNumberDetailResep();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertDetailResep method, of class DokterService.
     */
    @Test
    public void testInsertDetailResep() throws Exception {
        System.out.println("insertDetailResep");
        Obat_detailResep detailResep = null;
        DokterService instance = new DokterServiceImpl();
        Obat_detailResep expResult = null;
        Obat_detailResep result = instance.insertDetailResep(detailResep);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateDetailResep method, of class DokterService.
     */
    @Test
    public void testUpdateDetailResep() throws Exception {
        System.out.println("updateDetailResep");
        Obat_detailResep detailResep = null;
        DokterService instance = new DokterServiceImpl();
        instance.updateDetailResep(detailResep);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteDetailResep method, of class DokterService.
     */
    @Test
    public void testDeleteDetailResep() throws Exception {
        System.out.println("deleteDetailResep");
        String No_Detail_Resep = "";
        DokterService instance = new DokterServiceImpl();
        instance.deleteDetailResep(No_Detail_Resep);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllDetailResepByIDResep method, of class DokterService.
     */
    @Test
    public void testGetAllDetailResepByIDResep() throws Exception {
        System.out.println("getAllDetailResepByIDResep");
        String ID_RESEP = "";
        DokterService instance = new DokterServiceImpl();
        List<Obat_detailResep> expResult = null;
        List<Obat_detailResep> result = instance.getAllDetailResepByIDResep(ID_RESEP);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertResep method, of class DokterService.
     */
    @Test
    public void testInsertResep() throws Exception {
        System.out.println("insertResep");
        Obat_resep resep = null;
        DokterService instance = new DokterServiceImpl();
        instance.insertResep(resep);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNamaObat method, of class DokterService.
     */
    @Test
    public void testGetNamaObat() throws Exception {
        System.out.println("getNamaObat");
        DokterService instance = new DokterServiceImpl();
        List expResult = null;
        List result = instance.getNamaObat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHargaObat method, of class DokterService.
     */
    @Test
    public void testGetHargaObat() throws Exception {
        System.out.println("getHargaObat");
        String namaObat = "";
        DokterService instance = new DokterServiceImpl();
        int expResult = 0;
        int result = instance.getHargaObat(namaObat);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIDObat method, of class DokterService.
     */
    @Test
    public void testGetIDObat() throws Exception {
        System.out.println("getIDObat");
        String namaObat = "";
        DokterService instance = new DokterServiceImpl();
        String expResult = "";
        String result = instance.getIDObat(namaObat);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateResep method, of class DokterService.
     */
    @Test
    public void testUpdateResep() throws Exception {
        System.out.println("updateResep");
        Obat_resep resep = null;
        String ID_RESEP = "";
        int TOTAL_HARGA = 0;
        DokterService instance = new DokterServiceImpl();
        instance.updateResep(resep, ID_RESEP, TOTAL_HARGA);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastIDRekamMedis method, of class DokterService.
     */
    @Test
    public void testGetLastIDRekamMedis() throws Exception {
        System.out.println("getLastIDRekamMedis");
        DokterService instance = new DokterServiceImpl();
        String expResult = "";
        String result = instance.getLastIDRekamMedis();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class DokterServiceImpl implements DokterService {

        public Rekam_Medis insertRekam_Medis(Rekam_Medis rekam_medis) throws RemoteException {
            return null;
        }

        public Tindakan_detailTindakan insertDetailTindakan(Tindakan_detailTindakan detail_tindakan) throws RemoteException {
            return null;
        }

        public Tindakan_detailTindakan getDetailTindakan(String No_Detail) throws RemoteException {
            return null;
        }

        public List<Tindakan_detailTindakan> getDetailTindakan() throws RemoteException {
            return null;
        }

        public void updateRekam_Medis(Rekam_Medis rekam_medis) throws RemoteException {
        }

        public void deleteRekam_Medis(String Id_Rekam) throws RemoteException {
        }

        public Rekam_Medis getRekam_Medis(String Id_Rekam) throws RemoteException {
            return null;
        }

        public List<Rekam_Medis> getRekam_Medis() throws RemoteException {
            return null;
        }

        public List getNamaDiagnosa() throws RemoteException {
            return null;
        }

        public String getIdDiagnosa(String namaDiagnosa) throws RemoteException {
            return "";
        }

        public String getRekamMedisbyID() throws RemoteException {
            return "";
        }

        public List getNamaTindakan() throws RemoteException {
            return null;
        }

        public String getIdTindakan(String namaTindakan) throws RemoteException {
            return "";
        }

        public List<Rekam_Medis> GetRekam_MedisbyPasien(String idpasien) throws RemoteException {
            return null;
        }

        public String getAutoNumberNoDetail() throws RemoteException {
            return "";
        }

        public String getAutoNumberIdRekam() throws RemoteException {
            return "";
        }

        public int getTarif(String nama_tindakan) throws RemoteException {
            return 0;
        }

        public String mencariIdPembayaranDariPembayaran(String idPasien) throws RemoteException {
            return "";
        }

        public Pembayaran getPembayaranDariPembayaran(String idPembayaran) throws RemoteException {
            return null;
        }

        public void updatePembayaranDariPembayaran(Pembayaran pembayaran, String idRekam, int Harga) throws RemoteException {
        }

        public String getAutoNumberDariPembayaran() throws RemoteException {
            return "";
        }

        public void insertPembayaranDariPembayaran(String idPembayaran, String idPasien, String idRekam, int Harga) throws RemoteException {
        }

        public String getAutoNumberResep() throws RemoteException {
            return "";
        }

        public String getAutoNumberDetailResep() throws RemoteException {
            return "";
        }

        public Obat_detailResep insertDetailResep(Obat_detailResep detailResep) throws RemoteException {
            return null;
        }

        public void updateDetailResep(Obat_detailResep detailResep) throws RemoteException {
        }

        public void deleteDetailResep(String No_Detail_Resep) throws RemoteException {
        }

        public List<Obat_detailResep> getAllDetailResepByIDResep(String ID_RESEP) throws RemoteException {
            return null;
        }

        public void insertResep(Obat_resep resep) throws RemoteException {
        }

        public List getNamaObat() throws RemoteException {
            return null;
        }

        public int getHargaObat(String namaObat) throws RemoteException {
            return 0;
        }

        public String getIDObat(String namaObat) throws RemoteException {
            return "";
        }

        public void updateResep(Obat_resep resep, String ID_RESEP, int TOTAL_HARGA) throws RemoteException {
        }

        public String getLastIDRekamMedis() throws RemoteException {
            return "";
        }
    }
    
}
