/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClientApplication.model;

import Database.Entity.Pasien;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Afifah
 */
public class TableModelPasienTest {
    
    public TableModelPasienTest() {
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
     * Test of get method, of class TableModelPasien.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int row = 0;
        TableModelPasien instance = new TableModelPasien();
        Pasien expResult = null;
        Pasien result = instance.get(row);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class TableModelPasien.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Pasien pasien = null;
        TableModelPasien instance = new TableModelPasien();
        instance.insert(pasien);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class TableModelPasien.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        int row = 0;
        Pasien pasien = null;
        TableModelPasien instance = new TableModelPasien();
        instance.update(row, pasien);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class TableModelPasien.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int row = 0;
        TableModelPasien instance = new TableModelPasien();
        instance.delete(row);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setData method, of class TableModelPasien.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        List<Pasien> list = null;
        TableModelPasien instance = new TableModelPasien();
        instance.setData(list);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColumnName method, of class TableModelPasien.
     */
    @Test
    public void testGetColumnName() {
        System.out.println("getColumnName");
        int column = 0;
        TableModelPasien instance = new TableModelPasien();
        String expResult = "";
        String result = instance.getColumnName(column);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRowCount method, of class TableModelPasien.
     */
    @Test
    public void testGetRowCount() {
        System.out.println("getRowCount");
        TableModelPasien instance = new TableModelPasien();
        int expResult = 0;
        int result = instance.getRowCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColumnCount method, of class TableModelPasien.
     */
    @Test
    public void testGetColumnCount() {
        System.out.println("getColumnCount");
        TableModelPasien instance = new TableModelPasien();
        int expResult = 0;
        int result = instance.getColumnCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValueAt method, of class TableModelPasien.
     */
    @Test
    public void testGetValueAt() {
        System.out.println("getValueAt");
        int rowIndex = 0;
        int columnIndex = 0;
        TableModelPasien instance = new TableModelPasien();
        Object expResult = null;
        Object result = instance.getValueAt(rowIndex, columnIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
