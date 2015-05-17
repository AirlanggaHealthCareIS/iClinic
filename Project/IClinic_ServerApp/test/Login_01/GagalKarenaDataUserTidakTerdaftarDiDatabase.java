package Login_01;

import Database.Entity.User;
import ServerApplication.Server;
import ServerApplication.Service.AdministratorServiceServer;
import java.rmi.Remote;
import java.rmi.RemoteException;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GagalKarenaDataUserTidakTerdaftarDiDatabase implements Remote{
    Server server;
    
    public GagalKarenaDataUserTidakTerdaftarDiDatabase() throws RemoteException{
        server = new Server();
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
    public void testLoginUser() throws Exception {
        System.out.println("loginUser");
        String Username = "Putri";
        String Password = "Putri123";
        AdministratorServiceServer instance = new AdministratorServiceServer();
        User expResult = new User();
        expResult.setId_User("U0001");
        expResult.setNama_User("Kusumaningtyas Aditya Putri");
        expResult.setJabatan("ADMINISTRATOR");
        
        assertEquals("0", instance.loginUser(Username, Password));
    }
}
