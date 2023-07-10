package Lesson_10_Test555;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class FuitBox2<T extends Test02> implements Iterator<T>, Iterable<T> {

    private T fruit;

    private List<T> fruits;

    private int index = 0;

    public List<T> getFruits() {
        return fruits;
    }

    public void setFruits(List<T> fruits) {
        this.fruits = fruits;
    }

    public FuitBox2() {
        fruits = new ArrayList<>();
    }

    //------------------------------------------
    public void addFruits(T fruit) {

        fruits.add(fruit);
    }

//    public int getWeight() {
//        int sum = 0;
//        Iterator iterator = fruits.iterator();
//        while (iterator.hasNext()) {
//            sum += (Integer) iterator.next();
//        }
//        return sum;
//    }

    public int getWeight() {
        int sum = 0;
        for (T fruit : fruits) {
            sum += fruit.getWeight();
        }
        return sum;
    }

//    public FuitBox2<T> sprinkleApples(){
//        FuitBox2 newfuitBox2 = new FuitBox2();
//        for (T fruit:fruits) {
//            newfuitBox2.addFruits(fruit);
//        }
//
////        List<T> newfruits = new ArrayList<>();
////        newfruits.addAll(fruits);
//        fruits.clear();
////        return newfruits;
//        return newfuitBox2;
//    }


    //----------------------------------
    @Override
    public String toString() {
        return "FuitTest{" +
                "fruits=" + fruits +
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

//    @Override
//    public T next() {
//        if (index < fruits.size()) {
//            return fruits.get(index++);
//        } else {
//            throw new NoSuchElementException();
//        }
//    }

    @Override
    public void forEach(Consumer<? super T> action) {
//        Iterable.super.forEach(action);
        for (T fruit : fruits) {
            action.accept(fruit);
        }
    }

    @Override
    public Iterator<T> iterator() {
        return this;
    }

    public void clear(FuitBox2<T> box2) {
        box2.getFruits().clear();
    }
}
