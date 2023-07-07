package Lesson_09_DZ;

import java.util.Iterator;

/*создать класс Контейнер - Container.
        В контейнере могут быть ящики (класс Box).

        У каждого ящика есть вес.
        У каждого контейнера есть метод "получить вес" - это сумма всех весов ящиков, которые находятся в контейнере.

        Класс Контейнер должен быть Comparable. Сравнивать он должен по весам контейнера (чем меньше вес, тем меньше контейнер).
        Класс ContainerCountComparator - Comparator, который сравнивает контейнеры по количеству ящиков (чем меньше ящиков, тем меньше контейнер).
        Класс контейнер должен быть Iterable - итерирование должно происходить по ящикам внутри контейнера.

        Container c = new Container(...);
// ...
        for (Box box: c) {
        box - это контейнер
        }*/

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(10);
        Box box2 = new Box(2);
        Box box3 = new Box(3);
        Box box4 = new Box(4);
        Box box5 = new Box(50);

        Container container1 = new Container();
        container1.addBox(box1);
        container1.addBox(box2);
        container1.addBox(box3);
        container1.addBox(box4);
        container1.addBox(box5);

        Container container2 = new Container();
        container2.addBox(box1);
        container2.addBox(box5);


        System.out.println("\n★★★★★★★★★★★★Певый контейнер★★★★★★★★★★★★\n");
        Iterator<Integer> containerIterator1 = container1.iterator();

        System.out.print("\"Container1\": ");
        while (containerIterator1.hasNext()) {
            System.out.print(containerIterator1.next() + " ");
        }
        System.out.println();
        System.out.println("\"SUMBOX1\": " + container1.sumBox());

        System.out.println("\n★★★★★★★★★★★★Второй контейнер★★★★★★★★★★★★\n");
        Iterator<Integer> containerIterator2 = container2.iterator();

        System.out.print("\"Container2\": ");
        while (containerIterator2.hasNext()) {
            System.out.print(containerIterator2.next() + " ");
        }
        System.out.println();
        System.out.println("\"SUMBOX2\": " + container2.sumBox());

        System.out.println("\n★★★★★★★★★★★★Сравнение по весу★★★★★★★★★★★\n");

        int comparisonToResult = container1.compareTo(container2);
        if (comparisonToResult > 0) {
            System.out.println("container1:" + container1.sumBox() + " > " + "container2:" + container2.sumBox());
        } else if (comparisonToResult < 0) {
            System.out.println("container1:" + container1.sumBox() + " < " + "container2:" + container2.sumBox());
        } else {
            System.out.println("container1:" + container1.sumBox() + " == " + "container2:" + container2.sumBox());
        }

        System.out.println("\n★★★★★★★★★★★★Сравнение по количеству★★★★★\n");
        ContainerCountComparator comparator = new ContainerCountComparator();
        int comparisonResult = comparator.compare(container1, container2);
        if (comparisonResult > 0) {
            System.out.println("container1:" + container1.sizeContainer() + " > " + "container2:" + container2.sizeContainer());
        } else if (comparisonResult < 0) {
            System.out.println("container1:" + container1.sizeContainer() + " < " + "container2:" + container2.sizeContainer());
        } else {
            System.out.println("container1:" + container1.sizeContainer() + " == " + "container2:" + container2.sizeContainer());
        }


//        System.out.println("--------------------------Сравнение по количеству----------------------------");
//        ContainerCountComparator containerCountComparator = new ContainerCountComparator(container1);
//        System.out.println();
//        if (containerCountComparator.compareTo(container2) == 1) {
//            System.out.println("container1:" + container1.sizeContainer() + " > " + "container2:" + container2.sizeContainer());
//        } else if (containerCountComparator.compareTo(container2) == -1) {
//            System.out.println("container1:" + container1.sizeContainer() + " < " + "container2:" + container2.sizeContainer());
//        } else
//            System.out.println("container1:" + container1.sizeContainer() + " == " + "container2:" + container2.sizeContainer());




    }
}
