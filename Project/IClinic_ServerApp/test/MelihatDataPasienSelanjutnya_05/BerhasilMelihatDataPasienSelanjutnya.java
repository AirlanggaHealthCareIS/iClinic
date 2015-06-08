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
public class BerhasilMelihatDataPasienSelanjutnya {
    
     /**
     * Test of Id_pasien method, of class DokterServiceServer.
     */
    @Test
    public void testId_pasien() throws Exception {
        System.out.println("Id_pasien");
        Antrian antrian = new Antrian();
        antrian.setId_Antrian("A0001");
        antrian.setId_Pasien("P0001");
        antrian.setJenis_Antrian("DOKTER UMUM");
        antrian.setKeterangan("1");
        DokterServiceServer instance = new DokterServiceServer();
        assertEquals(antrian, instance.Id_pasien(antrian));
        // TODO review the generated test code and remove the default call to fail.
     }
    
    
    
    /**
     * Test of Nama_pasien method, of class okterServiceServer.
     */
    @Test
    public void testNama_pasien() throws Exception {
        System.out.println("Nama_pasien");
        String id_pasien = "P0001";
        DokterServiceServer instance = new DokterServiceServer();
        String expResult = "AGUS";
        String result = instance.Nama_pasien(id_pasien);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    
    
    /**
     * Test of updateAntrian method, of class DokterServiceServer.
     */
    @Test
    public void testUpdateAntrian() throws Exception {
        System.out.println("updateAntrian");
        String IDAntrianSaatIni = "A0001";
        DokterServiceServer instance = new DokterServiceServer();
        instance.updateAntrian(IDAntrianSaatIni);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
