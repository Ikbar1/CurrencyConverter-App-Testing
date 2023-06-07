/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import CurrencyConv.AUDConversion;
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
public class AUDConversionTest {
    
    public AUDConversionTest() {
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
    public void testAUDtoUSD(){
    System.out.println("AUD Conversion to USD");
    double amount = 15300;
    AUDConversion instance = new AUDConversion();
    double expResult= 10000;
    double usd = instance.AUDtoUSD(amount, amount);
    System.out.println("Amount of Money to convert is:"+ amount+ " AUD");
    System.out.println("The Converted Money is:"+ expResult +" USD");
    System.out.println("-----------------------------");
    assertEquals(expResult, usd, 0.0);
    }
    
    @Test
    public void testAUDtoPound(){
    System.out.println("AUD Conversion to Pound");
    double amount = 3540;
    AUDConversion instance = new AUDConversion();
    double expResult= 2000;
    double pound = instance.AUDtoPound(amount, amount);
    System.out.println("Amount of Money to convert is:"+ amount+ " AUD");
    System.out.println("The Converted Money is:"+ expResult +" Pound");
    System.out.println("-----------------------------");
    assertEquals(expResult, pound, 0.0);
    }
    
     @Test
    public void testAUDtoEuro(){
    System.out.println("AUD Conversion to Euro");
    double amount = 385;
    AUDConversion instance = new AUDConversion();
    double expResult= 250;
    double Euro = instance.AUDtoEuro(amount, amount);
    System.out.println("Amount of Money to convert is:"+ amount+ " AUD");
    System.out.println("The Converted Money is:"+ expResult +" Euro");
    System.out.println("-----------------------------");
    assertEquals(expResult, Euro, 0.0);
    }
    
    @Test
    public void testAUDtoIdr(){
    System.out.println("AUD Conversion to Idr");
    double amount = 58.8;
    AUDConversion instance = new AUDConversion();
    double expResult= 600000;
    double Idr = instance.AUDtoIdr(amount, amount);
    System.out.println("Amount of Money to convert is:"+ amount+ " AUD");
    System.out.println("The Converted Money is:"+ expResult +" Idr");
    System.out.println("-----------------------------");
    assertEquals(expResult, Idr, 0.0);
    }
    
      @Test
    public void testAUDtoSgd(){
    System.out.println("AUD Conversion to Sgd");
    double amount = 715;
    AUDConversion instance = new AUDConversion();
    double expResult= 650;
    double Sgd = instance.AUDtoSgd(amount, amount);
    System.out.println("Amount of Money to convert is:"+ amount+ " AUD");
    System.out.println("The Converted Money is:"+ expResult +" Sgd");
    System.out.println("-----------------------------");
    assertEquals(expResult, Sgd, 0.0);
    }
}
