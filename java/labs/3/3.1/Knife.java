package Lab3;

public class Knife extends Dish{
    private boolean sharp;
    public Knife(boolean c, boolean s)
    {
        super(c);
        sharp=s;
    }
    public void Info()
    {
        if(super.GetClean())
            System.out.println("Нож чистый");
        else
            System.out.println("Нож грязный");
        if(sharp)
            System.out.println("Нож острый");
        else
            System.out.println("Нож тупой");

    }
}
