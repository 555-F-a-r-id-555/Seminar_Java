package lesson02_lec;

public class Lec02_3 {
    public static void main(String[] args) {
        String str1 = "String1";
        String str2 = "String2";
        String res1 = str1.concat(" " + str2);
        System.out.println(res1);
        int Obj = 858;
        String res2 = String.valueOf(Obj);
        System.out.println(res2);
        String joinres = String.join("-",str1,str2,res2);
        System.out.println(joinres);



    }
}
