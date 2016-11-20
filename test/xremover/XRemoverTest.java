package xremover;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class XRemoverTest {
    @Test
    public void shouldRemoveXsOfStringMaintainingFirstAndLastX() {
        XRemover firstString = new XRemover("xxHxix");
        firstString.removeXs();

        Assert.assertThat(firstString.getString(), is("xHix"));
    }
}
