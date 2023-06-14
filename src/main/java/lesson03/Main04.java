package lesson03;

import java.util.Arrays;

public class Main04 {
    public static void main(String[] args) {
        String[] str1 = "hello".split("");
        System.out.println(Arrays.toString(str1));

        char[] ch = "hello".toCharArray();
        System.out.println(ch.getClass());


//        for ( String elem:str1) {
//            System.out.println(elem.getClass().getName());
//        }


        String str2 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
        System.out.println(str2);
    }
}

