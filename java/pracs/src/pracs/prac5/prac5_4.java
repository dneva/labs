package pracs.prac5;

import java.util.Scanner;

//Даны натуральные числа k и s. Определите, сколько существует k-значных натуральных чисел, сумма цифр которых равна d. Запись натурального числа не может начинаться с цифры 0.
//В этой задаче можно использовать цикл для перебора всех цифр, стоящих на какой-либо позиции.
public class prac5_4 {
    public static int func(int k,int s, int d)
    {
        if(s<Math.pow(10,k-1))
            return 1;
        int sum=0;
        int a = s;
        for(int i=1;i<k;i++) {
            sum += a %10;
            a = a / 10;
        }
        sum+=a;
       // System.out.println(sum);
        if(sum==d)
            System.out.println(s);
        return func(k,s-1, d);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        int d = s.nextInt();
        func(k,(int)Math.pow(10,k)-1,d);
    }
}
