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
 * @author Erin
 */




public class BerhasilMelihatPasienSelanjutnya implements Remote{

    
    public BerhasilMelihatPasienSelanjutnya() throws RemoteException{
        
    }
    
    
     @Test
    public void testGetPasienSelanjutnya() throws Exception {
        System.out.println("getPasienSelanjutnya");
        LabServiceServer instance = new LabServiceServer();
        Antrian expResult = null;
        Antrian result = instance.getPasienSelanjutnya();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPasienId method, of class LabServiceServer.
     */
    @Test
    public void testGetPasienId() throws Exception {
        System.out.println("getPasienId");
        String Id_Pasien = "";
        LabServiceServer instance = new LabServiceServer();
        Boolean expResult = null;
        Boolean result = instance.getPasienId(Id_Pasien);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNamaPasien method, of class LabServiceServer.
     */
    @Test
    public void testGetNamaPasien() throws Exception {
        System.out.println("getNamaPasien");
        String Id_Pasien = "P0001";
        LabServiceServer instance = new LabServiceServer();
        String expResult = "Agus";
        String result = instance.getNamaPasien(Id_Pasien);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateAntrian method, of class LabServiceServer.
     */
//    @Test
//    public void testUpdateAntrian() throws Exception {
//        System.out.println("updateAntrian");
//        Antrian antrian = null;
//        LabServiceServer instance = new LabServiceServer();
//        Boolean expResult = null;
//        Boolean result = instance.updateAntrian(antrian);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
//    } 
   
    
    