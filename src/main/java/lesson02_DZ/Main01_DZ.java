package lesson02_DZ;

//Создадим maven проект и добавим в зависимости библиотеку org.json.
// Фрагмент файла pom.xml с зависимостями,выглядит следующим образом:
//        <dependencies>
//        <!-- https://mvnrepository.com/artifact/org.json/json -->
//        <dependency>
//        <groupId>org.json</groupId>
//        <artifactId>json</artifactId>
//        <version>20160810</version>
//        </dependency>
//        </dependencies>
/*1) Дана строка sql-запроса "select * from students where ".
     Сформируйте часть WHERE этого запроса, используя StringBuilder.
     Данные для фильтрации приведены ниже в виде json-строки.
     Если значение null, то параметр не должен попадать в запрос.
     Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}*/

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

    public class Main01_DZ {
        public static void JsonWriter(String fileName) {
            //Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
            JSONObject person = new JSONObject();
            person.put("name", "Ivanov");
            person.put("city", "Moscow");
            person.put("country", "Russia");
            person.put("age", "null");

            // Запись
            try (FileWriter fileWriter = new FileWriter(fileName)) {

                fileWriter.write(person.toString());
                System.out.println("Текст успешно записан в файл : " + "data.json");
                System.out.println(person);

            } catch (IOException e) {
                System.out.println("Ошибка записи :(");
            }
        }

        public static String JsonReader(String fileName) {
            StringBuilder stringBuilder = new StringBuilder();

            try {
                BufferedReader reader = new BufferedReader(new FileReader(fileName));
                String line;
                while ((line = reader.readLine()) != null) {
                    stringBuilder.append(line);
                }
            } catch (IOException e) {
                System.out.println("Ошибка чтения.....");
            }

            String jsonString = stringBuilder.toString();
            System.out.println(jsonString);
            return jsonString;
        }


        public static void JsonParser(String jsonString) {
            // Данные для фильтрации в виде json-строки
            try {
                // Создание JSON-объекта из строки
                JSONObject jsonObject = new JSONObject(jsonString);

                // Преобразование JSON-объекта в HashMap
                Map<String, String> hashMap = new HashMap<>();

                // Получение ключей и значений из JSON-объекта
                Iterator<String> keys = jsonObject.keys();
                while (keys.hasNext()) {
                    String key = keys.next();
                    String value = jsonObject.getString(key);
                    hashMap.put(key, value);
                }

                // Вывод HashMap
//            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
//                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
//            }
                StringBuilder whereClause = new StringBuilder("select * from students where ");

                for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();

                    if (value != null && !value.equals("null")) {
                        whereClause.append(key).append(" = '").append(value).append("' AND ");
                    }
                }

                // Удаление последнего "AND" из строки
                int lastIndex = whereClause.lastIndexOf("AND");
                whereClause.delete(lastIndex, lastIndex + 3);
                System.out.println(whereClause.toString());

            } catch (JSONException e) {
                System.out.println("Ошибка");
            }
        }


        public static void main(String[] args) {
            // Придумать имя файла с расшерением json
            String fileName = "data1.json";
            // записываем файл
            JsonWriter(fileName);
            // читаем файл
            String res = JsonReader(fileName);

            JsonParser(res);

        }
}

