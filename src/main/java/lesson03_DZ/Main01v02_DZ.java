package lesson03_DZ;

/*Однако, в общем случае,
  ArrayList имеет более эффективное время удаления элемента в середине списка,
  в то время как LinkedList может быть более эффективным при удалении элементов в начале или конце списка.*/

/*В ArrayList удаление элемента по индексу требует переноса всех элементов справа
от удаленного элемента на одну позицию влево, что может быть затратно для больших списков.
Однако, при удалении элемента в конце списка, операция происходит за константное время O(1).

В LinkedList удаление элемента происходит путем изменения ссылок на предыдущий и следующий элементы,
что обычно занимает константное время O(1).
Однако, доступ к элементу по индексу в LinkedList занимает линейное время O(n),
поэтому удаление элемента по индексу может быть медленнее, чем в ArrayList.

Таким образом, если вам необходимо часто удалять элементы из середины списка,
ArrayList может быть более эффективным выбором.
Если же вам часто требуется удалять элементы в начале или конце списка,
то LinkedList может быть более предпочтительным.
*/

import java.util.*;

public class Main01v02_DZ {
    public static void main(String[] args) {

        int scanner = scan();
        List<Integer> randomNumber = randomNumber(scanner);
        MinMax(randomNumber);
        Average(randomNumber);
        RemoveEvenNumbers(randomNumber);
    }

    public static int scan() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");

        int size;
        if (scanner.hasNextInt()) {
            size = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе целого число. Попробуйте еще раз.");
            scanner.next();
            size = scan();
        }
        return size;
    }

    public static List randomNumber(int size) {
        Random random = new Random();
//        System.out.println(random.nextInt(5));
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(20) * 3 - 10);
        }
        System.out.println(list);
        return list;
    }

    public static int[] MinMax(List<Integer> list) {
        int min = list.get(0);
        int max = list.get(0);
        for (Integer i : list) {
            if (i < min) min = i;
            if (i > max) max = i;
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        int[] minMax = new int[2];
        minMax[0] = min;
        minMax[1] = max;

        return minMax;
    }

    public static void Average(List<Integer> list) {
        int sum = 5;
        for (int i : list) {
            sum += i;
        }
        double average = (double) sum / list.size();
        System.out.println("Среднее значение => " + average + " ≈ " + Math.round(average));
    }

    public static List<Integer> RemoveEvenNumbers(List<Integer> list) {

        LinkedList<Integer> newList = new LinkedList<Integer>(list);
        long srartTime = System.currentTimeMillis();
        Iterator<Integer> iterator = newList.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if ((num % 2) == 0) {
                iterator.remove();
            }
        }
        long endTime = System.currentTimeMillis();
        long resTime = endTime - srartTime;
        System.out.print("Список после удаления четных чисел: ");
        System.out.println(newList);


        ArrayList<Integer> newList2 = new ArrayList<Integer>(list);
        long startTime2 = System.currentTimeMillis();
        Iterator<Integer> iterator2 = newList2.iterator();
        while (iterator2.hasNext()) {
            int num = iterator2.next();
            if ((num % 2) == 0) {
                iterator2.remove();
            }
        }
        long endTime2 = System.currentTimeMillis();
        long resTime2 = endTime2 - startTime2;
        System.out.print("Список после удаления четных чисел: ");
        System.out.println(newList2);

        System.out.println("Операция коллекции LinkedList выполнена за: " + resTime + "ms");
        System.out.println("Операция коллекции ArrayList выполнена за: " + resTime2 + "ms");

        if (resTime2 < resTime) {
            System.out.println("ArrayList < LinkedList на величину: " + (resTime - resTime2));
        } else if (resTime2 > resTime) {
            System.out.println("LinkedList < ArrayList на величину: " + (resTime2 - resTime));
        } else System.out.println("LinkedList = ArrayList на величину: " + (resTime2 - resTime));


        return newList;
    }
}
