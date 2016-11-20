package zodiacsign;

public class SignProfile {
    private final String profileName;
    private final String startMonth;
    private final String startDay;
    private final String endMonth;
    private final String endDay;

    public SignProfile(String profileName, String startMonth, String startDay, String endMonth, String endDay) {
        this.profileName = profileName;
        this.startMonth = startMonth;
        this.startDay = startDay;
        this.endMonth = endMonth;
        this.endDay = endDay;
    }

    public String getProfileName() {
        return profileName;
    }
}
