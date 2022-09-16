package practice8;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList{
    protected ConcurrentLinkedQueue<E> content;

    public WaitList() {
        content = new ConcurrentLinkedQueue<>();
    }
    public WaitList(Collection<E> c){
        this.content = (ConcurrentLinkedQueue<E>) c;
    }

    @Override
    public String toString() {
        return "WaitList{" +
                "content=" + content +
                '}';
    }

    @Override
    public void add(Object element) {
        content.add((E) element);
    }

    @Override
    public Object remove(Object element) {
        if (content.contains(element)){
            content.remove(element);
            return element;
        }
        else return null;
    }

    @Override
    public boolean contains(Object element) {
        return content.contains(element);
    }

    @Override
    public boolean containsAll(Collection c) {
        return content.containsAll(c);
    }

    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }
}
