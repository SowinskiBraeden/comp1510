package ca.bcit.comp1510.assignment3.q1;

/**
 * Represents a street address.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 * @param streetAddress Street address.
 * @param city city.
 * @param state state or province.
 * @param postalCode postal code, zip code.
 */
public record Address(String streetAddress, String city, 
        String state, String postalCode) {

    /**
     * Returns a description of this Address object.
     *
     * @return formatted value of streetAddress, city, state, zipCode
     */
    public String toString() {
        String result;

        result = streetAddress + "\n";
        result += city + ", " + state + "  " + postalCode;

        return result;
    }
}

