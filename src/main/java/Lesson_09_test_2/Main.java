package Lesson_09_test_2;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Integer[] array = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        LinkedList<Integer> list = new LinkedList<>();
        Collections.addAll(list,array);


        for (int i = 0; i < list.size(); i++) {
            //------------------------------------------------
            System.out.print(String.format("%s ", list.get(i)));
            //------------------------------------------------
        }

        System.out.println();
        System.out.println("--------------------------------");
        Iterator iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }




    }
}
