package MengelolaDataTabelMaster_14;

import Database.Entity.Obat_tabelMaster;
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

public class BerhasilMenambahkanDataDiTabelObat implements Remote{
    AdministratorServiceServer adminServiceServer;
    TableModelLog tableModelLog = new TableModelLog();
    
    public BerhasilMenambahkanDataDiTabelObat() throws RemoteException{
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
    public void testGetAutoNumberObat() throws Exception {
        System.out.println("getAutoNumberObat");

        String expResult = "OBT0100";
        String result = adminServiceServer.getAutoNumberObat();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testInsertObat_tabelMaster() throws Exception {
        System.out.println("insertObat_tabelMaster");
        Obat_tabelMaster obat = new Obat_tabelMaster();
        obat.setId_Obat("OBT0100");
        obat.setNama_Obat("VIT C");
        obat.setJenis_Obat("Vitamin");
        obat.setHarga_Obat(5000);
        obat.setSatuan("TABLET");
        
        Obat_tabelMaster expResult = new Obat_tabelMaster();
        expResult.setId_Obat("OBT0100");
        expResult.setNama_Obat("VIT C");
        expResult.setJenis_Obat("Vitamin");
        expResult.setHarga_Obat(5000);
        expResult.setSatuan("TABLET");
        
        Obat_tabelMaster result = adminServiceServer.insertObat_tabelMaster(obat);
        assertEquals(expResult.getId_Obat(), result.getId_Obat());
        assertEquals(expResult.getNama_Obat(), result.getNama_Obat());
        assertEquals(expResult.getJenis_Obat(), result.getJenis_Obat());
        assertEquals(expResult.getHarga_Obat(), result.getHarga_Obat());
        assertEquals(expResult.getSatuan(), result.getSatuan());
    }
}
