package reversible;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class NumberTest {
    @Test
    public void shouldReturnANumber() {
        Number number = new Number(5);
        Assert.assertThat(number.getNumber(), is(5));
    }
}
