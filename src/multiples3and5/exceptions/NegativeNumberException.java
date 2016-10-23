package multiples3and5.exceptions;

public class NegativeNumberException extends Exception {
    public NegativeNumberException() {
        super("The number must be >= 0");
    }
}
