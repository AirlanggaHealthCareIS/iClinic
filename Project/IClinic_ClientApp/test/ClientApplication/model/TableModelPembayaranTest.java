/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClientApplication.model;

import Database.Entity.Pembayaran;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus X455L
 */
public class TableModelPembayaranTest {
    
    public TableModelPembayaranTest() {
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
     * Test of get method, of class TableModelPembayaran.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int row = 0;
        TableModelPembayaran instance = new TableModelPembayaran();
        Pembayaran expResult = null;
        Pembayaran result = instance.get(row);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class TableModelPembayaran.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Pembayaran pembayaran = null;
        TableModelPembayaran instance = new TableModelPembayaran();
        instance.insert(pembayaran);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class TableModelPembayaran.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        int row = 0;
        Pembayaran pembayaran = null;
        TableModelPembayaran instance = new TableModelPembayaran();
        instance.update(row, pembayaran);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class TableModelPembayaran.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int row = 0;
        TableModelPembayaran instance = new TableModelPembayaran();
        instance.delete(row);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setData method, of class TableModelPembayaran.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        List<Pembayaran> list = null;
        TableModelPembayaran instance = new TableModelPembayaran();
        instance.setData(list);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColumnName method, of class TableModelPembayaran.
     */
    @Test
    public void testGetColumnName() {
        System.out.println("getColumnName");
        int column = 0;
        TableModelPembayaran instance = new TableModelPembayaran();
        String expResult = "";
        String result = instance.getColumnName(column);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRowCount method, of class TableModelPembayaran.
     */
    @Test
    public void testGetRowCount() {
        System.out.println("getRowCount");
        TableModelPembayaran instance = new TableModelPembayaran();
        int expResult = 0;
        int result = instance.getRowCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColumnCount method, of class TableModelPembayaran.
     */
    @Test
    public void testGetColumnCount() {
        System.out.println("getColumnCount");
        TableModelPembayaran instance = new TableModelPembayaran();
        int expResult = 0;
        int result = instance.getColumnCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValueAt method, of class TableModelPembayaran.
     */
    @Test
    public void testGetValueAt() {
        System.out.println("getValueAt");
        int rowIndex = 0;
        int columnIndex = 0;
        TableModelPembayaran instance = new TableModelPembayaran();
        Object expResult = null;
        Object result = instance.getValueAt(rowIndex, columnIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
