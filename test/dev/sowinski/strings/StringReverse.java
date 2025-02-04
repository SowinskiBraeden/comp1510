package dev.sowinski.strings;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * StringReverse test different methods to reverse strings.
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class StringReverse {
    
    /**
     * linearReverse reverse strings by looping over each element.
     * @param s string to reverse
     * @return reversed string as String
     */
    public static String linearReverse(String s) {
        String n = "";
        for (int i = s.length() - 1; i >= 0; i--) {            
            n += s.charAt(i);
        }
        return n;
    }
    
    /**
     * halfLinearReverse reverses strings by only looping
     * over half of the string.
     * @param s string to reverse
     * @return reversed string
     */
    public static String halfLinearReverse(String s) {
        char r;
        char[] n = s.toCharArray();
        for (int i = 0; i < n.length / 2; i++) {
            r = n[n.length - 1 - i];
            n[n.length - 1 - i] = n[i];
            n[i] = r;
        }
        return new String(n);
    }

    /**
     * main program entry.
     * @param args unused
     */
    public static void main(String[] args) {
        char[] charset = {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 
            'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 
            's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', 
            '2', '3', '4', '5', '6', '7', '8', '9', '0'
        };
        String test = new String(charset);
        
        long start;
        long end;
        final int upperBound = 100000;
        final int micro = 1000;

        try {
            PrintWriter myWriter = new PrintWriter("output.csv", "UTF-8");
        
            for (int i = 0; i < upperBound; i++) {
                start = System.nanoTime();
                String r1 = new StringBuffer(test).reverse().toString();
                r1.length();
                end = System.nanoTime();
                int duration1 = (int) ((end - start) / micro);
                
                start = System.nanoTime();
                r1 = halfLinearReverse(test);
                end = System.nanoTime();
                int duration3 = (int) ((end - start) / micro);
    
                int len = test.length() + 1;
                System.out.println(len - 1);
      
                int rand = (int) (Math.random() * charset.length);
                test += charset[rand];
                
                String data = len + ","
                        + duration1 + ","
                        + duration3;
                
                myWriter.println(data);
            }
            
            myWriter.close();
            System.out.println("Done");
        } catch (IOException e) {
            System.out.println("An error occured!");
            e.printStackTrace();
        }
    }
}
