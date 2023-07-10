package Lesson_10_Test555;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Test test01 = new Test(2);
        Test test02 = new Test(4);

//        System.out.println(test01);
//        System.out.println(test02);

        FuitBox2<Test02> fuitBox2 = new FuitBox2<Test02>();

        System.out.println("----------------------");
        System.out.println(fuitBox2);
        System.out.println("------------------------");
        fuitBox2.addFruits(test01);
        System.out.println(fuitBox2);
        fuitBox2.addFruits(test02);
        System.out.println(fuitBox2);
        fuitBox2.addFruits(test02);
        System.out.println(fuitBox2);
        System.out.println("----------------------------");
//
//        for (FuitTest<Test02> it = fuitTest; it.hasNext(); ) {
//            Test02 elem = it.next();
//            System.out.println(elem);
//        }

        Iterator<Test02> iterator = fuitBox2.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("------------------------------");

        fuitBox2.forEach(elem -> System.out.println(elem));

        System.out.println("------------------------------");
        System.out.println(fuitBox2.getWeight());
        System.out.println("------------------------------");
//        System.out.println(fuitBox2.sprinkleApples().getClass().getName());
        System.out.println(fuitBox2);
        System.out.println("------------------------------");

//        SprinkTest<Test02> sprinkTest = new SprinkTest<>();
//        System.out.println(sprinkTest.sprinkTest2(fuitBox2));

        FuitBox2<Test02> fuitBox3 = new FuitBox2<>();

        fuitBox3.addFruits(test01);
        fuitBox3.addFruits(test02);
        fuitBox3.addFruits(test01);
        fuitBox3.addFruits(test02);



        SprinkTest<Test02> sprinkTest = new SprinkTest<>();
        FuitBox2<Test02> newBox = sprinkTest.copyAndRemove(fuitBox3);

        System.out.println("Новый FuitBox2: " + newBox);
        System.out.println("Исходный FuitBox2 после удаления: " + fuitBox3);

        System.out.println("------------------------------");

    }


}
