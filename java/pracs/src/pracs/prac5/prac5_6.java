package pracs.prac5;

import java.util.Scanner;

//Дано натуральное число n>1. Проверьте, является ли оно простым. Программа должна вывести слово YES, если число простое и NO, если число составное. Алгоритм должен иметь сложность O(logn).
//Указание. Понятно, что задача сама по себе нерекурсивна, т.к. проверка числа n на простоту никак не сводится к проверке на простоту меньших чисел. Поэтому нужно сделать еще один параметр рекурсии: делитель числа, и именно по этому параметру и делать рекурсию.
public class prac5_6 {
    public static int func(int n, int d)
    {
        if(d==1 || d==0)
            return 1;
        if(n%d==0)
            return 0;
       return func(n,d-1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(func(n,n-1)==1)
            System.out.println("YES");
        else System.out.println("NO");
    }
}
