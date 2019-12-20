package pracs.prac8;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class BoundedWaitList<E> extends WaitList<E>{
    private int capacity;
    public BoundedWaitList(int capacity){
        super.content=new ConcurrentLinkedQueue<E>();
        this.capacity=capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(E element) {
        if(capacity>content.size()){
            content.add(element);
        } else
           throw new IndexOutOfBoundsException("Capacity: "+capacity);
    }

    @Override
    public E remove() {
        return content.remove();
    }

    @Override
    public boolean contains(E element) {
        return content.contains(element);
    }

    @Override
    public boolean containsAll(Collection<E> c) {
        return content.containsAll(c);
    }

    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }

    @Override
    public String toString() {
        return super.toString()+" Capacity: "+capacity;
    }
}
