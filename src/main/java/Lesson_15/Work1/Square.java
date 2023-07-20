package Lesson_15.Work1;

public class Square implements Figure {

    private int height;
    @Override
    public void setHeight(int height) {
        this.height =  height;
    }

    @Override
    public void setWidth(int height) {
        this.height = height ;
    }

    @Override
    public int areaCalc() {
        return height* height;
    }
}
