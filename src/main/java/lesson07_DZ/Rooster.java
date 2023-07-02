package lesson07_DZ;

public class Rooster extends Animals {
    public Rooster(String aminalName, int animalAge, String animalColor) {
        super(aminalName, animalAge, animalColor);
    }

    public Rooster(String aminalName, int animalAge) {
        super(aminalName, animalAge);
    }

    public Rooster(String aminalName) {
        super(aminalName);
    }

    public Rooster() {
    }

    @Override
    void voice() {
        System.out.println(getAminalName() + " кукарекает");

    }

    @Override
    void walking() {
        System.out.println(getAminalName() + " гуляет");
    }

    @Override
    void aet(int amount) {
        System.out.println(new StringBuilder().append(getAminalName()).append(" клюет ").append(amount).append(" зернышко/шек").toString());


    }

    @Override
    void sleep() {
        System.out.println(getAminalName() + " спит");
    }

    @Override
    void bite() {
        System.out.println(getAminalName() + " клюет");
    }
}
