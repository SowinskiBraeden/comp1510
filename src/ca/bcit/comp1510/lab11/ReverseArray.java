package ca.bcit.comp1510.lab11;

import java.util.Scanner;
import java.util.Arrays;

/**
 * ReverseArray is self explanitory.
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class ReverseArray {

    /**
     * readValidInt reads and validates an integer.
     * @param msg to print;
     * @param scan to read input
     * @return validated int
     */
    private static int readValidInt(String msg, Scanner scan) {
        int number = 0;
        boolean valid = false;
        
        do {
            System.out.print(msg);
            
            if (!scan.hasNextInt()) {
                System.out.println(scan.next() + " is not a valid number.\n");
                continue;
            }
            
            number = scan.nextInt();
            valid = true;

        } while (!valid);
                
        return number;
    }
    
    /**
     * reverseIntArray reverses an array of ints.
     * @param arr of ints.
     * @return reversed array of ints.
     */
    private static int[] reverseIntArray(int[] arr) {
        int n;
        for (int i = 0; i < arr.length / 2; i++) {
            n = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i];
            arr[i] = n;
        }
        
        return arr;
    }
    
    /**
     * main program entry.
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int length = readValidInt(
                "Please enter the length for the array: ",
                scan
        );
        
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            int num = readValidInt(
                    "Please enter a number: ",
                    scan
            );
            arr[i] = num;
        }
        
        System.out.println(Arrays.toString(arr));
        
        arr = reverseIntArray(arr);

        System.out.println(Arrays.toString(arr));
    }
}
