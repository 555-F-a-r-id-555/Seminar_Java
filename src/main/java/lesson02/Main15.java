package lesson02;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class Main15 {

    public static void main(String[] args) {
        File file = new File("test.txt");
        StringBuilder text = createdString("test", 100);

        String pathProject = System.getProperty("user.dir");
        File dir = new File(pathProject);


        System.out.println("Текущая папка");
        System.out.println(pathProject);

        try (FileOutputStream fos = new FileOutputStream(file);
             OutputStreamWriter osw = new OutputStreamWriter(fos,
                     StandardCharsets.UTF_8)) {

            for (String fname : dir.list()) {
                osw.write(String.valueOf(fname+"\n"));
            }

            System.out.println("Successfully written data to the file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static StringBuilder createdString(String str, int number) {
        StringBuilder someStr = new StringBuilder();
        for (int i = 0; i < number; i++) {
            someStr.append(str);
        }
        return someStr;
    }
}