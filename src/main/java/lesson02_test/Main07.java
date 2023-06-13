package lesson02_test;

import java.util.Arrays;

public class Main07 {
    public static int[] AddItem(int[] array, int item) {
        int length = array.length;
        int[] temp = new int[length + 1];
        System.arraycopy(array, 0, temp, 0, length);
        temp[length] = item;
        return temp;
    }

    public static void main(String[] args) {
        int[] a = {1, 9, 5};
        int[] res = AddItem(a, 858);
        System.out.println(Arrays.toString(res));
        res = AddItem(res, 777);
        System.out.println(Arrays.toString(res));
    }
}
