package Lab3;

import java.util.ArrayList;

public class FurnitureShop {
    private ArrayList goods;
    public FurnitureShop()
    {
        goods=new ArrayList();
    }
    public void AddGood(Furniture f)
    {
        goods.add(f);
    }
    public int GetSize()
    {
        return goods.size();
    }
    public void Info()
    {
        int tn=0, cn=0;
        for(int i=0;i<goods.size();i++)
        {
            if (goods.get(i) instanceof Table)
                tn++;
            else
                if (goods.get(i) instanceof Chair)
                    cn++;
        }
        System.out.println("Количество столов: "+tn);
        System.out.println("Количество стульев: "+ cn);
        System.out.println("Информация о товарах: ");
        for(int i=0;i<goods.size();i++)
        {
            ((Furniture)goods.get(i)).Info();
        }
    }
}
