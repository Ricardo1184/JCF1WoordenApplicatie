/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 *
 * @author Pajama Sammy
 */
public final class TextSplitter
{
    private TextSplitter(){}
    
    public static String[] splitToWords(String inputText)
    {
        return inputText.toLowerCase().split("[,\\s]+");
    }

    public static String[] splitToSentences(String inputText)
    {
        String[] sentences = inputText.split("\n");

        for (int i = 0; i < sentences.length; i++)
        {
            sentences[i] = sentences[i].replaceAll("[^a-zA-Z0-9]", " ").toLowerCase();
        }
        return sentences;
    }
}
