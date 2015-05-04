/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClientApplication.model;

import Database.Entity.Lab_transaksiLab;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author acer
 */
public class TableModelLab_transaksiLabTest {
    
    public TableModelLab_transaksiLabTest() {
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
     * Test of get method, of class TableModelLab_transaksiLab.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int row = 0;
        TableModelLab_transaksiLab instance = new TableModelLab_transaksiLab();
        Lab_transaksiLab expResult = null;
        Lab_transaksiLab result = instance.get(row);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class TableModelLab_transaksiLab.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Lab_transaksiLab transaksi_Lab = null;
        TableModelLab_transaksiLab instance = new TableModelLab_transaksiLab();
        instance.insert(transaksi_Lab);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class TableModelLab_transaksiLab.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        int row = 0;
        Lab_transaksiLab transaksi_Lab = null;
        TableModelLab_transaksiLab instance = new TableModelLab_transaksiLab();
        instance.update(row, transaksi_Lab);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class TableModelLab_transaksiLab.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int row = 0;
        TableModelLab_transaksiLab instance = new TableModelLab_transaksiLab();
        instance.delete(row);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setData method, of class TableModelLab_transaksiLab.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        List<Lab_transaksiLab> list = null;
        TableModelLab_transaksiLab instance = new TableModelLab_transaksiLab();
        instance.setData(list);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColumnName method, of class TableModelLab_transaksiLab.
     */
    @Test
    public void testGetColumnName() {
        System.out.println("getColumnName");
        int column = 0;
        TableModelLab_transaksiLab instance = new TableModelLab_transaksiLab();
        String expResult = "";
        String result = instance.getColumnName(column);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRowCount method, of class TableModelLab_transaksiLab.
     */
    @Test
    public void testGetRowCount() {
        System.out.println("getRowCount");
        TableModelLab_transaksiLab instance = new TableModelLab_transaksiLab();
        int expResult = 0;
        int result = instance.getRowCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColumnCount method, of class TableModelLab_transaksiLab.
     */
    @Test
    public void testGetColumnCount() {
        System.out.println("getColumnCount");
        TableModelLab_transaksiLab instance = new TableModelLab_transaksiLab();
        int expResult = 0;
        int result = instance.getColumnCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValueAt method, of class TableModelLab_transaksiLab.
     */
    @Test
    public void testGetValueAt() {
        System.out.println("getValueAt");
        int rowIndex = 0;
        int columnIndex = 0;
        TableModelLab_transaksiLab instance = new TableModelLab_transaksiLab();
        Object expResult = null;
        Object result = instance.getValueAt(rowIndex, columnIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
