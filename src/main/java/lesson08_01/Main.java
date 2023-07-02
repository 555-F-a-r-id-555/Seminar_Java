package lesson08_01;

public class Main {
    public static void main(String[] args) {
        Gen<Integer> object = new Gen<Integer>(289);

        object.show();
        Integer integer = object.getOb();
        System.out.println("Значение: " + integer);

        System.out.println("Значение др. типа..................");

        Gen<String> object2 = new Gen<String>("Это строка......");

        object2.show();
        String string = object2.getOb();
        System.out.println("Значение: " + string);

    }
}
