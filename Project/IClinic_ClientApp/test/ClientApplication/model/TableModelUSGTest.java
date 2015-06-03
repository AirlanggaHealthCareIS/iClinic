/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClientApplication.model;

import Database.Entity.USG;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author S550
 */
public class TableModelUSGTest {
    
    public TableModelUSGTest() {
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
     * Test of get method, of class TableModelUSG.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int row = 0;
        TableModelUSG instance = new TableModelUSG();
        USG expResult = null;
        USG result = instance.get(row);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class TableModelUSG.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        USG usg = null;
        TableModelUSG instance = new TableModelUSG();
        instance.insert(usg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class TableModelUSG.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        int row = 0;
        USG usg = null;
        TableModelUSG instance = new TableModelUSG();
        instance.update(row, usg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class TableModelUSG.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int row = 0;
        TableModelUSG instance = new TableModelUSG();
        instance.delete(row);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setData method, of class TableModelUSG.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        List<USG> list = null;
        TableModelUSG instance = new TableModelUSG();
        instance.setData(list);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColumnName method, of class TableModelUSG.
     */
    @Test
    public void testGetColumnName() {
        System.out.println("getColumnName");
        int column = 0;
        TableModelUSG instance = new TableModelUSG();
        String expResult = "";
        String result = instance.getColumnName(column);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRowCount method, of class TableModelUSG.
     */
    @Test
    public void testGetRowCount() {
        System.out.println("getRowCount");
        TableModelUSG instance = new TableModelUSG();
        int expResult = 0;
        int result = instance.getRowCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColumnCount method, of class TableModelUSG.
     */
    @Test
    public void testGetColumnCount() {
        System.out.println("getColumnCount");
        TableModelUSG instance = new TableModelUSG();
        int expResult = 0;
        int result = instance.getColumnCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValueAt method, of class TableModelUSG.
     */
    @Test
    public void testGetValueAt() {
        System.out.println("getValueAt");
        int rowIndex = 0;
        int columnIndex = 0;
        TableModelUSG instance = new TableModelUSG();
        Object expResult = null;
        Object result = instance.getValueAt(rowIndex, columnIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
