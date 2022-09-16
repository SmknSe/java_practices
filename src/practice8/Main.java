package practice8;

public class Main {
    public static void main(String[] args) {
        BoundedWaitList boundedWaitList = new BoundedWaitList(10);
        UnfairWaitList unfairWaitList = new UnfairWaitList();
        for (int i =0;i < 15;i++){
            boundedWaitList.add(i);
            unfairWaitList.add(i);
        }
        System.out.println(boundedWaitList+" "+boundedWaitList.getCapacity());
        System.out.println(unfairWaitList);
        unfairWaitList.moveToBack(2);
        unfairWaitList.remove(8);
        System.out.println(unfairWaitList);
    }
}
