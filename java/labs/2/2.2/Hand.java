package Lab1;

public class Hand {
    private String type;
    public Hand(String t)
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
    public void Wawe()
    {
        System.out.println("Взмах руки"+'('+type+')');
    }
}
