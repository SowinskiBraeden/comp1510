package ca.bcit.comp1510.lab10;

import java.util.random.RandomGenerator;

/**
 * RandomWalker walks in funny ways.
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class RandomWalker {
    
    private enum Directions {
        /** Up direction. */
        Up,
        /** Down direction. */
        Down,
        /** Left direction. */
        Left,
        /** Right direction. */
        Right
    }

    /** x coordinate of walker. */
    private int x;
    
    /** y coordinate of walker. */
    private int y;
    
    /** max steps of walker. */
    private int max;
    
    /** bound of walk areas. */
    private int bound;
    
    /** steps taken. */
    private int steps;
    
    /** maximumDistance travelled. */
    private int maximumDistance;
    
    /**
     * RandomWalker Constructor with no starting x, y.
     * @param maxSteps of walker
     * @param boundary of grid
     */
    public RandomWalker(int maxSteps, int boundary) {
        this.max = maxSteps;
        this.bound = boundary;
        this.x = 0;
        this.y = 0;
        this.steps = 0;
        this.maximumDistance = 0;
    }
    
    /**
     * RandomWalker Constructor with starting x, y.
     * @param maxSteps of walker
     * @param x starting position
     * @param y starting position
     * @param boundary of grid
     */
    public RandomWalker(int maxSteps, int x, int y, int boundary) {
        this.max = maxSteps;
        this.bound = boundary;
        this.x = x;
        this.y = y;
        this.steps = 0;
        this.maximumDistance = 0;
    }
    
    /** 
     * toString returns string representation.
     * @return RandomWalker string representation
     * */
    public String toString() {
        return "(" + this.x + ", " + this.y + ")" 
               + " max steps: " + this.max 
               + " bounds: " + this.bound;
    }
    
    /** 
     * takeStep in a random direction.
     */
    public void takeStep() {
        RandomGenerator rand = RandomGenerator.getDefault();
        
        int i = rand.nextInt(Directions.values().length);
        Directions dir = Directions.values()[i];
        
        switch (dir) {
            case Directions.Up -> this.y++;
            case Directions.Down -> this.y--;
            case Directions.Left -> this.x--;
            default -> this.x++;
        }
        
        this.steps++;
        
        this.maximumDistance = max(
            this.maximumDistance, 
            max(Math.abs(this.x), Math.abs(this.y))
        );
    }

    /**
     * moreSteps available?
     * @return more steps available
     */
    public boolean moreSteps() {
        return this.steps < this.max;
    }

    /**
     * inBounds check if x, y coords are in bounds.
     * @return in boundary
     */
    public boolean inBounds() {
        return this.x <= this.bound && this.x >= (-1 * this.bound) 
            && this.y <= this.bound && this.y >= (-1 * this.bound);
    }

    /**
     * walk simulation till out of bounds
     * or out of steps.
     */
    public void walk() {
        while (moreSteps() && inBounds()) {
            takeStep();
        }
    }
    
    /** 
     * max of a and b.
     * @param a int
     * @param b int
     * @return max of a and b
     * */
    private int max(int a, int b) {
        return a > b ? a : b;
    }
    
    /**
     * getMaximumDistance.
     * @return maximumDistance int
     */
    public int getMaximumDistance() {
        return this.maximumDistance;
    }
}
