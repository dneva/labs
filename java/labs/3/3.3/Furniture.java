package Lab3;

public abstract class Furniture {
private String color;
private double price;
public Furniture(String c, double p)
{
    color=c;
    price=p;
}
public void SetInfo(String c, double p)
{
    color=c;
    price=p;
}
public void Info()
{
    System.out.println("Цвет: "+color);
    System.out.println("Цена: "+price);
}
}
