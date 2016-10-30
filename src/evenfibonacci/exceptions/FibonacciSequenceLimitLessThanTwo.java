package evenfibonacci.exceptions;

public class FibonacciSequenceLimitLessThanTwo extends Exception {
    public FibonacciSequenceLimitLessThanTwo() {
        super("The Fibonacci sequence limit but be greater than one");
    }
}
