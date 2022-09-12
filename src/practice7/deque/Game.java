package practice7.deque;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Game {

    public Game(){
        int count=0;
        Scanner scanner = new Scanner(System.in);
        String[] first = scanner.nextLine().split(" ");
        String[] second = scanner.nextLine().split(" ");
        ArrayDeque<Integer> f = new ArrayDeque<Integer>();
        ArrayDeque<Integer> s =new ArrayDeque<Integer>();
        for (int i=0;i<5;i++){
            f.add(Integer.parseInt(first[i]));
            s.add(Integer.parseInt(second[i]));
        }
        System.out.println(f);
        System.out.println(s);
        while (!s.isEmpty() && !f.isEmpty() && count<106){
            if (f.getFirst()==0 && s.getFirst()==9 || f.getFirst() > s.getFirst() && !(f.getFirst()==9 && s.getFirst()==0)){
                f.add(f.getFirst());
                f.add(s.getFirst());
                f.remove(f.getFirst());
                s.remove(s.getFirst());
            }
            else if (f.getFirst() < s.getFirst() && !(s.getFirst()==9 && f.getFirst()==0) || s.getFirst()==0 && f.getFirst()==9){
                s.add(f.getFirst());
                s.add(s.getFirst());
                s.remove(s.getFirst());
                f.remove(f.getFirst());
            }
            count++;
            System.out.println(s);
            System.out.println(f);
        }
        if (s.isEmpty()){
            System.out.println("first "+count);
        }
        else if (f.isEmpty()){
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
