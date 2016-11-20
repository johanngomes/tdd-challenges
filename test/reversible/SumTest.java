package reversible;

import org.junit.Test;
import reversible.exceptions.NumberNegativeException;
import reversible.exceptions.NumberNotReversibleException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SumTest {
    @Test
    public void shouldReturnTheSumOfTwoNumbers() {
        assertThat(Sum.sum(1, 2), is(3));
    }

    @Test
    public void shouldReturnTheNumberOfReversibleNumbersBelow1000() throws NumberNotReversibleException, NumberNegativeException {
        assertThat(Sum.reversibleNumbersBelow(1000), is(120));
    }

    @Test
    public void shouldReturnTheNumberOfReversibleNumbersBelow10000000() throws NumberNotReversibleException, NumberNegativeException {
        assertThat(Sum.reversibleNumbersBelow(10000000), is(73370));
    }
}
