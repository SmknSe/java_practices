package practice9.Students;


public class Student implements Comparable<Student> {
    private String name;
    private String sname;
    private Integer score;
    private SortingStudentsByGPA sortingStudentsByGPA = new SortingStudentsByGPA();

    public Student(String name,String sname,int score){
        this.name = name;
        this.sname = sname;
        this.score = score;
    }

    public Student(String name,String sname) {
        this.sname = sname;
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sname=" + sname +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        int res = this.score.compareTo(student.score);
        if (res == 0){
            res = this.sname.compareTo(student.sname);
        }
        return res;
    }

    public SortingStudentsByGPA getSortingStudentsByGPA() {
        return sortingStudentsByGPA;
    }

    public boolean isStudent(Student student){
        return this.name.equals(student.name) && this.sname.equals(student.sname);
    }
}


