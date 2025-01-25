package lab1;

/**
* Plus demonstrates the different behaviours of the + operator.
* @author Braeden Sowinski
* @version 1.0.0
*/
public class Plus {
    /**
    * main program entry.
    * @param args unused
    */
    public static void main(String[] args) {
        System.out.println("This is a long string that is the"
                + " concatenation of two shorter strings.");

        final int years = 70;
        
        System.out.println("The first computer was invented about " 
                + years + " years ago");
        
        final int num1 = 8;
        final int num2 = 5;
        System.out.println("8 plus 5 is " + num1 + num2);
        System.out.println("8 plus 5 is " + (num1 + num2));
        System.out.println(num1 + num2 + " equals 8 plus 5.");
    }
}
