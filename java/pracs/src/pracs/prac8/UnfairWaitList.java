package pracs.prac8;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class UnfairWaitList<E> extends WaitList<E>{
    public UnfairWaitList() {
        super.content=new ConcurrentLinkedQueue<E>();
    }

    @Override
    public void add(E element) {
        content.add(element);
    }

    @Override
    public E remove() {
        return content.remove();
    }
    public void remove(E element)
    {
        content.remove(element);
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
    public void moveToBack(E element){

        if(contains(element))
        {
            remove(element);
            add(element);
        }
    }
}
