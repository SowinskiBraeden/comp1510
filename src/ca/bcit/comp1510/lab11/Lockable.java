package ca.bcit.comp1510.lab11;

/**
 * Lockable does stuff.
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public interface Lockable {
    
    /** 
     * setKey value.
     * @param key to set
     */
    void setKey(int key);
    
    /**
     * lock Object with key.
     * @param key to lock.
     * @return success
     */
    boolean lock(int key);
    
    /**
     * unlock Object with key.
     * @param key to unlock.
     * @return success
     */
    boolean unlock(int key);

    /**
     * locked Object state.
     * @return locked
     */    
    boolean locked();
}
