package practice1;

public class Ball {
    private String size;
    private int weight;

    @Override
    public String toString() {
        return "Ball{" +
                "size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Ball(int weight) {
        this.weight = weight;
    }

    public Ball(String size) {
        this.size = size;
    }

    public Ball(String size, int weight) {
        this.size = size;
        this.weight = weight;
    }
}
