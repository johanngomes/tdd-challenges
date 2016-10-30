package evenfibonacci;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class SumTest {

    @Test
    public void shouldReturnTheSumOfEvenNumbersInASequence() {
        Sequence sequence = new Sequence();

        sequence.addNumber(new Number(3));
        sequence.addNumber(new Number(5));
        sequence.addNumber(new Number(2));

        Sum sum = new Sum(sequence);

        Assert.assertThat(sum.getSumOfEvenNumbers(), Is.is(8));
    }

}