package pracs.prac1;

public class TestBall {

    public static void main(String[] args) {
        Ball b1=new Ball("Red",10.2);
        Ball b2=new Ball();
        b2.setColor("Blue");
        b2.setRadius(3.14);
        System.out.println("V of "+b1.getColor()+" ball = "+b1.getV());
        System.out.println(b2.toString());
    }
}
