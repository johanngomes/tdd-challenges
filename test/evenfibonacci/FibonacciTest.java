package evenfibonacci;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FibonacciTest {

    @Test
    public void shouldBuildSequenceOf5Numbers() {
        Fibonacci fibonacci = new Fibonacci(5);

        Sequence fibonacciSequenceOf5Numbers = fibonacci.getLimitedSequenceOf5Numbers();

        assertThat(fibonacciSequenceOf5Numbers.getSequence().get(0).getValue(), is(1));
        assertThat(fibonacciSequenceOf5Numbers.getSequence().get(1).getValue(), is(2));
        assertThat(fibonacciSequenceOf5Numbers.getSequence().get(2).getValue(), is(3));
        assertThat(fibonacciSequenceOf5Numbers.getSequence().get(3).getValue(), is(5));
        assertThat(fibonacciSequenceOf5Numbers.getSequence().get(4).getValue(), is(8));
    }

}