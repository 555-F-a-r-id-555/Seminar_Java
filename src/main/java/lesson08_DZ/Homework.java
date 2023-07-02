package lesson08_DZ;

public class Homework {

    /**
     * Задание
     * <p>
     * Предположим, вы разрабатываете какую-то компьютерную игру, в которой есть несколько типов объектов (классов):
     * 1. Здание (имеет текущий уровень здоровья)
     * 2. Герой (имеет текущий уровень здоровья и текущий уровень магической энергии)
     * 3. Нейтральный персонаж (имеет текущий уровень здоровья)
     * Примеры того, как это может выглядеть:
     * https://d3upx5peno0o6w.cloudfront.net/guides1png_1620826387.png
     * https://xgm.guru/files/100/242011/HP-Bar.png
     * <p>
     * Также у вас есть класс Render с методом showIndicator, который срабатывает при наведении мышки на объект
     * и работает следующим образом:
     * 1. Если объект обладает уровнем здоровья, то отображается индикатор с текущим уровнем здоровья.
     * 2. Если объект обладает уровнем магический энергии, то отображается индикатор с текущим уровнем энергии.
     * * В качестве упрощения, пусть вывод на дисплей это запись информации в консоль.
     * * То есть вы пишете код, который выводит на консоль информацию.
     * <p>
     * <p>
     * Подсказка: нужно ввести 2 интерфейса: наличие здоровья и наличие магической энергии.
     * В классе Render проверять только на эти интерфейсы и выводить нужную информацию.
     * Необходимо продумать, какие методы должны быть в интерфейсе.
     * <p>
     * ЧТО ДЕЛАТЬ НЕ НУЖНО:
     * Нельзя завязываться на конкретные классы. Предполагается, что таких классов очень много и они постоянно добавляются.
     * <p>
     * * Необязательные задания, которые не относятся к теме, но при сильном желании можно реализовать.
     * * Со звездочкой: реализовать в консоли отображение индикатора.
     * Например, при максимальном уровне здоровья 100 и текущем 40 можно отобразить вот такую ленточку: [xxxx      ]
     * ** С двумя звездочками: раскрасить вывод. Чем меньше здоровья, тем "краснее" цвет индикатора.
     * Для полного здоровья - цвет зеленый.
     */

    public static void main(String[] args) {
//        Render2 render = new Render2();

        //----------------Building--------------
        Building building1 = new Building(1000);
        building1.setCurrentHealthPoint(1800);

        System.out.println("Building1: ");
        building1.showIndicator();

        Building building2 = new Building(100);
        building2.setCurrentHealthPoint(70);

        System.out.println("Building2: ");
        building2.showIndicator();

        Building building3 = new Building(100);
        building3.setCurrentHealthPoint(7);

        System.out.println("Building3: ");
        building3.showIndicator();

        //--------------HERO-------------
        Hero hero1 = new Hero(150,110);
        hero1.setCurrentHealthPoint(99);
        hero1.setCurrentManaPoint(77);

        System.out.println("Hero1: ");
        hero1.showIndicator();

        Hero hero2 = new Hero(150,110);
        hero2.setCurrentHealthPoint(199);
        hero2.setCurrentManaPoint(177);

        System.out.println("Hero2: ");
        hero2.showIndicator();

        Hero hero3 = new Hero(150,110);
        hero3.setCurrentHealthPoint(9);
        hero3.setCurrentManaPoint(7);

        System.out.println("Hero3: ");
        hero3.showIndicator();


        //-----------------Neutral-----------------
        Neutral neutra1 = new Neutral(120);
        neutra1.setCurrentHealthPoint(105);

        System.out.println("Neutral1: ");
        neutra1.showIndicator();

        Neutral neutra2 = new Neutral(1200);
        neutra2.setCurrentHealthPoint(2050);

        System.out.println("Neutral2: ");
        neutra2.showIndicator();

        Neutral neutra3 = new Neutral(120);
        neutra3.setCurrentHealthPoint(45);

        System.out.println("Neutral3: ");
        neutra3.showIndicator();

        Neutral neutra4 = new Neutral(120);
        neutra4.setCurrentHealthPoint(0);

        System.out.println("Neutral4: ");
        neutra4.showIndicator();

        Neutral neutra5 = new Neutral(120);
        neutra5.setCurrentHealthPoint(-105);

        System.out.println("Neutral5: ");
        neutra5.showIndicator();





//        render.showIndicator(building); // В консоли должно быть примерно так: Текущий уровень здоровья: 50, максимальный уровень здоровья: 100

    }

}
