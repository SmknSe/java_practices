package practice6.n3;

public class Student implements Comparable<Student> {
    private String name;
    private Integer age;

    Student(String name,int age){
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        int res = this.name.compareTo(student.name);
        if (res == 0){
            res = this.age.compareTo(student.age);
        }
        return res;
    }
}
