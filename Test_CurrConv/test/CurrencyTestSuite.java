/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runners.Suite;
import org.junit.runner.RunWith;


/**
 *
 * @author Azhar
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({AUDConversionTest.class,PoundConversionTest.class,EuroConversionTest.class,IdrConversionTest.class,SgdConversionTest.class,USDConversionTest.class})
public class CurrencyTestSuite {
    
    public CurrencyTestSuite() {
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception{
    }
    
    @AfterClass
    public static void tearDownClass() throws Exception{
    }
    
    @Before
    public void setUp()throws Exception {
    }
    
    @After
    public void tearDown() throws Exception{
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
