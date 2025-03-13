package ca.bcit.comp1510.assignment2.q2;

/**
 * Word not like Microsoft word.
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class Word implements Comparable<Word> {
    
    /** word. */
    private final String word;
    
    /** frequency of word. */
    private int frequency = 1;
    
    /** 
     * Word constructor.
     * @param w new word.
     * */
    public Word(String w) {
        word = w;
    }

    /**
     * getWord.
     * @return string word
     */
    public String getWord() {
        return word;
    }
    
    /**
     * getFrequency.
     * @return int frequency
     */
    public int getFrequency() {
        return frequency;
    }
    
    /** increment frequency. */
    public void increment() {
        frequency++;
    }
    
    /**
     * toString.
     * @return string representation.
     */
    public String toString() {
        return word + " " + frequency;
    }

    /**
     * compareTo another Word class.
     * @param w Word object
     * @return larger frequency
     */
    @Override
    public int compareTo(Word w) {
        return Integer.compare(w.getFrequency(), frequency);
    }
}
