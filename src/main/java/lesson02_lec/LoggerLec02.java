package lesson02_lec;

import java.io.IOException;
import java.util.logging.*;

public class LoggerLec02 {
    public static void main(String[] args) throws IOException {
        // Создаем логгер
        Logger logger = Logger.getLogger(LoggerLec02.class.getName());
//        logger.setLevel(Level.INFO);
        // вывод
//        ConsoleHandler ch = new ConsoleHandler();
//        logger.addHandler(ch);
        FileHandler fh = new FileHandler("Log.xml");
        logger.addHandler(fh);
        // формат вывода
//        SimpleFormatter sFormatter = new SimpleFormatter();
        XMLFormatter xml = new XMLFormatter();
//        ch.setFormatter(sFormatter);
//        ch.setFormatter(xml);
        fh.setFormatter(xml);

        //Сообщение
        logger.log(Level.INFO,"Test logging");
        logger.info("Test logging2");
    }
}
