package lesson07_DZ;

//Нужно создать несколько классов животных:
//        1. Пес (Собака)
//        2. Кот (Кошка)
//        3. ... придумать еще парочку
//
//        Каждое животное имеет: (поля)
//        1. Имя (кличка)
//        2. Возраст
//        3. ... придумать еще какие-то параметры
//
//        Каждое животное может: (методы)
//        1. Подавать голос
//        2. Питаться (съедает какое-то количество еды, переданное в метод)
//        3. Двигаться
//        4. ... все, что сумеете придумать
//
//        Нужно выделить базовый тип с общими атрибутами, инкапсулировать то, что является внутренним, внурь класса.
//        Создать массив с животными и в цикле заставить их поесть (какое-то количество еды) и заставить подать голос.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animals dog = new Dog("Рекс",8,"brown");
        Animals cat = new Cat("Феликс",3,"red");
        Animals donkey = new Donkey("Яшка",7,"grey");
        Animals rooster = new Rooster("Вегас",4,"brown");

// либо, как вариант
//        Animals animals[] = new Animals[4];
//        animals[0] = dog;
//        animals[1] = cat;
//        animals[2] = donkey;
//        animals[3] = rooster;
//        dog.aet(7);
//        cat.aet(6);
//        donkey.aet(9);
//        rooster.aet(20);

        List<Animals> animals =  new ArrayList<Animals>();
        Collections.addAll(animals,dog,cat,donkey,rooster);


        for (Animals animal:animals) {
            animal.voice();
            try {
                Thread.sleep(1000);
                if(animal.equals(dog))animal.aet(7);
                else if (animal.equals(cat))animal.aet(5);
                else if (animal.equals(donkey))animal.aet(20);
                else animal.aet(40);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            animal.walking();


        }

    }
}
