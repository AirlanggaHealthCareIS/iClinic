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
public class MelihatResepBerhasil_1 {
    ApotekerServiceServer apotekerServiceServer;
    TableModelLog tableModelLog = new TableModelLog();

    public MelihatResepBerhasil_1() throws RemoteException {
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
        System.out.println("mencocokan_IdResep");
        
        apotekerServiceServer = new ApotekerServiceServer(tableModelLog);
        String Id_Resep = "R0001";
        
        String instance = apotekerServiceServer.mencocokan_IdResep(Id_Resep);
        System.out.println(instance);
        
        String expResult = "Resep Ada";
        
        assertEquals(expResult, instance);
    }

}
