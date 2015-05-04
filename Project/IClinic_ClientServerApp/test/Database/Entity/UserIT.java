/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.Entity;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class UserIT {
    
    public UserIT() {
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

    /**
     * Test of getId_User method, of class User.
     */
    @Test
    public void testGetId_User() {
        System.out.println("getId_User");
        User instance = new User();
        String expResult = "";
        String result = instance.getId_User();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNama_User method, of class User.
     */
    @Test
    public void testGetNama_User() {
        System.out.println("getNama_User");
        User instance = new User();
        String expResult = "";
        String result = instance.getNama_User();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJabatan method, of class User.
     */
    @Test
    public void testGetJabatan() {
        System.out.println("getJabatan");
        User instance = new User();
        String expResult = "";
        String result = instance.getJabatan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsername method, of class User.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        User instance = new User();
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class User.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        User instance = new User();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_User method, of class User.
     */
    @Test
    public void testSetId_User() {
        System.out.println("setId_User");
        String Id_User = "";
        User instance = new User();
        instance.setId_User(Id_User);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNama_User method, of class User.
     */
    @Test
    public void testSetNama_User() {
        System.out.println("setNama_User");
        String Nama_User = "";
        User instance = new User();
        instance.setNama_User(Nama_User);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJabatan method, of class User.
     */
    @Test
    public void testSetJabatan() {
        System.out.println("setJabatan");
        String Jabatan = "";
        User instance = new User();
        instance.setJabatan(Jabatan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class User.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String Username = "";
        User instance = new User();
        instance.setUsername(Username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class User.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String Password = "";
        User instance = new User();
        instance.setPassword(Password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
