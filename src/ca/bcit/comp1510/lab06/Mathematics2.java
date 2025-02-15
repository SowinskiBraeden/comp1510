package ca.bcit.comp1510.lab06;

/**
 * Mathematics2 does more math stuff.
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class Mathematics2 {

    /** FOOT_TO_KILOMETRE_RATIO is important. */
    public static final double FOOT_TO_KILOMETRE_RATIO = 0.0003048;

    /**
     * getSquareArea returns square of input.
     * @param d input to get square.
     * @return square area.
     */
    public double getSquareArea(double d) {
        return d * d;
    }
    
    /**
     * add two floating point numbers.
     * @param d first number
     * @param e second number
     * @return sum of d and e
     */
    public double add(double d, double e) {
        return d + e;
    }

    /**
     * multiply two floating point numbers.
     * @param d first number
     * @param e second number
     * @return product of d and e
     */
    public double multiply(double d, double e) {
        return d * e;
    }

    /**
     * subtract floating point number from another.
     * @param d number
     * @param e number to subtract
     * @return difference of d and e
     */
    public double subtract(double d, double e) {
        return d - e;
    }

    /**
     * divide two floating point numbers.
     * @param i first number
     * @param j divide by
     * @return quotiant of i and j
     */
    public double divide(int i, int j) {
        if (j == 0) {
            return 0.0;
        }
        return i / j;
    }

    /**
     * absoluteValue converts negative numbers to positive.
     * @param i number
     * @return i as a positive number
     */
    public int absoluteValue(int i) {
        if (i >= 0) {            
            return i;
        } else {
            return i * -1;
        }
    }

    /**
     * getRandomNumberBetweenTenAndTwentyButNotFifteen
     * does as the name says.
     * @return int
     */
    public int getRandomNumberBetweenTenAndTwentyButNotFifteen() {
        final int max = 21;
        final int min = 10;
        final int bad = 15;

        int rand = bad;
        while (rand == bad) {
            rand = (int) (Math.random() * (max - min)) + min;
        }
        return rand;
    }

    /**
     * convertFeetToKilometres.
     * @param d number of feet
     * @return kilometres.
     */
    public double convertFeetToKilometres(double d) {
        return d * FOOT_TO_KILOMETRE_RATIO;
    }
    
    /**
     * sumOfProducts.
     * @param i min/max
     * @param j step
     * @return sum
     */
    public int sumOfProducts(int i, int j) {
        int sum = 0;
        if (i >= 0) {
            for (int k = j; k <= i; k += j) {
                sum += k;
            }
        } else {
            for (int k = -j; k >= i; k -= j) {
                sum += k;
            }
        }
        return sum;
    }
}
