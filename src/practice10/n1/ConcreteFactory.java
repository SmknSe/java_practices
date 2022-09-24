package practice10.n1;

public class ConcreteFactory implements ComplexAbsrtactFactory {
    @Override
    public Complex createComplex() {
        return new Complex(0,0);
    }

    @Override
    public Complex CreateComplex(int real, int image) {
        return new Complex(real,image);
    }
}
