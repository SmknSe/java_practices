package practice6.n1;

public class Test {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("Adam",10);
        students[1] = new Student("Sam",12);
        students[2] = new Student("John",15);
        students[3] = new Student("Bob",13);
        students[4] = new Student("Bob",11);
        insertion(students);
        for (int i=0;i<5;i++){
            System.out.println(students[i]);
        }
    }

    public static void insertion(Comparable[] list){
        for (int i=0;i<list.length;i++){
            for (int j=i;j>0 && list[j-1].compareTo(list[j])>0;j--){
                Comparable tmp = list[j-1];
                list[j-1] = list[j];
                list[j] = tmp;
            }
        }
    }
}
