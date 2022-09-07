package practice6.n3;


public class Test {
    public static void main(String[] args) {
        Student[] students1 = new Student[5];
        Student[] students2 = new Student[5];
        students1[0] = new Student("Adam",10);
        students1[1] = new Student("Sam",12);
        students1[2] = new Student("John",15);
        students1[3] = new Student("Bob",13);
        students1[4] = new Student("Bob",11);
        students2[0] = new Student("Alex",20);
        students2[1] = new Student("Maks",32);
        students2[2] = new Student("Denis",8);
        students2[3] = new Student("Karl",17);
        students2[4] = new Student("Leo",27);
        Student[] new_list = new Student[10];
        merge_sort(students1,5);
        merge_sort(students2,5);
        merge(new_list,students1,students2,5,5);
        for (int i=0;i<10;i++){
            System.out.println(new_list[i]);
        }
    }

    public static void merge_sort(Comparable[] list,int n){
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        Comparable[] l = new Comparable[mid];
        Comparable[] r = new Comparable[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = list[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = list[i];
        }
        merge_sort(l, mid);
        merge_sort(r, n - mid);

        merge(list, l, r, mid, n - mid);
    }
    public static void merge(
            Comparable[] a, Comparable[] l, Comparable[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i].compareTo(r[j])<=0) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

}
