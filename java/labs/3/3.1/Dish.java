package Lab3;

public abstract class Dish {
    private boolean clean;
    public Dish(boolean c)
    {
        clean=c;
    }
    public void Wash()
    {
        clean=true;
    }
    public boolean GetClean()
    {
        return clean;
    }
    public abstract void Info();

}
