package lesson1;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        /*Во фразе
        переставить слова в обратном порядке.*/
        String str1 = "Добро пожаловать на курс по Java";
        String[] lst1 = str1.split(" ");
        String[] lst2 = new String[lst1.length];
        /*System.out.println(Arrays.toString(lst1));*/
        for (int i = lst1.length - 1; i >= 0; i--) {
            System.out.print(lst1[i] + " ");
            lst2[i] = lst1[i];
        }
        System.out.println();
        System.out.println(Arrays.toString(lst2));
    }
}
