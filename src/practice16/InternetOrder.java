package practice16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class InternetOrder {
    DoublyLinkedList items;

    public InternetOrder() {
        items = new DoublyLinkedList();
    }

    public InternetOrder(Item[] items) {
        this.items = new DoublyLinkedList(items);
    }

    public boolean add(Item item){
        return items.push_back(item);
    }

    public boolean remove(String name){
        return items.rremove(name);
    }

    public int removeAll(String name){
        int c = 0;
        while (items.find(name)){
            items.rremove(name);
            c++;
        }
        return c;
    }

    public int size(){
        return items.size();
    }

    public ArrayList<Item> getOrder(){
        return items.toArrayList();
    }

    public float getCost(){
        return items.getCost();
    }

    public int getItemsNum(String name){
        return items.itemNum(name);
    }

    public HashSet<String> getItemsNames(){
        return items.itemsNames();
    }

    public ArrayList<Item> getSortedOrder(){
        ArrayList<Item> a = new ArrayList<>();
        a = items.toArrayList();
        a.sort(new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                if (o1.getPrice()>o2.getPrice()) return -1;
                else if (o1.getPrice()==o2.getPrice()) return 0;
                else return 1;
            }
        });
        return a;
    }

}
