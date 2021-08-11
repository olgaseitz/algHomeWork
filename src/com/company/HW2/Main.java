import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //Задание 2.3
        //Создайте массив размером 400 элементов.
        //        Выполните сортировку с помощью метода sort().
        //        Оцените сортировку с помощью базового класса System.nanoTime().
        int[] mArray;
        int[] mArrayCopy;
        mArray = new int[400];

        Random rand = new Random();
        for (int i = 0; i < 400; i++) {
            mArray[i] = rand.nextInt(500);
        }
        mArrayCopy = Arrays.copyOf(mArray, mArray.length);
        System.out.println("Original Arrays: " + Arrays.toString(mArrayCopy));
        System.out.println("-----------------");

        long lStartTime1 = System.nanoTime();
        Arrays.sort(mArray);
        long lEndTime1 = System.nanoTime() - lStartTime1;

        System.out.println("Sorted Arrays: " + Arrays.toString(mArray));
        System.out.println("Time sort: " + lEndTime1);
        System.out.println("-----------------");

        //         Задание 2.4
        // На основе существующего массива данных из задания 2.3 реализуйте алгоритм сортировки пузырьком.
        // Оцените сортировку с помощью базового класса System.nanoTime().
        //         Сравните время выполнения алгоритмы сортировки методом sort() из задания 2.1 и сортировку пузырьком.
        int[] mArrayBubble;
        int buff;
        mArrayBubble = Arrays.copyOf(mArrayCopy, mArrayCopy.length);

        long lStartTime2 = System.nanoTime();
        boolean sortedBubble = false;
        while (!sortedBubble) {
            sortedBubble = true;
            for (int i = 0; i < mArrayBubble.length - 1; i++) {
                if (mArrayBubble[i] > mArrayBubble[i + 1]) {
                    sortedBubble = false;
                    buff = mArrayBubble[i];
                    mArrayBubble[i] = mArrayBubble[i + 1];
                    mArrayBubble[i + 1] = buff;
                }
            }
        }
        long lEndTime2 = System.nanoTime() - lStartTime2;
        System.out.println("Bubble Sorted Arrays: " + Arrays.toString(mArrayBubble));
        System.out.println("Time Bubble sort: " + lEndTime2);

        if (lEndTime1 > lEndTime2) {
            System.out.println("Сортировка методом sort() " + lEndTime1 + " медленнее сортировки пузырьком " + lEndTime2);
        } else
            System.out.println("Сортировка методом sort() " + lEndTime1 + " быстрее сортировки пузырьком " + lEndTime2);
        System.out.println("-----------------");

        //  Задание 2.5
        //         На основе массива данных из задания 2.3 реализуйте алгоритм сортировки методом выбора.
        //         Оцените сортировку с помощью базового класса System.nanoTime().
        //         Сравните с временем выполнения алгоритмов сортировки из прошлых заданий 2.3 и 2.4.

        int[] mArrayCh;
        mArrayCh = Arrays.copyOf(mArrayCopy, mArrayCopy.length);

        long lStartTime3 = System.nanoTime();
        for (int i = 0; i < mArrayCh.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < mArrayCh.length; j++) {
                if (mArrayCh[j] < mArrayCh[min]) {
                    min = j;
                }
            }
            swapM(mArrayCh, i, min);
        }
        long lEndTime3 = System.nanoTime() - lStartTime3;

        System.out.println("Метод выбора Sorted Arrays: " + Arrays.toString(mArrayCh));
        System.out.println("Time метод выбора sort: " + lEndTime3);

        if (lEndTime1 > lEndTime3) {
            System.out.println("Сортировка методом sort() " + lEndTime1 + " медленнее сортировки методом выбора " + lEndTime3);
        } else
            System.out.println("Сортировка методом sort() " + lEndTime1 + " быстрее сортировки методом выбора " + lEndTime3);

        if (lEndTime2 > lEndTime3) {
            System.out.println("Сортировка пузырьком " + lEndTime2 + " медленнее сортировки методом выбора " + lEndTime3);
        } else
            System.out.println("Сортировка пузырьком " + lEndTime2 + " быстрее сортировки методом выбора " + lEndTime3);
        System.out.println("-----------------");


        //         Задание 2.6
        // На основе массива данных из задания 2.3 реализуйте алгоритм сортировки методом вставки.
        //         Оцените сортировку с помощью базового класса System.nanoTime().
        //         Сравните с временем выполнения алгоритмов сортировки из прошлых заданий 2.3, 2.4 и 2.5.

        int[] mArrayAdd;
        int in;
        mArrayAdd = Arrays.copyOf(mArrayCopy, mArrayCopy.length);

        long lStartTime4 = System.nanoTime();
        for (int i = 1; i < mArrayAdd.length; i++) {
            buff = mArrayAdd[i];
            in = i;
            while (in > 0 && mArrayAdd[in - 1] >= buff) {
                mArrayAdd[in] = mArrayAdd[in - 1];
                --in;
            }
        }
        long lEndTime4 = System.nanoTime() - lStartTime4;

        System.out.println("Метод вставки Sorted Arrays: " + Arrays.toString(mArrayAdd));
        System.out.println("Time метод вставки sort: " + lEndTime4);

        if (lEndTime1 > lEndTime4) {
            System.out.println("Сортировка методом sort() " + lEndTime1 + " медленнее сортировки методом вставки " + lEndTime4);
        } else
            System.out.println("Сортировка методом sort() " + lEndTime1 + " быстрее сортировки методом вставки " + lEndTime4);

        if (lEndTime2 > lEndTime4) {
            System.out.println("Сортировка пузырьком " + lEndTime2 + " медленнее сортировки методом вставки " + lEndTime4);
        } else
            System.out.println("Сортировка пузырьком " + lEndTime2 + " быстрее сортировки методом вставки " + lEndTime4);
        if (lEndTime3 > lEndTime4) {
            System.out.println("Сортировка методом выбора " + lEndTime3 + " медленнее сортировки методом вставки " + lEndTime4);
        } else
            System.out.println("Сортировка методом выбора " + lEndTime3 + " быстрее сортировки методом вставки " + lEndTime4);
        System.out.println("-----------------");
    }

    public static void swapM(int[] a, int first, int last) {
        int buffCh = a[first];
        a[first] = a[last];
        a[last] = buffCh;
    }
}

        // Задание 2.1
       // На основе программного кода из домашнего задания №1 реализуйте массив на основе существующих примитивных или ссылочных типов данных.
       // Выполните обращение к массиву и базовые операции класса Arrays.
       //         Оценить выполненные методы с помощью базового класса System.nanoTime().


class Employee {

    public static void main(String[] args) {
        String[] name = {"Davidson", "Smith", "Johnson", "Wesson", "Johns", "Dyson", "Bowers", "May", "Lee", "Morgan"};
        int[] salary = {100000, 45000, 60000, 15000, 15000, 25000, 30000, 45000, 10000, 50000};
        int[] salaryCopy;

        System.out.println("Original Arrays Работники: " + Arrays.toString(name));

        long lStartTimeShow = System.nanoTime();
        System.out.println("Original Arrays Зарплата: " + Arrays.toString(salary));
        long lEndTimeShow = System.nanoTime() - lStartTimeShow;

        System.out.println("-------------");

        long lStartTimeCopy = System.nanoTime();
        salaryCopy = Arrays.copyOf(salary, salary.length);
        long lEndTimeCopy = System.nanoTime() - lStartTimeCopy;

        System.out.println("Copy Arrays Зарплата: " + Arrays.toString(salaryCopy));
        System.out.println("Equals Зарплата: " + salary.equals(salaryCopy));

        long lStartTimeEqual = System.nanoTime();
        System.out.println("Equals Arrays Зарплата: " + Arrays.equals(salary, salaryCopy));
        long lEndTimeEqual = System.nanoTime() - lStartTimeEqual;

        System.out.println("-------------");

        System.out.println("Отображение массива заняло: " + lEndTimeShow + "\n" + "Копирование заняло: " + lEndTimeCopy
                + "\n" + "Сравнение заняло: " + lEndTimeEqual);
        System.out.println("-------------");

        //         Задание 2.2
        // На основе написанного кода в задании 2.1 реализуйте линейный и двоичный поиск.
        //         Оценить алгоритмы линейного и двоичного поиска с помощью базового класса System.nanoTime(),
        //         при необходимости расширьте уже существующий массив данных.

        int key = 25000;
        int key2 = 60000;

        long lStartTimeOne = System.nanoTime();
        for (int j : salary) {
            if (j == key) {
                System.out.println("Success: " + key);

            }
        }
        long lEndTimeOne = System.nanoTime() - lStartTimeOne;

        Arrays.sort(salary);
        System.out.println("-------------");
        System.out.println("Sorted: " + Arrays.toString(salary));
        System.out.println("-------------");
        long lStartTimeBi = System.nanoTime();
        System.out.println(binarySearch(salary, key2));
        long lEndTimeBi = System.nanoTime() - lStartTimeBi;
        System.out.println("-------------");
        System.out.println("Линейный поиск занял: " + lEndTimeOne + "\n" + "Двоичный поиск занял: " + lEndTimeBi);
    }

    public static int binarySearch(int[] arr, int elementToSearch) {
        int firstIndex = 0;
        int lastIndex = arr.length - 1;
        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;

            if (arr[middleIndex] == elementToSearch) {
                return middleIndex;
            } else if (arr[middleIndex] < elementToSearch)
                firstIndex = middleIndex + 1;
             else if (arr[middleIndex] > elementToSearch)
                lastIndex = middleIndex - 1;


        }
        return -1;
    }
}






