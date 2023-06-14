package lesson03;

import java.util.*;

public class Main01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(900);
        list.add(0,9);
        Collections.addAll(list, 1, 2, 3, 4, 5, 6);
        System.out.println(list);
        ex0();
    }


    private static void ex0() {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
        System.out.println(s6);
        System.out.println(Arrays.toString(s6.toCharArray()));

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1 == s5);
        System.out.println(s1 == s6);
        System.out.println("---------------");
        System.out.println(s1.equals(s5));
        System.out.println(s1.equalsIgnoreCase(s5));
        System.out.println(Objects.equals(s1, s5));
    }

    private static void listTest() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(0,9);
        Collections.addAll(list, 1, 2, 3, 4, 5, 6);
        System.out.println(list);
        Integer[] ints = (Integer[]) list.toArray();
        Integer[] ints2 = list.toArray(new Integer[]{});
        test(1, 2, 5, 7, 8, 4);
    }

    static void test(Integer... arr) {
        for (Integer integer : arr) {
            System.out.println("value: " + integer);
        }
    }

    private static void ex1() {
        Random random = new Random();
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            integers.add(random.nextInt(100)); //0-99
        }

//        integers.sort(Comparator.naturalOrder());
        Collections.sort(integers, Comparator.reverseOrder());

        System.out.println(integers);
    }
}
