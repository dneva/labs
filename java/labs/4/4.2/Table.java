package Lab4;

public class Table extends Furniture{
    private double width;
    private double length;
    public Table(String c, double p, double w, double l)
    {
        super(c,p);
        width=w;
        length=l;
    }
    public void SetInfo(String c, double p, double w, double l)
    {
        super.SetInfo(c, p);
        width=w;
        length=l;
    }
    public void Info()
    {
        super.Info();
        System.out.println("Ширина: "+width);
        System.out.println("Длина: "+length);
    }
}
