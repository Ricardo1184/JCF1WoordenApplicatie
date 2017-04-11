/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
