package evenfibonacci;

import evenfibonacci.exceptions.FibonacciSequenceLimitLessThanTwo;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SumTest {

    private final int FOUR_MILLION = 4000000;

    @Test
    public void shouldReturnTheSumOfEvenNumbersInASequence() {
        Sequence sequence = new Sequence();

        sequence.addNumber(new Number(3));
        sequence.addNumber(new Number(5));
        sequence.addNumber(new Number(2));

        Sum sum = new Sum(sequence);

        assertThat(sum.getSumOfEvenNumbers(), is(8));
    }

    @Test
    public void shouldReturnTheSumOfEvenNumbersInASequenceOfFibonacciNumbersLimitedByValue4Million()
            throws FibonacciSequenceLimitLessThanTwo {
        Fibonacci fibonacci = new Fibonacci(FOUR_MILLION, 1000000);

        Sequence sequence = fibonacci.getLimitedSequence();

        Sum sum = new Sum(sequence);

        assertThat(sum.getSumOfEvenNumbers(), is(4613731));
    }

}