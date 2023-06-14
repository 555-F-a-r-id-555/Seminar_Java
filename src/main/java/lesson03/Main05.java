package lesson03;

import java.util.List;

public class Main05 {
    public static void main(String[] args) {
        List<String> strings = List.of("4", "qwe", "5", "8", "hello");
        int sum = 0;
        for (String string : strings)
            try {
                sum += Integer.parseInt(string);
            } catch (NumberFormatException e) {
                System.err.println("Невозможно перевести в строку: " + string);
            }

        System.out.println("sum: " + sum);
    }
}
