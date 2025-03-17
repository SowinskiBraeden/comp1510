package ca.bcit.comp1510.lab09;

/**
 * Represents a two-sided coin that can be flipped.  Modified over class
 * example to use enum.
 * 
 * @author Lewis & Loftus 9e
 * @author Bruce Link
 * @author BCIT
 * @version 2023
 */
public class Coin {
    /** Enumeration type representing sides of a coin. */
    public enum CoinFace {
        /** the side of a coin considered tails. */
        Tails,
        /** the side of a coin considered heads. */
        Heads
    }

    /** Coin's current face showing. */
    private CoinFace face;

    /**
     * Constructs a Coin object and flips it to give it a starting value.
     */
    public Coin() {
        flip();
    }

    /**
     * Flips this Coin by randomly choosing a face value.
     */
    public void flip() {
        final double half = 0.5;
        if (Math.random() < half) {
            face = CoinFace.Heads;
        } else {
            face = CoinFace.Tails;
        }
    }
    
    /**
     * returns side of coin as CoinFace type.
     * @return current showing face of this coin.
     */
    public CoinFace getFace() {
        return face;
    }
    
    /**
     * set the coin face explicitly.  No required check on values as enum 
     * CoinFace allows no illegal values to be passed.
     * @param newFace the new face to show.
     */
    public void setFace(CoinFace newFace) {
        face = newFace;
    }

    /**
     * Returns true if the current face of the Coin is heads.
     * @return true if current face is heads, else false.
     */
    public boolean isHeads() {
        return face == CoinFace.Heads;
    }

    /**
     * Returns the current face value of this Coin as a String.
     * @return toString description
     */
    public String toString() {
        return face.name();      
    }
}

