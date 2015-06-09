/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PendaftarandanRegistrasiPasienLama;

import Database.Entity.Pasien;
import ServerApplication.Service.Bag_PendaftaranServiceServer;
import ServerApplication.model.TableModelLog;
import java.rmi.RemoteException;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Adam.Muhammad
 */
public class DataPasienLamaTidakTerdaftar {
    Bag_PendaftaranServiceServer bag_PendaftaranServiceServer;
    TableModelLog tableModelLog=new TableModelLog();
    public DataPasienLamaTidakTerdaftar() throws RemoteException {
        this.bag_PendaftaranServiceServer = new Bag_PendaftaranServiceServer(tableModelLog);
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
    public void testInsertPasien() throws Exception {
        System.out.println("insertPasien");
        Pasien pasien = null;
        String Id_Pasien = "P0001";
        Bag_PendaftaranServiceServer instance = new Bag_PendaftaranServiceServer(tableModelLog);
        Pasien expResult = new Pasien();
        expResult.setNo_Ktp("1234567890123456");
        expResult.setNama_Pasien("Anang");
        expResult.setAlamat("Surabaya");
        expResult.setTanggal_Lahir(new Date("may, 1 2015"));
        expResult.setTanggal_Daftar(new Date("August, 25 1994"));
        expResult.setUsia(Integer.parseInt("20"));
        expResult.setNo_HP("");
        expResult.setJenis_Kelamin("L");
        expResult.setPilihan_Layanan("Dokter Umum");
        instance.insertPasien(pasien);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}