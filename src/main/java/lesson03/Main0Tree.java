package lesson03;

/*В классе Tree добавить возможность использовать любые сравниваемые типы данных.
  То есть нужно параметризовать класс T дженериком <T extends Comparable<T>>*/


public class Main0Tree {
    public static void main(String[] args) {
        // Создаем экземпляр класса Tree с типом данных Integer
        Tree<Integer> tree = new Tree<>();

        // Вставляем значения в дерево
        tree.insert(5);
        tree.insert(2);
        tree.insert(7);
        tree.insert(1);
        tree.insert(3);
        tree.insert(6);
        tree.insert(8);

        // Проверяем, пустое ли дерево
        if (tree.isEmpty()) {
            System.out.println("Дерево пустое");
        } else {
            System.out.println("Дерево не пустое");
        }


        Tree<String> tree2 = new Tree<String>();

        tree2.insert("Hi");
        tree2.insert("I'm");
        tree2.insert("Java");
        tree2.insert("Generics");

        if (tree2.isEmpty()) {
            System.out.println("Дерево пустое");
        } else {
            System.out.println("Дерево не пустое");
        }

        Tree<Boolean> tree3 = new Tree<Boolean>();

        tree3.insert(true);
        tree3.insert(false);


        if (tree3.isEmpty()) {
            System.out.println("Дерево пустое");
        } else {
            System.out.println("Дерево не пустое");
        }
    }
}




