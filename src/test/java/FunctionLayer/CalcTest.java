/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionLayer;

import java.util.ArrayList;
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
public class CalcTest {
    
    public CalcTest() {
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
    public void testCalcUnderSternbrædderForBag600AMOUNT() {
        System.out.println("calcUnderSternbr\u00e6dderForBag");
        int width = 600;
        Calc instance = new Calc();
        LineItems expResult = new LineItems(5);
        LineItems result = instance.calcUnderSternbrædderForBag(width);
        
        int a, b;
        a = expResult.getAmount();
        b=result.getAmount();
        
        assertEquals(a, b);
    }

   @Test
    public void testCalcUnderSternbrædderForBag400AMOUNT() {
        System.out.println("calcUnderSternbr\u00e6dderForBag");
        int width = 400;
        Calc instance = new Calc();
        LineItems expResult = new LineItems(3);
        LineItems result = instance.calcUnderSternbrædderForBag(width);
        
        int a, b;
        a = expResult.getAmount();
        b=result.getAmount();
        
        assertEquals(a, b);
    }
    
   @Test
    public void testCalcUnderSternbrædderForBag200AMOUNT() {
        System.out.println("calcUnderSternbr\u00e6dderForBag");
        int width = 200;
        Calc instance = new Calc();
        LineItems expResult = new LineItems(1);
        LineItems result = instance.calcUnderSternbrædderForBag(width);
        
        int a, b;
        a = expResult.getAmount();
        b=result.getAmount();
        
        assertEquals(a, b);
    }     
    


    
}
