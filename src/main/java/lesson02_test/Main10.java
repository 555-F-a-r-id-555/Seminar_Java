package lesson02_test;

import java.util.ArrayList;
import java.util.Collections;

public class Main10 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(2);
        list.add("bear");
        list.add(7);


        System.out.println(list);

        System.out.println(list.get(1));
        System.out.println(list.indexOf("bear"));
        list.remove(1);

        System.out.println(list);
        System.out.println(list.set(1, 87));
        System.out.println(list);

        list.add(100);
        list.add(5);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.subList(1, list.size()));

    }
}
