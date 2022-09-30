package practice9.Students;

import practice9.Data;
import practice9.Errors.InnInputEr;
import practice9.Errors.ResultEr;
import practice9.Errors.SearchEr;

import java.util.regex.Pattern;

public class StudentController{

    public static class SearchRes extends ResultEr {
        private Student student;

        public SearchRes(Student student, SearchEr er) {
            super(er);
            this.student = student;
        }

        public Student getStudent() {
            return student;
        }


        @Override
        public String toString() {
            return "SearchRes{" +
                    "er=" + er +
                    ", student=" + student +
                    '}';
        }
    }

    public static SearchRes search(Student student) {
        for (Student ar_student : Data.getStudents()) {
            if (student.isStudent(ar_student)) {
                return new SearchRes(ar_student, null);
            }
        }
        return new SearchRes(null, new SearchEr("student not found"));
    }


    public static class CheckInn extends ResultEr{
        private boolean res;

        public CheckInn(boolean res, Exception er) {
            super(er);
            this.res = res;
        }


        @Override
        public String toString() {
            return "CheckInn{" +
                    "er=" + er +
                    ", res=" + res +
                    '}';
        }
    }

    public static CheckInn check(String INN){
        if (Pattern.matches("\\d{12}",INN)) return new CheckInn(true,null);
        return new CheckInn(false,new InnInputEr("incorrect INN"));
    }
}
