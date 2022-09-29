package practice11;

public class Const implements Operation{
    private float c;

    public Const(float c) {
        this.c = c;
    }

    @Override
    public Value getValue() {
        return new Value(c, Value.Type.CONST);
    }
}
