package lesson04
import java.util.*
class Test02 {
    fun main() {
        val strings: Deque<String> = LinkedList()
        val scanner = Scanner(System.`in`)
        var str = ""

        while (str != "exit") {
            print("Введите строку: ")
            str = scanner.nextLine()

            when (str) {
                "print" -> println(strings)
                "revert" -> {
                    if (!strings.isEmpty()) {
                        strings.removeFirst()
                    } else {
                        println("revert -> throw new NoSuchElementException")
                    }
                }

                else -> strings.addFirst(str)
            }
        }
    }
//Этот код выполняет те же действия, что и оригинальный код на Java.
// Он использует класс LinkedList для создания Deque строк и
// класс Scanner для чтения пользовательского ввода.
// Оператор when используется для проверки значения строки и выполнения соответствующего действия.
}