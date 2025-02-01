package dev.sowinski.comp1510.lab1;

/**
 * Prints hello world message.
 * @author Braeden Sowinski
 * @version 1.0.0
 * */
public class Hello {
    
    /**
     * main program entry.
     * @param args unused
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

/*
 *  After changing the classname to "helo", the error is:
 *      Error: Could not find or load main class lab1.Hello in module lab0
 *      
 *  Changing the text inside of the println function produces no errors and 
 *  simply outputs "Helo World!" as intended.
 *  
 *  Removing the final quotation produces the error: 
 *      String literal is not properly closed by a double-quote
 *      
 *  Removing the first quotation produces the error:
 *      Syntax error on token(s), misplaced construct(s)
 *      Syntax error on token "!", ; expected
 *      String literal is not properly closed by a double-quote
 *  
 *  Forgetting a semi-colon at the end of a line of code will produce a 
 *  syntax error: 
 *      "Syntax error, insert ";" to complete BlockStatements"
 *      
 */
