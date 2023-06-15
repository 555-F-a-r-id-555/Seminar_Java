package lesson03;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {9, 5, 7, 1, 3, 6, 2, 8, 4, 200, -3, -9};

        System.out.println("Исходный массив:");
        printArray(array);

        mergeSort(array);

        System.out.println("Отсортированный массив:");
        printArray(array);
    }

    public static void mergeSort(int[] array) {
        if (array.length <= 1) {
            return;
        }

        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        // Заполняем левую половину массива
        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }

        // Заполняем правую половину массива
        for (int i = mid; i < array.length; i++) {
            right[i - mid] = array[i];
        }

        mergeSort(left); // Рекурсивно сортируем левую половину
        mergeSort(right); // Рекурсивно сортируем правую половину

        merge(left, right, array); // Слияние двух отсортированных половин
    }

    public static void merge(int[] left, int[] right, int[] array) {
        int i = 0; // Индекс для левой половины
        int j = 0; // Индекс для правой половины
        int k = 0; // Индекс для объединенного массива

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            array[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            array[k] = right[j];
            j++;
            k++;
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

