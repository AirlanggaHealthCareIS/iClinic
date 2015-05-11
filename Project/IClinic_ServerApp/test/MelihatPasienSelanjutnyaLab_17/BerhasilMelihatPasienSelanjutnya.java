/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MelihatPasienSelanjutnyaLab_17;

import Database.Entity.Antrian;
import ServerApplication.Service.LabServiceServer;
import java.rmi.Remote;
import java.rmi.RemoteException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 *
 * @author acer
 */
public class BerhasilMelihatPasienSelanjutnya implements Remote{
   
   LabServiceServer labServiceServer;

    public BerhasilMelihatPasienSelanjutnya() throws RemoteException {
        this.labServiceServer = new LabServiceServer();
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
        public void testMelihatPasienSelanjutnya() throws Exception {
        System.out.println("MelihatPasienSelanjutnya");
        
        labServiceServer = new LabServiceServer();
        String Id_Pasien = "P0001";
       // Date tanggal = new java.util.Date();
      
        
        Antrian instance = labServiceServer.ubahstatus(String id_Antrian);
        System.out.println(instance.getId_Antrian());
        System.out.println(instance.getId_Pasien());
        System.out.println(instance.getJenis_Antrian());
        System.out.println(instance.getKeterangan());
       
        
        Antrian expResult = new Antrian();
        
        expResult.getId_Pasien("P001");
        
        
        assertEquals(expResult.getId_Antrian(), instance.getId_Antrian());
        assertEquals(expResult.getId_Pasien(), instance.getId_Pasien());
        assertEquals(expResult.getJenis_Antrian(), instance.getJenis_Antrian());
        assertEquals(expResult.getKeterangan(), instance.getKeterangan());
       
    }
}

       
   

    
    

