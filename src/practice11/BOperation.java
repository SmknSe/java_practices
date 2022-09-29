package practice11;

public abstract class BOperation {
    Value value;

    float getOpRes(String op,float a,float b){
        return switch (op) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> a + b;
        };
    }

    public BOperation(Operation operation1, Operation operation2) {
        Value first = operation1.getValue();
        Value second = operation2.getValue();
        switch (first.type) {
            case VALUE:
                value = new Value(first);
                switch (second.type) {
                    case VALUE:
                        value.value2 = second;
                        break;
                    case CONST:
                        value.f2 = second.f1;
                        break;
                    case VAR:
                        value.v2 = second.v1;
                        break;
                    default:
                        break;
                }
                break;
            case VAR:
                value = new Value(first.v1);
                switch (second.type) {
                    case VALUE:
                        value.value2 = second;
                        break;
                    case CONST:
                        value.f2 = second.f1;
                        break;
                    case VAR:
                        value.v2 = second.v1;
                        break;
                    default:
                        break;
                }
                break;
            case CONST:
                value = new Value(first.f1);
                switch (second.type) {
                    case VALUE:
                        value.value2 = second;
                        break;
                    case CONST:
                        value.f2 = second.f1;
                        break;
                    case VAR:
                        value.v2 = second.v1;
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }
        value.type = Value.Type.VALUE;
    }

    public float evaluate(float var, Value res) {
        if (res.v1 != null) {
            if (res.v2 != null) {
                return getOpRes(res.op, var, var);
            }
            if (res.f2 != null) {
                return getOpRes(res.op, var, res.f2);
            }
            if (res.value2 != null) {
                return getOpRes(
                        res.op,
                        var,
                        evaluate(var, res.value2)
                );
            }
        }

        if (res.f1 != null) {
            if (res.v2 != null) {
                return getOpRes(res.op, res.f1, var);
            }
            if (res.f2 != null) {
                return getOpRes(res.op, res.f1, res.f2);
            }
            if (res.value2 != null) {
                return getOpRes(
                        res.op,
                        res.f1,
                        evaluate(var, res.value2)
                );
            }
        }

        if (res.value1 != null) {
            if (res.v2 != null) {
                return getOpRes(
                        res.op,
                        evaluate(var, res.value1),
                        var
                );
            }
            if (res.f2 != null) {
                return getOpRes(
                        res.op,
                        evaluate(var, res.value1),
                        res.f2
                );
            }
            if (res.value2 != null) {
                return getOpRes(
                        res.op,
                        evaluate(var, res.value1),
                        evaluate(var, res.value2)
                );
            }
        }

        return 0;
    }

    public float evaluate(float var) {
        return evaluate(var, value);
    }
}

