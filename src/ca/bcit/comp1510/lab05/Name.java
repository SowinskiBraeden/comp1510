package ca.bcit.comp1510.lab05;

/** 
 * Name contains name information.
 * 
 * @author Braeden Sowinski
 * @version 1.0.0
 * 
 * @param first name string
 * @param middle name string
 * @param last name string
 */
public record Name(String first, String middle, String last) {
    
    /** 
     * toString compiles all names.
     * @return full name as String.
     */
    public String toString() {
        return first + " " + middle + " " + last;
    }

    /**
     * length returns the sum of all name lengths.
     * @return int length
     */
    public int length() {
        return first.length() + middle.length() + last.length();
    }
    
    /**
     * initials returns initials of all names uppercased.
     * @return string initials
     */
    public String initials() {
        return "" + first.toUpperCase().charAt(0)
                  + middle.toUpperCase().charAt(0)
                  + last.toUpperCase().charAt(0);
    }
    
    /**
     * charAt returns character from full string name.
     * @param i index
     * @return char from full name string.
     */
    public char charAt(int i) {
        return this.toString().charAt(i);
    }
    
    /** 
     * toStringFormat compiles all names in a format.
     * @return full name as String formatted.
     */
    public String toStringFormat() {
        return last + ", " + first + " " + middle;
    }
    
    /**
     * equalsFirst checks if input equals first name.
     * @param s string to compare to first name
     * @return boolean if it matches
     */
    public boolean equalsFirst(String s) {
        return first.toLowerCase().equals(s.toLowerCase());
    }
}

