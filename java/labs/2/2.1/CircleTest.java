package Lab1;

import java.util.Scanner;

public class CircleTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle(0,0,0);
        System.out.println("Введите координаты центра");
        c.SetCenter(sc.nextDouble(),sc.nextDouble());
        System.out.println("Введите радиус");
        c.SetRadius(sc.nextDouble());
        System.out.println("Создан круг с центром в точке:\nx="+c.GetX()+" y="+ c.GetY()+ '\n'+ "И радиусом: "+ c.GetRadius());
    }
}
