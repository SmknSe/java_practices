package practice16;

public final class Dish implements Item{
    private final float price;
    private final String name;
    private final String description;

    public Dish(float price, String name, String description) {
        this.price = price;
        this.name = name;
        this.description = description;
    }

    public Dish(String name, String description) {
        this.price = 0;
        this.name = name;
        this.description = description;
    }

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
