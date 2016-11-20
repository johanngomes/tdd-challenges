package xremover;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class StringFilterTest {
    @Test
    public void shouldRemoveXsOfStringMaintainingFirstAndLastX() {
        StringFilter firstString = new StringFilter("xxHxix");
        firstString.removeXs();

        StringFilter secondString = new StringFilter("abcd");
        secondString.removeXs();

        StringFilter thirdString = new StringFilter("xabcdx");
        thirdString.removeXs();

        StringFilter fourthString = new StringFilter("");
        fourthString.removeXs();

        StringFilter fiftyString = new StringFilter("x");
        fiftyString.removeXs();

        Assert.assertThat(firstString.getString(), is("xHix"));
        Assert.assertThat(secondString.getString(), is("abcd"));
        Assert.assertThat(thirdString.getString(), is("xabcdx"));
        Assert.assertThat(fourthString.getString(), is(""));
        Assert.assertThat(fiftyString.getString(), is("x"));
    }
}
