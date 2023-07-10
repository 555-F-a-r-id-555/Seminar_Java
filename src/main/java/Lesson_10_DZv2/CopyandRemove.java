package Lesson_10_DZv2;

public class CopyandRemove<T extends Fruit> {
    public FruitBox copyAndRemove(FruitBox<T> sourceBox) {
        FruitBox<T> newBox = new FruitBox<>();

        for (T fruit : sourceBox) {
            newBox.addFruits(fruit);
        }

        sourceBox.clear(sourceBox);

        return newBox;
    }
}
