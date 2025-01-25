package lab1;

/**
* This program prints out 1 to 5 in three languages.
* @author = Braeden Sowinski
* @version = 1.0.0
*/
public class Count {

    // below is a javadoc comment, its different from multi line by
    // starting with two stars
    /**
     * main program entry.
     * @param args unused
     */
    public static void main(String[] args) {
        // Here is 1 to 5 in English
        System.out.println("One, two, three, four, five.");
        
        // Here is 1 to 5 in French
        System.out.println("Un, deux, trois, quatre, cinq.");
        
        // Here is 1 to 5 in Spanish
        System.out.println("Uno, dos, tres, cuatro, cinco");
    }
}

// removing one slash from the beginning of the comment makes it invalid
// adding slashes after the first two initial slashes is ok. they are ignored

/*
 * this is a multi-line comment
 */
