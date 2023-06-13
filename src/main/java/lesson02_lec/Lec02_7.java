package lesson02_lec;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Lec02_7 {
    public static Path fileIsExist (String fileName){
        String seporator = File.separator;
        String getPath = System.getProperty("user.dir");
        // формируем путь;
        String resPath = String.join(seporator, getPath, fileName);
        // проверка пути и файла;
        Path path = Paths.get(resPath);
        boolean exist = Files.isRegularFile(path);
        if (exist) {
            System.out.print("Файл существует по этому пути: ");
            System.out.println(path);
        } else System.out.println("Sorry, файла не существует :(");
        return path;
    }
    public static void main(String[] args) {
        String fileName = "text555.txt";
        System.out.println(fileIsExist(fileName).getClass().getName());
//        String pathToString = fileIsExist(fileName) .toString();
//        System.out.println(pathToString.getClass().getName());




    }
}
