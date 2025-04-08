package ca.bcit.comp1510.assignment3.q3;

/**
 * MIXChar represents a MIX Character.
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class MIXChar {

    /** MIX character array. */
    public static final char[] CHARS = {
        ' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'Δ', 'J',
        'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'Σ', 'Π', 'S', 'T',
        'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5',
        '6', '7', '8', '9', '.', ',', '(', ')', '+', '-', '*', '/',
        '=', '$', '<', '>', '@', ';', ':', '\''
    };
    
    /** character. */
    private final int value;
    
    /**
     * MixChar constructor.
     * @param c character
     */
    public MIXChar(char c) throws IllegalArgumentException {
        if (!isMIXChar(c)) {
            throw new IllegalArgumentException(
                "Invalid MIX Character provided."
            );
        }
        this.value = c;
    }
    
    /**
     * isMIXChar check if a given character
     * is a valid MIX character.
     * @param c char to check
     * @return boolean
     */
    static boolean isMIXChar(char c) {
        for (int i = 0; i < CHARS.length; i++) {
            if (CHARS[i] == c) {
                return true;
            }
        }
        return false;
    }

    /**
     * toChar converts this MIXChar character 
     * to corresponding Java char.
     * @return character
     */
    public char toChar() {
        return (char) this.value;
    }

    /**
     * convert MIXChar array to string.
     * @param c MIXChar array.
     * @return string
     */
    static String toString(MIXChar[] c) {
        char[] chars = new char[c.length];
        for (int i = 0; i < c.length; i++) {
            chars[i] = (char) c[i].ordinal();
        }
        return new String(chars);
    }

    /**
     * toMIXChar converts string to MIXChar array.
     * @param s string to convert.
     * @return MIXChar array
     */
    static MIXChar[] toMIXChar(String s) {
        MIXChar[] mix = new MIXChar[s.length()];
        for (int i = 0; i < mix.length; i++) {
            mix[i] = new MIXChar(s.charAt(i));
        }
        return mix;
    }

    /**
     * ordinal returns numeric valid of character.
     * @return numeric value
     */
    public int ordinal() {
        for (int i = 0; i < CHARS.length; i++) {
            if (this.value == CHARS[i]) {
                return i;
            }
        }
        return -1;
    }

    /**
     * toString converts MIXChar to 
     * corresponding Java char as a String.
     * @return mix char as string.
     */
    public String toString() {
        return "" + toChar();
    }
}
