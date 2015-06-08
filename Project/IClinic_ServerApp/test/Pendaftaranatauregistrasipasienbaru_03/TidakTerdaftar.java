/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pendaftaranatauregistrasipasienbaru_03;

import Database.Entity.Pasien;
import ServerApplication.Service.Bag_PendaftaranServiceServer;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author TOSHIBA
 */
public class TidakTerdaftar implements Remote{
    Bag_PendaftaranServiceServer bag_PendaftaranServiceServer;
    public TidakTerdaftar() throws RemoteException {
        this.bag_PendaftaranServiceServer = new Bag_PendaftaranServiceServer();
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
    public void testGetAutoNumber() throws Exception {
        System.out.println("getAutoNumber");
        
        String expResult = "P0003";
        String result = bag_PendaftaranServiceServer.getAutoNumber();
        assertEquals(expResult, result);
    }
    @Test
    public void testInsertPasien() throws Exception {
        System.out.println("insertPasien");
        
        Pasien instance = new Pasien();
        instance.setId_Pasien(null);
        instance.setNo_Ktp("1234567890123456");
        instance.setNama_Pasien("Anang");
        instance.setAlamat("");
        instance.setTanggal_Lahir(new Date("may, 1 2015"));
        instance.setTanggal_Daftar(new Date("August, 25 1994"));
        instance.setUsia(Integer.parseInt("20"));
        instance.setNo_HP("085749912764");
        instance.setJenis_Kelamin("L");
        instance.setPilihan_Layanan("Dokter Umum");
        
        Pasien expResult = new Pasien();
        expResult.setId_Pasien(null);
        expResult.setNo_Ktp("1234567890123456");
        expResult.setNama_Pasien("Anang");
        expResult.setAlamat("");
        expResult.setTanggal_Lahir(new Date("may, 1 2015"));
        expResult.setTanggal_Daftar(new Date("August, 25 1994"));
        expResult.setUsia(Integer.parseInt("20"));
        expResult.setNo_HP("085749912764");
        expResult.setJenis_Kelamin("L");
        expResult.setPilihan_Layanan("Dokter Umum");
        
        bag_PendaftaranServiceServer.insertPasien(instance);
        assertEquals(expResult.getId_Pasien(), instance.getId_Pasien());
        assertEquals(expResult.getNo_Ktp(), instance.getNo_Ktp());
        assertEquals(expResult.getNama_Pasien(), instance.getNama_Pasien());
        assertEquals(expResult.getAlamat(), instance.getAlamat());
        assertEquals(expResult.getTanggal_lahir(), instance.getTanggal_lahir());
        assertEquals(expResult.getTanggal_lahir(), instance.getTanggal_lahir());
        assertEquals(expResult.getUsia(), instance.getUsia());
        assertEquals(expResult.getNo_HP(), instance.getNo_HP());
        assertEquals(expResult.getJenis_Kelamin(), instance.getJenis_Kelamin());
        assertEquals(expResult.getPilihan_Layanan(), instance.getPilihan_Layanan());
        
    }
}
