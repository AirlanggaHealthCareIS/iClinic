/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MelihatRekamMedisPasien;

import Database.Entity.Pasien;
import Database.Entity.Rekam_Medis;
import ServerApplication.Service.DokterServiceServer;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Ayundha
 */
public class BerhasilMelihatRekamMedisPasien {
    DokterServiceServer dokterServiceServer;

    public BerhasilMelihatRekamMedisPasien() throws RemoteException {
        this.dokterServiceServer = new DokterServiceServer();
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws RemoteException {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testMeihatRekamMedisPasien() throws Exception {
        System.out.println("MeihatRekamMedisPasien");
        
        dokterServiceServer = new DokterServiceServer();
        String idpasien = "P0001";
        List<Rekam_Medis> instance = dokterServiceServer.GetRekam_MedisbyPasien(idpasien);
        
        List<Rekam_Medis> expResult = new ArrayList();
        Rekam_Medis rm = new Rekam_Medis();
        rm.setId_Rekam("RM0001");
        rm.setId_Diagnosa("D001");
        rm.setId_Pasien("P0001");
        rm.setTgl_Rekam(java.sql.Date.valueOf("2015-05-11"));
        rm.setTinggi(123);
        rm.setBerat(123);
        rm.setTekanan_Darah(123);
        rm.setHasil_Pemerikasaan("qwe");
        rm.setAlergi("qwe");
        rm.setTotal_Harga(123);
        rm.setLayanan_Tambahan("qwe");
        expResult.add(rm);
        rm = new Rekam_Medis();
        rm.setId_Rekam("RM0002");
        rm.setId_Diagnosa("D002");
        rm.setId_Pasien("P0001");
        rm.setTgl_Rekam(java.sql.Date.valueOf("2015-05-11"));
        rm.setTinggi(123);
        rm.setBerat(123);
        rm.setTekanan_Darah(123);
        rm.setHasil_Pemerikasaan("qwe");
        rm.setAlergi("qwe");
        rm.setTotal_Harga(123);
        rm.setLayanan_Tambahan("qwe");
        expResult.add(rm);
        assertEquals(expResult.size(), instance.size());
        //assertEquals(expResult, instance);
    }
}
