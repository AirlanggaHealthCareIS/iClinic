package MengisiResepPasien_07;

import Database.Entity.Obat_detailResep;
import Database.Entity.Obat_resep;
import ServerApplication.Service.DokterServiceServer;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DokterGagalMengisiResepKarenaPengisianFieldTidakLengkap implements Remote{
    DokterServiceServer dokterServiceServer;
    
    public DokterGagalMengisiResepKarenaPengisianFieldTidakLengkap() throws RemoteException{
        this.dokterServiceServer = new DokterServiceServer();
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
    public void testGetAutoNumberResep() throws Exception {
        System.out.println("getAutoNumberResep");
        
        String expResult = "RSP0004";
        String result = dokterServiceServer.getAutoNumberResep();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testInsertResep() throws Exception {
        System.out.println("insertResep");
        
        Obat_resep instance = new Obat_resep();
        instance.setId_Rekam("REK0001");
        instance.setId_Resep("RSP0003");
        instance.setTotal_Harga(0);
        
        Obat_resep expResult = new Obat_resep();
        expResult.setId_Rekam("REK0001");
        expResult.setId_Resep("RSP0003");
        expResult.setTotal_Harga(0);
                
        Obat_resep result = dokterServiceServer.insertResep(instance);
        assertEquals(expResult.getId_Rekam(), result.getId_Rekam());
        assertEquals(expResult.getId_Resep(), result.getId_Resep());
        assertEquals(expResult.getTotal_Harga(), result.getTotal_Harga());
    }

    @Test
    public void testGetAutoNumberDetailResep() throws Exception {
        System.out.println("getAutoNumberDetailResep");
        
        String expResult = "DR0001";
        String result = dokterServiceServer.getAutoNumberDetailResep();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testInsertDetailResep() throws Exception {
        System.out.println("insertDetailResep");
        
        Obat_detailResep instance = new Obat_detailResep();
        instance.setId_Resep("RSP0001");
        instance.setNo_Detail_Resep("DR0001");
        instance.setId_Obat("OBT0001");
        instance.setTakaran("3 kali sehari");
        instance.setJumlah(10);
        instance.setPemakaian("DIMINUM");
        instance.setKeterangan("");
        
        Obat_detailResep expResult = new Obat_detailResep();
        expResult.setId_Resep("RSP0001");
        expResult.setNo_Detail_Resep("DR0001");
        expResult.setId_Obat("OBT0001");
        expResult.setTakaran("3 kali sehari");
        expResult.setJumlah(10);
        expResult.setPemakaian("DIMINUM");
        expResult.setKeterangan("");
        
        Obat_detailResep result = dokterServiceServer.insertDetailResep(instance);
        assertEquals(expResult.getId_Resep(), result.getId_Resep());
        assertEquals(expResult.getNo_Detail_Resep(), result.getNo_Detail_Resep());
        assertEquals(expResult.getId_Obat(), result.getId_Obat());
        assertEquals(expResult.getTakaran(), result.getTakaran());
        assertEquals(expResult.getJumlah(), result.getJumlah());
        assertEquals(expResult.getPemakaian(), result.getPemakaian());
        assertEquals(expResult.getKeterangan(), result.getKeterangan());
    }

    @Test
    public void testGetAllDetailResepByIDResep() throws Exception {
        System.out.println("getAllDetailResepByIDResep");
        
        String ID_RESEP = "RSP0001";
        
        List<Obat_detailResep> expResult = null;
        List<Obat_detailResep> result = dokterServiceServer.getAllDetailResepByIDResep(ID_RESEP);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testUpdateResep() throws Exception {
        System.out.println("updateResep");
        
        Obat_resep resep = null;
        String ID_RESEP = "";
        int TOTAL_HARGA = 0;
        
        DokterServiceServer instance = new DokterServiceServer();
        instance.updateResep(resep, ID_RESEP, TOTAL_HARGA);
    }
}
