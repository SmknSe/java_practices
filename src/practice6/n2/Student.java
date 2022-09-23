package practice6.n2;


public class Student implements Comparable<Student> {
    private String name;
    private Integer age;
    private Integer score;
    private SortingStudentsByGPA sortingStudentsByGPA = new SortingStudentsByGPA();

    Student(String name,int age,int score){
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public Integer getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
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

    public SortingStudentsByGPA getSortingStudentsByGPA() {
        return sortingStudentsByGPA;
    }
}


