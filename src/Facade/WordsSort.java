/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Pajama Sammy
 */
public final class WordsSort
{
    private WordsSort(){}
    
    public static String SortWords(String input)
    {
        String[] words = TextSplitter.splitToWords(input);
        Set<String> uniqueWords = new LinkedHashSet(Arrays.asList(words));
        TreeSet<String> tree = new TreeSet();
        tree.addAll(uniqueWords);
        tree = (TreeSet<String>) tree.descendingSet();
        StringBuilder sb = new StringBuilder();
        for (String i : tree)
        {
            sb.append(i);
            sb.append("\n");
        }
        return(sb.toString());
    }
    
}
