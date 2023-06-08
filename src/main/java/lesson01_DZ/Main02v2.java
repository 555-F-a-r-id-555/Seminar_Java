// упрощенный вариант v2
package lesson01_DZ;

import java.util.Scanner;
import java.util.Arrays;


public class Main02v2 {
    static int[][] RandomTable(int myInput) {
        int[][] randomtable1 = new int[myInput][myInput];
        for (int i = 0; i < myInput; i++) {
            for (int j = 0; j < myInput; j++) {
                int randomNumber = (int) (Math.random() * 10) + 7;
                randomtable1[i][j] = randomNumber;
            }
        }
        return randomtable1;
    }

    public static void main(String[] args) {
        // Получаем данные от пользователя
        System.out.print("Введите целое число : ");
        Scanner inputStr = new Scanner(System.in);
        int myInput1 = inputStr.nextInt();
        /*System.out.println(myInput1);*/

        // создаем переменную res в которую помещаем двухмерную матрицу
        int[][] res = RandomTable(myInput1);
        System.out.println(Arrays.deepToString(res));

        // заполняем главную и побочную диагонали единицами
        for (int i = 0; i < myInput1; i++) {
            for (int j = 0; j < myInput1; j++) {
                if (i == j || i + j == myInput1 - 1) {
                    res[i][j] = 1;
                }
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(Arrays.deepToString(res));
    }
}
