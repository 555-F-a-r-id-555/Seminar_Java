package lesson02_lec;

public class Lec02 {
    public static void main(String[] args) {
        var start = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 100_000; i++) {
            str += "+";
        }
        var stop = System.currentTimeMillis();
        var res = stop -start;
        System.out.println("res = " + res +" ms");
        System.out.println("str = ");
        System.out.println(str);
    }
}
