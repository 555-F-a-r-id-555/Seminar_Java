package lesson02;

public class Main13 {
    /*String getString(){

    }*/
    public static void main(String[] args) {
        /*напишите метод который составит строку, состоящую из 100 повторений,
        который запишет эту строку в простой текстовой файл, обработайти исключения.*/

        /*2.Напишите метод, который вернет содержимое текущей папки в виде массива строк.
            Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
            Обработайте ошибки с помощью try-catch конструкции.
            В случае возникновения исключения, оно должно записаться в лог-файл.*/
        /*String line = "empty";
        try {
            File file = new File(pathFile);
            if (file.createNewFile()) {
                System.out.println("file.created"); }
            else {
                BufferedReader bufReader =
                        new BufferedReader(new FileReader(file));
                System.out.println("file.existed");
                line = bufReader.readLine();
                bufReader.close(); }
        } catch (Exception e) {
            //e.printStackTrace();
        } finally {
            System.out.println(line);
        }*/
      /*  File file = new File("test.txt");
        StringBuilder text = createdString("test", 100);

        try (FileOutputStream fos = new FileOutputStream(file);
             OutputStreamWriter osw = new OutputStreamWriter(fos,
                     StandardCharsets.UTF_8))
        {
            osw.write(String.valueOf(text));
            System.out.println("Successfully written data to the file");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static StringBuilder createdString(String str, int number){
        StringBuilder someStr = new StringBuilder();
        for (int i = 0; i < number; i++) {
            someStr.append(str);
        }
        return someStr;*/
    }
}
