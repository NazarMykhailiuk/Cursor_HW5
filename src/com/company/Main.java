package com.company;

public class Main {

    public static void main(String[] args) {
        MyList<Integer> intList = new MyList<>();
        intList.add(29);
        intList.add(-25);
        intList.add(111);
        intList.add(11);
        intList.add(-10);
        System.out.println(intList);

        MyList<Double> doubleList = new MyList<>();
        doubleList.add(22.10);
        doubleList.add(99.99);
        doubleList.add(14.22);
        doubleList.add(14.22);
        doubleList.add(12.12);
        doubleList.add(14.14);
        System.out.println(doubleList);
    }
}
