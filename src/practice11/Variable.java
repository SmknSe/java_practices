package practice11;

public class Variable implements Operation{

    private String v;

    public Variable(String v) {
        this.v = v;
    }

    @Override
    public Value getValue() {
        return new Value(v, Value.Type.VAR);
    }
}
