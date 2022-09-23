package practice6.n2;


import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        SortingStudentsByGPA[] students = new SortingStudentsByGPA[5];
        students[0] = new SortingStudentsByGPA("Adam",10,100);
        students[1] = new SortingStudentsByGPA("Sam",12,12);
        students[2] = new SortingStudentsByGPA("John",15,85);
        students[3] = new SortingStudentsByGPA("Bob",13,60);
        students[4] = new SortingStudentsByGPA("Bob",11,90);
        quick_sort(students,0,4);
        for (int i=0;i<5;i++){
            System.out.println(students[i]);
        }
    }

    public static void quick_sort(SortingStudentsByGPA[] list,int low, int high){
        if (list.length == 0)
            return;
        if (low >= high)
            return;
        int middle = low + (high - low) / 2;
        SortingStudentsByGPA opora = list[middle];
        int i = low, j = high;
        while (i <= j) {
            while (opora.compare(list[i],opora)>0) {
                i++;
            }
            while (opora.compare(list[j],opora)<0) {
                j--;
            }
            if (i <= j) {
                SortingStudentsByGPA temp = list[i];
                list[i] = list[j];
                list[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quick_sort(list, low, j);
        if (high > i)
            quick_sort(list, i, high);
    }
}
