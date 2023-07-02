package lesson07_DZ;

public class Donkey extends Animals {


    public Donkey(String aminalName, int animalAge, String animalColor) {
        super(aminalName, animalAge, animalColor);
    }

    public Donkey(String aminalName, int animalAge) {
        super(aminalName, animalAge);
    }

    public Donkey(String aminalName) {
        super(aminalName);
    }

    public Donkey() {
    }

    @Override
    void voice() {
        System.out.println( getAminalName() + " говорит ИА..");

    }

    @Override
    void walking() {
        System.out.println(getAminalName() + " гуляет");
    }

    @Override
    void aet(int amount) {
        System.out.println(new StringBuilder().append(getAminalName()).append(" кушает ").append(amount).append(" кукурузу/ы").toString());

    }

    @Override
    void sleep() {
        System.out.println(getAminalName() + " спит");
    }

    @Override
    void bite() {
        System.out.println(getAminalName() + " кусается");
    }
}
