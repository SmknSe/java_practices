package practice11;

public class Multiply extends BOperation implements Operation{
    public Multiply(Operation operation1, Operation operation2) {
        super(operation1,operation2);
        value.op="*";
    }

    @Override
    public Value getValue() {
        return value;
    }
}
