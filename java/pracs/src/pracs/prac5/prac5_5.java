package pracs.prac5;
//Дано натуральное число N. Вычислите сумму его цифр.
//При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется).
import java.util.Scanner;

public class prac5_5 {
    public static int func(int n) {
        if(n<10)
            return n;
       return n%10+func(n/10);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(func(n));
    }
}
