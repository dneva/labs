package lab7;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListTest {

    public static void main(String[] args) {
	    LinkedList<String> names=new LinkedList<String>();
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Введите количество имен");
	    int size=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            System.out.println("Введите имя");
            names.add(sc.next());
        }
        names.addLast("Ваня");
        names.addFirst("Вова");
        names.add(2, "Таня");
        for (String s:names)
        {
            System.out.println(s);
        }
        names.removeLast();
        names.removeFirst();
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
