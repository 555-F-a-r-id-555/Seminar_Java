package lesson02_lec;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.util.Scanner;

public class Lec02_6 {
    public static void main(String[] args) throws FileNotFoundException {
        String seporator = File.separator;
        String getPath = System.getProperty("user.dir");
        String fileName = "text555.txt";
        String resPath = String.join(seporator, getPath, fileName);
        System.out.println(resPath);

        File file = new File(resPath);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
