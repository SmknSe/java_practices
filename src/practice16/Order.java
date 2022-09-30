package practice16;

import java.util.ArrayList;

public class Order {
    ArrayList<Item> order;

    public Order() {
        order = new ArrayList<>();
    }

    public Order(ArrayList<Item> order) {
        this.order = order;
    }

    public boolean add(Item item){
        return order.add(item);
    }

    public boolean remove(Item item){
        return order.remove(item);
    }

    @Override
    public String toString() {
        return "Order{" +
                "order=" + order +
                '}';
    }
}
