package Lesson_15.Work1v2;
/*
Доработка, предыдущего кода:
1.Figure на два интерфейса: RectangleFigure и SquareFigure.
  Каждый интерфейс предоставляет свои уникальные методы,
  связанные с установкой параметров фигур,
  что соблюдает принцип разделения интерфейсов.
2.В классах Rectangle и Square добавили конструкторы
для инициализации высоты и ширины (для Rectangle) или только высоты (для Square).
Таким образом, объекты фигуры создаются в инициализированном состоянии,
а не через методы setHeight() и setWidth().
3....

*/
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
