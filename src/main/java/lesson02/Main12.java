package lesson02;

public class Main12 {
    public static void main(String[] args) {
        /*Напишите метод, который сжимает строку.
        Пример: вход .*/
        String abc = "ttttaaaabbbcddqq";
        char index = abc.charAt(0);
        /*Integer count = new Integer();*/
        int count = 1;
        StringBuilder sb = new StringBuilder();


        for (int i = 1; i < abc.length(); i++) {
            if (abc.charAt(i-1) == abc.charAt(i)){
                count++;
            }else if(count ==1) {
                sb.append(abc.charAt(i-1));
            }
            else{
                sb.append(abc.charAt(i-1)).append(count);
                count = 1;
            }
            if(i==abc.length()-1){
                sb.append(abc.charAt(i));
                sb.append(count);
            }
        }
        System.out.println(sb);
    }
}
