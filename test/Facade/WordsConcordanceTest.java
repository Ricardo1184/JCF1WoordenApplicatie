/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ricardo van Dijke
 */
public class WordsConcordanceTest {
    
    public WordsConcordanceTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of ConcordanceWords method, of class WordsConcordance.
     */
    @Test
    public void testConcordanceWords()
    {
        System.out.println("ConcordanceWords");
        String text = "Hello I am\nRicardo Hello\nHello";
        String expResult = "am	 [1] \nhello	 [1, 2, 3] \ni	 [1, 2] \nricardo	 [2] \n";
        String result = WordsConcordance.ConcordanceWords(text);
        assertEquals(expResult, result);
    }   
}
