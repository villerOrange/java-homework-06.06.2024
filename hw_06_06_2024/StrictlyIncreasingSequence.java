package org.example.hw_06_06_2024;

import java.util.Arrays;
import java.util.Random;

public class StrictlyIncreasingSequence {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[5];

        // Заполнение массива случайными числами от 10 до 99
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(90) + 10;
        }

        // Вывод массива
        System.out.println("Массив: " + Arrays.toString(array));

        // Проверка, является ли массив строго возрастающей последовательностью
        boolean isStrictlyIncreasing = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= array[i + 1]) {
                isStrictlyIncreasing = false;
                break;
            }
        }

        // Вывод результата проверки
        if (isStrictlyIncreasing) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью.");
        }
    }
}
