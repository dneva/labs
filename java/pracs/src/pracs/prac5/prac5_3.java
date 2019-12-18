package pracs.prac5;

import java.util.Scanner;

//Даны два целых числа A и В (каждое в отдельной строке). Выведите все числа от A до B включительно, в порядке возрастания, если A < B, или в порядке убывания в противном случае.
public class prac5_3 {
    public static int func(int a, int b)
    {
        System.out.print(a+" ");
        if(a==b)
            return 1;
        if(a<b)
            return func(a+1, b);
        return func(a-1, b);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        func(a,b);
    }
}
