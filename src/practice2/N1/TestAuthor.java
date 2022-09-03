package practice2.N1;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Stiven King","STIVEN007@mail.ru",'M');
        System.out.println(author.toString());
        author.setEmail("new@mail.ru");
        System.out.println(author.toString());
    }
}
