package lesson03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main03 {
    public static void main(String[] args) {

//        Создать список типа ArrayList<String>.
//        Поместить в него как строки, так и целые числа.
//        Пройти по списку, найти и удалить целые числа.


        List<String> arrList = new ArrayList<String>();
        Collections.addAll(arrList, "1","a","3","gre");
        System.out.println(arrList);
//        System.out.println(arrList.get(0).);
        Integer a = Integer.parseInt(arrList.get(0));
        System.out.println(a.getClass().getName());
//        int x = Integer.parseInt("9");
        System.out.println(removeDigits(arrList));
    }
    public static List<String> removeDigits(List<String> arrList){
        for (int i = 0; i < arrList.size(); i++) {
            try {
                Integer a = Integer.parseInt(arrList.get(i));
                arrList.remove(i);
            }
            catch(Exception e){
                continue;
            }
        }
        return arrList;
    }
}
