package evenfibonacci;

public class Fibonacci {
    private Sequence sequence;
    private int limitBy;

    public Fibonacci(int limitBy) {
        this.limitBy = limitBy;
    }

    public Sequence getLimitedSequenceOf5Numbers() {
        int one=1;
        int two=2;

        sequence = new Sequence();

        sequence.addNumber(new Number(one));
        sequence.addNumber(new Number(two));

        sequence.addNumber(new Number(sequence.getSequence().get(0).getValue()
                                    + sequence.getSequence().get(1).getValue()));

        sequence.addNumber(new Number(sequence.getSequence().get(1).getValue()
                                    + sequence.getSequence().get(2).getValue()));

        sequence.addNumber(new Number(sequence.getSequence().get(2).getValue()
                                    + sequence.getSequence().get(3).getValue()));

        return sequence;
    }
}
