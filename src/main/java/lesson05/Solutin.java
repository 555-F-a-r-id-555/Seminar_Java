package lesson05;

public class Solutin {
    public static void main(String[] args) {
        String test = "MMMMCMXIX";
        int res1 = res(test);
        System.out.println(res1);

    }

    public static int res(String s) {
        int number = 0;
        int answer = 0;
        int prev = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == 'I') {
                number = 1;
            } else if (s.charAt(i) == 'V') {
                number = 5;
            } else if (s.charAt(i) == 'X') {
                number = 10;
            } else if (s.charAt(i) == 'L') {
                number = 50;
            } else if (s.charAt(i) == 'C') {
                number = 100;
            } else if (s.charAt(i) == 'D') {
                number = 500;
            } else if (s.charAt(i) == 'M') {
                number = 1000;
            }
            if (number < prev) {
                answer -= number;
            } else {
                answer += number;
            }
            prev = number;
        }
        return answer;
    }
}

