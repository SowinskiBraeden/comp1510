package ca.bcit.comp1510.assignment2.q2;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

import java.util.List;
import java.util.ArrayList;

/**
 * <p>This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.</p>
 *
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class WordCounter {

    /** words list. */
    private List<Word> words = new ArrayList<Word>();

    /**
     * parseBook returns the number of unique words found in a given
     * book.
     * @param filename string.
     * @return numberOfWords int.
     */
    public int parseBook(String filename) throws FileNotFoundException {
        
        Scanner fileScan = new Scanner(new File(filename));
        Scanner lineScan;
        
        while (fileScan.hasNext()) {
            lineScan = new Scanner(fileScan.nextLine());
            lineScan.useDelimiter(" ");
            
            while (lineScan.hasNext()) {
                String word = lineScan.next().toLowerCase();
                
                boolean exists = false;
                for (int i = 0; i < words.size() && !exists; i++) {
                    if (words.get(i).getWord().equals(word)) {
                        words.get(i).increment();
                        // look I did not use a break statement...
                        exists = true;
                    }
                }
                
                if (!exists) {
                    words.add(new Word(word));
                }
            }
            lineScan.close();
        }
        
        fileScan.close();
        
        return words.size();
    }
    
    /**
     * printTopWords.
     * @param n int number of words.
     */
    public void printTopWords(int n) {
        words.sort(null);
        
        for (int i = 0; i < n; i++) {
            System.out.println(words.get(i).toString());
        }
    }
    
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        WordCounter counter = new WordCounter();

        int numberOfWords;
        
        try {
            numberOfWords = counter.parseBook("src/bible.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found");
            return;
        }
        
        System.out.println(numberOfWords + " words\n");
        
        final int top10 = 10;
        counter.printTopWords(top10);
    }
}
