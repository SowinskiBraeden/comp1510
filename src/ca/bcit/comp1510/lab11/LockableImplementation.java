package ca.bcit.comp1510.lab11;

/**
 * LockableImplementation is a demo of 
 * implementing Lockable interface.
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class LockableImplementation implements Lockable {

    /** key of class. */
    private int key;
    
    /** locked state of class. */
    private boolean locked;
    
    /** LockableImplementation empty constructor. */
    public LockableImplementation() {
        this.key = 0;
        this.locked = false;
    }

    /** 
     * setKey value.
     * @param key to set
     */
    public void setKey(int key) {
        this.key = key;
    }
    
    /**
     * lock Object with key.
     * @param keyIn to lock.
     * @return success
     */
    public boolean lock(int keyIn) {
        this.locked = this.key == keyIn ? true : this.locked;
        return this.key == keyIn;
    }
    
    /**
     * unlock Object with key.
     * @param keyIn to unlock.
     * @return success
     */
    public boolean unlock(int keyIn) {
        this.locked = this.key == keyIn ? false : this.locked;
        return this.key == keyIn;
    }

    /**
     * locked Object state.
     * @return locked
     */    
    public boolean locked() {
        return this.locked;
    }
    
    /** 
     * doSomething as examplet to demo locked.
     * @param data string
     * */
    public void doSomething(String data) {
        if (this.locked) {
            return;
        }
        
        System.out.println("Doing something with " + data);
    }
}
