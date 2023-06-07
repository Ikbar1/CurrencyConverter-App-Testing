/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import CurrencyConv.IdrConversion;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Azhar
 */
public class IdrConversionTest {
    
    public IdrConversionTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testIdrtoUSD(){
    System.out.println("Idr Conversion to USD");
    double amount = 6000000;
    IdrConversion instance = new IdrConversion();
    double expResult= 384;
    double usd = instance.IdrtoUSD(amount, amount);
    System.out.println("Amount of Money to convert is:"+ amount+ " Idr");
    System.out.println("The Converted Money is:"+ expResult +" USD");
    System.out.println("-----------------------------");
    assertEquals(expResult, usd, 0.0);
    }
    
    @Test
    public void testIdrtoPound(){
    System.out.println("Idr Conversion to Pound");
    double amount = 4000000;
    IdrConversion instance = new IdrConversion();
    double expResult= 220;
    double pound = instance.IdrtoPound(amount, amount);
    System.out.println("Amount of Money to convert is:"+ amount+ " Idr");
    System.out.println("The Converted Money is:"+ expResult +" Pound");
    System.out.println("-----------------------------");
    assertEquals(expResult, pound, 0.0);
    }
    
     @Test
    public void testIdrtoEuro(){
    System.out.println("Idr Conversion to Euro");
    double amount = 2000000;
    IdrConversion instance = new IdrConversion();
    double expResult= 126;
    double Euro = instance.IdrtoEuro(amount, amount);
    System.out.println("Amount of Money to convert is:"+ amount+ " Idr");
    System.out.println("The Converted Money is:"+ expResult +" Euro");
    System.out.println("-----------------------------");
    assertEquals(expResult, Euro, 0.0);
    }
    
    @Test
    public void testIdrtoAUD(){
    System.out.println("Idr Conversion to AUD");
    double amount = 9000000;
    IdrConversion instance = new IdrConversion();
    double expResult= 882;
    double aud = instance.IdrtoAUD(amount, amount);
    System.out.println("Amount of Money to convert is:"+ amount+ " Idr");
    System.out.println("The Converted Money is:"+ expResult +" Idr");
    System.out.println("-----------------------------");
    assertEquals(expResult, aud, 0.0);
    }
    
      @Test
    public void testIdrtoSgd(){
    System.out.println("Idr Conversion to Sgd");
    double amount = 8300000;
    IdrConversion instance = new IdrConversion();
    double expResult= 747;
    double Sgd = instance.IdrtoSgd(amount, amount);
    System.out.println("Amount of Money to convert is:"+ amount+ " Idr");
    System.out.println("The Converted Money is:"+ expResult +" Sgd");
    System.out.println("-----------------------------");
    assertEquals(expResult, Sgd, 0.0);
    }
}
