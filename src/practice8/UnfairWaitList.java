package practice8;

public class UnfairWaitList extends WaitList {
    public UnfairWaitList() {
    }

    @Override
    public Object remove(Object element) {
        if (!element.equals(content.stream().findFirst())) return super.remove(element);
        return null;
    }

    public void moveToBack(Object element){
        super.add(super.remove(element));
    }
}
