/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionLayer;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author simon
 */
public class MaterialsTest {
    
    public MaterialsTest() {
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

    @Test
    public void testGetMaterialsID() {
        System.out.println("getMaterialsID");
        Materials instance = null;
        int expResult = 0;
        int result = instance.getMaterialsID();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMaterialsID() {
        System.out.println("setMaterialsID");
        int MaterialsID = 0;
        Materials instance = null;
        instance.setMaterialsID(MaterialsID);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetName() {
        System.out.println("getName");
        Materials instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetName() {
        System.out.println("setName");
        String Name = "";
        Materials instance = null;
        instance.setName(Name);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetLength() {
        System.out.println("getLength");
        Materials instance = null;
        int expResult = 0;
        int result = instance.getLength();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetLength() {
        System.out.println("setLength");
        int Length = 0;
        Materials instance = null;
        instance.setLength(Length);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetStock() {
        System.out.println("getStock");
        Materials instance = null;
        int expResult = 0;
        int result = instance.getStock();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetStock() {
        System.out.println("setStock");
        int Stock = 0;
        Materials instance = null;
        instance.setStock(Stock);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Materials instance = null;
        int expResult = 0;
        int result = instance.getPrice();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        int Price = 0;
        Materials instance = null;
        instance.setPrice(Price);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetDesp() {
        System.out.println("getDesp");
        Materials instance = null;
        String expResult = "";
        String result = instance.getDesp();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetDesp() {
        System.out.println("setDesp");
        String Description = "";
        Materials instance = null;
        instance.setDesp(Description);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetName_T() {
        System.out.println("getName_T");
        Materials instance = null;
        String expResult = "";
        String result = instance.getName_T();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetName_T() {
        System.out.println("setName_T");
        String Name_T = "";
        Materials instance = null;
        instance.setName_T(Name_T);
        fail("The test case is a prototype.");
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Materials instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
