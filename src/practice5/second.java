package practice5;

import java.util.Scanner;
//num8
public class second {
    public static void main(String[] args) {
        String s;
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();
        new second(s);
    }
    second(String s){
        if (isPalindrom(s,0)) System.out.println("YES");
        else System.out.println("NO");
    }
    public boolean isPalindrom(String s,int ind){
        if (s.length()-ind-1<ind) return true;
        if (s.charAt(ind) == s.charAt(s.length()-ind-1)) return isPalindrom(s,ind+1);
        else return false;
    }
}
