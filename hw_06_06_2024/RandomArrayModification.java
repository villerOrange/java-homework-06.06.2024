package org.example.hw_06_06_2024;

import java.util.Arrays;
import java.util.Random;

public class RandomArrayModification {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[8];

        // Заполнение массива случайными числами от 1 до 50
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50) + 1;
        }

        // Вывод массива до изменений
        System.out.println("Исходный массив: " + Arrays.toString(array));

        // Замена элементов с нечетными индексами на ноль
        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }

        // Вывод измененного массива
        System.out.println("Модифицированный массив: " + Arrays.toString(array));
    }
}
