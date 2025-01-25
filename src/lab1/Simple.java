package lab1;

/**
 * Simple talk about valid variable identifiers.
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class Simple {

    /**
     * main program entry.
     * @param args unused
     */
    public static void main(String[] args) {
        System.out.print("I love Java!\n");
    }
}

/*
 * simple        - invalid, cannot match class name
 * SimpleProgram - valid
 * 1_Simple      - invalid, cannot start with a number
 * _simple_      - valid
 * *Simple*      - invalid, contains invalid characters (*)
 * $123_45       - valid
 * Simple!       - invalid, contains an invalid character (!)
 */
