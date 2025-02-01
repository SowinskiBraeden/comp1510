package dev.sowinski.comp1510.lab4;

/**
 * Represents one die (singular of dice) with faces showing values between 1 and
 * 6.
 * 
 * Rename class from Die to MultiDie.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @author Braeden Sowinski
 * @version 2025
 */
public class MultiDie {
    /** Maximum face value. */
    public final int max;

    /** Current value showing on the die. */
    private int faceValue;
    
    /**
     * Constructor sets the initial face value to 1.
     * @param numSides int Maximum face value
     */
    public MultiDie(int numSides) {
        max = numSides;
        faceValue = roll();
    }

    /**
     * Rolls this Die and returns the result.
     * @return faceValue as an int
     */
    public int roll() {
        faceValue = (int) (Math.random() * max) + 1;

        return faceValue;
    }

    /**
     * Sets the face value of this Die to the specified value.
     * @param value an int
     */
    public void setFaceValue(int value) {
        faceValue = value;
    }

    /**
     * Returns the face value of this Die as an int.
     * @return faceValue as an int
     */
    public int getFaceValue() {
        return faceValue;
    }

    /**
     * Returns a String representation of this Die.
     * @return toString description
     */
    public String toString() {
        String result = Integer.toString(faceValue);

        return result;
    }
}

