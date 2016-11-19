package reversible;

import reversible.exceptions.NumberNegativeException;
import reversible.exceptions.NumberNotReversibleException;

public class Number {
    private Integer number;

    public Number(Integer number) throws NumberNegativeException {
        isPositive(number);

        this.number = number;
    }

    public boolean isOdd() {
        if (number % 2 != 0) {
            return true;
        }
        return false;
    }

    public boolean allDigitsAreOdd() {
        int[] digits = getArrayOfDigits();

        for(int digit = 0; digit < digits.length; digit++) {
            if (digitIsEven(digits[digit])) return false;
        }

        return true;
    }

    private boolean digitIsEven(int digit) {
        if (digit % 2 == 0) {
            return true;
        }
        return false;
    }

    private int[] getArrayOfDigits() {
        return Integer.toString(number).chars().map(c -> c-='0').toArray();
    }

    public Integer getNumber() {
        return number;
    }

    public void reverse() throws NumberNotReversibleException {
        isReversible();

        StringBuffer reversedNumber = new StringBuffer(number.toString()).reverse();
        number = Integer.parseInt(reversedNumber.toString());
    }

    private void isReversible() throws NumberNotReversibleException {
        if (number < 10) {
            throw new NumberNotReversibleException();
        }
    }

    private void isPositive(int number) throws NumberNegativeException {
        if (number < 0) {
            throw new NumberNegativeException();
        }
    }
}
