package lesson02;

public class Main11 {
    public static void main(String[] args) {
        System.out.println();

        /*Дано четное число N (>0) и символы c1 и c2.
         Написать метод, который вернет строку длины N,
        которая состоит из чередующихся символов c1 и c2, начиная с c1. */

        int n = 6;

        String c1 = "A";
        String c2 = "Y";
        StringBuilder sb = new StringBuilder();



        for (int i = 0; i < n/2; i++){
            sb.append(c1).append(c2);

        }
        System.out.println(sb);



    }
}
