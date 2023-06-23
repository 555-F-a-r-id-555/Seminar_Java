package lesson05;

//Написать метод, который переведет число из римского формата записи в арабский.
//        Например, MMXXII = 2022


import java.util.Map;

public class Main03 {
    public static void main(String[] args) {
        String test = "MMMMCMXIX";
        int res1 = ex3(test);
        System.out.println(res1);

    }

    private static Integer ex3(String romanNum) {

        Map<Character, Integer> romanToDecimalMap = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );

        StringBuilder romanNumSB = new StringBuilder(romanNum.trim()).reverse();
        int decimalNum = 0;
        int prevNum = -1;

        for (Character romanChar : romanNumSB.toString().toCharArray()) {
            int currentNum = romanToDecimalMap.get(romanChar);
            if (currentNum < prevNum) {
                currentNum *= -1;
            }
            decimalNum += currentNum;
            prevNum = currentNum;
        }

        return decimalNum;

    }
}
