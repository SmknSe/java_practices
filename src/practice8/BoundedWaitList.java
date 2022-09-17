package practice8;

public class BoundedWaitList<E> extends WaitList{
    private int capacity;

    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                ", content=" + content +
                '}';
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(Object element) {
        if (content.size()<capacity) super.add(element);
    }
}
