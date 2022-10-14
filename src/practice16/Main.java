package practice16;

public class Main {
    public static void main(String[] args) {
        InternetOrder o = new InternetOrder();
        o.add(new Dish(1.12f,"salad","some info"));
        o.add(new Dish(4.122f,"soup","some info"));
        o.add(new Dish(5.235f,"meat","some info"));
        o.add(new Drink(123.2f,"water","info"));
        o.add(new Drink(3.2f,"juice","info"));
        o.add(new Drink(2.3f,"cola","info"));
        o.add(new Drink(5.3f,"cola","info"));
        o.items.print();
        System.out.println(o.getCost());
        System.out.println(o.getSortedOrder());
        System.out.println(o.getItemsNames());
        System.out.println(o.getItemsNum("cola"));
        o.remove("cola");
        o.items.print();
        System.out.println(o.size());
    }
}
