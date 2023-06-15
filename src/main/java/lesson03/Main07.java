package lesson03;

/*Каталог товаров книжного магазина сохранен в виде двумерного
  списка List<ArrayList<String>> так, что на 0й позиции каждого
  внутреннего списка содержится название жанра, а на остальных
  позициях - названия книг. Напишите метод для заполнения данной
  структуры.*/
/*Реализовать алгоритм сортировки слиянием*/

import java.util.ArrayList;
import java.util.List;

public class Main07 {
    public static void main(String[] args) {
        List<List<String>> books = new ArrayList<>();

        // Создаем первую строку
        List<String> row1 = new ArrayList<>();
        row1.add("проза");
        row1.add("поэзия");
        row1.add("док");

        // Создаем вторую строку
        List<String> row2 = new ArrayList<>();
        row2.add("Война и мир");
        row2.add("Бородино");
        row2.add("F-----");

        // Создаем третью строку
        List<String> row3 = new ArrayList<>();
        row3.add("12 стульев");
        row3.add("H----");
        row3.add("I----");

        // Добавляем строки в двумерный список
        books.add(row1);
        books.add(row2);
        books.add(row3);

        // Выводим двумерный список
        for (List<String> row : books) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println(books.size());
        System.out.println(books.get(0).size());
    }
}
