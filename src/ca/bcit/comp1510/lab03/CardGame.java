package ca.bcit.comp1510.lab03;

/**
 * CardGame give a random card.
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class CardGame {
    enum Rank {
        /**
         * ace is ace.
         */
        ace,
        /**
         * two is two.
         */
        two,
        /**
         * three is three.
         */
        three,
        /**
         * four is four.
         */
        four,
        /**
         * five is five.
         */
        five,
        /**
         * six is six.
         */
        six,
        /**
         * seven is seven.
         */
        seven,
        /**
         * eight is eight.
         */
        eight,        
        /**
         * nine is nine.
         */
        nine,
        /**
         * ten is ten.
         */
        ten,
        /**
         * jack is jack.
         */
        jack,
        /**
         * queen is queen.
         */
        queen,
        /**
         * king is king.
         */
        king
    }
    
    enum Suit {
        /**
         * hearts.
         */
        hearts,
        /**
         * diamonds.
         */
        diamonds,
        /**
         * clubs.
         */
        clubs,
        /**
         * spades.
         */
        spades
    }
    
    /*
     * Thank you checkstyle for making things very very clear. 
     * with the need for javadoc comments on every enum variant.
     */
    
    /**
     * main program entry.
     * @param args unused
     */
    public static void main(String[] args) {
        int randomRankChoice = (int) (Math.random() * Rank.values().length);
        int randomSuitChoice = (int) (Math.random() * Suit.values().length);
        Rank randomRank = Rank.values()[randomRankChoice];
        Suit randomSuit = Suit.values()[randomSuitChoice];
        
        System.out.printf("%s of %s", randomRank, randomSuit);
    }
}
