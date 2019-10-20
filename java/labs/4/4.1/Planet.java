package Lab4;

public class Planet implements Nameable{
    private String name;
    private double radius;
    public Planet(String n, double r)
    {
        name=n;
        radius=r;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void setRadius(double radius)
    {
        this.radius=radius;
    }
    public String getName()
    {
        return name;
    }

    public double getRadius() {
        return radius;
    }
}
