package multiples3and5;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class NumberTest {
    @Test
    public void shouldReturnNumber() {
        Number number = new Number(5);
        assertThat(number.value, is(5));
    }

}