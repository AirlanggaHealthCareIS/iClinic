package MengelolaDataTabelMaster_14;

import Database.Entity.Kecantikan_tabelMaster;
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

public class BerhasilMenambahkanDataDiTabelLayananKecantikan implements Remote{
    AdministratorServiceServer adminServiceServer;
    TableModelLog tableModelLog = new TableModelLog();
    
    public BerhasilMenambahkanDataDiTabelLayananKecantikan() throws RemoteException{
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
    public void testGetAutoNumberKecantikan() throws Exception {
        System.out.println("getAutoNumberKecantikan");

        String expResult = "K0003";
        String result = adminServiceServer.getAutoNumberKecantikan();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testInsertKecantikan_tabelMaster() throws Exception {
        System.out.println("insertKecantikan_tabelMaster");
        
        Kecantikan_tabelMaster cantik = new Kecantikan_tabelMaster();
        cantik.setId_Kecantikan("K0003");
        cantik.setJenis_Layanan("SLIMMING");
        cantik.setTarif(1500000);
        cantik.setDeskripsi("");
        
        Kecantikan_tabelMaster expResult = new Kecantikan_tabelMaster();
        expResult.setId_Kecantikan("K0003");
        expResult.setJenis_Layanan("SLIMMING");
        expResult.setTarif(1500000);
        expResult.setDeskripsi("");
        
        Kecantikan_tabelMaster result = adminServiceServer.insertKecantikan_tabelMaster(cantik);
        assertEquals(expResult.getId_Kecantikan(), result.getId_Kecantikan());
        assertEquals(expResult.getJenis_Layanan(), result.getJenis_Layanan());
        assertEquals(expResult.getTarif(), result.getTarif());
        assertEquals(expResult.getDeskripsi(), result.getDeskripsi());
    }
}
