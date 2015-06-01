package MemprosesPembayaranPasien_22;

import Database.Entity.Pembayaran;
import ServerApplication.Service.Bag_PembayaranServiceServer;
import ServerApplication.model.TableModelLog;
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
public class BerhasilMemprosesPembayaranPasiendenganDebit implements Remote {

    Bag_PembayaranServiceServer bag_PembayaranServiceServer;
    TableModelLog tableModelLog = new TableModelLog();

    public BerhasilMemprosesPembayaranPasiendenganDebit() throws RemoteException {
        this.bag_PembayaranServiceServer = new Bag_PembayaranServiceServer(tableModelLog);
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
        
        this.bag_PembayaranServiceServer = new Bag_PembayaranServiceServer(tableModelLog);
        String Id_Pembayaran = "BYR0002";
        String Status = "LUNAS DEBIT";
        
        String instance = bag_PembayaranServiceServer.updateStatusPembayaran(Id_Pembayaran, Status);
        System.out.println(instance);
        
        String expResult = "LUNAS DEBIT";
        
        assertEquals(expResult, instance);
    }

    /**
     * Test of getStatus method, of class Bag_PembayaranServiceServer.
     */
    @Test
    public void testGetStatus() throws Exception {
        System.out.println("getStatus");
        
        this.bag_PembayaranServiceServer = new Bag_PembayaranServiceServer(tableModelLog);
        String Id_Pembayaran = "BYR0002";
        
        String instance = bag_PembayaranServiceServer.getStatus(Id_Pembayaran);
        System.out.println(instance);
        
        String expResult = "LUNAS DEBIT";
        
        assertEquals(expResult, instance);
    }
}
