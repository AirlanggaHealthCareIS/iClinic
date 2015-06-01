package MengelolaDataTabelMaster_14;

import Database.Entity.Lab_tabelMaster;
import ServerApplication.Service.AdministratorServiceServer;
import java.rmi.Remote;
import java.rmi.RemoteException;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BerhasilMenambahkanDataDiTabelLayananLab implements Remote{
    AdministratorServiceServer adminServiceServer;
    
    public BerhasilMenambahkanDataDiTabelLayananLab() throws RemoteException{
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
    public void testGetAutoNumberLab() throws Exception {
        System.out.println("getAutoNumberLab");

        String expResult = "LAB0002";
        String result = adminServiceServer.getAutoNumberLab();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testInsertLab_tabelMaster() throws Exception {
        System.out.println("insertLab_tabelMaster");
        
        Lab_tabelMaster lab = new Lab_tabelMaster();
        lab.setId_Lab("LAB0002");
        lab.setJenis_Pemeriksaan("Cek Urine");
        lab.setHarga(100000);
        lab.setDeskripsi("");
        
        Lab_tabelMaster expResult = new Lab_tabelMaster();
        expResult.setId_Lab("LAB0002");
        expResult.setJenis_Pemeriksaan("Cek Urine");
        expResult.setHarga(100000);
        expResult.setDeskripsi("");
        
        Lab_tabelMaster result = adminServiceServer.insertLab_tabelMaster(lab);
        assertEquals(expResult.getId_Lab(), result.getId_Lab());
        assertEquals(expResult.getJenis_Pemeriksaan(), result.getJenis_Pemeriksaan());
        assertEquals(expResult.getHarga(), result.getHarga());
        assertEquals(expResult.getDeskripsi(), result.getDeskripsi());
    }
}
