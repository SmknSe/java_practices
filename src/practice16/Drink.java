package practice16;

public final class Drink implements Item{
    private final float price;
    private final String name;
    private final String description;

    public Drink(float price, String name, String description) {
        this.price = price;
        this.name = name;
        this.description = description;
    }

    public Drink(String name, String description) {
        this.price = 0;
        this.name = name;
        this.description = description;
    }

    @Override
    public float getPrice() {
        return this.price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
