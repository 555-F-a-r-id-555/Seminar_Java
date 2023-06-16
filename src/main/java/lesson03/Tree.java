package lesson03;

public class Tree<T extends Comparable<T>> {
    private Node<T> root;

    // Конструктор класса Tree
    public Tree() {
        root = null;
    }

    // Вставка значения в дерево
    public void insert(T value) {
        root = insertRecursive(root, value);
    }

    // Рекурсивный метод вставки значения в дерево
    private Node<T> insertRecursive(Node<T> currentNode, T value) {
        if (currentNode == null) {
            // Создаем новый узел, если текущий узел является пустым
            return new Node<>(value);
        }

        // Сравниваем значения и рекурсивно вставляем значение в правильное поддерево
        if (value.compareTo(currentNode.value) < 0) {
            currentNode.left = insertRecursive(currentNode.left, value);
        } else if (value.compareTo(currentNode.value) > 0) {
            currentNode.right = insertRecursive(currentNode.right, value);
        }

        // Возвращаем текущий узел
        return currentNode;
    }

    // Вспомогательный метод для проверки пустоты дерева
    public boolean isEmpty() {
        return root == null;
    }

    // Внутренний класс для представления узла дерева
    private static class Node<T> {
        T value;
        Node<T> left;
        Node<T> right;

        // Конструктор класса Node
        public Node(T value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
}
