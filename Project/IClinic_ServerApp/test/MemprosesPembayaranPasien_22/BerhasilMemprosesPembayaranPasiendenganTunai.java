package MemprosesPembayaranPasien_22;

import Database.Entity.Pembayaran;
import ServerApplication.Service.Bag_PembayaranServiceServer;
import java.rmi.Remote;
import java.rmi.RemoteException;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Asus X455L
 */
public class BerhasilMemprosesPembayaranPasiendenganTunai implements Remote {

    Bag_PembayaranServiceServer bag_PembayaranServiceServer;

    public BerhasilMemprosesPembayaranPasiendenganTunai() throws RemoteException {
        this.bag_PembayaranServiceServer = new Bag_PembayaranServiceServer();
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
    public void testUpdateStatusPembayaran() throws Exception {
        System.out.println("updateStatusPembayaran");
        
        bag_PembayaranServiceServer = new Bag_PembayaranServiceServer();
        String Id_Pembayaran = "BYR0001";
        String Status = "LUNAS TUNAI";
        
        String instance = bag_PembayaranServiceServer.updateStatusPembayaran(Id_Pembayaran, Status);
        System.out.println(instance);
        
        String expResult = "LUNAS TUNAI";
        
        assertEquals(expResult, instance);
    }

    /**
     * Test of getStatus method, of class Bag_PembayaranServiceServer.
     */
    @Test
    public void testGetStatus() throws Exception {
        System.out.println("getStatus");
        
        bag_PembayaranServiceServer = new Bag_PembayaranServiceServer();
        String Id_Pembayaran = "BYR0001";
        
        String instance = bag_PembayaranServiceServer.getStatus(Id_Pembayaran);
        System.out.println(instance);
        
        String expResult = "LUNAS TUNAI";
        
        assertEquals(expResult, instance);
    }
}
