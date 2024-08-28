package HW03.Collections;

import java.util.ArrayList;
import java.util.List;

public class TestCollection {
    public static void main(String[] args) {
        //моя коллекция
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(3);
        myArrayList.add(2);
        myArrayList.add(1);

        List<Integer> list1 = new ArrayList<>();
        list1.add(4);
        list1.add(5);

        System.out.println(myArrayList.size());
        System.out.println(myArrayList.get(2));
        System.out.println(myArrayList.remove(2));
        System.out.println(myArrayList.size());
        System.out.println(myArrayList.addAll(list1));
        System.out.println(myArrayList.size());
        System.out.println();

        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));
        }
        System.out.println("-------------------");

        //стандартная коллекция
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(1);

        System.out.println(list.size());
        System.out.println(list.get(2));
        System.out.println(list.remove(2));
        System.out.println(list.size());
        System.out.println(list.addAll(list1));
        System.out.println(list.size());
        System.out.println();
        for(Integer i : list) {
            System.out.println(i);
        }

        MyArrayList.sortBubble(list);
        System.out.println();
        for(Integer i : list) {
            System.out.println(i);
        }
    }
}
