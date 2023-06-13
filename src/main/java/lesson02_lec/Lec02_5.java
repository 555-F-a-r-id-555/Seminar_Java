package lesson02_lec;

import java.io.File;

public class Lec02_5 {
    public static void main(String[] args) {
        String getpath = System.getProperty("user.dir");
        System.out.println(getpath);
        String separator = File.separator;
        System.out.println(separator);
        String respath = getpath.concat(separator + "text555");
        System.out.println(respath);
        File file = new File(respath);
        System.out.println(file.getAbsolutePath());
    }
}
