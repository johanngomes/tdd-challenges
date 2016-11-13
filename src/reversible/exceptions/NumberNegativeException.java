package reversible.exceptions;

public class NumberNegativeException extends Exception {
    public NumberNegativeException() {
        super("The number should not be negative");
    }
}
