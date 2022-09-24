package practice12_15.n1;

public class Person {
    String name;
    String surname;
    String patronymic;

    public Person(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    private StringBuffer getIn(String s){
        if (!s.isEmpty()){
            return new StringBuffer();
        }
        return new StringBuffer();
    }
}
