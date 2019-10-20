package Lab4;

public class Car implements Nameable{
    private String color;
    private String name;
    public Car(String c, String n)
    {
        color=c;
        name=n;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
