package practice11;

public class Value {
    enum Type{
        VAR, VALUE, CONST,
    }
    Value value1=null;
    Value value2=null;
    Float f1=null;
    String v1=null;
    Float f2=null;
    String v2=null;
    String op=null;
    Type type=null;

    public Value(Value value1) {
        this.value1 = value1;
    }

    public Value(String v1) {
        this.v1 = v1;
    }

    public Value(float f1) {
        this.f1 = f1;
    }
    public Value(String v1, Type type) {
        this.v1 = v1;
        this.type = type;
    }
    public Value(float f1, Type type) {
        this.f1 = f1;
        this.type = type;
    }
}
