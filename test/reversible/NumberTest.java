package reversible;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class NumberTest {
    @Test
    public void shouldReturnANumber() {
        Number number = new Number(5);
        assertThat(number.getNumber(), is(5));
    }

    @Test
    public void shouldReverseItself() {
        Number number = new Number(25);
        number.reverse();

        assertThat(number.getNumber(), is(52));
    }

    @Test
    public void shouldDereverseItself() {
        Number number = new Number(25);
        number.reverse();
        number.reverse();

        assertThat(number.getNumber(), is(25));
    }
}
