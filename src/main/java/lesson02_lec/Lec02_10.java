package lesson02_lec;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

//4) К калькулятору из предыдущего ДЗ добавить логирование.

public class Lec02_10 {
    static Scanner scanner = new Scanner(System.in);

    public static void Logger(String fileName) throws IOException {
        // Создаем логгер
        Logger logger = Logger.getLogger(LoggerLec02.class.getName());
        // вывод
        FileHandler fh = new FileHandler(fileName);
        logger.addHandler(fh);
        // формат вывода
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        //Сообщение
        logger.log(Level.INFO, "Test logging");
        logger.info("Test logging2");
    }

    public static int getInt(String fileName) throws IOException {
        System.out.print("Введите число: ");
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();//рекурсия
            num = getInt(fileName);
        }
        Logger(fileName);
        System.out.println();
        return num;
    }

    public static char getOperation(String fileName) throws IOException {

        System.out.print("Введите операцию: ");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();//рекурсия
            operation = getOperation(fileName);
        }
        Logger(fileName);
        System.out.println();
        return operation;
    }

    public static int calc(int num1, int num2, char operation,String filename) throws IOException {
        int result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '^':
                result = (int) Math.pow(num1, num2);
                break;
            case 'l':
                result = (int) Math.log10(num1);
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation(filename),filename);//рекурсия
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        String fileName = "log3.xml";
        int int1 = getInt(fileName);
        char operation = getOperation(fileName);
        if (operation == 'l') {
            int result = calc(int1, 0, operation,fileName);
        }

        int int2 = getInt(fileName);
        int result = calc(int1, int2, operation,fileName);
        System.out.println("Результат операции: " + result);
    }
}
