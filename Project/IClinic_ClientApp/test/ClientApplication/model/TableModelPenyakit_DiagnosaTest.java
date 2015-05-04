/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClientApplication.model;

import Database.Entity.Penyakit_diagnosa;
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
public class TableModelPenyakit_DiagnosaTest {
    
    public TableModelPenyakit_DiagnosaTest() {
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
     * Test of get method, of class TableModelPenyakit_Diagnosa.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int row = 0;
        TableModelPenyakit_Diagnosa instance = new TableModelPenyakit_Diagnosa();
        Penyakit_diagnosa expResult = null;
        Penyakit_diagnosa result = instance.get(row);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class TableModelPenyakit_Diagnosa.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Penyakit_diagnosa diagnosa = null;
        TableModelPenyakit_Diagnosa instance = new TableModelPenyakit_Diagnosa();
        instance.insert(diagnosa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class TableModelPenyakit_Diagnosa.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        int row = 0;
        Penyakit_diagnosa diagnosa = null;
        TableModelPenyakit_Diagnosa instance = new TableModelPenyakit_Diagnosa();
        instance.update(row, diagnosa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class TableModelPenyakit_Diagnosa.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int row = 0;
        TableModelPenyakit_Diagnosa instance = new TableModelPenyakit_Diagnosa();
        instance.delete(row);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setData method, of class TableModelPenyakit_Diagnosa.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        List<Penyakit_diagnosa> list = null;
        TableModelPenyakit_Diagnosa instance = new TableModelPenyakit_Diagnosa();
        instance.setData(list);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColumnName method, of class TableModelPenyakit_Diagnosa.
     */
    @Test
    public void testGetColumnName() {
        System.out.println("getColumnName");
        int column = 0;
        TableModelPenyakit_Diagnosa instance = new TableModelPenyakit_Diagnosa();
        String expResult = "";
        String result = instance.getColumnName(column);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRowCount method, of class TableModelPenyakit_Diagnosa.
     */
    @Test
    public void testGetRowCount() {
        System.out.println("getRowCount");
        TableModelPenyakit_Diagnosa instance = new TableModelPenyakit_Diagnosa();
        int expResult = 0;
        int result = instance.getRowCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColumnCount method, of class TableModelPenyakit_Diagnosa.
     */
    @Test
    public void testGetColumnCount() {
        System.out.println("getColumnCount");
        TableModelPenyakit_Diagnosa instance = new TableModelPenyakit_Diagnosa();
        int expResult = 0;
        int result = instance.getColumnCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValueAt method, of class TableModelPenyakit_Diagnosa.
     */
    @Test
    public void testGetValueAt() {
        System.out.println("getValueAt");
        int rowIndex = 0;
        int columnIndex = 0;
        TableModelPenyakit_Diagnosa instance = new TableModelPenyakit_Diagnosa();
        Object expResult = null;
        Object result = instance.getValueAt(rowIndex, columnIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
