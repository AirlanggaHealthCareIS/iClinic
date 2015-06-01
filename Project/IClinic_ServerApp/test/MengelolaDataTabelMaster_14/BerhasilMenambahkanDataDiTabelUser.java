package MengelolaDataTabelMaster_14;

import Database.Entity.User;
import ServerApplication.Service.AdministratorServiceServer;
import java.rmi.Remote;
import java.rmi.RemoteException;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BerhasilMenambahkanDataDiTabelUser implements Remote{
    AdministratorServiceServer adminServiceServer;
    
    public BerhasilMenambahkanDataDiTabelUser() throws RemoteException{
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
    public void testGetAutoNumberUser() throws Exception {
        System.out.println("getAutoNumberUser");

        String expResult = "U0011";
        String result = adminServiceServer.getAutoNumberUser();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testInsertUser() throws Exception {
        System.out.println("insertUser");
        
        User user = new User();
        user.setId_User("U0011");
        user.setNama_User("Indra Kharisma");
        user.setJabatan("ADMINISTRATOR");
        user.setUsername("Indra");
        user.setPassword("Indra");
        
        User expResult = new User();
        expResult.setId_User("U0011");
        expResult.setNama_User("Indra Kharisma");
        expResult.setJabatan("ADMINISTRATOR");
        expResult.setUsername("Indra");
        expResult.setPassword("Indra");
        
        User result = adminServiceServer.insertUser(user);
        assertEquals(expResult.getId_User(), result.getId_User());
        assertEquals(expResult.getNama_User(), result.getNama_User());
        assertEquals(expResult.getJabatan(), result.getJabatan());
        assertEquals(expResult.getUsername(), result.getUsername());
        assertEquals(expResult.getPassword(), result.getPassword());
    }
}
