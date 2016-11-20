package xremover;

public class StringFilter {
    private String string;

    public StringFilter(String string) {
        this.string = string;
    }

    public void removeXs() {
        if (stringHaveX() && stringHaveLengthGreaterThanOne()) {
            this.string = this.string.charAt(0)
                    + this.string.replaceAll("x", "").replaceAll("X", "")
                    + this.string.charAt(this.string.length() - 1);
        }
    }

    private boolean stringHaveLengthGreaterThanOne() {
        return this.string.length() > 1;
    }

    private boolean stringHaveX() {
        return this.string.contains("x") || this.string.contains("X");
    }

    public String getString() {
        return string;
    }
}
