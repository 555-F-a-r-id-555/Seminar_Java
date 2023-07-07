package Lesson_09_test_2;

import java.util.LinkedList;
import java.util.ListIterator;

public class Iter {
    public static void main(String[] args) {

        LinkedList<Integer> list = getRandomList();

        ListIterator<Integer> iterator = list.listIterator();

        while (iterator.hasNext()){
            int item =  iterator.next();
            if(item >= 20 ) {
                iterator.remove();
            }
        }

        System.out.println(list);

    }

    public static LinkedList<Integer> getRandomList() {
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            list.add((int) Math.round(Math.random() * 25));
        }
        return list;
    }
}
