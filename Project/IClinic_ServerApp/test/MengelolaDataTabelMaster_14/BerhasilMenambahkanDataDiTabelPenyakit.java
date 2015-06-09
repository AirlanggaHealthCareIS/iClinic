package MengelolaDataTabelMaster_14;

import Database.Entity.Penyakit_tabelMaster;
import ServerApplication.Service.AdministratorServiceServer;
import ServerApplication.model.TableModelLog;
import java.rmi.Remote;
import java.rmi.RemoteException;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BerhasilMenambahkanDataDiTabelPenyakit implements Remote{
    AdministratorServiceServer adminServiceServer;
    TableModelLog tableModelLog = new TableModelLog();
    
    public BerhasilMenambahkanDataDiTabelPenyakit() throws RemoteException{
        this.adminServiceServer = new AdministratorServiceServer(tableModelLog);
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
    public void testGetAutoNumberPenyakit() throws Exception {
        System.out.println("getAutoNumberPenyakit");

        String expResult = "P0030";
        String result = adminServiceServer.getAutoNumberPenyakit();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testInsertPenyakit_tabelMaster() throws Exception {
        System.out.println("insertPenyakit_tabelMaster");
        Penyakit_tabelMaster penyakit = new Penyakit_tabelMaster();
        penyakit.setId_Penyakit("P0030");
        penyakit.setPenyakit("Kanker");
        penyakit.setGejala("Banyak");
        
        Penyakit_tabelMaster expResult = new Penyakit_tabelMaster();
        expResult.setId_Penyakit("P0030");
        expResult.setPenyakit("Kanker");
        expResult.setGejala("Banyak");
        
        Penyakit_tabelMaster result = adminServiceServer.insertPenyakit_tabelMaster(penyakit);
        assertEquals(expResult.getId_Penyakit(), result.getId_Penyakit());
        assertEquals(expResult.getPenyakit(), result.getPenyakit());
        assertEquals(expResult.getGejala(), result.getGejala());
    }
}
