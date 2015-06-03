/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClientApplication.model;

import Database.Entity.Rekam_Medis;
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
public class TableModelRekam_MedisTest {
    
    public TableModelRekam_MedisTest() {
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
     * Test of get method, of class TableModelRekam_Medis.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int row = 0;
        TableModelRekam_Medis instance = new TableModelRekam_Medis();
        Rekam_Medis expResult = null;
        Rekam_Medis result = instance.get(row);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class TableModelRekam_Medis.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Rekam_Medis rekam_medis = null;
        TableModelRekam_Medis instance = new TableModelRekam_Medis();
        instance.insert(rekam_medis);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class TableModelRekam_Medis.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        int row = 0;
        Rekam_Medis rekam_medis = null;
        TableModelRekam_Medis instance = new TableModelRekam_Medis();
        instance.update(row, rekam_medis);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class TableModelRekam_Medis.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int row = 0;
        TableModelRekam_Medis instance = new TableModelRekam_Medis();
        instance.delete(row);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setData method, of class TableModelRekam_Medis.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        List<Rekam_Medis> list = null;
        TableModelRekam_Medis instance = new TableModelRekam_Medis();
        instance.setData(list);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColumnName method, of class TableModelRekam_Medis.
     */
    @Test
    public void testGetColumnName() {
        System.out.println("getColumnName");
        int column = 0;
        TableModelRekam_Medis instance = new TableModelRekam_Medis();
        String expResult = "";
        String result = instance.getColumnName(column);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRowCount method, of class TableModelRekam_Medis.
     */
    @Test
    public void testGetRowCount() {
        System.out.println("getRowCount");
        TableModelRekam_Medis instance = new TableModelRekam_Medis();
        int expResult = 0;
        int result = instance.getRowCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColumnCount method, of class TableModelRekam_Medis.
     */
    @Test
    public void testGetColumnCount() {
        System.out.println("getColumnCount");
        TableModelRekam_Medis instance = new TableModelRekam_Medis();
        int expResult = 0;
        int result = instance.getColumnCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValueAt method, of class TableModelRekam_Medis.
     */
    @Test
    public void testGetValueAt() {
        System.out.println("getValueAt");
        int rowIndex = 0;
        int columnIndex = 0;
        TableModelRekam_Medis instance = new TableModelRekam_Medis();
        Object expResult = null;
        Object result = instance.getValueAt(rowIndex, columnIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
