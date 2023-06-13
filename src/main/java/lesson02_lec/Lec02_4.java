package lesson02_lec;

import java.util.Arrays;

public class Lec02_4 {
    public static void main(String[] args) {
        String[] str1 = "Farid".split("");
        System.out.println(Arrays.toString(str1));
        String res1 = String.join("-",str1);
        System.out.println(res1);
    }
}
