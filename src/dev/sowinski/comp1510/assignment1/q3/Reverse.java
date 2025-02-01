package dev.sowinski.comp1510.assignment1.q3;

import java.util.Scanner;
import java.util.Stack;

/**
 * Reverse reads strings back in reverse.
 * 
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class Reverse {

    /**
     * main program entry.
     * @param args unused
     */
    public static void main(String[] args) {
        Stack<String> wordStack = new Stack<String>();
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter ten words!");

        wordStack.push(scan.next());
        wordStack.push(scan.next());
        wordStack.push(scan.next());
        wordStack.push(scan.next());
        wordStack.push(scan.next());
        wordStack.push(scan.next());
        wordStack.push(scan.next());
        wordStack.push(scan.next());
        wordStack.push(scan.next());
        wordStack.push(scan.next());
        
        scan.close();
        
        System.out.println(wordStack.pop() + " "
                + wordStack.pop() + " "
                + wordStack.pop() + " "
                + wordStack.pop() + " "
                + wordStack.pop() + " "
                + wordStack.pop() + " "
                + wordStack.pop() + " "
                + wordStack.pop() + " "
                + wordStack.pop() + " "
                + wordStack.pop()
        );
    }
}
