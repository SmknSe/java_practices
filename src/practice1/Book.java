package practice1;

public class Book {
    private String name;
    private int count;

    public Book(String name) {
        this.name = name;
    }

    public Book(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book(String name,int count) {
        this.count = count;
        this.name = name;
    }
}
