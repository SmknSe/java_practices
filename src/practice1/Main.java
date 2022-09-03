package practice1;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("dog",1);
        Ball ball = new Ball("small",1);
        Book book = new Book("book",1);

        System.out.println(dog.toString());
        System.out.println(ball.toString());
        System.out.println(book.toString());

        dog.setAge(2);
        ball.setWeight(2);
        book.setCount(2);
        System.out.println(dog.getAge()+" "+ball.getWeight()+" "+book.getCount());
    }
}
