package reversible;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SumTest {
    @Test
    public void shouldReturnTheSumOfTwoNumbers() {
        assertThat(Sum.sum(1, 2), is(3));
    }
}
