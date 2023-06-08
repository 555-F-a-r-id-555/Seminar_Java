package lesson01_DZ;

import java.util.Scanner;
import java.util.Arrays;

public class Main04 {
    public static int[] resArray(int shiftValue, int[] res) {
        int temp;
        int len = res.length;
        if (shiftValue > 0) {
            // n= + k  ->
            for (int j = 0; j < shiftValue; j++) {
                for (int i = len - 1; i > 0; i--) {
                    temp = res[i];
                    res[i] = res[(i - 1) % (len)];
                    res[(i - 1) % (len)] = temp;
                }
            }
            return res;
            /*System.out.println(Arrays.toString(res));*/
        } else if (shiftValue < 0) {
            // n= -k <-
            for (int j = 0; j < -shiftValue; j++) {
                for (int i = 1; i < len; i++) {
                    temp = res[i];
                    res[i] = res[(i - 1) % (len)];
                    res[(i - 1) % (len)] = temp;
                }
            }
            return res;
            /*System.out.println(Arrays.toString(res));*/
        }
        return res;
    }

    public static void main(String[] args) {
        /*4.** Написать метод, которому на вход подается одномерный массив
        и число n (может быть положительным, или отрицательным),
        при этом метод должен сместить все элементы массива на n позиций.
        Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
        Примеры:
        [ 1, 2, 3, 4 ] при n = 1 (на один вправо) -> [ 4, 1, 2, 3 ];
        [ 4, 5, 6, 1, 2] при n = -2 (на два влево) -> [ 6, 1, 2, 4, 5 ].
        При каком n в какую сторону сдвиг можете выбирать сами.*/

        int test1 = 3;
        int[] res = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(resArray(test1,res)));

        int test2 = -3;
        System.out.println(Arrays.toString(resArray(test2,res)));


        System.out.print("Введите значение сдвига : ");
        Scanner inputStr2 = new Scanner(System.in);
        int shiftValue = inputStr2.nextInt();

        int [] res2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22};
        System.out.println(Arrays.toString(resArray(shiftValue,res2)));
    }
}

