package Facade;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ricardo van Dijke
 */
public class TextSplitterTest {
    /**
     * Test of splitToWords method, of class TextSplitter.
     */
    @Test
    public void testSplitToWords()
    {
        System.out.println("splitToWords");
        String inputText = "Hello I am Ricardo \nAnd";
        String[] expResult = new String[]{"hello","i","am","ricardo","and"};
        String[] result = TextSplitter.splitToWords(inputText);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of splitToSentences method, of class TextSplitter.
     */
    @Test
    public void testSplitToSentences()
    {
        System.out.println("splitToSentences");
        String inputText = "Hello I am Ricardo\nAnd this is a\nUnit Test";
                String[] expResult = new String[]{"hello i am ricardo","and this is a","unit test"};

        String[] result = TextSplitter.splitToSentences(inputText);
        assertArrayEquals(expResult, result);
    } 
}
