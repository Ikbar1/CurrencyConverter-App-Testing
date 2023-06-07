/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import CurrencyConv.EuroConversion;
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
public class EuroConversionTest {
    
    public EuroConversionTest() {
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
    public void testEurotoUSD(){
    System.out.println("Euro Conversion to USD");
    double amount = 500;
    EuroConversion instance = new EuroConversion();
    double expResult= 505;
    double usd = instance.EurotoUSD(amount, amount);
    System.out.println("Amount of Money to convert is:"+ amount+ " Euro");
    System.out.println("The Converted Money is:"+ expResult +" USD");
    System.out.println("-----------------------------");
    assertEquals(expResult, usd, 0.0);
    }
    
    @Test
    public void testEurotoPound(){
    System.out.println("Euro Conversion to Pound");
    double amount = 600;
    EuroConversion instance = new EuroConversion();
    double expResult= 522;
    double pound = instance.EurotoPound(amount, amount);
    System.out.println("Amount of Money to convert is:"+ amount+ " Euro");
    System.out.println("The Converted Money is:"+ expResult +" Pound");
    System.out.println("-----------------------------");
    assertEquals(expResult, pound, 0.0);
    }
    
     @Test
    public void testEurotoAUD(){
    System.out.println("Euro Conversion to AUD");
    double amount = 400;
    EuroConversion instance = new EuroConversion();
    double expResult= 616;
    double aud = instance.EurotoAUD(amount, amount);
    System.out.println("Amount of Money to convert is:"+ amount+ " Euro");
    System.out.println("The Converted Money is:"+ expResult +" AUD");
    System.out.println("-----------------------------");
    assertEquals(expResult, aud, 0.0);
    }
    
    @Test
    public void testEurotoIdr(){
    System.out.println("Euro Conversion to Idr");
    double amount = 700;
    EuroConversion instance = new EuroConversion();
    double expResult= 10991988;
    double Idr = instance.EurotoIdr(amount, amount);
    System.out.println("Amount of Money to convert is:"+ amount+ " Euro");
    System.out.println("The Converted Money is:"+ expResult +" Idr");
    System.out.println("-----------------------------");
    assertEquals(expResult, Idr, 0.0);
    }
    
      @Test
    public void testEurotoSgd(){
    System.out.println("Euro Conversion to Sgd");
    double amount = 800;
    EuroConversion instance = new EuroConversion();
    double expResult= 1128;
    double Sgd = instance.EurotoSgd(amount, amount);
    System.out.println("Amount of Money to convert is:"+ amount+ " Euro");
    System.out.println("The Converted Money is:"+ expResult +" Sgd");
    System.out.println("-----------------------------");
    assertEquals(expResult, Sgd, 0.0);
    }
}
