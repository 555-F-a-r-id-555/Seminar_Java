package Lesson_12;

import java.util.Arrays;
import java.util.Scanner;

public class UniversityApp {

    Scanner scanner = new Scanner(System.in);

    String[] string1 = scanner.nextLine().split(" ");

    public String[] getString1() {
        return string1;
    }

    public String getString_0() {
        return string1[0];
    }

    public String getString_1() {
        return string1[1];
    }

    public String getString_2() {
        return string1[2];
    }

    public String getString_3() {
        return string1[3];
    }


    public int GetNum() {
        if (Arrays.equals(this.string1, new String[]{"/get-student"})) {
//            System.out.println("/get-student");
            return 1;
        } else if (Arrays.equals(this.string1, new String[]{"/get-student", "name"})) {
//            System.out.println("{\"/get-student\",\"name\"}");
            return 2;
        } else if (Arrays.equals(this.string1, new String[]{"/get-student", "id"})) {
//            System.out.println("{\"/get-student\", \"id\"}");
            return 3;
        } else if (this.string1.length == 4 && this.string1[0].equals("/create-student")) {
//            System.out.println("{\"/create-student\", \"Name_Surname\", \"age\", \"class1\"}");
            return 4;
        } else if (this.string1.length == 2 && this.string1[0].equals("/delete-teacher")) {
//            System.out.println("{/delete-teacher, \"Maria_Pavlova\"}");
            return 5;
        } else if (this.string1.length == 2 && this.string1[0].equals("/get-group")) {
//            System.out.println("/get-group 11А");
            return 6;
        } else if (this.string1.length == 3 && this.string1[0].equals("/set-group-student-by-id")) {
//            System.out.println("/set-group-student-by-id 2 11Б");
            return 7;
        } else return -1;

    }

}
