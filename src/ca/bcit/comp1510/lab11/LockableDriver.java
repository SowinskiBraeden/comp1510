package ca.bcit.comp1510.lab11;

/**
 * LockableDriver drives Lockable Coin.
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class LockableDriver {

    /**
     * main program entry.
     * @param args unused.
     */
    public static void main(String[] args) {
        Coin coin = new Coin();
        
        System.out.println("Coin is " 
                + (coin.locked() ? "locked" : "unlocked"));
        
        System.out.println("Face: " + coin.getFace());
        System.out.println("Flipping...");
        coin.flip();
        System.out.println("Face: " + coin.getFace());

        System.out.println("Locking Coin...");
        final int key = 984757;
        coin.setKey(key);
        coin.lock(key);
        
        System.out.println("Flipping...");
        coin.flip();
        System.out.println("Face: " + coin.getFace());
        
        System.out.println("No change in face value because " 
                + "coin is locked and cannot be flipped.");
        
        System.out.println("Unlocking Coin...");
        coin.unlock(key);
        
        System.out.println("Flipping...");
        coin.flip();
        System.out.println("Face: " + coin.getFace());
    }
}
