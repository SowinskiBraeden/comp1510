package ca.bcit.comp1510.lab10;

/** 
 * Name does name stuff.
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class Name implements Comparable<Name> {
    
    /** first name string. */
    private final String first;
    
    /** middle name string. */
    private final String middle;
    
    /** last name string. */
    private final String last;

    
    /**
     * Name constructor.
     * @param first name string
     * @param middle name string
     * @param last name string
     */
    public Name(
        String first, 
        String middle, 
        String last
    ) throws IllegalArgumentException {
        if (!valid(first) || !valid(last)) {
            throw new IllegalArgumentException(
                "First or last name cannot be null or empty."
            );
        }
        
        this.first = first;
        this.middle = middle;
        this.last = last;
    }
    
    /**
     * Name constructor.
     * @param first name string
     * @param last name string
     */
    public Name(
        String first,
        String last
    ) throws IllegalArgumentException { 
        if (!valid(first) || !valid(last)) {
            throw new IllegalArgumentException(
                "First or last name cannot be null or empty."
            );
        }
       
        this.first = first;
        this.middle = null;
        this.last = last;
    }
    
    /**
     * valid name entry.
     * @param n string test
     * @return valid boolean
     */
    private boolean valid(String n) {
        return !(n.equals("") || n.equals(null));
    }

    /**
     * getFirst.
     * @return first name string.
     */
    public String getFirst() {
        return this.first;
    }

    /**
     * getMiddle.
     * @return middle name string.
     */
    public String getMiddle() {
        return this.middle;
    }
    
    /**
     * getLast.
     * @return last name string.
     */
    public String getLast() {
        return this.last;
    }

    /** 
     * compareTo other Name.
     * @param n Name object
     * @return compared int
     */
    @Override
    public int compareTo(Name n) {
        if (!this.last.equals(n.last)) {
            return this.last.compareTo(n.last);
        } else {
            if (!this.first.equals(n.first)) {
                return this.first.compareTo(n.first);
            } else {
                return this.middle.compareTo(n.middle);
            }
        }
    }
    
    /**
     * toString names.
     * @return first last name string
     */
    public String toString() {
        return this.middle == null ? this.last + " " + this.first
                : this.last + " " + this.middle + " " + this.first;
    }
}
