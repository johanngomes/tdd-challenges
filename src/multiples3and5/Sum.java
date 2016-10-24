package multiples3and5;

import multiples3and5.exceptions.NegativeNumberException;

public class Sum {
    public int multiplesOf3Behind1000() throws NegativeNumberException {
        int sum = 0;

        for(int number=1; number < 1000; number++) {
            Number numberToSum = new Number(number);

            if (numberToSum.isMultipleOf(3)) {
                sum += numberToSum.getValue();
            }
        }

        return sum;
    }
}
