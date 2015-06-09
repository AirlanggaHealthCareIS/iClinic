/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MelihatPasienSelanjutnyaLab_17;

import Database.Entity.Antrian;
import ServerApplication.Service.LabServiceServer;
import ServerApplication.model.TableModelLog;
import java.rmi.Remote;
import java.rmi.RemoteException;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author acer
 */
public class GagalMelihatPasienSelanjutnya implements Remote {
    LabServiceServer labServiceServer;
    TableModelLog tableModelLog = new TableModelLog();
    
    public GagalMelihatPasienSelanjutnya() throws RemoteException{
         this.labServiceServer = new LabServiceServer(tableModelLog);
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
    public void testGetPasienSelanjutnya() throws Exception {
        System.out.println("getPasienSelanjutnya");
        
        Antrian instance = new Antrian();
        instance.setId_Antrian("ANT0001");
        instance.setId_Pasien("P0001");
        instance.setJenis_Antrian("LABORATORIUM");
        instance.setKeterangan("BELUM");
        
        Antrian expResult = new Antrian();
        expResult.setId_Antrian("ANT0001");
        expResult.setId_Pasien("P0001");
        expResult.setJenis_Antrian("LABORATORIUM");
        expResult.setKeterangan("BELUM");
        
        Antrian result = labServiceServer.getPasienSelanjutnya();
        assertEquals(expResult.getId_Antrian(), result.getId_Antrian());
        assertEquals(expResult.getId_Pasien(), result.getId_Pasien());
        assertEquals(expResult.getJenis_Antrian(), result.getJenis_Antrian());
        assertEquals(expResult.getKeterangan(), result.getKeterangan());
    }

    /**
     * Test of getPasienId method, of class LabServiceServer.
     */
    @Test
    public void testGetPasienId() throws Exception {
        System.out.println("getPasienId");
        
        
    }

    /**
     * Test of getNamaPasien method, of class LabServiceServer.
     */
    @Test
    public void testGetNamaPasien() throws Exception {
        System.out.println("getNamaPasien");
        
    }

    }
