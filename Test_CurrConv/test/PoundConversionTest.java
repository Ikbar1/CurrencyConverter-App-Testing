/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import CurrencyConv.PoundConversion;
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
public class PoundConversionTest {
    
    public PoundConversionTest() {
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
    public void testPoundtoUSD(){
    System.out.println("Pound Conversion to USD");
    double amount = 500;
    PoundConversion instance = new PoundConversion();
    double expResult= 580;
    double usd = instance.PoundtoUSD(amount, amount);
    System.out.println("Amount of Money to convert is:"+ amount+ " Pound");
    System.out.println("The Converted Money is:"+ expResult +" USD");
    System.out.println("-----------------------------");
    assertEquals(expResult, usd, 0.0);
    }
    
    @Test
    public void testPoundtoAUD(){
    System.out.println("Pound Conversion to AUD");
    double amount = 100;
    PoundConversion instance = new PoundConversion();
    double expResult= 177;
    double aud = instance.PoundtoAUD(amount, amount);
    System.out.println("Amount of Money to convert is:"+ amount+ " Pound");
    System.out.println("The Converted Money is:"+ expResult +" AUD");
    System.out.println("-----------------------------");
    assertEquals(expResult, aud, 0.0);
    }
    
     @Test
    public void testPoundtoEuro(){
    System.out.println("Pound Conversion to Euro");
    double amount = 240;
    PoundConversion instance = new PoundConversion();
    double expResult= 276;
    double Euro = instance.PoundtoEuro(amount, amount);
    System.out.println("Amount of Money to convert is:"+ amount+ " Pound");
    System.out.println("The Converted Money is:"+ expResult +" Euro");
    System.out.println("-----------------------------");
    assertEquals(expResult, Euro, 0.0);
    }
    
    @Test
    public void testPoundtoIdr(){
    System.out.println("Pound Conversion to Idr");
    double amount = 300;
    PoundConversion instance = new PoundConversion();
    double expResult= 5407845;
    double Idr = instance.PoundtoIdr(amount, amount);
    System.out.println("Amount of Money to convert is:"+ amount+ " Pound");
    System.out.println("The Converted Money is:"+ expResult +" Idr");
    System.out.println("-----------------------------");
    assertEquals(expResult, Idr, 0.0);
    }
    
      @Test
    public void testPoundtoSgd(){
    System.out.println("Pound Conversion to Sgd");
    double amount = 350;
    PoundConversion instance = new PoundConversion();
    double expResult= 567;
    double Sgd = instance.PoundtoSgd(amount, amount);
    System.out.println("Amount of Money to convert is:"+ amount+ " Pound");
    System.out.println("The Converted Money is:"+ expResult +" Sgd");
    System.out.println("-----------------------------");
    assertEquals(expResult, Sgd, 0.0);
    }
}
