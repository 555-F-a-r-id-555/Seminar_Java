package lesson08_DZ;

public class Hero extends Render {
    private int maxHealthPoint; // максимально количество здоровья
    private int currentHealthPoint; // текущее количество здоровья

    private int maxManaPoint; // максимально количество магический энергии
    private int currentManaPoint; // текущее количество магический энергии

    public Hero(int maxHealthPoint, int maxManaPoint) {
        this.maxHealthPoint = maxHealthPoint;
        this.maxManaPoint = maxManaPoint;

        this.currentHealthPoint = maxHealthPoint;
        this.currentManaPoint = maxManaPoint;
    }

    public void setCurrentHealthPoint(int currentHealthPoint) {
        this.currentHealthPoint = currentHealthPoint;
    }

    public void setCurrentManaPoint(int currentManaPoint) {
        this.currentManaPoint = currentManaPoint;
    }

    public int getMaxHealthPoint() {
        return maxHealthPoint;
    }

    public int getCurrentHealthPoint() {
        return currentHealthPoint;
    }

    public int getMaxManaPoint() {
        return maxManaPoint;
    }

    public int getCurrentManaPoint() {
        return currentManaPoint;
    }

    @Override
    public String showLine(Integer maxPoint, Integer currentPoint, String str, String str2) {
        return super.showLine(maxPoint, currentPoint, str, str2);
    }

    // str1 = "☼","♥" либо "X"
    // str2 = "†" ,"○"  либо "X"
    @Override
    void showIndicator() {
        System.out.println(((currentHealthPoint * 1.0) / maxHealthPoint) * 100 + "% HP :"
                + showLine((Integer) maxHealthPoint, (Integer) currentHealthPoint, "♥", "†"));
        System.out.println(((currentManaPoint * 1.0) / maxManaPoint) * 100 + "% HP :"
                + showLine((Integer) maxManaPoint, (Integer) currentManaPoint, "☼", "○"));
    }

    // FIXME: 29.06.2023 Дописать нужное// FIXED
}
