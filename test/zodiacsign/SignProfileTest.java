package zodiacsign;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SignProfileTest {
    @Test
    public void shouldReturnASignProfile() {
        String startMonth = "03";
        String startDay = "21";

        String endMonth = "03";
        String endDay = "21";

        String profileName = "Aries";

        SignProfile signProfile = new SignProfile(profileName, startMonth, startDay, endMonth, endDay);

        assertThat(signProfile.getProfileName(), is("Aries"));
    }
}
