package reversible;

import reversible.exceptions.NumberNegativeException;
import reversible.exceptions.NumberNotReversibleException;

public class Number {
    private Integer number;

    public Number(Integer number) throws NumberNegativeException {
        isPositive(number);

        this.number = number;
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
