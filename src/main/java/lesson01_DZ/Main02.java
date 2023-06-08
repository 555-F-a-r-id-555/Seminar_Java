package lesson01_DZ;

import java.util.Scanner;
import java.util.Arrays;

//Объявляем класс RandomNumbers
class RandomNumbers {
    int myInput;

    int[][] RandomTable(int myInput) {
        int[][] randomtable1 = new int[myInput][myInput];
        for (int i = 0; i < myInput; i++) {
            for (int j = 0; j < myInput; j++) {
                int randomNumber = (int) (Math.random() * 10) + 7;
                randomtable1[i][j] = randomNumber;
            }
        }
        return randomtable1;
    }
}

public class Main02 {
    public static void main(String[] args) {
        /*2. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        и с помощью цикла(-ов) заполнить его диагональные элементы единицами
        (можно только одну из диагоналей, если обе сложно).
        Определить элементы одной из диагоналей можно по следующему принципу:
        индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];*/
        // Получаем данные от пользователя
        System.out.print("Введите целое число : ");
        Scanner inputStr = new Scanner(System.in);
        int myInput1 = inputStr.nextInt();
        /*System.out.println(myInput1);*/
        // Создаем экземпляр класса т.е. объект randomNumbers
        // для обращения к переменным и методам используем точечную нотацию
        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.myInput = myInput1;
        // создаем переменную res в которую помещаем двухмерную матрицу
        int[][] res = randomNumbers.RandomTable(randomNumbers.myInput);
        System.out.println(Arrays.deepToString(res));
        System.out.println();
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
