package lab7;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {

    public static void main(String[] args) {
	    ArrayList<String> names=new ArrayList<String>();
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
        for (String s:names)
        {
            System.out.println(s);
        }
        names.remove(names.size()-1);
        names.remove(0);
        names.remove("Таня");
        System.out.println("\nУдаление...");
        if(!names.contains("Вова")){

            System.out.println("Список не содержит имя Вова");
        }

        for (String s:names)
        {
            System.out.println(s);
        }

    }
}
