package lesson02_lec;

public class Lec02_2 {
    public static void main(String[] args) {
        var start = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 100_000; i++) stringBuilder.append("+");
        var stop = System.currentTimeMillis();
        var res = stop -start;
        System.out.println("res = " + res +" ms");
        System.out.println("stringBuilder = ");
        System.out.println(stringBuilder);
    }
}
