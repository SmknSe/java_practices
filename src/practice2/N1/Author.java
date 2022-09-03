package practice2.N1;

public class Author {
    private String name;
    private String email;
    private char gender;

    @Override
    public String toString() {
        return "автор - "+name+"("+gender+") at "+email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
}
