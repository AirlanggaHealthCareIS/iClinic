/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MelihatDataPasienSelanjutnya_05;

import Database.Entity.Antrian;
import ServerApplication.Service.DokterServiceServer;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
/**
 *
 * @author Arlin
 */
public class GagalMelihatDataPasienSelanjutnya {
    
    
    /**
     * Test of Id_pasien method, of class USGServiceServer.
     */
    @Test
    public void testId_pasien() throws Exception {
        System.out.println("Id_pasien");
        Antrian antrian = new Antrian();
        antrian.setId_Antrian("kosong");
        DokterServiceServer instance = new DokterServiceServer();
        Antrian expResult = antrian;
        Antrian result = new Antrian();
        result = instance.Id_pasien(antrian);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
}
