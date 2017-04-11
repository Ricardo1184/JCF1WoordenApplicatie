package Facade;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ricardo van Dijke
 */
public class WordsCountTest {
    /**
     * Test of CountUniqueAndTotalWords method, of class WordsCount.
     */
    @Test
    public void testCountUniqueAndTotalWords()
    {
        System.out.println("CountUniqueAndTotalWords");
        String text = "Hello I am Ricardo and This This This Hello";
        String expResult = "Totaal aantal woorden: 9\nAantal verschillende woorden: 6";
        String result = WordsCount.CountUniqueAndTotalWords(text);
        assertEquals(expResult, result);
    }

    /**
     * Test of CountWordsOccurences method, of class WordsCount.
     */
    @Test
    public void testCountWordsOccurences()
    {
        System.out.println("CountWordsOccurences");
        String text = "Hello I am Ricardo and This This This Hello";
        String expResult = "\nricardo: 1\nam: 1\nhello: 2\ni: 1\nthis: 3\nand: 1";
        String result = WordsCount.CountWordsOccurences(text);
        assertEquals(expResult, result);
    }  
}
