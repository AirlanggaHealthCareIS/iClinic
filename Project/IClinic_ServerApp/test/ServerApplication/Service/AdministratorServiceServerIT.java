/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServerApplication.Service;

import Database.Entity.Kecantikan_tabelMaster;
import Database.Entity.Lab_tabelMaster;
import Database.Entity.Obat_tabelMaster;
import Database.Entity.Penyakit_tabelMaster;
import Database.Entity.Tindakan_tabelMaster;
import Database.Entity.User;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class AdministratorServiceServerIT {
    
    public AdministratorServiceServerIT() {
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
     * Test of loginUser method, of class AdministratorServiceServer.
     */
    @Test
    public void testLoginUser() throws Exception {
        System.out.println("loginUser");
        String Username = "";
        String Password = "";
        AdministratorServiceServer instance = new AdministratorServiceServer();
        String expResult = "";
        String result = instance.loginUser(Username, Password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertUser method, of class AdministratorServiceServer.
     */
    @Test
    public void testInsertUser() throws Exception {
        System.out.println("insertUser");
        User user = null;
        AdministratorServiceServer instance = new AdministratorServiceServer();
        User expResult = null;
        User result = instance.insertUser(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateUser method, of class AdministratorServiceServer.
     */
    @Test
    public void testUpdateUser() throws Exception {
        System.out.println("updateUser");
        User user = null;
        AdministratorServiceServer instance = new AdministratorServiceServer();
        instance.updateUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteUser method, of class AdministratorServiceServer.
     */
    @Test
    public void testDeleteUser() throws Exception {
        System.out.println("deleteUser");
        String Id_User = "";
        AdministratorServiceServer instance = new AdministratorServiceServer();
        instance.deleteUser(Id_User);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUser method, of class AdministratorServiceServer.
     */
    @Test
    public void testGetUser_String() throws Exception {
        System.out.println("getUser");
        String Id_User = "";
        AdministratorServiceServer instance = new AdministratorServiceServer();
        User expResult = null;
        User result = instance.getUser(Id_User);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUser method, of class AdministratorServiceServer.
     */
    @Test
    public void testGetUser_0args() throws Exception {
        System.out.println("getUser");
        AdministratorServiceServer instance = new AdministratorServiceServer();
        List<User> expResult = null;
        List<User> result = instance.getUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAutoNumberUser method, of class AdministratorServiceServer.
     */
    @Test
    public void testGetAutoNumberUser() throws Exception {
        System.out.println("getAutoNumberUser");
        AdministratorServiceServer instance = new AdministratorServiceServer();
        String expResult = "";
        String result = instance.getAutoNumberUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertObat_tabelMaster method, of class AdministratorServiceServer.
     */
    @Test
    public void testInsertObat_tabelMaster() throws Exception {
        System.out.println("insertObat_tabelMaster");
        Obat_tabelMaster obat = null;
        AdministratorServiceServer instance = new AdministratorServiceServer();
        Obat_tabelMaster expResult = null;
        Obat_tabelMaster result = instance.insertObat_tabelMaster(obat);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateObat_tabelMaster method, of class AdministratorServiceServer.
     */
    @Test
    public void testUpdateObat_tabelMaster() throws Exception {
        System.out.println("updateObat_tabelMaster");
        Obat_tabelMaster obat = null;
        AdministratorServiceServer instance = new AdministratorServiceServer();
        instance.updateObat_tabelMaster(obat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteObat_tabelMaster method, of class AdministratorServiceServer.
     */
    @Test
    public void testDeleteObat_tabelMaster() throws Exception {
        System.out.println("deleteObat_tabelMaster");
        String Id_Obat = "";
        AdministratorServiceServer instance = new AdministratorServiceServer();
        instance.deleteObat_tabelMaster(Id_Obat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObat_tabelMaster method, of class AdministratorServiceServer.
     */
    @Test
    public void testGetObat_tabelMaster_String() throws Exception {
        System.out.println("getObat_tabelMaster");
        String Id_Obat = "";
        AdministratorServiceServer instance = new AdministratorServiceServer();
        Obat_tabelMaster expResult = null;
        Obat_tabelMaster result = instance.getObat_tabelMaster(Id_Obat);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObat_tabelMaster method, of class AdministratorServiceServer.
     */
    @Test
    public void testGetObat_tabelMaster_0args() throws Exception {
        System.out.println("getObat_tabelMaster");
        AdministratorServiceServer instance = new AdministratorServiceServer();
        List<Obat_tabelMaster> expResult = null;
        List<Obat_tabelMaster> result = instance.getObat_tabelMaster();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cekPemakaianObat method, of class AdministratorServiceServer.
     */
    @Test
    public void testCekPemakaianObat() throws Exception {
        System.out.println("cekPemakaianObat");
        String Id_Obat = "";
        AdministratorServiceServer instance = new AdministratorServiceServer();
        int expResult = 0;
        int result = instance.cekPemakaianObat(Id_Obat);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAutoNumberObat method, of class AdministratorServiceServer.
     */
    @Test
    public void testGetAutoNumberObat() throws Exception {
        System.out.println("getAutoNumberObat");
        AdministratorServiceServer instance = new AdministratorServiceServer();
        String expResult = "";
        String result = instance.getAutoNumberObat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertPenyakit_tabelMaster method, of class AdministratorServiceServer.
     */
    @Test
    public void testInsertPenyakit_tabelMaster() throws Exception {
        System.out.println("insertPenyakit_tabelMaster");
        Penyakit_tabelMaster penyakit = null;
        AdministratorServiceServer instance = new AdministratorServiceServer();
        Penyakit_tabelMaster expResult = null;
        Penyakit_tabelMaster result = instance.insertPenyakit_tabelMaster(penyakit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePenyakit_tabelMaster method, of class AdministratorServiceServer.
     */
    @Test
    public void testUpdatePenyakit_tabelMaster() throws Exception {
        System.out.println("updatePenyakit_tabelMaster");
        Penyakit_tabelMaster penyakit = null;
        AdministratorServiceServer instance = new AdministratorServiceServer();
        instance.updatePenyakit_tabelMaster(penyakit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletePenyakit_tabelMaster method, of class AdministratorServiceServer.
     */
    @Test
    public void testDeletePenyakit_tabelMaster() throws Exception {
        System.out.println("deletePenyakit_tabelMaster");
        String Id_Penyakit = "";
        AdministratorServiceServer instance = new AdministratorServiceServer();
        instance.deletePenyakit_tabelMaster(Id_Penyakit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPenyakit_tabelMaster method, of class AdministratorServiceServer.
     */
    @Test
    public void testGetPenyakit_tabelMaster_String() throws Exception {
        System.out.println("getPenyakit_tabelMaster");
        String Id_Penyakit = "";
        AdministratorServiceServer instance = new AdministratorServiceServer();
        Penyakit_tabelMaster expResult = null;
        Penyakit_tabelMaster result = instance.getPenyakit_tabelMaster(Id_Penyakit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPenyakit_tabelMaster method, of class AdministratorServiceServer.
     */
    @Test
    public void testGetPenyakit_tabelMaster_0args() throws Exception {
        System.out.println("getPenyakit_tabelMaster");
        AdministratorServiceServer instance = new AdministratorServiceServer();
        List<Penyakit_tabelMaster> expResult = null;
        List<Penyakit_tabelMaster> result = instance.getPenyakit_tabelMaster();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cekPemakaianPenyakit method, of class AdministratorServiceServer.
     */
    @Test
    public void testCekPemakaianPenyakit() throws Exception {
        System.out.println("cekPemakaianPenyakit");
        String Id_Penyakit = "";
        AdministratorServiceServer instance = new AdministratorServiceServer();
        int expResult = 0;
        int result = instance.cekPemakaianPenyakit(Id_Penyakit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAutoNumberPenyakit method, of class AdministratorServiceServer.
     */
    @Test
    public void testGetAutoNumberPenyakit() throws Exception {
        System.out.println("getAutoNumberPenyakit");
        AdministratorServiceServer instance = new AdministratorServiceServer();
        String expResult = "";
        String result = instance.getAutoNumberPenyakit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertTindakan_tabelMaster method, of class AdministratorServiceServer.
     */
    @Test
    public void testInsertTindakan_tabelMaster() throws Exception {
        System.out.println("insertTindakan_tabelMaster");
        Tindakan_tabelMaster tindakan = null;
        AdministratorServiceServer instance = new AdministratorServiceServer();
        Tindakan_tabelMaster expResult = null;
        Tindakan_tabelMaster result = instance.insertTindakan_tabelMaster(tindakan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateTindakan_tabelMaster method, of class AdministratorServiceServer.
     */
    @Test
    public void testUpdateTindakan_tabelMaster() throws Exception {
        System.out.println("updateTindakan_tabelMaster");
        Tindakan_tabelMaster tindakan = null;
        AdministratorServiceServer instance = new AdministratorServiceServer();
        instance.updateTindakan_tabelMaster(tindakan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteTindakan_tabelMaster method, of class AdministratorServiceServer.
     */
    @Test
    public void testDeleteTindakan_tabelMaster() throws Exception {
        System.out.println("deleteTindakan_tabelMaster");
        String Id_Tindakan = "";
        AdministratorServiceServer instance = new AdministratorServiceServer();
        instance.deleteTindakan_tabelMaster(Id_Tindakan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTindakan_tabelMaster method, of class AdministratorServiceServer.
     */
    @Test
    public void testGetTindakan_tabelMaster_String() throws Exception {
        System.out.println("getTindakan_tabelMaster");
        String Id_Tindakan = "";
        AdministratorServiceServer instance = new AdministratorServiceServer();
        Tindakan_tabelMaster expResult = null;
        Tindakan_tabelMaster result = instance.getTindakan_tabelMaster(Id_Tindakan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTindakan_tabelMaster method, of class AdministratorServiceServer.
     */
    @Test
    public void testGetTindakan_tabelMaster_0args() throws Exception {
        System.out.println("getTindakan_tabelMaster");
        AdministratorServiceServer instance = new AdministratorServiceServer();
        List<Tindakan_tabelMaster> expResult = null;
        List<Tindakan_tabelMaster> result = instance.getTindakan_tabelMaster();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cekPemakaianTindakan method, of class AdministratorServiceServer.
     */
    @Test
    public void testCekPemakaianTindakan() throws Exception {
        System.out.println("cekPemakaianTindakan");
        String Id_Tindakan = "";
        AdministratorServiceServer instance = new AdministratorServiceServer();
        int expResult = 0;
        int result = instance.cekPemakaianTindakan(Id_Tindakan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAutoNumberTindakan method, of class AdministratorServiceServer.
     */
    @Test
    public void testGetAutoNumberTindakan() throws Exception {
        System.out.println("getAutoNumberTindakan");
        AdministratorServiceServer instance = new AdministratorServiceServer();
        String expResult = "";
        String result = instance.getAutoNumberTindakan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertLab_tabelMaster method, of class AdministratorServiceServer.
     */
    @Test
    public void testInsertLab_tabelMaster() throws Exception {
        System.out.println("insertLab_tabelMaster");
        Lab_tabelMaster lab = null;
        AdministratorServiceServer instance = new AdministratorServiceServer();
        Lab_tabelMaster expResult = null;
        Lab_tabelMaster result = instance.insertLab_tabelMaster(lab);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateLab_tabelMaster method, of class AdministratorServiceServer.
     */
    @Test
    public void testUpdateLab_tabelMaster() throws Exception {
        System.out.println("updateLab_tabelMaster");
        Lab_tabelMaster lab = null;
        AdministratorServiceServer instance = new AdministratorServiceServer();
        instance.updateLab_tabelMaster(lab);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteLab_tabelMaster method, of class AdministratorServiceServer.
     */
    @Test
    public void testDeleteLab_tabelMaster() throws Exception {
        System.out.println("deleteLab_tabelMaster");
        String Id_Lab = "";
        AdministratorServiceServer instance = new AdministratorServiceServer();
        instance.deleteLab_tabelMaster(Id_Lab);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLab_tabelMaster method, of class AdministratorServiceServer.
     */
    @Test
    public void testGetLab_tabelMaster_String() throws Exception {
        System.out.println("getLab_tabelMaster");
        String Id_Lab = "";
        AdministratorServiceServer instance = new AdministratorServiceServer();
        Lab_tabelMaster expResult = null;
        Lab_tabelMaster result = instance.getLab_tabelMaster(Id_Lab);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLab_tabelMaster method, of class AdministratorServiceServer.
     */
    @Test
    public void testGetLab_tabelMaster_0args() throws Exception {
        System.out.println("getLab_tabelMaster");
        AdministratorServiceServer instance = new AdministratorServiceServer();
        List<Lab_tabelMaster> expResult = null;
        List<Lab_tabelMaster> result = instance.getLab_tabelMaster();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cekPemakaianLab method, of class AdministratorServiceServer.
     */
    @Test
    public void testCekPemakaianLab() throws Exception {
        System.out.println("cekPemakaianLab");
        String Id_Lab = "";
        AdministratorServiceServer instance = new AdministratorServiceServer();
        int expResult = 0;
        int result = instance.cekPemakaianLab(Id_Lab);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAutoNumberLab method, of class AdministratorServiceServer.
     */
    @Test
    public void testGetAutoNumberLab() throws Exception {
        System.out.println("getAutoNumberLab");
        AdministratorServiceServer instance = new AdministratorServiceServer();
        String expResult = "";
        String result = instance.getAutoNumberLab();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertKecantikan_tabelMaster method, of class AdministratorServiceServer.
     */
    @Test
    public void testInsertKecantikan_tabelMaster() throws Exception {
        System.out.println("insertKecantikan_tabelMaster");
        Kecantikan_tabelMaster kecantikan = null;
        AdministratorServiceServer instance = new AdministratorServiceServer();
        Kecantikan_tabelMaster expResult = null;
        Kecantikan_tabelMaster result = instance.insertKecantikan_tabelMaster(kecantikan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateKecantikan_tabelMaster method, of class AdministratorServiceServer.
     */
    @Test
    public void testUpdateKecantikan_tabelMaster() throws Exception {
        System.out.println("updateKecantikan_tabelMaster");
        Kecantikan_tabelMaster kecantikan = null;
        AdministratorServiceServer instance = new AdministratorServiceServer();
        instance.updateKecantikan_tabelMaster(kecantikan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteKecantikan_tabelMaster method, of class AdministratorServiceServer.
     */
    @Test
    public void testDeleteKecantikan_tabelMaster() throws Exception {
        System.out.println("deleteKecantikan_tabelMaster");
        String Id_Kecantikan = "";
        AdministratorServiceServer instance = new AdministratorServiceServer();
        instance.deleteKecantikan_tabelMaster(Id_Kecantikan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKecantikan_tabelMaster method, of class AdministratorServiceServer.
     */
    @Test
    public void testGetKecantikan_tabelMaster_String() throws Exception {
        System.out.println("getKecantikan_tabelMaster");
        String Id_Kecantikan = "";
        AdministratorServiceServer instance = new AdministratorServiceServer();
        Kecantikan_tabelMaster expResult = null;
        Kecantikan_tabelMaster result = instance.getKecantikan_tabelMaster(Id_Kecantikan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKecantikan_tabelMaster method, of class AdministratorServiceServer.
     */
    @Test
    public void testGetKecantikan_tabelMaster_0args() throws Exception {
        System.out.println("getKecantikan_tabelMaster");
        AdministratorServiceServer instance = new AdministratorServiceServer();
        List<Kecantikan_tabelMaster> expResult = null;
        List<Kecantikan_tabelMaster> result = instance.getKecantikan_tabelMaster();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cekPemakaianKecantikan method, of class AdministratorServiceServer.
     */
    @Test
    public void testCekPemakaianKecantikan() throws Exception {
        System.out.println("cekPemakaianKecantikan");
        String Id_Kecantikan = "";
        AdministratorServiceServer instance = new AdministratorServiceServer();
        int expResult = 0;
        int result = instance.cekPemakaianKecantikan(Id_Kecantikan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAutoNumberKecantikan method, of class AdministratorServiceServer.
     */
    @Test
    public void testGetAutoNumberKecantikan() throws Exception {
        System.out.println("getAutoNumberKecantikan");
        AdministratorServiceServer instance = new AdministratorServiceServer();
        String expResult = "";
        String result = instance.getAutoNumberKecantikan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
