package practice16;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DoublyLinkedList{
    class Node {
        Node(Item obj) {
            this.obj = obj;
            prev = next = null;
        }

        public Node prev;
        public Node next;
        public Item obj;

        public String toString() {
            return obj.toString();
        }
    }

    Node head;
    Node tail;

    DoublyLinkedList(Item[] items){
       for(int i=0;i< items.length;i++){
           this.push_back(items[i]);
       }
    }

    DoublyLinkedList(Item item) {
        head = tail = new Node(item);
    }

    DoublyLinkedList() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void push_front(Item item) {
        if (isEmpty()) {
            head = tail = new Node(item);
            return;
        }
        Node new_node = new Node(item);
        new_node.next = head;
        head.prev = new_node;
        head = new_node;
    }

    public boolean push_back(Item item) {
        if (isEmpty()) {
            head = tail = new Node(item);
            return true;
        }
        Node new_node = new Node(item);
        tail.next = new_node;
        new_node.prev = tail;
        tail = new_node;
        return true;
    }

    public Item pop_front() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return null;
        }
        Node node = head;
        node.next.prev = null;
        head = node.next;
        return node.obj;
    }

    public Item pop_back() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return null;
        }
        Node node = tail;
        node.prev.next = null;
        tail = node.prev;
        return node.obj;
    }

    public void remove(Item el) {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        if (head.obj == el) {
            pop_front();
            return;
        }
        if (tail.obj == el) {
            pop_back();
            return;
        }
        Node slow = head, fast = head.next;
        while (fast != null && !fast.obj.equals(el)) {
            fast = fast.next;
            slow = slow.next;
        }
        if (fast == null) {
            System.out.println("Element " + el + " not found");
            return;
        }
        slow.next = fast.next;
        fast.next.prev = slow;
    }

    public boolean find(String name){
        Node cur = head;
        while (cur!=null){
            if (cur.obj.getName().equals(name)){
                return true;
            }
            else{
                cur = cur.next;
            }
        }
        return false;
    }

    public boolean rremove(String name) {
        if (isEmpty()) {
            System.out.println("List is empty");
            return false;
        }
        if (tail.obj.getName() == name) {
            pop_back();
            return true;
        }
        if (head.obj.getName() == name) {
            pop_front();
            return true;
        }
        Node slow = tail, fast = tail.prev;
        while (fast != null && !fast.obj.getName().equals(name)) {
            fast = fast.prev;
            slow = slow.prev;
        }
        if (fast == null) {
            System.out.println("Element with name " + name + " not found");
            return false;
        }
        slow.prev = fast.prev;
        fast.prev.next = slow;
        return true;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        System.out.print("DoublyLinkedList: ");
        Node node = head;
        while (node != null) {
            System.out.print(node + " ");
            node = node.next;
        }
        System.out.println();
    }

    public void print_reverse() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        System.out.print("List of " + head.obj.getClass().toString().substring(16) + "s (reversed): ");
        Node node = tail;
        while (node != null) {
            System.out.print(node + " ");
            node = node.prev;
        }
        System.out.println();
    }

    public int size(){
        Node cur = head;
        int c = 1;
        while (cur!=null){
            cur = cur.next;
            c++;
        }
        return c;
    }

    public ArrayList<Item> toArrayList(){
        ArrayList<Item> a = new ArrayList<>();
        Node cur = head;
        do {
            a.add(cur.obj);
            cur = cur.next;
        }while (cur!=null);
        return a;
    }

    public float getCost(){
        Node cur = head;
        float cost = 0;
        do{
            cost+=cur.obj.getPrice();
            cur = cur.next;
        }while (cur!=null);
        return cost;
    }

    public int itemNum(String name){
        Node cur = head;
        int c = 0;
        while (cur!=null){
            if (cur.obj.getName().equals(name)){
                c++;
            }
            cur = cur.next;
        }
        return c;
    }

    public HashSet<String> itemsNames(){
        HashSet<String> names = new HashSet<>();
        Node cur = head;
        do{
            names.add(cur.obj.getName());
            cur = cur.next;
        }while (cur!=null);
        return names;
    }
}
