package labs;
public class Container<E> {
    private Object[] objects;
    private int size;
    public Container()
    {
        objects=new Object[10];
        size=0;
    }
    public void add(E e) {
        if (size < objects.length) {
            objects[size] = e;
        } else {
            Object[] bufobjects=new Object[size+10];
            for(int i=0;i<size;i++) bufobjects[i]=objects[i];
            objects=new Object[size+10];
            objects=bufobjects;
            objects[size] = e;
        }
        ++size;
    }
    public void print()
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(objects[i]+" ");
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }
}
