package evenfibonacci;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class NumberTest {

    @Test
    public void shouldReturnFive() {
        Number number = new Number(5);
        assertThat(number.getValue(), is(5));
    }

    @Test
    public void shouldAssertThat5IsEven() {
        Number number = new Number(5);
        assertThat(number.isEven(), is(true));
    }

    @Test
    public void shouldAssertThat6IsNotEven() {
        Number number = new Number(6);
        assertThat(number.isEven(), is(false));
    }

    @Test
    public void shouldAssertThat11IsEven() {
        Number number = new Number(11);
        assertThat(number.isEven(), is(true));
    }
}