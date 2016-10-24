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

    @Test
    public void shouldReturnThat3IsMultipleOf3() throws NegativeNumberException {
        Number number = new Number(3);
        assertThat(number.isMultipleOf(3), is(true));
    }

    @Test
    public void shouldReturnThat4IsNotMultipleOf3() throws NegativeNumberException {
        Number number = new Number(4);
        assertThat(number.isMultipleOf(3), is(false));
    }

    @Test
    public void shouldReturnThat25IsMultipleOf5() throws NegativeNumberException {
        Number number = new Number(25);
        assertThat(number.isMultipleOf(5), is(true));
    }

    @Test
    public void shouldReturnThat2IsNotMultipleOf5() throws NegativeNumberException {
        Number number = new Number(2);
        assertThat(number.isMultipleOf(5), is(false));
    }
}