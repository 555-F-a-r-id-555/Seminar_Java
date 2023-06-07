package lesson01;

import java.util.Arrays;

public class Main01 {
    public static void main(String[] args) {
        /*Дан массив двоичных чисел,
        например [1,1,0,1,1,1], вывести
        максимальное количество подряд идущих 1.*/
        int[] num1 = {1, 0};
        System.out.println(Arrays.toString(num1));
        int count1 = 0;
        int maxcount = 0;
        for (int i = 1; i < num1.length; i++) {
            if (num1[i - 1] == num1[i]) {
                count1++;
                if (maxcount < count1) {
                    maxcount = count1;
                }
            } else {
                count1 = 0;
            }
        }
        System.out.println(maxcount + 1);
    }
}
