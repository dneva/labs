package Lab4;

public class Chair extends Furniture{
    private String type;
    public Chair(String c, double p, String t)
    {
        super(c,p);
        type=t;
    }
    public void SetInfo(String c, double p, String t)
    {
        super.SetInfo(c, p);
        type=t;
    }
    public void Info()
    {
        super.Info();
        System.out.println("Тип: "+type);
    }
}
