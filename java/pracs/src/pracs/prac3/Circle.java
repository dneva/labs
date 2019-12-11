package pracs.prac3;

public class Circle extends Shape{
    protected Double radius;
    public Circle()
    {
        radius=0.0;
    }
    public Circle(Double radius)
    {
        this.radius=radius;
    }
    public Circle(Double radius, String color, boolean filled)
    {
        super(color, filled);
        this.radius=radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
    public Double getArea()
    {
        return Math.PI*Math.pow(radius,2);
    }
    public Double getPerimeter()
    {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Shape: circle, radius:"+this.radius+", color: "+this.color;
    }
}
