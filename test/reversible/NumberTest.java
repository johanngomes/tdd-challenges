package reversible;

import org.junit.Test;
import reversible.exceptions.NumberNegativeException;
import reversible.exceptions.NumberNotReversibleException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class NumberTest {
    @Test
    public void shouldReturnANumber() throws NumberNegativeException {
        Number number = new Number(5);
        assertThat(number.getNumber(), is(5));
    }

    @Test
    public void shouldReverseItself() throws NumberNotReversibleException, NumberNegativeException {
        Number number = new Number(25);
        number.reverse();

        assertThat(number.getNumber(), is(52));
    }

    @Test
    public void shouldDereverseItself() throws NumberNotReversibleException, NumberNegativeException {
        Number number = new Number(25);
        number.reverse();
        number.reverse();

        assertThat(number.getNumber(), is(25));
    }

    @Test(expected = NumberNotReversibleException.class)
    public void shouldNotReverseANumberWithOneDigit() throws NumberNotReversibleException, NumberNegativeException {
        Number number = new Number(2);

        number.reverse();
    }

    @Test(expected = NumberNegativeException.class)
    public void shouldNotCreateANegativeNumber() throws NumberNegativeException {
        new Number(-1);
    }

    @Test
    public void shouldRecognizeAnOddNumber() throws NumberNegativeException {
        Number number = new Number(5);

        assertThat(number.isOdd(), is(true));
    }

    @Test
    public void shouldRecognizeANonOddNumber() throws NumberNegativeException {
        Number number = new Number(2);

        assertThat(number.isOdd(), is(false));
    }
}
