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
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getDescription() {
        return null;
    }
}
