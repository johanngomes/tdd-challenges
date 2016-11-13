package reversible;

import reversible.exceptions.NumberNotReversibleException;

public class Number {
    private Integer number;

    public Number(Integer number) {
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
}
