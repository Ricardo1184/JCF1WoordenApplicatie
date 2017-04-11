/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Pajama Sammy
 */
public final class WordsCount
{

    private WordsCount()
    {
    }

    public static String CountUniqueAndTotalWords(String text)
    {
        String[] words = TextSplitter.splitToWords(text);
        Collection<String> uniqueWords = new HashSet(Arrays.asList(words));

        return "Totaal aantal woorden: "
                + words.length
                + "\nAantal verschillende woorden: "
                + uniqueWords.size();
    }

    public static String CountWordsOccurences(String text)
    {
        Collection<String> allWords = Arrays.asList(TextSplitter.splitToWords(text));
        Set<String> uniqueWords = new HashSet<>(allWords);
        StringBuilder sb = new StringBuilder();

        for (String word : uniqueWords)
        {
            sb.insert(0, word + ": " + Collections.frequency(allWords, word));
            sb.insert(0, "\n");
        }
        return (sb.toString());
    }

}
