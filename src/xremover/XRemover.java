package xremover;

public class XRemover {
    private String string;

    public XRemover(String string) {
        this.string = string;
    }

    public void removeXs() {
        if (this.string.contains("x") || this.string.contains("X")) {
            this.string = this.string.charAt(0)
                    + this.string.replaceAll("x", "").replaceAll("X", "")
                    + this.string.charAt(this.string.length() - 1);
        }
    }

    public String getString() {
        return string;
    }
}
