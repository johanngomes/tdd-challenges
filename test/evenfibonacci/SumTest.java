package evenfibonacci;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SumTest {

    @Test
    public void shouldReturnTheSumOfEvenNumbersInASequence() {
        Sequence sequence = new Sequence();

        sequence.addNumber(new Number(3));
        sequence.addNumber(new Number(5));
        sequence.addNumber(new Number(2));

        Sum sum = new Sum(sequence);

        assertThat(sum.getSumOfEvenNumbers(), is(8));
    }

}