package ca.bcit.comp1510.lab08;

import java.util.Scanner;

/**
 * Represent a valid Gregorian date on or after 24 February 1582.
 * @author blink
 * @version 1.0.0
 * @param day day of month.  1 .. max days in month
 * @param month month of year.  1 .. 12
 * @param year year in Gregorian calendar.  1582 .. 2999
 */ 
public record Date(int day, int month, int year) {
    
    /** Date constructor. 
     * @throws IllegalArgumentException if invalid input. */
    public Date {
        if (!isDateValid(day, month, year)) {
            throw new IllegalArgumentException("Invalid Date arguments");
        }
    }
    
    /** 
     * isMonthValid validates stuff.
     * @param m int mont number
     * @return boolean valid month number
     */
    public static boolean isMonthValid(int m) {
        final int minMonth = 1;
        final int maxMonth = 12;
        return minMonth <= m && m <= maxMonth;
    }
    
    /**
     * isYearValid validates stuff.
     * @param year int year number
     * @return boolean valid year number
     */
    public static boolean isYearValid(int year) {
        final int min = 1582;
        final int max = 2999;
        return min <= year && year <= max;
    }
    
    /** 
     * isLeapYear validates stuff.
     * @param year int year number
     * @return boolean is leap year
     */
    public static boolean isLeapYear(int year) {
        final int mod1 = 4;
        final int mod2 = 100;
        final int mod3 = 400;
        return (year % mod3 == 0)
                || (year % mod1 == 0 && year % mod2 != 0);
    }
    
    /** 
     * daysInMonth gives info.
     * @param month int month number
     * @param isLeapYear boolean
     * @return int number of days
     */
    public static int daysInMonth(int month, boolean isLeapYear) {
        final int min = 1;
        final int max = 12;
        if (max < month || month < min) {
            return 0;
        }
        
        if (month == 2) {
            final int nonLeapYear = 28;
            final int leapYear = 29;
            return isLeapYear ? leapYear : nonLeapYear;
        }
        
        final int daysThirtyOne = 31;
        final int daysThirty = 30;
        final int half = 7;
        
        boolean thirtyOne = month <= half 
                ? (month % 2) == 1 : ((month + 1) % 2) == 1;
        
        return thirtyOne ? daysThirtyOne : daysThirty;
    }

    /**
     * isValidDate validates date.
     * @param day int
     * @param month int 
     * @param year int
     * @return boolean
     */
    public static boolean isDateValid(int day, int month, int year) {
        boolean validYear = isYearValid(year);
        boolean leapYear = isLeapYear(year);
        boolean validMonth = isMonthValid(month);
        boolean validDay = day <= daysInMonth(month, leapYear)
                            && day >= 1;
                          
        return validYear && validMonth && validDay;
    }
    
    private static int readValidInt(String message, Scanner scan) {
        boolean validInt = false;
        int data = 0;
        do {
            System.out.print(message);

            if (!scan.hasNextInt()) {
                System.out.println(scan.next() + " is not a valid integer.\n");
                continue;
            }
            
            data = scan.nextInt();
            validInt = true;
            
        } while (!validInt);
        
        return data;
    }
    
    /**
     * main program entry.
     * @param args unused
     */
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        int day = readValidInt("Enter a day (int): ", scan);
        int month = readValidInt("Enter a month (int): ", scan);
        int year = readValidInt("Enter a year (int): ", scan);
        scan.close();
        
        System.out.println();
        
        boolean validYear = Date.isYearValid(year);
        boolean validMonth = Date.isMonthValid(month);
        boolean validDay = Date.isDateValid(day, month, year);
        
        boolean leapYear = Date.isLeapYear(year);

        int daysInMonth = Date.daysInMonth(month, leapYear);
        
        System.out.println("Valid year:   " + validYear);
        System.out.println("Is Leap Year: " + leapYear);
        System.out.println("Valid month:  " + validMonth);
        System.out.println("# of Days:    " + daysInMonth);
        System.out.println("Valid day:    " + validDay);
        
        Date newDate = new Date(day, month, year);
        newDate.year();
    } 
}
