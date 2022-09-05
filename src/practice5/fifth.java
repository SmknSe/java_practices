package practice5;

import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        new fifth();
    }
    fifth(){
        System.out.println(count());
    }
    public int count(){
        String a;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextLine();
        if (a.equals("1")) return count()+1;
        else if (a.equals("00")) return 0;
        else return count();

    }
}
