package practice6.n2;

public class SortingStudentsByGPA implements Comparable<SortingStudentsByGPA>{
    public String name;
    public Integer age;
    public Integer score;

    SortingStudentsByGPA(String name,int age, int score){
        this.name = name;
        this.age = age;
        this.score = score;
    }


    @Override
    public String toString() {
        return "SortingStudentsByGPA{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }


    @Override
    public int compareTo(SortingStudentsByGPA student) {
        int res = this.score.compareTo(student.score);
        if (res == 0){
            res = this.name.compareTo(student.name);
        }
        return res;
    }
}
