package practice11;

public class Subtract extends BOperation implements Operation{
    public Subtract(Operation operation1, Operation operation2) {
        super(operation1,operation2);
        value.op="-";
    }

    @Override
    public Value getValue() {
        return value;
    }
}
