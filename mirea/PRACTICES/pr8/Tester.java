package ru.mirea.practices.pr8;

public class Tester {
    public static void main(String[] args) {
        System.out.println("1 test");
        WaitList<Integer> wList = new WaitList<>();
        wList.add(1);
        wList.add(3);
        wList.add(0);
        wList.add(-1);
        System.out.println(wList);
        System.out.println(wList.isEmpty());
        wList.remove();
        System.out.print(wList);

        System.out.println("2 Test");
        BoundedWaitList<Integer> bwList = new BoundedWaitList<>(3);
        bwList.add(1);
        bwList.add(2);
        bwList.add(3);
        System.out.println(bwList);
        System.out.println(bwList.contains(2));

        System.out.println("Test 3");
        UnfairWaitList<Integer> uwList = new UnfairWaitList<>();
        uwList.add(3);
        uwList.add(2);
        uwList.add(1);
        System.out.println(uwList);
        uwList.moveToBack();
        System.out.println(uwList);
    }
}
