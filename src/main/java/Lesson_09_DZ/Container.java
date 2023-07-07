package Lesson_09_DZ;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;


public class Container implements Iterable<Integer>, Iterator<Integer>, Comparable<Container> {

    private List<Box> boxes;
    private int currentIndex = 0;

    public Container() {
        boxes = new ArrayList<>();
    }

    public void addBox(Box box) {
        boxes.add(box);
    }


    public int sumBox() {
        int sum = 0;
        for (Box box : boxes) {
            sum += box.getWeight();
        }
        return sum;
    }

    public int sizeContainer() {
        return boxes.size();
    }

    @Override
    public Iterator<Integer> iterator() {
        return this;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < boxes.size();
    }

    @Override
    public Integer next() {
        if (hasNext()) {
            Box box = boxes.get(currentIndex);
            currentIndex++;
            return box.getWeight();
        }
        throw new NoSuchElementException("Нет больше элементов в Container");
    }

    @Override
    public int compareTo(Container o) {
        Integer weight = (Integer) this.sumBox();
        if (weight > o.sumBox()) return 1;
        if (weight < o.sumBox()) return -1;
        return 0;
    }
}


//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//
//public class Container implements Iterable<Integer>,Comparable<Container> {
//    private List<Integer> boxes;
//
//    public Container() {
//        boxes = new ArrayList<>();
//    }
//
//    public void addBox(Box box) {
//        boxes.add(box.getWeight());
//    }
//
//    public int sumBox() {
//        int sum = 0;
//        for (int weight : boxes) {
//            sum += weight;
//        }
//        return sum;
//    }
//
//    public int sizeContainer() {
//        return boxes.size();
//    }
//
//    @Override
//    public Iterator<Integer> iterator() {
//        return boxes.iterator();
//    }
//    @Override
//    public int compareTo(Container o) {
//        Integer weight = (Integer) this.sumBox();
//        if (weight > o.sumBox()) return 1;
//        if (weight < o.sumBox()) return -1;
//        return 0;
//    }
//}
