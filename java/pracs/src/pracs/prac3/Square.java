package pracs.prac3;

public class Square extends Rectangle{
    public Square(){
        width=0.0;
        length=0.0;
    }
    public Square(Double side){
        super(side,side);
    }
    public Square(Double side, String color, boolean filled)
    {
        super(side,side,color,filled);
    }
    public Double getSide()
    {
        return width;
    }
    public void setSide(Double side)
    {
        width=side;
        length=side;
    }

    @Override
    public void setWidth(Double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(Double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return "Shape: square, side:"+this.width;
    }
}
