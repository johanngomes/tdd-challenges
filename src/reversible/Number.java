package reversible;

public class Number {
    private Integer number;

    public Number(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public void reverse() {
        StringBuffer reversedNumber = new StringBuffer(number.toString()).reverse();
        number = Integer.parseInt(reversedNumber.toString());
    }
}
