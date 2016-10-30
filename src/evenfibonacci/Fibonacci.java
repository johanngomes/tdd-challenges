package evenfibonacci;

import evenfibonacci.exceptions.FibonacciSequenceLimitLessThanTwo;

public class Fibonacci {
    private Sequence sequence;
    private int limitBy;

    public Fibonacci(int limitBy) {
        this.sequence = new Sequence();
        this.limitBy = limitBy;
    }

    public Sequence getLimitedSequence() throws FibonacciSequenceLimitLessThanTwo {
        builtSequence();

        return sequence;
    }

    private void builtSequence() throws FibonacciSequenceLimitLessThanTwo {
        checkValidLimit();

        addTwoFirstFibonacciNumbersToSequence();

        addNextFibonacciNumbersToSequence();
    }

    private void checkValidLimit() throws FibonacciSequenceLimitLessThanTwo {
        if(limitBy < 2) {
            throw new FibonacciSequenceLimitLessThanTwo();
        }
    }

    private void addNextFibonacciNumbersToSequence() {
        for(int n=1; n < limitBy; n++) {
            sequence.addNumber(new Number(sequence.getSequence().get(n - 1).getValue()
                                        + sequence.getSequence().get(n).getValue()));
        }
    }

    private void addTwoFirstFibonacciNumbersToSequence() {
        sequence.addNumber(new Number(1));
        sequence.addNumber(new Number(2));
    }
}
