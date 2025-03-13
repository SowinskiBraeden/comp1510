package ca.bcit.comp1510.lab07;

import java.util.List;

/**
 * Provide code for testing.
 * @author blink
 * @version 1
 *
 */
public class TestThis {
    
    /** 
     * Return the largest value in the parameters.
     * @param a first number
     * @param b second number
     * @param c third number
     * @return largest of three numbers
     */
    public int largest(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
    
    /** 
     * Return the largest value in the parameters.
     * @param a List of integers (use ArrayList<Integer> in test)
     * @return largest of numbers in List
     */
    public int largest(List<Integer> a) {
        int max = a.get(0);
        int i = 1;
        while (i < a.size()) {
            if (a.get(i) > max) {
                max = a.get(i);
            }
            i++;
        }
        
        return max;
    }

}
