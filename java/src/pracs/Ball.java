package pracs;

public class Ball {
    String color;
    Double radius;
    public Ball(String c, Double r)
    {
        color=c;
        radius=r;
    }
    public Ball()
    {
        color="";
        radius=0.0;
    }

    public String getColor() {
        return color;
    }

    public Double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
    public Double getV(){
        return (4/3)*Math.PI*Math.pow(radius,3);
    }
    public String toString()
    {
        return "This is " + color + "with a radius of " + radius;
    }
}
