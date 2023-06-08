package lesson01_DZ;

import java.time.LocalTime;
import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        /*3. В консоли запросить имя пользователя.
        В зависимости от текущего времени, вывести приветствие вида:
        "Доброе утро, <Имя>!", если время от 05:00 до 11:59
        "Добрый день, <Имя>!", если время от 12:00 до 17:59;
        "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
        "Доброй ночи, <Имя>!", если время от 23:00 до 4:59*/
        System.out.print("Введите ваше имя : ");
        Scanner inputStr = new Scanner(System.in);
        String name = inputStr.nextLine();
        System.out.println();

        LocalTime currentTime = LocalTime.now();
        // Выводим текущее время
        /*System.out.println("Текущее время: " + currentTime);*/
        /*System.out.println(currentTime.isBefore(LocalTime.of(6,0)));*/

        String greeting;
        if (currentTime.isAfter(LocalTime.of(5, 0)) && currentTime.isBefore(LocalTime.of(11, 59))) {
            greeting = "Доброе утро, ";
        } else if (currentTime.isAfter(LocalTime.of(12, 0)) && currentTime.isBefore(LocalTime.of(17, 59))) {
            greeting = "Добрый день, ";
        } else if (currentTime.isAfter(LocalTime.of(18, 0)) && currentTime.isBefore(LocalTime.of(22, 59))) {
            greeting = "Добрый вечер, ";
        } else {
            greeting = "Доброй ночи, ";
        }
        System.out.println(greeting + name + "!");
        }
    }