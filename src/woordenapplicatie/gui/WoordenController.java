package woordenapplicatie.gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.TreeSet;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import org.apache.commons.lang3.StringUtils;

/**
 * FXML Controller class
 *
 * @author frankcoenen
 */
public class WoordenController implements Initializable {

    private static final String DEFAULT_TEXT = "Een, twee, drie, vier\n"
            + "Hoedje van, hoedje van\n"
            + "Een, twee, drie, vier\n"
            + "Hoedje van papier\n";/*
            + "\n"
            + "Heb je dan geen hoedje meer\n"
            + "Maak er één van bordpapier\n"
            + "Eén, twee, drie, vier\n"
            + "Hoedje van papier\n"
            + "\n"
            + "Een, twee, drie, vier\n"
            + "Hoedje van, hoedje van\n"
            + "Een, twee, drie, vier\n"
            + "Hoedje van papier\n"
            + "\n"
            + "En als het hoedje dan niet past\n"
            + "Zetten we 't in de glazenkas\n"
            + "Een, twee, drie, vier\n"
            + "Hoedje van papier";
             ;*/
    @FXML
    private Button btAantal;
    @FXML
    private TextArea taInput;
    @FXML
    private Button btSorteer;
    @FXML
    private Button btFrequentie;
    @FXML
    private Button btConcordantie;
    @FXML
    private TextArea taOutput;

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        taInput.setText(DEFAULT_TEXT);
    }

    @FXML
    private void aantalAction(ActionEvent event)
    {
        String[] words = splitToWords(taInput.getText());
        HashSet aantalUniques = new HashSet(Arrays.asList(words));
        taOutput.setText(
                "Totaal aantal woorden: "
                + words.length
                + "\nAantal verschillende woorden: "
                + Integer.toString(aantalUniques.size())
        );
    }

    @FXML
    private void sorteerAction(ActionEvent event)
    {
        String[] words = splitToWords(taInput.getText());
        LinkedHashSet<String> uniqueWords = new LinkedHashSet(Arrays.asList(words));
        TreeSet<String> tree = new TreeSet();
        tree.addAll(uniqueWords);
        tree = (TreeSet<String>) tree.descendingSet();
        StringBuilder sb = new StringBuilder();
        for (String i : tree)
        {
            sb.append(i);
            sb.append("\n");
        }
        taOutput.setText(sb.toString());
    }

    @FXML
    private void frequentieAction(ActionEvent event)
    {
        List<String> list = Arrays.asList(splitToWords(taInput.getText()));
        Set<String> uniqueSet = new HashSet<>(list);
        StringBuilder sb = new StringBuilder();

        for (String temp : uniqueSet)
        {
            sb.insert(0, temp + ": " + Collections.frequency(list, temp));
            sb.insert(0, "\n");
        }
        taOutput.setText(sb.toString());
    }

    @FXML
    private void concordatieAction(ActionEvent event)
    {
        String[] sentences = splitToSentences(taInput.getText());
        TreeSet<String> uniqueWords = new TreeSet(Arrays.asList(splitToWords(taInput.getText())));

        StringBuilder sb = new StringBuilder();

        for (String word : uniqueWords)
        {
            sb.append(word);
            sb.append("\t [");
            for (int i = 0; i < sentences.length; i++)
            {
                // if (sentences[i].contains(word))
                // {
                for (int j = 0; j < StringUtils.countMatches(sentences[i], word); j++)
                {
                    sb.append(i + 1);
                    sb.append(", ");

                }
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.deleteCharAt(sb.length() - 1);

            sb.append("] \n");
        }
        taOutput.setText(sb.toString());
    }

    private String[] splitToWords(String inputText)
    {
        return inputText
                .replaceAll("[^a-zA-Z0-9]", " ") //Replaces everything that's not a character or letter
                .toLowerCase() //Makes everything lowercase
                .replaceAll(" +", " ") //Removes multiple consecutive spaces 
                .split(" ");                        //Split by spaces
    }

    private String[] splitToSentences(String inputText)
    {
        String[] sentences = inputText.split("\n");

        for (int i = 0; i < sentences.length; i++)
        {
            sentences[i] = sentences[i].replaceAll("[^a-zA-Z0-9]", " ").toLowerCase();
        }
        return sentences;
    }
}
