package Lesson_15.Work1v2;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3,5);
        Square square = new Square(5);

        System.out.println("Rectangle: " + rectangle.areaCalc());
        System.out.println("Square: " + square.areaCalc());

        rectangle.setHeight(8);
        rectangle.setWidth(11);
        System.out.println("Rectangle2: " + rectangle.areaCalc());

        square.setHeight(11);
        System.out.println("Square2: " + square.areaCalc());
    }
}
