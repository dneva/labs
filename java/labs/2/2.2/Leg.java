package Lab1;

public class Leg {
    private String type;
    public Leg(String t)
    {
        type=t;
    }
    public void SetType(String t)
    {
        type=t;
    }
    public String GetType(String t)
    {
        return type;
    }
    public void Step()
    {
        System.out.println("Шаг ноги"+'('+type+')');
    }
}
