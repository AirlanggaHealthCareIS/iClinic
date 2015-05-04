/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClientApplication.model;

import Database.Entity.Tindakan_detailTindakan;
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
public class TableModelTindakan_detailTindakanTest {
    
    public TableModelTindakan_detailTindakanTest() {
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
     * Test of get method, of class TableModelTindakan_detailTindakan.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int row = 0;
        TableModelTindakan_detailTindakan instance = new TableModelTindakan_detailTindakan();
        Tindakan_detailTindakan expResult = null;
        Tindakan_detailTindakan result = instance.get(row);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class TableModelTindakan_detailTindakan.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Tindakan_detailTindakan detail_tindakan = null;
        TableModelTindakan_detailTindakan instance = new TableModelTindakan_detailTindakan();
        instance.insert(detail_tindakan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class TableModelTindakan_detailTindakan.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        int row = 0;
        Tindakan_detailTindakan detail_tindakan = null;
        TableModelTindakan_detailTindakan instance = new TableModelTindakan_detailTindakan();
        instance.update(row, detail_tindakan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class TableModelTindakan_detailTindakan.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int row = 0;
        TableModelTindakan_detailTindakan instance = new TableModelTindakan_detailTindakan();
        instance.delete(row);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setData method, of class TableModelTindakan_detailTindakan.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        List<Tindakan_detailTindakan> list = null;
        TableModelTindakan_detailTindakan instance = new TableModelTindakan_detailTindakan();
        instance.setData(list);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColumnName method, of class TableModelTindakan_detailTindakan.
     */
    @Test
    public void testGetColumnName() {
        System.out.println("getColumnName");
        int column = 0;
        TableModelTindakan_detailTindakan instance = new TableModelTindakan_detailTindakan();
        String expResult = "";
        String result = instance.getColumnName(column);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRowCount method, of class TableModelTindakan_detailTindakan.
     */
    @Test
    public void testGetRowCount() {
        System.out.println("getRowCount");
        TableModelTindakan_detailTindakan instance = new TableModelTindakan_detailTindakan();
        int expResult = 0;
        int result = instance.getRowCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColumnCount method, of class TableModelTindakan_detailTindakan.
     */
    @Test
    public void testGetColumnCount() {
        System.out.println("getColumnCount");
        TableModelTindakan_detailTindakan instance = new TableModelTindakan_detailTindakan();
        int expResult = 0;
        int result = instance.getColumnCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValueAt method, of class TableModelTindakan_detailTindakan.
     */
    @Test
    public void testGetValueAt() {
        System.out.println("getValueAt");
        int rowIndex = 0;
        int columnIndex = 0;
        TableModelTindakan_detailTindakan instance = new TableModelTindakan_detailTindakan();
        Object expResult = null;
        Object result = instance.getValueAt(rowIndex, columnIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
