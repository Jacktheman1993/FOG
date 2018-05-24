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
   
//mange af testene giver 1 ekstra item per udregning,  i forhold til hvad der står på FOGs stykliste.
    @Test
    public void testCalcUnderSternbrædderForBag() {
        System.out.println("calcUnderSternbr\u00e6dderForBag");
        int width = 600;
        Calc instance = new Calc();
        LineItems expResult = new LineItems(1, 5);
        LineItems result = instance.calcUnderSternbrædderForBag(width);
        assertEquals(expResult, result);
    }

    @Test
    public void testCalcUnderSternbrædderSide() {
        System.out.println("calcUnderSternbr\u00e6dderSide");
        int length = 780;
        Calc instance = new Calc();
        LineItems expResult = new LineItems(2, 4);
        LineItems result = instance.calcUnderSternbrædderSide(length);
        System.out.println( expResult + "  " + result);
        assertEquals(expResult, result);
    }
/*
    @Test
    public void testCalcOverSternbrædderForenden() {
        System.out.println("calcOverSternbr\u00e6dderForenden");
        int width = 600;
        Calc instance = new Calc();
        LineItems expResult = null;
        LineItems result = instance.calcOverSternbrædderForenden(width);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCalcOverSternbrædderSiderne() {
        System.out.println("calcOverSternbr\u00e6dderSiderne");
        int length = 780;
        Calc instance = new Calc();
        LineItems expResult = null;
        LineItems result = instance.calcOverSternbrædderSiderne(length);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCalcRemmeISider() {
        System.out.println("calcRemmeISider");
        int width = 600;
        Calc instance = new Calc();
        LineItems expResult = null;
        LineItems result = instance.calcRemmeISider(width);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCalcSpærMontPåRem() {
        System.out.println("calcSp\u00e6rMontP\u00e5Rem");
        int width = 600;
        Calc instance = new Calc();
        LineItems expResult = null;
        LineItems result = instance.calcSpærMontPåRem(width);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCalcStolper() {
        System.out.println("calcStolper");
        Calc instance = new Calc();
        LineItems expResult = null;
        LineItems result = instance.calcStolper();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCalcVandbrædtSternSider() {
        System.out.println("calcVandbr\u00e6dtSternSider");
        int length = 780;
        Calc instance = new Calc();
        LineItems expResult = null;
        LineItems result = instance.calcVandbrædtSternSider(length);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCalcVandbrædtSternForende() {
        System.out.println("calcVandbr\u00e6dtSternForende");
        int width = 600;
        Calc instance = new Calc();
        LineItems expResult = null;
        LineItems result = instance.calcVandbrædtSternForende(width);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCalcTagpladerMontPåSpær600() {
        System.out.println("calcTagpladerMontP\u00e5Sp\u00e6r600");
        int width = 600;
        Calc instance = new Calc();
        LineItems expResult = null;
        LineItems result = instance.calcTagpladerMontPåSpær600(width);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCalcTagpladerMontPåSpær360() {
        System.out.println("calcTagpladerMontP\u00e5Sp\u00e6r360");
        int width = 600;
        Calc instance = new Calc();
        LineItems expResult = null;
        LineItems result = instance.calcTagpladerMontPåSpær360(width);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCalcBundskruerPakke() {
        System.out.println("calcBundskruerPakke");
        int width = 600;
        int length = 780;
        Calc instance = new Calc();
        LineItems expResult = null;
        LineItems result = instance.calcBundskruerPakke(width, length);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCalcHulbånd() {
        System.out.println("calcHulb\u00e5nd");
        int length = 780;
        Calc instance = new Calc();
        LineItems expResult = null;
        LineItems result = instance.calcHulbånd(length);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCalcSpærpåRemUniversalHøjre() {
        System.out.println("calcSp\u00e6rp\u00e5RemUniversalH\u00f8jre");
        int width = 600;
        Calc instance = new Calc();
        LineItems expResult = null;
        LineItems result = instance.calcSpærpåRemUniversalHøjre(width);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCalcSpærpåRemUniversalVenstre() {
        System.out.println("calcSp\u00e6rp\u00e5RemUniversalVenstre");
        int width = 600;
        Calc instance = new Calc();
        LineItems expResult = null;
        LineItems result = instance.calcSpærpåRemUniversalVenstre(width);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCalc4dot5x60Skruer() {
        System.out.println("calc4dot5x60Skruer");
        int length = 780;
        Calc instance = new Calc();
        LineItems expResult = null;
        LineItems result = instance.calc4dot5x60Skruer(length);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCalc4x50BesSkruer() {
        System.out.println("calc4x50BesSkruer");
        int length = 780;
        Calc instance = new Calc();
        LineItems expResult = null;
        LineItems result = instance.calc4x50BesSkruer(length);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCalcBræddeBolt() {
        System.out.println("calcBr\u00e6ddeBolt");
        int length = 780;
        Calc instance = new Calc();
        LineItems expResult = null;
        LineItems result = instance.calcBræddeBolt(length);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCalcFirkantsskiver() {
        System.out.println("calcFirkantsskiver");
        int length = 780;
        Calc instance = new Calc();
        LineItems expResult = null;
        LineItems result = instance.calcFirkantsskiver(length);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCalc4dot5x70() {
        System.out.println("calc4dot5x70");
        int length = 780;
        Calc instance = new Calc();
        LineItems expResult = null;
        LineItems result = instance.calc4dot5x70(length);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCalc4dot5x50() {
        System.out.println("calc4dot5x50");
        int length = 780;
        Calc instance = new Calc();
        LineItems expResult = null;
        LineItems result = instance.calc4dot5x50(length);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCalcVinkelBeslag() {
        System.out.println("calcVinkelBeslag");
        int length = 780;
        Calc instance = new Calc();
        LineItems expResult = null;
        LineItems result = instance.calcVinkelBeslag(length);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCalcLægteBagsideDør() {
        System.out.println("calcL\u00e6gteBagsideD\u00f8r");
        Calc instance = new Calc();
        LineItems expResult = null;
        LineItems result = instance.calcLægteBagsideDør();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCalcLøsholtSkurSider() {
        System.out.println("calcL\u00f8sholtSkurSider");
        int width = 600;
        Calc instance = new Calc();
        LineItems expResult = null;
        LineItems result = instance.calcLøsholtSkurSider(width);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCalcStaldDørsGreb() {
        System.out.println("calcStaldD\u00f8rsGreb");
        Calc instance = new Calc();
        LineItems expResult = null;
        LineItems result = instance.calcStaldDørsGreb();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCalcHængsler() {
        System.out.println("calcH\u00e6ngsler");
        Calc instance = new Calc();
        LineItems expResult = null;
        LineItems result = instance.calcHængsler();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

  */  
}
