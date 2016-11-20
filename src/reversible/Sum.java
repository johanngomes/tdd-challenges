package reversible;

import reversible.exceptions.NumberNegativeException;
import reversible.exceptions.NumberNotReversibleException;

public final class Sum {
    public static int sum(int number, int otherNumber) {
        return number + otherNumber;
    }

    public static int reversibleNumbersBelow(int number) throws NumberNegativeException, NumberNotReversibleException {
        int reversibleNumbersCount = 0;

        for(int n=10; n <= number; n++) {
            Number reversedNumber = new Number(n);
            reversedNumber.reverse();

            boolean isReversible = isReversible(n, reversedNumber);

            reversibleNumbersCount = getReversibleNumbersCount(reversibleNumbersCount, n, reversedNumber, isReversible);
        }

        return reversibleNumbersCount;
    }

    private static boolean isReversible(int n, Number numberToBeReverse) throws NumberNegativeException {
        int sumOfNumberWithReversible = n + numberToBeReverse.getNumber();

        return new Number(sumOfNumberWithReversible).allDigitsAreOdd();
    }

    private static int getReversibleNumbersCount(int reversibleNumbersCount, int n, Number numberToBeReverse, boolean isReversible) {
        if( (isReversible) && ((n > 9) && (numberToBeReverse.getNumber() > 9)) ){
            reversibleNumbersCount++;
        }

        return reversibleNumbersCount;
    }
}
