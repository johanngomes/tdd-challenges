package evenfibonacci;

import evenfibonacci.exceptions.FibonacciSequenceLimitLessThanTwo;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FibonacciTest {

    private final int FOUR_MILLION = 4000000;

    @Test
    public void shouldBuildSequenceOf5Numbers() throws FibonacciSequenceLimitLessThanTwo {
        Fibonacci fibonacci = new Fibonacci(FOUR_MILLION, 5);

        Sequence fibonacciSequenceOf5Numbers = fibonacci.getLimitedSequence();

        assertThat(fibonacciSequenceOf5Numbers.getSequence().get(0).getValue(), is(1));
        assertThat(fibonacciSequenceOf5Numbers.getSequence().get(1).getValue(), is(2));
        assertThat(fibonacciSequenceOf5Numbers.getSequence().get(2).getValue(), is(3));
        assertThat(fibonacciSequenceOf5Numbers.getSequence().get(3).getValue(), is(5));
        assertThat(fibonacciSequenceOf5Numbers.getSequence().get(4).getValue(), is(8));
    }

    @Test
    public void shouldBuildSequenceOf2Numbers() throws FibonacciSequenceLimitLessThanTwo {
        Fibonacci fibonacci = new Fibonacci(FOUR_MILLION, 5);

        Sequence fibonacciSequenceOf5Numbers = fibonacci.getLimitedSequence();

        assertThat(fibonacciSequenceOf5Numbers.getSequence().get(0).getValue(), is(1));
        assertThat(fibonacciSequenceOf5Numbers.getSequence().get(1).getValue(), is(2));
    }

    @Test(expected = FibonacciSequenceLimitLessThanTwo.class)
    public void shouldNotBuildSequenceOf1Number() throws FibonacciSequenceLimitLessThanTwo {
        Fibonacci fibonacci = new Fibonacci(FOUR_MILLION, 1);

        fibonacci.getLimitedSequence();
    }

    @Test
    public void shouldBuildASequenceLimitedByNumbersLessThan4Million() throws FibonacciSequenceLimitLessThanTwo {
        Fibonacci fibonacci = new Fibonacci(FOUR_MILLION, 1000000);

        Sequence sequence = fibonacci.getLimitedSequence();

        assertThat(sequence.getSequence().get(31).getValue(), is(3524578));
    }

}