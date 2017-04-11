package Facade;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ricardo van Dijke
 */
public class WordsConcordanceTest {
      
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
