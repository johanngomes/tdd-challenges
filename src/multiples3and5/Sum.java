package multiples3and5;

import multiples3and5.exceptions.NegativeNumberException;

public class Sum {
    private int sum = 0;

    public int multiplesOf3Behind1000() throws NegativeNumberException {
        for(int number=1; number < 1000; number++) {
            Number numberToSum = new Number(number);

            sumWithMultipleOf3(numberToSum);
        }

        return sum;
    }

    public int multiplesOf5Behind1000() throws NegativeNumberException {
        for(int number=1; number < 1000; number++) {
            Number numberToSum = new Number(number);

            sumWithMultipleOf5(numberToSum);
        }

        return sum;
    }

    private void sumWithMultipleOf3(Number numberToSum) {
        if (numberToSum.isMultipleOf(3)) {
            sum += numberToSum.getValue();
        }
    }

    private void sumWithMultipleOf5(Number numberToSum) {
        if (numberToSum.isMultipleOf(5)) {
            sum += numberToSum.getValue();
        }
    }
}
