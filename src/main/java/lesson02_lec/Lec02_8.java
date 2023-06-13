package lesson02_lec;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lec02_8 {
    public static void main(String[] args) {
        File file = new File("text555");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }
}
