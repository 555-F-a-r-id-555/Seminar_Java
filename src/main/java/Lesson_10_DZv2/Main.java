package Lesson_10_DZv2;

//    Урок 4. ООП: Обобщения. ч1
//    Есть класс Фрукта. У фрукта есть вес.
//    Есть 3 наследника: апельсин, яблоко и золотое яблоко.
//    Нужно создать класс "Коробка с фруктами", в которую можно класть фрукты какого-то типа.
//    После создания коробка пустая. В нее можно добавлять фрукты с помощью метода add().
//    У коробки можно узнать сумарный вес с помощью метода getWeight().
//    Содержимое коробки можно пересыпать в другую коробку. При этом исходная коробка очищается,
//    а вторая наполняется.

public class Main {
    public static void main(String[] args) {
        Apple apple1 = new Apple(8);
        Apple apple2 = new Apple(3);
        Apple apple3 = new Apple(5);
        Apple apple4 = new Apple(7);
        Apple apple5 = new Apple(15);

        GoldenApple goldenApple1 = new GoldenApple(5);
        GoldenApple goldenApple2 = new GoldenApple(10);
        GoldenApple goldenApple3 = new GoldenApple(15);

        Orange orange1 = new Orange(1);
        Orange orange2 = new Orange(2);
        Orange orange3 = new Orange(3);



        FruitBox<Fruit> fruitBox1  = new FruitBox<>();
        System.out.println(fruitBox1);

        fruitBox1.addFruits(apple1);
        fruitBox1.addFruits(apple2);
        fruitBox1.addFruits(apple3);
        fruitBox1.addFruits(apple4);
        fruitBox1.addFruits(apple5);
        System.out.println("Added Apple, AppleWeight = " +fruitBox1.getWeight());
        fruitBox1.addFruits(goldenApple1);
        fruitBox1.addFruits(goldenApple2);
        fruitBox1.addFruits(goldenApple3);
        System.out.println("Added goldenApple, goldenAppleWeight + AppleWeight = " +fruitBox1.getWeight());
        fruitBox1.addFruits(orange1);
        fruitBox1.addFruits(orange2);
        fruitBox1.addFruits(orange3);


        System.out.println(fruitBox1);
        System.out.println("----------------------");
        System.out.println("WEIGHT = " + fruitBox1.getWeight());
        System.out.println("----------------------");

        CopyandRemove<Fruit> copyandRemove = new CopyandRemove<>();
        FruitBox<Fruit> newbox = copyandRemove.copyAndRemove(fruitBox1);

        System.out.println("Новый FuitBox1: " + newbox);
        System.out.println("Исходный FuitBox1 после удаления: " + fruitBox1);





    }









}
