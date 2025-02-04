package ca.bcit.comp1510.lab04;

/** 
 * Name contains name information.
 * 
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class Name {
    
    /** first name. */
    private String first;

    /** middle name. */
    private String middle;

    /** last name. */
    private String last;

    /**
     * Name constructor.
     * @param firstName stores given first name
     * @param middleName stores given middle name
     * @param lastName stores given last name
     */
    public Name(String firstName, String middleName, String lastName) {
        first = firstName;
        middle = middleName;
        last = lastName;
    }

    /** getFirst.
     * @return first name as String
     */
    public String getFirst() {
        return first;
    }

    /** getMiddle.
     * @return middle name as String
     */
    public String getMiddle() {
        return middle;
    }

    /** getMiddle.
     * @return middle name as String
     */
    public String getLast() {
        return last;
    }
    
    /** toString compiles all names.
     * @return full name as String.
     */
    public String toString() {
        return first + " " + middle + " " + last;
    }
}
