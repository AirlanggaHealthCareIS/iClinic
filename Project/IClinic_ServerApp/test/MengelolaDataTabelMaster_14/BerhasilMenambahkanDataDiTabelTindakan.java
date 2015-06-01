package MengelolaDataTabelMaster_14;

import Database.Entity.Tindakan_tabelMaster;
import ServerApplication.Service.AdministratorServiceServer;
import java.rmi.Remote;
import java.rmi.RemoteException;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BerhasilMenambahkanDataDiTabelTindakan implements Remote{
    AdministratorServiceServer adminServiceServer;
    
    public BerhasilMenambahkanDataDiTabelTindakan() throws RemoteException{
        this.adminServiceServer = new AdministratorServiceServer();
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
    public void testGetAutoNumberTindakan() throws Exception {
        System.out.println("getAutoNumberTindakan");

        String expResult = "T0004";
        String result = adminServiceServer.getAutoNumberTindakan();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testInsertTindakan_tabelMaster() throws Exception {
        System.out.println("insertTindakan_tabelMaster");
        Tindakan_tabelMaster tindakan = new Tindakan_tabelMaster();
        tindakan.setId_Tindakan("T0004");
        tindakan.setNama_Tindakan("Injeksi");
        tindakan.setSpesialisasi("UMUM");
        tindakan.setTarif(10000);
        tindakan.setKeterangan("");
        
        Tindakan_tabelMaster expResult = new Tindakan_tabelMaster();
        expResult.setId_Tindakan("T0004");
        expResult.setNama_Tindakan("Injeksi");
        expResult.setSpesialisasi("UMUM");
        expResult.setTarif(10000);
        expResult.setKeterangan("");
        
        Tindakan_tabelMaster result = adminServiceServer.insertTindakan_tabelMaster(tindakan);
        assertEquals(expResult.getId_Tindakan(), result.getId_Tindakan());
        assertEquals(expResult.getNama_Tindakan(), result.getNama_Tindakan());
        assertEquals(expResult.getSpesialisasi(), result.getSpesialisasi());
        assertEquals(expResult.getTarif(), result.getTarif());
        assertEquals(expResult.getKeterangan(), result.getKeterangan());
    }
}
