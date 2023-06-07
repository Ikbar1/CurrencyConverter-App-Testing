/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import CurrencyConv.USDConversion;
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
public class USDConversionTest {
    
    public USDConversionTest() {
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
    public void testUSDtoAUD(){
    System.out.println("USD Conversion to AUD");
    double amount = 1400;
    USDConversion instance = new USDConversion();
    double expResult= 2142;
    double aud = instance.USDtoAUD(amount, amount);
    System.out.println("Amount of Money to convert is:"+ amount+ " USD");
    System.out.println("The Converted Money is:"+ expResult +" AUD");
    System.out.println("-----------------------------");
    assertEquals(expResult, aud, 0.0);
    }
    
    @Test
    public void testUSDtoPound(){
    System.out.println("USD Conversion to Pound");
    double amount = 8300;
    USDConversion instance = new USDConversion();
    double expResult= 7138;
    double pound = instance.USDtoPound(amount, amount);
    System.out.println("Amount of Money to convert is:"+ amount+ " USD");
    System.out.println("The Converted Money is:"+ expResult +" Pound");
    System.out.println("-----------------------------");
    assertEquals(expResult, pound, 0.0);
    }
    
     @Test
    public void testUSDtoEuro(){
    System.out.println("USD Conversion to Euro");
    double amount = 7200;
    USDConversion instance = new USDConversion();
    double expResult= 7128;
    double Euro = instance.USDtoEuro(amount, amount);
    System.out.println("Amount of Money to convert is:"+ amount+ " USD");
    System.out.println("The Converted Money is:"+ expResult +" Euro");
    System.out.println("-----------------------------");
    assertEquals(expResult, Euro, 0.0);
    }
    
    @Test
    public void testUSDtoIdr(){
    System.out.println("USD Conversion to Idr");
    double amount = 200;
    USDConversion instance = new USDConversion();
    double expResult= 3119270;
    double Idr = instance.USDtoIdr(amount, amount);
    System.out.println("Amount of Money to convert is:"+ amount+ " USD");
    System.out.println("The Converted Money is:"+ expResult +" Idr");
    System.out.println("-----------------------------");
    assertEquals(expResult, Idr, 0.0);
    }
    
      @Test
    public void testUSDtoSgd(){
    System.out.println("USD Conversion to Sgd");
    double amount = 850;
    USDConversion instance = new USDConversion();
    double expResult= 1190;
    double Sgd = instance.USDtoSgd(amount, amount);
    System.out.println("Amount of Money to convert is:"+ amount+ " USD");
    System.out.println("The Converted Money is:"+ expResult +" Sgd");
    System.out.println("-----------------------------");
    assertEquals(expResult, Sgd, 0.0);
    }
}
