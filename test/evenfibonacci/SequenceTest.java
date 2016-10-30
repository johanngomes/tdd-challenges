package evenfibonacci;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SequenceTest {

    @Test
    public void shouldReturnASequenceOfNumbers() {
        Sequence sequence = new Sequence();

        sequence.addNumber(new Number(10));
        sequence.addNumber(new Number(20));
        sequence.addNumber(new Number(30));

        List<Number> numbers = sequence.getSequence();

        Assert.assertThat(numbers.get(0).getValue(), Is.is(10));
        Assert.assertThat(numbers.get(1).getValue(), Is.is(20));
        Assert.assertThat(numbers.get(2).getValue(), Is.is(30));
    }

}