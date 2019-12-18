package pracs.prac5;

import java.util.Scanner;

//Дана монотонная последовательность, в которой каждое натуральное число k встречается ровно k раз: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4,…
public class prac5_1 {
    public static int func(int n)
    {
        if(n==1) {
            System.out.print(1);
            return 1;
        }
        for(int i=0;i<n;i++)
            System.out.print(n+" ");
        return func(n-1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        func(s.nextInt());
    }
}
