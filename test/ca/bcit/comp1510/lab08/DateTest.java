/**
 * 
 */
package ca.bcit.comp1510.lab08;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */
class DateTest {
    
    @Test
    void testIsMonthValid() {
        int month = 6;
        boolean valid = Date.isMonthValid(month);
        assertEquals(true, valid);
    }
    
    @Test
    void testIsMonthValid1() {
        int month = 21;
        boolean valid = Date.isMonthValid(month);
        assertEquals(false, valid);
    }

    @Test
    void testIsYearValid() {
        int year = 2005;
        boolean valid = Date.isYearValid(year);
        assertEquals(true, valid);
    }
    
    @Test
    void testIsYearValid1() {
        int year = 1450;
        boolean valid = Date.isYearValid(year);
        assertEquals(false, valid);
    }
    
    @Test
    void testIsYearValid2() {
        int year = 3821;
        boolean valid = Date.isYearValid(year);
        assertEquals(false, valid);
    }
    
    @Test
    void testIsLeapYear() {
        int year = 2005;
        boolean leap = Date.isLeapYear(year);
        assertEquals(false, leap);
    }
    
    @Test
    void testIsLeapYear1() {
        int year = 2004;
        boolean leap = Date.isLeapYear(year);
        assertEquals(true, leap);
    }
    
    @Test
    void testIsLeapYear2() {
        int year = 1700;
        boolean leap = Date.isLeapYear(year);
        assertEquals(false, leap);
    }
    
    @Test
    void testIsLeapYear3() {
        int year = 2100;
        boolean leap = Date.isLeapYear(year);
        assertEquals(false, leap);
    }
    
    @Test
    void testDaysInMonth() {
        int month = 4;
        boolean leapYear = false;
        int days = Date.daysInMonth(month, leapYear);
        assertEquals(30, days);
    }
    
    @Test
    void testDaysInMonth1() {
        int month = 5;
        boolean leapYear = false;
        int days = Date.daysInMonth(month, leapYear);
        assertEquals(31, days);
    }
    
    @Test
    void testDaysInMonth2() {
        int month = 2;
        boolean leapYear = false;
        int days = Date.daysInMonth(month, leapYear);
        assertEquals(28, days);
    }
    
    @Test
    void testDaysInMonth3() {
        int month = 2;
        boolean leapYear = true;
        int days = Date.daysInMonth(month, leapYear);
        assertEquals(29, days);
    }
    
    @Test
    void testDaysInMonth4() {
        int month = 16;
        boolean leapYear = true;
        int days = Date.daysInMonth(month, leapYear);
        assertEquals(0, days);
    }
    
    @Test
    void testIsDateValid() {
        int day = 26;
        int month = 4;
        int year = 2005;
        boolean valid = Date.isDateValid(day, month, year);
        assertEquals(true, valid);
    }
    
    @Test
    void testIsDateValid1() {
        int day = 33;
        int month = 8;
        int year = 1999;
        boolean valid = Date.isDateValid(day, month, year);
        assertEquals(false, valid);
     }
    
    @Test
    void testConstructorException() {
        int day = 33;
        int month = 8;
        int year = 1999;

        assertThrows(IllegalArgumentException.class,
                () -> { new Date(day, month, year); });
    }
}
