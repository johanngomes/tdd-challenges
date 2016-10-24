package multiples3and5;

import multiples3and5.exceptions.NegativeNumberException;

public class Number {
    private int ZERO = 0;

    private int value;

    public Number(int value) throws NegativeNumberException {
        this.setValue(value);
    }

    public boolean isMultipleOf(int value) {
        if (this.value % value == ZERO) {
            return true;
        }
        return false;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) throws NegativeNumberException {
        verifyNegativeValue(value);

        this.value = value;
    }

    private void verifyNegativeValue(int value) throws NegativeNumberException {
        if (value < ZERO) {
            throw new NegativeNumberException();
        }
    }
}
