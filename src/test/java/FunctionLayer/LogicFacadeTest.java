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
public class LogicFacadeTest {
    
    public LogicFacadeTest() {
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
    public void testLogin() throws Exception {
        System.out.println("login");
        String email = "";
        String password = "";
        User expResult = null;
        User result = LogicFacade.login(email, password);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCreateUser() throws Exception {
        System.out.println("createUser");
        String email = "";
        String password = "";
        User expResult = null;
        User result = LogicFacade.createUser(email, password);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetOrder() throws Exception {
        System.out.println("getOrder");
        int idOrder = 0;
        Order expResult = null;
        Order result = LogicFacade.getOrder(idOrder);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCreateOrder() throws Exception {
        System.out.println("createOrder");
        User user = null;
        int width = 0;
        int length = 0;
        int height = 0;
        boolean shed = false;
        boolean status = false;
        int expResult = 0;
        int result = LogicFacade.createOrder(user, width, length, height, shed, status);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
