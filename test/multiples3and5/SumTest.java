package multiples3and5;

import multiples3and5.exceptions.NegativeNumberException;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SumTest {

    @Test
    public void shouldSumMultiplesOf3Behind1000() throws NegativeNumberException {
        Sum sum = new Sum();
        assertThat(sum.multiplesOf3Behind1000(), is(166833));
    }

}