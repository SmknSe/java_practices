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
            return new StringBuffer().append(s.charAt(0)).append(".");
        }
        return new StringBuffer("");
    }

    public String getFio() {
        StringBuffer res = new StringBuffer(surname);
        StringBuffer tmp;

        tmp = getIn(name);
        if (!tmp.isEmpty()) {
                res.append(" ").append(tmp);
        }

        tmp = getIn(patronymic);
        if (!tmp.isEmpty()) {
            if (res.charAt(res.length() - 1) == '.') {
                res.append(" ").append(tmp);
            }
        }
        return res.toString();
    }

}
