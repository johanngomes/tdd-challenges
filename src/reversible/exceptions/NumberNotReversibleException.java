package reversible.exceptions;

public class NumberNotReversibleException extends Exception {
    public NumberNotReversibleException() {
        super("The number must have more than one digit to be reversible");
    }
}
