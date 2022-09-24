package practice8;

public class Main {
    public static void main(String[] args) {
        BoundedWaitList<Integer> boundedWaitList = new BoundedWaitList<>(10);
        UnfairWaitList<Integer> unfairWaitList = new UnfairWaitList<>();
        for (int i =0;i < 15;i++){
            boundedWaitList.add(i);
            unfairWaitList.add(i);
        }
        System.out.println(boundedWaitList+" "+boundedWaitList.getCapacity());
        System.out.println(unfairWaitList);
        unfairWaitList.moveToBack(2);
        unfairWaitList.remove(8);
        unfairWaitList.remove(0);
        System.out.println(unfairWaitList);

        BoundedWaitList<Object> boundedWaitList1 = new BoundedWaitList<>(5);
        UnfairWaitList<Object> unfairWaitList1 = new UnfairWaitList<>();
        String al = "abcdefghijklmnop";
        for (int i=0;i<10;i++){
            boundedWaitList1.add(al.charAt(i));
            unfairWaitList1.add((al.charAt(i)));
        }
        System.out.println(boundedWaitList1);
        System.out.println(unfairWaitList1);
        unfairWaitList1.moveToBack('b');
        unfairWaitList1.remove('c');
        System.out.println(unfairWaitList1);
    }
}
