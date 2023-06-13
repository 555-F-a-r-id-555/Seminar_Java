package lesson02_test;

public class Main2 {
    public static void main(String[] args) {
        Object u = 1;
        GetType(u);
        u = 1.5;
        System.out.println(u);
        GetType(u);
    }

    static void GetType(Object x) {
        System.out.println(x.getClass().getName());
    }

}