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
public class OrderTest {
    
    public OrderTest() {
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
    public void testIsStatus() {
        System.out.println("isStatus");
        Order instance = null;
        boolean expResult = false;
        boolean result = instance.isStatus();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        boolean Status = false;
        Order instance = null;
        instance.setStatus(Status);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetIDorder() {
        System.out.println("getIDorder");
        Order instance = null;
        int expResult = 0;
        int result = instance.getIDorder();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetIDorder() {
        System.out.println("setIDorder");
        int IDorder = 0;
        Order instance = null;
        instance.setIDorder(IDorder);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetWidth() {
        System.out.println("getWidth");
        Order instance = null;
        int expResult = 0;
        int result = instance.getWidth();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetWidth() {
        System.out.println("setWidth");
        int Width = 0;
        Order instance = null;
        instance.setWidth(Width);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetLength() {
        System.out.println("getLength");
        Order instance = null;
        int expResult = 0;
        int result = instance.getLength();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetLength() {
        System.out.println("setLength");
        int Length = 0;
        Order instance = null;
        instance.setLength(Length);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        Order instance = null;
        int expResult = 0;
        int result = instance.getHeight();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetHeight() {
        System.out.println("setHeight");
        int Height = 0;
        Order instance = null;
        instance.setHeight(Height);
        fail("The test case is a prototype.");
    }

    @Test
    public void testIsShed() {
        System.out.println("isShed");
        Order instance = null;
        boolean expResult = false;
        boolean result = instance.isShed();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetShed() {
        System.out.println("setShed");
        boolean Shed = false;
        Order instance = null;
        instance.setShed(Shed);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetId() {
        System.out.println("getId");
        Order instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Order instance = null;
        instance.setId(id);
        fail("The test case is a prototype.");
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Order instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
