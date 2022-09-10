package practice5;

import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        System.out.println(reverse(a,0));
    }
    public static int reverse(int a,int c){
        if (a==0) return c;
        else return reverse(a/10,c*10+a%10);
    }
}
