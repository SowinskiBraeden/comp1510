package ca.bcit.comp1510.lab10;

/**
 * Collisions between RandomWalkers.
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class Collisions {

    /**
     * samePosition detects if two RandomWalkers 
     * share the same coordinates.
     * @param a RandomWalker
     * @param b RandomWaler
     * @return boolean of matching coordinates
     */
    public static boolean samePosition(RandomWalker a, RandomWalker b) {
        return a.getX() == b.getX() && a.getY() == b.getY();
    }
    
    /**
     * main program entry.
     * @param args unused
     */
    public static void main(String[] args) {
        final int bound = 2000000;
        final int steps = 100000;
        
        final int x1 = -3;
        final int y1 = 0;
        final int x2 = 3;
        final int y2 = 0;
        
        RandomWalker w1 = new RandomWalker(steps, x1, y1, bound);
        RandomWalker w2 = new RandomWalker(steps, x2, y2, bound);

        boolean collided = false;
        int stepsTaken = 0;
        
        for (int i = 0; i < steps && !collided; i++) {
            w1.takeStep();
            w2.takeStep();
            collided = samePosition(w1, w2);
            stepsTaken++;
        }
        
        String message = collided ? "Collision!" : "No Collision.";
        System.out.println(message);
        System.out.println("After " + stepsTaken + " steps");
    }
}
