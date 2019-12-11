package pracs.prac3;

public class Rectangle extends Shape{
    protected Double width;
    protected Double length;
    public Rectangle()
    {
        width=0.0;
        length=0.0;
    }
    public Rectangle(Double width,Double length)
    {
        this.width=width;
        this.length=length;
    }
    public Rectangle(Double width, Double length, String color, boolean filled)
    {
        super(color,filled);
        this.width=width;
        this.length=length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }
    public Double getArea()
    {
        return width*length;
    }
    public Double getPerimeter()
    {
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "Shape: rectangle, width:"+this.width+", length: "+this.length;
    }
}
