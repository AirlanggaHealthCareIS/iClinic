package Login;

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

public class Berhasil implements Remote{
    Server server;
    
    public Berhasil() throws RemoteException{
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
        String Password = "Putri";
        AdministratorServiceServer instance = new AdministratorServiceServer();
        User expResult = new User();
        expResult.setId_User("U0001");
        expResult.setNama_User("Kusumaningtyas Aditya Putri");
        expResult.setJabatan("ADMINISTRATOR");
        
        assertEquals(expResult.getJabatan(), instance.loginUser(Username, Password));
    }
}
