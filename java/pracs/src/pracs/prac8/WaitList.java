package pracs.prac8;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public abstract class WaitList<E> implements IWaitList<E> {
    protected ConcurrentLinkedQueue<E> content;
    public WaitList(){
        ConcurrentLinkedQueue<E> content = new ConcurrentLinkedQueue<>();
    }
    public WaitList(Collection<E> c) {
        content.addAll(c);
    }
    @Override
    public String toString() {
        return content.toString();
    }
}
