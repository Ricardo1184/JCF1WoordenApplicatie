package Facade;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ricardo van Dijke
 */
public class WordsSortTest {
    /**
     * Test of SortWords method, of class WordsSort.
     */
    @Test
    public void testSortWords()
    {
        System.out.println("SortWords");
        String input = "Hello I am Ricardo and This This This Hello";
        String expResult = "this\nricardo\ni\nhello\nand\nam\n";
        String result = WordsSort.SortWords(input);
        assertEquals(expResult, result);
    }   
}
