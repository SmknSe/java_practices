package practice7.stack;

import java.util.Scanner;
import java.util.Stack;

public class Game {

    public Game(){
        int count=0;
        Scanner scanner = new Scanner(System.in);
        String[] first = scanner.nextLine().split(" ");
        String[] second = scanner.nextLine().split(" ");
        Stack<Integer> f = new Stack<>();
        Stack<Integer> s = new Stack<>();
        for (int i=0;i<5;i++){
            f.add(Integer.parseInt(first[i]));
            s.add(Integer.parseInt(second[i]));
        }
        System.out.println(f);
        System.out.println(s);
        while (!s.empty() && !f.empty() && count<106){
            if (f.firstElement()==0 && s.firstElement()==9 || f.firstElement() > s.firstElement() && !(f.firstElement()==9 && s.firstElement()==0)){
                f.add(f.firstElement());
                f.add(s.firstElement());
                f.pop();
                s.pop();
            }
            else if (f.firstElement() < s.firstElement() && !(s.firstElement()==9 && f.firstElement()==0) || s.firstElement()==0 && f.firstElement()==9){
                s.add(f.firstElement());
                s.add(s.firstElement());
                s.pop();
                f.pop();
            }
            count++;
            System.out.println(s);
            System.out.println(f);
        }
        if (s.empty()){
            System.out.println("first "+count);
        }
        else if (f.empty()){
            System.out.println("second "+count);
        }
        else{
            System.out.println("botva");
        }
    }
    public static void main(String[] args) {
        new Game();
    }
}
