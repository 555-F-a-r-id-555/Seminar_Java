package lesson02_test;

import java.util.ArrayList;

public class Main09 {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList list = new ArrayList();
        list.add(858);
        for (Object i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
        list.add(777);
        list.add(555);
        list.add("Masha -");
        list.add("Маша");
        for (Object i : list) {
            System.out.print(new StringBuilder().append(i).append(" ").toString());
        }
    }
}
