/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Memprosesdataantrianpasien_02;

import Database.Entity.Antrian;
import Database.Entity.Pasien;
import ServerApplication.Service.Bag_PendaftaranServiceServer;
import ServerApplication.model.TableModelLog;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author TOSHIBA
 */
public class Terkirim implements Remote{
    Bag_PendaftaranServiceServer bag_PendaftaranServiceServer;
    TableModelLog tableModelLog=new TableModelLog();
    public Terkirim() throws RemoteException {
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
    public void testGetAutoNumberAntrian() throws Exception {
        System.out.println("getAutoNumberAntrian");
        
        String expResult = "ANT0001";
        String result = bag_PendaftaranServiceServer.getAutoNumberAntrian();
        assertEquals(expResult, result);
    }
    @Test
    public void testInsertAntrian() throws Exception {
        System.out.println("insertAntrian");
        
        Antrian instance = new Antrian();
        instance.setId_Antrian("ANT0001");
        instance.setId_Pasien(null);
        instance.setJenis_Antrian("DOKTER UMUM");
        instance.setKeterangan("BELUM");
        
        Antrian expResult = new Antrian();
        expResult.setId_Antrian("ANT0001");
        expResult.setId_Pasien(null);
        expResult.setJenis_Antrian("DOKTER UMUM");
        expResult.setKeterangan("BELUM");
        
        
        Antrian result = bag_PendaftaranServiceServer.insertAntrian(instance);
        assertEquals(expResult.getId_Antrian(), result.getId_Antrian());
        assertEquals(expResult.getId_Pasien(), result.getId_Pasien());
        assertEquals(expResult.getJenis_Antrian(), result.getJenis_Antrian());
        assertEquals(expResult.getKeterangan(), result.getKeterangan());
        
    }
}
