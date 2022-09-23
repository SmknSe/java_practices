package practice9;

import practice9.Students.Student;

import java.util.ArrayList;

public class Data {
    private static ArrayList<Student> students = new ArrayList<>();

    public Data() {
        students.add(new Student("Adam","Green",100));
        students.add(new Student("Bob","Green",50));
        students.add(new Student("Kate","Green",78));
        students.add(new Student("Sam","Green",99));
        students.add(new Student("Mary","Green",12));
        students.add(new Student("Alex","Green",34));
    }

    public static ArrayList<Student> getStudents() {
        return students;
    }
}
