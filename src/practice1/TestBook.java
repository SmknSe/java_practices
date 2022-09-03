package practice1;

public class TestBook {
    public static void main(String[] args) {
        Book book = new Book("book",1);
        System.out.println(book.toString());
        book.setCount(2);
        System.out.println(book.getCount());
    }
}
