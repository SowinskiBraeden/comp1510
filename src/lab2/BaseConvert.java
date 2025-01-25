package lab2;

import java.util.Scanner;

/** 
 * BaseConvert converts any base 10 number to any base.
 * 
 * @author Braeden Sowinski
 * @version 1.1.0
 */
public class BaseConvert {   

    /** main program entry.
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Convert base 10 to base (2-9): ");
        int base = scan.nextInt();
        final int baseMin = 2;
        final int baseMax = 9;
        if (base < baseMin || base > baseMax) {
            System.out.printf("Base %d is not valid", base);
            scan.close();
            return;
        }
        System.out.printf("Convert 'n' to base %d: ", base);
        long n = scan.nextLong();
        
        scan.close();
        
        String newBase = "";  
        while (n != 0) {
            newBase += n % base;
            n /= base;
        }

        newBase = new StringBuffer(newBase).reverse().toString();
        System.out.printf("%d in (base 10) is equal to %s (base %d).", 
                n, 
                newBase, 
                base
        );
    }
}
