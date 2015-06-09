/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MelihatResepPasien_11;

import Database.Entity.Obat_detailResep;
import ServerApplication.Service.ApotekerServiceServer;
import ServerApplication.model.TableModelLog;
import java.rmi.RemoteException;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author RinduPW
 */
public class MelihatResepGagalKarenaIDResepSalah_3 {
        ApotekerServiceServer apotekerServiceServer;
        TableModelLog tableModelLog = new TableModelLog();
        
public MelihatResepGagalKarenaIDResepSalah_3() throws RemoteException {
this.apotekerServiceServer = new ApotekerServiceServer(tableModelLog);
    }
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
   
    @Test
    public void testGetObat_detailResep_int() throws Exception {
        System.out.println("getObat_detailResep");
        String Id_Obat = "";
        ApotekerServiceServer instance = new ApotekerServiceServer(tableModelLog);
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
