package xremover;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class XRemoverTest {
    @Test
    public void shouldRemoveXsOfStringMaintainingFirstAndLastX() {
        XRemover firstString = new XRemover("xxHxix");
        firstString.removeXs();

        XRemover secondString = new XRemover("abcd");
        secondString.removeXs();

        XRemover thirdString = new XRemover("xabcdx");
        thirdString.removeXs();

        Assert.assertThat(firstString.getString(), is("xHix"));
        Assert.assertThat(secondString.getString(), is("abcd"));
        Assert.assertThat(thirdString.getString(), is("xabcdx"));
    }
}
