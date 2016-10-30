package evenfibonacci;

import java.util.ArrayList;
import java.util.List;

public class Sequence {
    List<Number> sequence = new ArrayList<>();

    public void addNumber(Number number) {
        sequence.add(number);
    }

    public List<Number> getSequence() {
        return sequence;
    }
}
