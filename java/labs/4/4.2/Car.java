package Lab4;

public class Car implements Priceable{
    private String color;
    private String name;
    private double price;
    public Car(String c, String n, double p)
    {
        color=c;
        name=n;
        price=p;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
