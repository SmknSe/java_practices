package practice5;

import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println(count(a,b));
    }
    public static int count(int a,int b){
        if (a>b+1 || b==0 && a>1) return 0;
        if (a==0) return 1;
        return count(a,b-1)+count(a-1,b-1);
    }
}
