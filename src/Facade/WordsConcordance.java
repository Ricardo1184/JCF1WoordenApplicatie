/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Pajama Sammy
 */
public final class WordsConcordance
{

    private WordsConcordance()
    {
    }

    public static String ConcordanceWords(String text)
    {
        String[] sentences = TextSplitter.splitToSentences(text);
        Set<String> uniqueWords = new TreeSet(Arrays.asList(TextSplitter.splitToWords(text)));

        StringBuilder sb = new StringBuilder();

        for (String word : uniqueWords)
        {
            sb.append(word);
            sb.append("\t [");
            for (int i = 0; i < sentences.length; i++)
            {
                if (sentences[i].contains(word))
                {
                    sb.append(i + 1);
                    sb.append(", ");
                }
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.deleteCharAt(sb.length() - 1);

            sb.append("] \n");
        }

        return sb.toString();
    }
}
