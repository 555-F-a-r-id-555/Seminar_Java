package Lesson_15.Work1v2;

public class Square implements SquareFigure{
    private int height;

    public Square(int height) {
        this.height = height;
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int areaCalc() {
        return height * height;
    }
}
