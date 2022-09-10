package practice1;

public class TestDog {
    public static void main(String[] args) {
        Dog dog = new Dog("dog",1);
        System.out.println(dog);
        dog.setAge(2);
        System.out.println(dog.getAge());
    }
}
