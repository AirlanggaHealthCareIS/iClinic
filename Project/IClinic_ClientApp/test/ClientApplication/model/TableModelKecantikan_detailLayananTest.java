/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClientApplication.model;

import Database.Entity.Kecantikan_detailLayanan;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Acer
 */
public class TableModelKecantikan_detailLayananTest {
    
    public TableModelKecantikan_detailLayananTest() {
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
     * Test of get method, of class TableModelKecantikan_detailLayanan.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int row = 0;
        TableModelKecantikan_detailLayanan instance = new TableModelKecantikan_detailLayanan();
        Kecantikan_detailLayanan expResult = null;
        Kecantikan_detailLayanan result = instance.get(row);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class TableModelKecantikan_detailLayanan.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Kecantikan_detailLayanan detail_layanan = null;
        TableModelKecantikan_detailLayanan instance = new TableModelKecantikan_detailLayanan();
        instance.insert(detail_layanan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class TableModelKecantikan_detailLayanan.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        int row = 0;
        Kecantikan_detailLayanan detail_layanan = null;
        TableModelKecantikan_detailLayanan instance = new TableModelKecantikan_detailLayanan();
        instance.update(row, detail_layanan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class TableModelKecantikan_detailLayanan.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int row = 0;
        TableModelKecantikan_detailLayanan instance = new TableModelKecantikan_detailLayanan();
        instance.delete(row);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setData method, of class TableModelKecantikan_detailLayanan.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        List<Kecantikan_detailLayanan> list = null;
        TableModelKecantikan_detailLayanan instance = new TableModelKecantikan_detailLayanan();
        instance.setData(list);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColumnName method, of class TableModelKecantikan_detailLayanan.
     */
    @Test
    public void testGetColumnName() {
        System.out.println("getColumnName");
        int column = 0;
        TableModelKecantikan_detailLayanan instance = new TableModelKecantikan_detailLayanan();
        String expResult = "";
        String result = instance.getColumnName(column);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRowCount method, of class TableModelKecantikan_detailLayanan.
     */
    @Test
    public void testGetRowCount() {
        System.out.println("getRowCount");
        TableModelKecantikan_detailLayanan instance = new TableModelKecantikan_detailLayanan();
        int expResult = 0;
        int result = instance.getRowCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColumnCount method, of class TableModelKecantikan_detailLayanan.
     */
    @Test
    public void testGetColumnCount() {
        System.out.println("getColumnCount");
        TableModelKecantikan_detailLayanan instance = new TableModelKecantikan_detailLayanan();
        int expResult = 0;
        int result = instance.getColumnCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValueAt method, of class TableModelKecantikan_detailLayanan.
     */
    @Test
    public void testGetValueAt() {
        System.out.println("getValueAt");
        int rowIndex = 0;
        int columnIndex = 0;
        TableModelKecantikan_detailLayanan instance = new TableModelKecantikan_detailLayanan();
        Object expResult = null;
        Object result = instance.getValueAt(rowIndex, columnIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
