package evenfibonacci;

public class Number {
    private final int value;

    public Number(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        if (value % 2 != 0) {
            return true;
        }
        return false;
    }
}
