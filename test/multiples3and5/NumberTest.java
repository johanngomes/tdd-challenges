package multiples3and5;

import multiples3and5.exceptions.NegativeNumberException;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class NumberTest {
    @Test
    public void shouldReturnNumber() throws NegativeNumberException {
        Number number = new Number(5);
        assertThat(number.getValue(), is(5));
    }

    @Test(expected = NegativeNumberException.class)
    public void shouldNotReturnANegativeNumber() throws NegativeNumberException {
        new Number(-3);
    }
}