package lab10;

public class MyArrayList<E> {
    private E[] objects;
    private int size;

    public MyArrayList() {
        objects = (E[]) new Object[10];
        size = 0;
    }

    public void add(E e) {

        if (size == objects.length) {
            E[] bufobjects = (E[]) new Object[size + 10];
            System.arraycopy(objects,0,bufobjects,0,size);
            objects = bufobjects;
        }
        objects[size] = e;
        size++;
    }

    public void add(int index, E e) {
        if (index > size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        if (index == size) {
            add(e);
        } else {
            System.arraycopy(objects,index,objects,index+1,size-index);
            objects[index]=e;
            size++;
        }

    }
    public E remove(E e) {
       return remove(indexOf(e));
    }
    public E remove(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        E r = objects[index];
        if (index != --size)
            System.arraycopy(objects, index + 1, objects, index, size - index);
        objects[size] = null;
        return r;
    }
    public E get(int index)
    {
        if (index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        return objects[index];
    }
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(objects[i] + " ");
        }
        System.out.println();
    }
    public void convert(E[] e)
    {
        objects=e;
        size = e.length;
    }
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(Object e) {
        return indexOf(e) != -1;
    }

    public int indexOf(Object e) {
        for (int i = 0; i < size; i++)
            if (e == objects[i])
                return i;
        return -1;
    }
}

