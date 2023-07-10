package Lesson_10_DZv2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class FruitBox<T extends Fruit> implements Iterable<T>, Iterator<T> {

    private List<T> fruits;

    private int index = 0;

    public List<T> getFruits() {
        return fruits;
    }

    public void setFruits(List<T> fruits) {
        this.fruits = fruits;
    }

    public FruitBox() {
        fruits = new ArrayList<>();
    }

    public void addFruits(T fruit) {
        fruits.add(fruit);
    }

    public int getWeight() {
        int sum = 0;
        for (T fruit : fruits) {
            sum += fruit.getWeight();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "FruitBox{" +
                "fruits = " + fruits +
                '}';
    }

    @Override
    public boolean hasNext() {
        return index < fruits.size();
    }

    @Override
    public T next() {
        if (index < fruits.size()) {
            index++;
        } else {
            index = 0;
        }

        T t = fruits.get(index - 1);
        return t;
    }

    @Override
    public Iterator<T> iterator() {
        return this;
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        for (T fruit : fruits) {
            action.accept(fruit);
        }
    }

    public void clear(FruitBox<T> box) {
        box.getFruits().clear();
    }

}
