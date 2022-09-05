package practice5;

import java.util.Scanner;
//num7
public class first {

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        new first(n);
    }
    first(int n){
        find_mn(n,2);
    }
    public void find_mn(int n,int div){
        if (n==1) return;
        if (n%div==0){
            System.out.println(div+"");
            find_mn(n/div,div);
        }
        else if (div==2){
            find_mn(n,div+1);
        }
        else{
            find_mn(n,div+2);
        }
    }
}
