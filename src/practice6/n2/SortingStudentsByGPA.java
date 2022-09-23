package practice6.n2;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<SortingStudentsByGPA> {
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
    public int compare(SortingStudentsByGPA o1, SortingStudentsByGPA o2) {
        return o1.score.compareTo(o2.score);
    }
}
