/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MelihatPasienSelanjutnyaLab_17;

import ServerApplication.Service.LabServiceServer;
import java.rmi.Remote;
import java.rmi.RemoteException;
import org.junit.Test;

/**
 *
 * @author acer
 */
public class GagalMelihatPasienSelanjutnya implements Remote {

    
    public GagalMelihatPasienSelanjutnya() throws RemoteException{
        
    }
    
    @Test
    public void testGetPasienId() throws Exception {
        System.out.println("getPasienId");
        String Id_Pasien = "Kosong";
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
        String Id_Pasien = "Kosong";
        LabServiceServer instance = new LabServiceServer();
        String expResult = "Kosong";
        String result = instance.getNamaPasien(Id_Pasien);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    private void assertEquals(Boolean expResult, Boolean result) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private void fail(String the_test_case_is_a_prototype) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private void assertEquals(String expResult, String result) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
