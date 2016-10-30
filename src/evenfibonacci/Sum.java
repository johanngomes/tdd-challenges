package evenfibonacci;

public class Sum {
    Sequence sequence;
    
    public Sum(Sequence sequence) {
        this.sequence = sequence;
    }

    public int getSumOfEvenNumbers() {
        return sequence.getSequence().stream()
                .filter(n -> n.isEven())
                .mapToInt(n -> n.getValue())
                .sum();
    }
}
