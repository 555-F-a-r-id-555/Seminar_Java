package Lesson_09_test.lesson2;

public interface Swimming {
    void swim();

    static void staticMethod() {
        System.out.println("This is static!");
    }

    private void privateMethod() {
        System.out.println("This swimming animal say \"Hello!\"");
    }

    default void sayHello() {
        privateMethod();
    }
}
