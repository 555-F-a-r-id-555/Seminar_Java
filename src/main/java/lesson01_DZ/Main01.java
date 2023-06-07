package lesson01_DZ;

import java.util.Scanner;
import java.util.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Main01 {
    public static void main(String[] args) {
        /*1. Задать одномерный массив и найти
        в нем минимальный и максимальный элементы ;*/
        System.out.print("Введите массив целых чисел, через пробел: ");
        Scanner inputStr = new Scanner(System.in);
        String myInput = inputStr.nextLine();
        String[] myInput2 = myInput.split(" ");
        /*System.out.println(Arrays.toString(myInput2));*/

        /*List<String> list2 = Arrays.asList(myInput2);*/
        ArrayList<Integer> myInputInt = new ArrayList<>();
        for (String elem : myInput2) {
            myInputInt.add(Integer.parseInt(elem));
        }
        System.out.println(myInputInt);

        int maxElem, minElem;
        maxElem = minElem = myInputInt.get(0);
        for (int elem : myInputInt) {
            if (maxElem < elem) maxElem = elem;
            if (minElem > elem) minElem = elem;
        }
        System.out.println("maxElem = " + maxElem + " minElem = " + minElem);
    }
}