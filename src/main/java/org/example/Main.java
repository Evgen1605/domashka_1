package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(2001); // выбрасываем случайное число от 0 до 2000

        int n = 0;
        int number = i;
        while (number > 0) {
            n++;
            number >>= 1;
        }

        short count = 0;
        for (int j = i; j < Short.MAX_VALUE; j++){
            if ( j % n == 0) {
                count++;
            }
        }

        int[] m1 = new int [count]; // создаем массив для кратных чисел
        count = 0;

        for (int j = i; j < Short.MAX_VALUE; j++) { // ищем кратные числа
            if (j % n == 0) {
                m1[count++] = j; // сохраняем кратное число в массив m1
            }
        }
        count = 0;

        for (int j = Short.MIN_VALUE; j < i; j++) { // ищем некратные числа
            if (j % n != 0) {
                count++;
            }
        }
        int[] m2 = new int[count];
        count = 0;
        for (int j = Short.MIN_VALUE; j < i; j++) {
            if (j%n !=0) {
                m2[count++] = j;
            }
        }

        // выводим результаты
        System.out.println("Случайное число i = " + i);
        System.out.println("Номер старшего значения бита n = " + n);
        System.out.println("Длина массива m1 = " + count);
        System.out.println("Длина массива m2 = " + count);
    }
}