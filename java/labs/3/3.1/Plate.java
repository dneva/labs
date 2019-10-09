package Lab3;

public class Plate extends Dish {
    private boolean food;
    public Plate(boolean c, boolean f)
    {
        super(c);
        food=f;

    }
    public void Info()
    {
        if(food)
            System.out.println("На тарелке есть еда");
        else
        {
            System.out.println("Тарелка пустая");
            if(super.GetClean())
                System.out.println("Тарелка чистая");
            else
                System.out.println("Тарелка грязная");
        }
    }
    public void Wash() {
        super.Wash();
        food=false;
    }
    public void MakeFood()
    {
        food=true;
    }
}
