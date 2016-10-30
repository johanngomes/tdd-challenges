package evenfibonacci;

import evenfibonacci.exceptions.FibonacciSequenceLimitLessThanTwo;

public class Fibonacci {
    private final int limitByNumber;
    private final int limitByLength;

    private Sequence sequence;

    public Fibonacci(int limitByNumber, int limitByLength) {
        this.sequence = new Sequence();
        this.limitByNumber = limitByNumber;
        this.limitByLength = limitByLength;
    }

    public Sequence getLimitedSequence() throws FibonacciSequenceLimitLessThanTwo {
        builtSequence();

        return sequence;
    }

    private void builtSequence() throws FibonacciSequenceLimitLessThanTwo {
        checkValidLimitLength();

        addTwoFirstFibonacciNumbersToSequence();

        addNextFibonacciNumbersToSequence();
    }

    private void checkValidLimitLength() throws FibonacciSequenceLimitLessThanTwo {
        if(limitByLength < 2) {
            throw new FibonacciSequenceLimitLessThanTwo();
        }
    }

    private void addNextFibonacciNumbersToSequence() {
        for(int n = 1; n < limitByLength; n++) {
            Number numberToBeAdded = new Number(sequence.getSequence().get(n - 1).getValue()
                                              + sequence.getSequence().get(n).getValue());

            if(numberToBeAdded.getValue() > limitByNumber) {
                break;
            }

            sequence.addNumber(numberToBeAdded);
        }
    }

    private void addTwoFirstFibonacciNumbersToSequence() {
        sequence.addNumber(new Number(1));
        sequence.addNumber(new Number(2));
    }
}
