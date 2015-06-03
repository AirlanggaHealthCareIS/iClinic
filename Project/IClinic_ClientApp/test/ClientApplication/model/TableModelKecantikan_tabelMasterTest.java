/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClientApplication.model;

import Database.Entity.Kecantikan_tabelMaster;
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
public class TableModelKecantikan_tabelMasterTest {
    
    public TableModelKecantikan_tabelMasterTest() {
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
     * Test of get method, of class TableModelKecantikan_tabelMaster.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int row = 0;
        TableModelKecantikan_tabelMaster instance = new TableModelKecantikan_tabelMaster();
        Kecantikan_tabelMaster expResult = null;
        Kecantikan_tabelMaster result = instance.get(row);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class TableModelKecantikan_tabelMaster.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Kecantikan_tabelMaster kecantikan = null;
        TableModelKecantikan_tabelMaster instance = new TableModelKecantikan_tabelMaster();
        instance.insert(kecantikan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class TableModelKecantikan_tabelMaster.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        int row = 0;
        Kecantikan_tabelMaster kecantikan = null;
        TableModelKecantikan_tabelMaster instance = new TableModelKecantikan_tabelMaster();
        instance.update(row, kecantikan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class TableModelKecantikan_tabelMaster.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int row = 0;
        TableModelKecantikan_tabelMaster instance = new TableModelKecantikan_tabelMaster();
        instance.delete(row);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setData method, of class TableModelKecantikan_tabelMaster.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        List<Kecantikan_tabelMaster> list = null;
        TableModelKecantikan_tabelMaster instance = new TableModelKecantikan_tabelMaster();
        instance.setData(list);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColumnName method, of class TableModelKecantikan_tabelMaster.
     */
    @Test
    public void testGetColumnName() {
        System.out.println("getColumnName");
        int column = 0;
        TableModelKecantikan_tabelMaster instance = new TableModelKecantikan_tabelMaster();
        String expResult = "";
        String result = instance.getColumnName(column);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRowCount method, of class TableModelKecantikan_tabelMaster.
     */
    @Test
    public void testGetRowCount() {
        System.out.println("getRowCount");
        TableModelKecantikan_tabelMaster instance = new TableModelKecantikan_tabelMaster();
        int expResult = 0;
        int result = instance.getRowCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColumnCount method, of class TableModelKecantikan_tabelMaster.
     */
    @Test
    public void testGetColumnCount() {
        System.out.println("getColumnCount");
        TableModelKecantikan_tabelMaster instance = new TableModelKecantikan_tabelMaster();
        int expResult = 0;
        int result = instance.getColumnCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValueAt method, of class TableModelKecantikan_tabelMaster.
     */
    @Test
    public void testGetValueAt() {
        System.out.println("getValueAt");
        int rowIndex = 0;
        int columnIndex = 0;
        TableModelKecantikan_tabelMaster instance = new TableModelKecantikan_tabelMaster();
        Object expResult = null;
        Object result = instance.getValueAt(rowIndex, columnIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
