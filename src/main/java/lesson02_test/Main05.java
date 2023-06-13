package lesson02_test;

import java.util.Arrays;

public class Main05 {
    public static int[] NewArray(int[] array) {
        int[] newArray = new int[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 555};
        int[] newArrays = NewArray(a);
        for (int i : newArrays) {
            System.out.print(i + " ");
        }
    }
}
