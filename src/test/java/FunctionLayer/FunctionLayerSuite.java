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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author simon
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({FunctionLayer.LoginSampleExceptionTest.class, FunctionLayer.UserTest.class, FunctionLayer.MaterialsTest.class, FunctionLayer.LogicFacadeTest.class, FunctionLayer.OrderTest.class, FunctionLayer.LineItemsTest.class, FunctionLayer.CalcTest.class})
public class FunctionLayerSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
