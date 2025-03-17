package ca.bcit.comp1510.lab09;

/**
 * CoinRunner.
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class CoinRunner {

    /**
     * main program entry.
     * @param args unused.
     */
    public static void main(String[] args) {
        Coin c = new Coin();
        
        int headsCurrent = 0;
        int headsMax = 0;
        
        final int flips = 100;
        for (int i = 0; i < flips; i++) {
            c.flip();
            Coin.CoinFace face = c.getFace();
            if (face == Coin.CoinFace.Heads) {
                headsCurrent++;
                headsMax = headsCurrent > headsMax ? headsCurrent : headsMax;
            } else {
                headsCurrent = 0;
            }
            System.out.println(face);
        }
        
        System.out.println("The longest run of heads is " + headsMax);
    }
}
