package multiples3and5;

import multiples3and5.exceptions.NegativeNumberException;

public class Number {
    private int value;

    public Number(int value) throws NegativeNumberException {
        this.setValue(value);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) throws NegativeNumberException {
        verifyNegativeValue(value);

        this.value = value;
    }

    private void verifyNegativeValue(int value) throws NegativeNumberException {
        if (value < 0) {
            throw new NegativeNumberException();
        }
    }
}
