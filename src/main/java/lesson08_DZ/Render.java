package lesson08_DZ;


abstract class Render {
    public static final String ANSI_RESET = "\u001B[0m";
    //--------------------------------------------------
    public static final String ANSI_BRIGHT_RED = "\u001B[91m";
    public static final String ANSI_DARK_RED = "\u001B[31m";
    public static final String ANSI_LIGHT_RED = "\u001B[95m";
    public static final String ANSI_BURGUNDY_RED = "\u001B[31m";
    public static final String ANSI_PINK_RED = "\u001B[31m";
    //-----------------------------------------------------------
    //    Ярко-красный: \u001B[91m
    //    Темно-красный: \u001B[31m
    //    Светло-красный: \u001B[95m
    //    Бордовый: \u001B[35m
    //    Розовый: \u001B[95m
    //------------------------------------------------------------
    public static final String ANSI_BRIGHT_GREEN = "\u001B[92m";
    public static final String ANSI_DARK_GREEN = "\u001B[32m";
    public static final String ANSI_LIGHT_GREEN = "\u001B[96m";
    public static final String ANSI_LIME_GREEN = "\u001B[38;2;0;255;0m";
    public static final String ANSI_GREEN_BLUE = "\u001B[34m";
    //-------------------------------------------------------------
    //    Ярко-зеленый: \u001B[92m
    //    Темно-зеленый: \u001B[32m
    //    Светло-зеленый: \u001B[96m
    //    Лаймовый: \u001B[38;2;0;255;0m
    //    Зеленый синий: \u001B[34m
    //-------------------------------------------------------------
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLACK = "\u001B[30m";

    /**
     * Если объект обладает уровнем здоровья, то отображается индикатор с текущим уровнем здоровья.
     * Если объект обладает уровнем магический энергии, то отображается индикатор с текущим уровнем энергии.
     * * В качестве упрощения, пусть вывод на дисплей = запись информации в консоль.
     */


    // str1 = "☼","♥"  либо  "X"
    // str2 = "†" ,"○"  либо  "X"
    public String showLine(Integer maxPoint, Integer currentPoint, String str, String str2) {
        String line = "";
        for (int i = 1; i <= ((currentPoint * 1.0) / maxPoint) * 10; i++) {
            line += str;
        }

        if (currentPoint >= maxPoint) {
            return (ANSI_LIME_GREEN + "[" + line + "]" + ANSI_RESET);
        } else if (line.length() > 8) {
            return (ANSI_BRIGHT_GREEN + "[" + line + " ".repeat(10 - line.length()) + "]" + ANSI_RESET);
        } else if (line.length() > 6) {
            return (ANSI_DARK_GREEN + "[" + line + " ".repeat(10 - line.length()) + "]" + ANSI_RESET);
        } else if (line.length() > 5) {
            return (ANSI_GREEN_BLUE + "[" + line + " ".repeat(10 - line.length()) + "]" + ANSI_RESET);
        } else if (line.length() > 3) {
            return (ANSI_LIGHT_RED + "[" + line + " ".repeat(10 - line.length()) + "]" + ANSI_RESET);
        } else if (line.length() >= 1) {
            return (ANSI_BURGUNDY_RED + "[" + line + " ".repeat(10 - line.length()) + "]" + ANSI_RESET);
        } else if (currentPoint > 0) {
            return (ANSI_BRIGHT_RED + "[" + ANSI_RESET +
                    ANSI_BLACK + str2 + ANSI_RESET +
                    ANSI_BRIGHT_RED + " ".repeat(10) + "]" + ANSI_RESET);
        } else if (currentPoint == 0) {
            return (ANSI_BLACK + "[" + line + "]" + ANSI_RESET);
        } else {
            return (ANSI_YELLOW + "[" + line + "]" + ANSI_RESET);
        }

    }

//    public String showLine(Integer maxPoint, Integer currentPoint, String str, String str2) {
//        StringBuilder line = new StringBuilder();
//        int lineLength = (int) Math.ceil((currentPoint * 1.0) / maxPoint * 10);
//        line.append(str.repeat(lineLength));
//
//        String color;
//
//        if (currentPoint >= maxPoint) {
//            color = ANSI_LIME_GREEN;
//        } else if (lineLength > 8) {
//            color = ANSI_BRIGHT_GREEN;
//        } else if (lineLength > 6) {
//            color = ANSI_DARK_GREEN;
//        } else if (lineLength > 5) {
//            color = ANSI_GREEN_BLUE;
//        } else if (lineLength > 3) {
//            color = ANSI_LIGHT_RED;
//        } else if (lineLength >= 1) {
//            color = ANSI_BURGUNDY_RED;
//        } else if (currentPoint > 0) {
//            return ANSI_BRIGHT_RED + "[" + ANSI_RESET +
//                    ANSI_BLACK + str2 + ANSI_RESET +
//                    ANSI_BRIGHT_RED + " ".repeat(10) + "]" + ANSI_RESET;
//        } else if (currentPoint == 0) {
//            return ANSI_BLACK + "[" + line.toString() + "]" + ANSI_RESET;
//        } else {
//            return ANSI_YELLOW + "[" + line.toString() + "]" + ANSI_RESET;
//        }
//
//        return color + "[" + line.toString() + " ".repeat(10 - lineLength) + "]" + ANSI_RESET;
//    }


    abstract void showIndicator();
//    abstract void showIndicator(Object maxHealthPoint, Object currentHealthPoint);
// Не должно быть упоминания конкретных классов!!!

}
