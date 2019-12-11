package pracs.prac3;

abstract public class Shape {
    protected String color;
    protected boolean filled;
    public Shape()
    {
        color="";
        filled=false;
    }
    public Shape(String color, boolean filled)
    {
        this.color=color;
        this.filled=filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    abstract public Double getArea();
    abstract public Double getPerimeter();
    abstract public String toString();
}
