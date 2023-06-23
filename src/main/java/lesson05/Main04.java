package lesson05;

import java.util.Map;

public class Main04 {
    public static void main(String[] args) {
        String test = "MMMMCMXIX";
        int res1 = ex1(test);
        System.out.println(res1);

    }

    private static int ex1(String value) {
        //MMMMCMXCIX

        Map<Character, Integer> db = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );

        int sum = 0;

        for (int i = value.length() - 1; i > 0; i--) {
            if (db.get(value.charAt(i - 1)) < db.get(value.charAt(i))) {
                sum += db.get(value.charAt(i)) - db.get(value.charAt(i - 1));
                i--;
            } else {
                sum += db.get(value.charAt(i));
            }
        }

        if (db.get(value.charAt(0)) < db.get(value.charAt(1))) {
            sum += db.get(value.charAt(1)) - db.get(value.charAt(0));
        } else {
            sum += db.get(value.charAt(0));
        }


        return sum;
    }
}
