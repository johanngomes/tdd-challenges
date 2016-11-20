package arraycount9;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void shouldReturnNumberOf9sInAnArrayWhenThereAre9s() {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(9);
        numbers.add(2);
        numbers.add(9);
        numbers.add(6);

        assertThat(Counter.countNumberOf9s(numbers), is(2));
    }

    @Test
    public void shouldReturnNumberOf9sInAnArrayWhenThereAreNot9s() {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(0);
        numbers.add(2);
        numbers.add(1);
        numbers.add(3);

        assertThat(Counter.countNumberOf9s(numbers), is(0));
    }
}