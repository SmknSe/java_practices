package practice11;

public class Divide extends BOperation implements Operation{
    public Divide(Operation firstOperation, Operation secondOperation) {
        super(firstOperation, secondOperation);
        value.op = "/";
    }

    @Override
    public Value getValue() {
        return value;
    }
}
