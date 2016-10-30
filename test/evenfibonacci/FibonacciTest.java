package evenfibonacci;

import evenfibonacci.exceptions.FibonacciSequenceLimitLessThanTwo;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FibonacciTest {

    @Test
    public void shouldBuildSequenceOf5Numbers() throws FibonacciSequenceLimitLessThanTwo {
        Fibonacci fibonacci = new Fibonacci(5);

        Sequence fibonacciSequenceOf5Numbers = fibonacci.getLimitedSequence();

        assertThat(fibonacciSequenceOf5Numbers.getSequence().get(0).getValue(), is(1));
        assertThat(fibonacciSequenceOf5Numbers.getSequence().get(1).getValue(), is(2));
        assertThat(fibonacciSequenceOf5Numbers.getSequence().get(2).getValue(), is(3));
        assertThat(fibonacciSequenceOf5Numbers.getSequence().get(3).getValue(), is(5));
        assertThat(fibonacciSequenceOf5Numbers.getSequence().get(4).getValue(), is(8));
    }

    @Test
    public void shouldBuildSequenceOf2Numbers() throws FibonacciSequenceLimitLessThanTwo {
        Fibonacci fibonacci = new Fibonacci(5);

        Sequence fibonacciSequenceOf5Numbers = fibonacci.getLimitedSequence();

        assertThat(fibonacciSequenceOf5Numbers.getSequence().get(0).getValue(), is(1));
        assertThat(fibonacciSequenceOf5Numbers.getSequence().get(1).getValue(), is(2));
    }

    @Test(expected = FibonacciSequenceLimitLessThanTwo.class)
    public void shouldNotBuildSequenceOf1Number() throws FibonacciSequenceLimitLessThanTwo {
        Fibonacci fibonacci = new Fibonacci(1);

        fibonacci.getLimitedSequence();
    }

}