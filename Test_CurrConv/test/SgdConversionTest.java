/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import CurrencyConv.SgdConversion;
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
public class SgdConversionTest {
    
    public SgdConversionTest() {
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
    public void testSgdtoUSD(){
    System.out.println("Sgd Conversion to USD");
    double amount = 7500;
    SgdConversion instance = new SgdConversion();
    double expResult= 5400;
    double usd = instance.SgdtoUSD(amount, amount);
    System.out.println("Amount of Money to convert is:"+ amount+ " Sgd");
    System.out.println("The Converted Money is:"+ expResult +" USD");
    System.out.println("-----------------------------");
    assertEquals(expResult, usd, 0.0);
    }
    
    @Test
    public void testSgdtoPound(){
    System.out.println("Sgd Conversion to Pound");
    double amount = 8300;
    SgdConversion instance = new SgdConversion();
    double expResult= 5146;
    double pound = instance.SgdtoPound(amount, amount);
    System.out.println("Amount of Money to convert is:"+ amount+ " Sgd");
    System.out.println("The Converted Money is:"+ expResult +" Pound");
    System.out.println("-----------------------------");
    assertEquals(expResult, pound, 0.0);
    }
    
     @Test
    public void testSgdtoEuro(){
    System.out.println("Sgd Conversion to Euro");
    double amount = 4200;
    SgdConversion instance = new SgdConversion();
    double expResult= 2982;
    double Euro = instance.SgdtoEuro(amount, amount);
    System.out.println("Amount of Money to convert is:"+ amount+ " Sgd");
    System.out.println("The Converted Money is:"+ expResult +" Euro");
    System.out.println("-----------------------------");
    assertEquals(expResult, Euro, 0.0);
    }
    
    @Test
    public void testSgdtoIdr(){
    System.out.println("Sgd Conversion to Idr");
    double amount = 8900;
    SgdConversion instance = new SgdConversion();
    double expResult= 99275584;
    double Idr = instance.SgdtoIdr(amount, amount);
    System.out.println("Amount of Money to convert is:"+ amount+ " Sgd");
    System.out.println("The Converted Money is:"+ expResult +" Idr");
    System.out.println("-----------------------------");
    assertEquals(expResult, Idr, 0.0);
    }
    
      @Test
    public void testSgdtoAUD(){
    System.out.println("Sgd Conversion to AUD");
    double amount = 4500;
    SgdConversion instance = new SgdConversion();
    double expResult= 4905;
    double aud = instance.SgdtoAUD(amount, amount);
    System.out.println("Amount of Money to convert is:"+ amount+ " Sgd");
    System.out.println("The Converted Money is:"+ expResult +" AUD");
    System.out.println("-----------------------------");
    assertEquals(expResult, aud, 0.0);
    }
}
