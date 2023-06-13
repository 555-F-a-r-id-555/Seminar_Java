package lesson02;

public class Main12v2 {
    public static void main(String[] args) {
//        Напишите метод, который сжимает строку.
//        Пример: вход aaaabbbcdd

        String data = "aaaabbbcdddq";
        int counter = 1;
        StringBuilder newData = new StringBuilder();

        for (int i = 1; i < data.length(); i++) {
            if(data.charAt(i - 1) == data.charAt(i)){
                counter++;
            }
            else {
                newData.append(data.charAt(i - 1));
                if(counter > 1){
                    newData.append(counter);
                }
                counter = 1;
            }
            if(i == data.length() - 1){
                newData.append(data.charAt(i));
                if(counter > 1){
                    newData.append(counter);
                }
            }

        }
        System.out.println(newData);
    }
}
