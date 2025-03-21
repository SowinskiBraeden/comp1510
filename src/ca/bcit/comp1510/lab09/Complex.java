package ca.bcit.comp1510.lab09;

/**
 * Immutable Complex number type.
 * @author blink
 * @version 2025
 * @param re Real part of number.
 * @param im Imaginary part of number.
 */
public record Complex(double re, double im) {
    
    /** Imaginary number I. */
    public static final Complex I = new Complex(0, 1);
    
    /** Complex number 0. */
    public static final Complex ZERO = new Complex(0, 0);
    
    /** Complex number 1. */
    public static final Complex ONE = new Complex(1, 0);
            
    /** 
     * Factory method for complex number in polar form.
     * @param radius magnitude of number
     * @param angle argument of number
     * @return corresponding Complex number
     */
    public static Complex polarComplex(double radius, double angle) {
        
        return new Complex(radius * Math.cos(angle), 
                radius * Math.sin(angle));
    }
    
    /**
     * Returns absolute value of this.
     * @return the absolute value
     */
    public double abs() {
        return Math.hypot(re, im);
    }
    
    /**
     * Returns argument of this, the angle with respect to 
     * the positive real axis in range -π to π.
     * @return the argument, in radians
     */
    public double arg() {
        return Math.atan2(im, re);
    }
    
    /**
     * Returns conjugate value of this.
     * @return the conjugate value
     */
    public Complex conjugate() {
        return new Complex(re, -im);
    }

    /**
     * Adds parameter to this complex number.
     * @param op2 complex number to add
     * @return sum of this + op2
     */
    public Complex add(Complex op2) {
        return new Complex(re + op2.re, im + op2.im);
    }
    
    /**
     * real add.
     * @param op2 real value to add
     * @return result
     */
    public Complex add(double op2) {
        return new Complex(re + op2, im);
    }
    
    /**
     * Subtracts parameter from this complex number.
     * @param op2 complex number to subtract
     * @return difference of this - op2
     */
    public Complex subtract(Complex op2) {
        return new Complex(re - op2.re, im - op2.im);
    }
    
    /**
     * real subtract.
     * @param op2 real value to subtract
     * @return result
     */
    public Complex subtract(double op2) {
        return new Complex(re - op2, im);
    }
    
    /**
     * Multiplies parameter with this complex number.
     * @param op2 complex number to multiply
     * @return product of this * op2
     */
    public Complex multiply(Complex op2) {
        double realPart = re * op2.re - im * op2.im;
        double imagPart = re * op2.im + im * op2.re;
        return new Complex(realPart, imagPart);
    }
    
    /**
     * scalar multiply.
     * @param op2 scalar value to multiply
     * @return result
     */
    public Complex multiply(double op2) {
        return new Complex(re * op2, im * op2);
    }
    
    /**
     * Returns reciprocal of this complex number.
     * @return 1 / this
     */
    public Complex reciprocal() {
        double denominator = re * re + im * im;
        if (denominator == 0.0) {
            throw new IllegalArgumentException(
                    "tried to take reciprocal of 0");
        }
        return new Complex(re / denominator, -im / denominator);
    }
    
    /**
     * Divides parameter into this complex number.
     * @param op2 complex number to divide
     * @return quotient of this / op2
     */
    public Complex divide(Complex op2) {
        if (op2.re == 0.0 && op2.im == 0.0) {
            throw new IllegalArgumentException("Tried to divide by zero");
        }
        return multiply(op2.reciprocal());
    }

    /**
     * scalar divide.
     * @param op2 scalar value to divide
     * @return result
     */
    public Complex divide(double op2) {
        if (op2 == 0.0) {
            throw new IllegalArgumentException("Tried to divide by 0.0");
        }
        return new Complex(re / op2, im);
    }
    
    /**
     * Return complex square root of this.
     * @return the square root
     */
    public Complex sqrt() {
        return polarComplex(Math.sqrt(this.abs()), this.arg() / 2.0);
    }
    
    /**
     * Return the exponential e to the power of this, 
     * where e is Euler's constant Math.E.
     * @return e to the power this
     */
    public Complex exp() {
        return new Complex(Math.exp(re) * Math.cos(im), 
                           Math.exp(re) * Math.sin(im));
    }
    
    /**
     * Return the natural logarithm of this, 
     * with argument in range -π to π.  
     * @return e to the power this
     */
    public Complex log() {
        return new Complex(Math.log(abs()), arg());
    }
    
    /**
     * Converts to string with special cases for real and imaginary
     * values.
     * @return String representation of the complex number
     */
    public String toString() {
        if (im == 0.0) {
            return Double.toString(re);
        } else if (re == 0.0) {
            return Double.toString(im) + "i";
        } else if (im > 0) {
            return Double.toString(re) + " + " 
                      + Double.toString(im) + "i";
        } else {
            return Double.toString(re) + " - " 
                    + Double.toString(-im) + "i";   
        }
    }
}
