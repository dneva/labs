package lab7;
import java.util.ArrayList;
import java.util.Scanner;

public class MyArrayListTest {

    public static void main(String[] args) {
	    MyArrayList<String> names=new MyArrayList<String>();
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Введите количество имен");
	    int size=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            System.out.println("Введите имя");
            names.add(sc.next());
        }
        names.add(names.size(),"Ваня");
        names.add(0,"Вова");
        names.add(2, "Таня");
        names.print();
        names.remove(names.size()-1);
        names.remove(0);
        names.remove("Таня");
        System.out.println("\nУдаление...");
        if(!names.contains("Вова")){

            System.out.println("Список не содержит имя Вова");
        }
        names.print();

    }
}
