package Lesson_15.Work1;

public class Rectangle implements Figure {

    private int height;
    private int width;
    @Override
    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int areaCalc() {
        return height*width;
    }
}
