package lesson02_test;

import java.util.Arrays;
import java.util.List;

public class Main11 {
    public static void main(String[] args) {
        int day = 22;
        int month = 11;
        int year = 1986;
        Integer[] date = {day, month, year};
        date[0] = 30;
        System.out.println(Arrays.toString(date));
        List d = Arrays.asList(date);

        System.out.println(d);
        System.out.println(d.get(1));
        System.out.println(d.set(1, 12));
        System.out.println(d);
    }
}
