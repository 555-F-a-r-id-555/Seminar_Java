package lesson02_test;

import java.util.Arrays;

public class Main04 {
    public static void main(String[] args) {

        int[] a = {1, 9};
        int[] b = new int[3];
        System.out.println(Arrays.toString(b));

        System.arraycopy(a, 0, b, 1, a.length);
        System.out.println(Arrays.toString(b));
        b[0] = 858;
        System.out.println(b.length);
        System.out.println(Arrays.toString(b));

    }
}
