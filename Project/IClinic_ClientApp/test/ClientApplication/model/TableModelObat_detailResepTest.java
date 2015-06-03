/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClientApplication.model;

import Database.Entity.Obat_detailResep;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RinduPW
 */
public class TableModelObat_detailResepTest {
    
    public TableModelObat_detailResepTest() {
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
     * Test of get method, of class TableModelObat_detailResep.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int row = 0;
        TableModelObat_detailResep instance = new TableModelObat_detailResep();
        Obat_detailResep expResult = null;
        Obat_detailResep result = instance.get(row);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class TableModelObat_detailResep.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Obat_detailResep detail_resep = null;
        TableModelObat_detailResep instance = new TableModelObat_detailResep();
        instance.insert(detail_resep);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class TableModelObat_detailResep.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        int row = 0;
        Obat_detailResep detail_resep = null;
        TableModelObat_detailResep instance = new TableModelObat_detailResep();
        instance.update(row, detail_resep);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class TableModelObat_detailResep.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int row = 0;
        TableModelObat_detailResep instance = new TableModelObat_detailResep();
        instance.delete(row);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setData method, of class TableModelObat_detailResep.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        List<Obat_detailResep> list = null;
        TableModelObat_detailResep instance = new TableModelObat_detailResep();
        instance.setData(list);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColumnName method, of class TableModelObat_detailResep.
     */
    @Test
    public void testGetColumnName() {
        System.out.println("getColumnName");
        int column = 0;
        TableModelObat_detailResep instance = new TableModelObat_detailResep();
        String expResult = "";
        String result = instance.getColumnName(column);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRowCount method, of class TableModelObat_detailResep.
     */
    @Test
    public void testGetRowCount() {
        System.out.println("getRowCount");
        TableModelObat_detailResep instance = new TableModelObat_detailResep();
        int expResult = 0;
        int result = instance.getRowCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColumnCount method, of class TableModelObat_detailResep.
     */
    @Test
    public void testGetColumnCount() {
        System.out.println("getColumnCount");
        TableModelObat_detailResep instance = new TableModelObat_detailResep();
        int expResult = 0;
        int result = instance.getColumnCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValueAt method, of class TableModelObat_detailResep.
     */
    @Test
    public void testGetValueAt() {
        System.out.println("getValueAt");
        int rowIndex = 0;
        int columnIndex = 0;
        TableModelObat_detailResep instance = new TableModelObat_detailResep();
        Object expResult = null;
        Object result = instance.getValueAt(rowIndex, columnIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}