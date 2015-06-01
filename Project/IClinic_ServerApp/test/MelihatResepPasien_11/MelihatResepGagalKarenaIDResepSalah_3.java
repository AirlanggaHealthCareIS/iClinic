/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MelihatResepPasien_11;

import Database.Entity.Obat_detailResep;
import ServerApplication.Service.ApotekerServiceServer;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 *
 * @author RinduPW
 */
public class MelihatResepGagalKarenaIDResepSalah_3 {
   @Test
    public void testGetObat_detailResep_int() throws Exception {
        System.out.println("getObat_detailResep");
        String Id_Obat = "";
        ApotekerServiceServer instance = new ApotekerServiceServer();
        Obat_detailResep expResult = new Obat_detailResep();
        expResult.setNo_Detail_Resep("NDR0001");
        expResult.setId_Resep("R0002");
        expResult.setId_Obat("OBT0001");
        expResult.setTakaran("SATU SENDOK TEH");
        expResult.setPemakaian("SETELAH MAKAN");
        expResult.setJumlah(1);
        expResult.setKeterangan("TIDAK ADA");
        Obat_detailResep result = instance.getObat_detailResep(Id_Obat);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    } 
}
