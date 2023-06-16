package lesson04;

import java.util.Deque;
import java.util.LinkedList;

public class Main03 {

    public static void main(String[] args) {
        Stack();
        System.out.println("--------");
        Queue();

    }

    // 1.Реализация стека:
    public static void Stack() {
        Deque<Integer> stack = new LinkedList<>();
        stack.push(1); // Добавление элемента в верх стека
        stack.push(2);
        stack.push(3);
        int top = stack.peek(); // Получение верхнего элемента стека без удаления
        System.out.println(top); // Выводит: 3
        while (!stack.isEmpty()) {
            int element = stack.pop(); // Удаление и получение верхнего элемента стека
            System.out.println(element); // Выводит: 3, 2, 1
        }
    }

    // 2.Реализация очереди:
    public static void Queue() {
        Deque<String> queue = new LinkedList<>();
        queue.offer("A"); // Добавление элемента в конец очереди
        queue.offer("B");
        queue.offer("C");
        String firstElement = queue.peek(); // Получение первого элемента очереди без удаления
        System.out.println(firstElement); // Выводит: A
        while (!queue.isEmpty()) {
            String element = queue.poll(); // Удаление и получение первого элемента очереди
            System.out.println(element); // Выводит: A, B, C
        }

    }

    /*В этих примерах Deque используется для хранения элементов и
    обеспечения доступа к ним как в начале, так и в конце коллекции.
    Вы можете добавлять элементы в начало или конец очереди,
    удалять их и получать элементы с начала или конца в зависимости от ваших потребностей.
    Это делает Deque удобной и эффективной для различных сценариев использования.
*/
}
