package dev.sowinski.comp1510.lab3;

import java.util.Scanner;

/**
 * FunWithStrings
 * has some fun with strings?
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class FunWithStrings {
    /**
     * main program entry point.
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String book;
        String trimmedBook;
        System.out.print("Enter the title of your favourite book: ");
        book = scan.nextLine();
        trimmedBook = book.trim();
        scan.close();
        
        System.out.printf("Book: %s\n", book);
        System.out.printf("Title length: %d\n", book.length());
        System.out.printf("Trimed title length: %d\n", trimmedBook.length());
        System.out.printf("Starts with \"The\": %b\n", 
                book.toLowerCase().startsWith("the "));
        System.out.printf("Title uppercased: %s\n", book.toUpperCase());
        System.out.printf("Title lowercased: %s\n", book.toLowerCase());
        
        // Very clean code here -- checkstyle
        int len = trimmedBook.length();
        String upperFirst = trimmedBook.substring(0, 1).toUpperCase();
        String middleLow = trimmedBook.substring(1, len - 1).toLowerCase();
        String upperLast = trimmedBook.substring(len - 1, len).toUpperCase();
        System.out.printf("Finally: %s\n", upperFirst + middleLow + upperLast);

        // scan.next() returns the next token
    }
}
