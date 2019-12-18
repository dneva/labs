package pracs.prac5;

import java.util.Scanner;

public class prac5_2 {
    public static int func(int n){
        if(n==1) {
            System.out.print(1+" ");
            return 1;
        }
       func(n-1);
        System.out.print(n+" ");
        return 1;

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        func(s.nextInt());
    }
}
