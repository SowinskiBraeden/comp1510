package ca.bcit.comp1510.lab05;

/**
 * Mathematics impliments math.
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class Mathematics {

    /** PI is a math constant. */
    public static final double PI = 3.141592654;

    /**
     * getCircleArea returns area of a circle.
     * @param r radius
     * @return double area
     */
    public double getCircleArea(double r) {
        return PI * r * r;
    }

    /**
     * sumOfInts adds up all ints counting up to int i.
     * @param n max number
     * @return int sum
     */
    public int sumOfInts(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    /**
     * isPositive checks if given number is positive.
     * @param n int to check if positive
     * @return boolean is positive
     */
    public boolean isPositive(int n) {
        return n > 0;
    }

    /**
     * isEven check if a given number is even.
     * @param n int to check if even
     * @return boolean is even
     */
    public boolean isEven(int n) {
        return (n % 2) == 0;
    }

    /**
     * sumOfEvens sums even integers up to max i.
     * @param n int max
     * @return int sum
     */
    public int sumOfEvens(int n) {
        int sum = 0;
        
        if (this.isPositive(n)) {            
            for (int i = 0; i <= n; i++) {
                if (this.isEven(i)) {
                    sum += i;
                }
            }
            return sum;
        } else {
            for (int i = 0; i >= n; i--) {
                if (this.isEven(i)) {
                    sum += i;
                }
            }
            return sum;
        }
    }
}
