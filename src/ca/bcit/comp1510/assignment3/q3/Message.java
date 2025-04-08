package ca.bcit.comp1510.assignment3.q3;

/**
 * Message of MIXChars.
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class Message {
    
    /** maximum number of chars stored per segment. */
    public static final int MAXCHARPERSEGMENT = 11;

    /** base of MIX character set 0 to 55. */
    public static final int BASE = 56;
    
    /** segments of a MIXChar[] where each long holds 11 MIXChar characters. */
    private long[] segments;
    
    /** number of characters stored in segments. */
    private int numChars;

    /**
     * Message constructor.
     * @param m message to store
     */
    public Message(MIXChar[] m) {
        int segmentsLength = (int) Math.ceil(m.length / MAXCHARPERSEGMENT);
        this.segments = new long[segmentsLength];
        generateSegments(m);
    }
    
    /**
     * Message constructor.
     * @param s message as string
     */
    public Message(String s) {
        MIXChar[] m = MIXChar.toMIXChar(s);
        int segmentsLength = (int) Math.ceil(m.length / MAXCHARPERSEGMENT);
        this.segments = new long[segmentsLength];
        generateSegments(m);
    }
    
    /**
     * generateSegments loads MIXChar values into
     * segments.
     * @param m MIXChar[]
     */
    private void generateSegments(MIXChar[] m) {
        this.segments = m.length % MAXCHARPERSEGMENT == 0 
                      ? new long[(m.length / MAXCHARPERSEGMENT)]
                      : new long[(m.length / MAXCHARPERSEGMENT) + 1];
        
        for (int i = 0; i < this.segments.length; i++) {
            for (
                int j = 0; 
                j < MAXCHARPERSEGMENT && this.numChars < m.length;
                j++
            ) {
                MIXChar c = m[this.numChars];
                
                long value = c.ordinal();
                value *= (long) Math.pow(BASE, j);
                
                this.segments[i] += value;
                this.numChars++;
            }
        }
    }
    

    /**
     * toString returns string message.
     * @return string
     */
    public String toString() {
        String message = "";        
        for (int i = 0; i < this.segments.length; i++) {
            long segment = this.segments[i];
            while (segment != 0) {                
                int value = (int) Long.remainderUnsigned(
                    segment, 
                    BASE
                );
                char c = MIXChar.CHARS[value];
                message += c;
                segment = Long.divideUnsigned(segment, BASE);
            }
        }
        return message;
    }

    /**
     * toLongs shows encoded longs.
     * @return longs string
     */
    public String toLongs() {
        String longs = "";
        for (int i = 0; i < this.segments.length; i++) {
            longs += Long.toUnsignedString(this.segments[i]) + " ";
        }
        return longs;
    }
}
