package Lab4;

public abstract class Furniture implements Priceable{
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

    @Override
    public double getPrice() {
        return price;
    }
}
