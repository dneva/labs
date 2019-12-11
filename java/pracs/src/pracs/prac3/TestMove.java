package pracs.prac3;
public class TestMove{
    public static void main(String[] args) {
        MovableCircle c=new MovableCircle(0,0, 1,1,4);
        System.out.println(c);
        MovableRectangle r=new MovableRectangle(-20,-20, -10,-10,10, 10);
        System.out.println(r);
        c.moveDown();
        c.moveRight();
        System.out.println(c);
        r.moveUp();
        r.moveLeft();
        System.out.println(r);


    }

}
