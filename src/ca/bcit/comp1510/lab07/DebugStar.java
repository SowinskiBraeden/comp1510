package ca.bcit.comp1510.lab07;

/**
 * DebugStar does something.
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class DebugStar {
    
    /**
     * main drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        final int six = 6;
        final int seven = 7;
        run("+", six, seven);
        run("-", six, seven);
        run(six);
    }

    /**
     * Operation gets operation.
     * @param key string
     * @return Operation
     */
    private static Operation getOperation(final String key) {
        final Operation operation;
        if (key.equals("+")) {
            operation = new Add();
        } else {
            operation = new Subtract();
        }
        
        return (operation);
    }

    /**
     * run runs stuff.
     * @param key final string
     * @param a final int 
     * @param b final int
     */
    private static void run(final String key, final int a, final int b) {
        final Operation operation;
        final int result;
        operation = getOperation(key);
        result = operation.perform(a, b);
        System.out.println("result = " + result);
    }
    
    /**
     * run runs stuff.
     * @param n final int
     */
    private static void run(final int n) {
        final Factorial factorial;
        final int result;
        factorial = new Factorial();
        result = factorial.perform(n);
        System.out.println("result = " + result);
    }

}

interface Operation {
    int perform(int a, int b);
}

class Add implements Operation {
    @Override
    public int perform(final int a, final int b) {
        return (a + b);
    }
}

class Subtract implements Operation {
    @Override
    public int perform(final int a, final int b) {
        return (a - b);
    }
}

class Factorial {
    int perform(final int n) {
        int ret;
        ret = 1;
        for (int i = 1; i < n; i++) {
            ret *= i;
        }
        return (ret);
    }
}
