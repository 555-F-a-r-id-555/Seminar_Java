package lesson08_DZ;

public class Building extends Render {

    private int maxHealthPoint; // максимально количество здоровья
    private int currentHealthPoint; // текущее количество здоровья

    public Building(int maxHealthPoint) {
        this.maxHealthPoint = maxHealthPoint;
        this.currentHealthPoint = maxHealthPoint;
    }


    public void setCurrentHealthPoint(int currentHealthPoint) {
        this.currentHealthPoint = currentHealthPoint;
    }

    public int getMaxHealthPoint() {
        return maxHealthPoint;
    }

    public int getCurrentHealthPoint() {
        return currentHealthPoint;
    }

    // str1 = "☼","♥" либо "X"
    // str2 = "†" ,"○"  либо "X"
    @Override
    void showIndicator() {
        System.out.println(((currentHealthPoint * 1.0) / maxHealthPoint) * 100 + "% HP :"
                + showLine((Integer) maxHealthPoint, (Integer) currentHealthPoint, "♥", "†"));
    }


    @Override
    public String showLine(Integer maxPoint, Integer currentPoint, String str, String str2) {
        return super.showLine(maxPoint, currentPoint,  str, str2);
    }


    // FIXME: 29.06.2023 Дописать нужное // FIXED
}
