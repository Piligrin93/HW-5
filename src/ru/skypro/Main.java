package ru.skypro;

public class Main {

    public static void main(String[] args) {

        // Задание 1, Задание 2 и Задание 3

        int[] massiv1 = new int[3]; // Объявление массива1 по заданным параметрам Задания 1
        massiv1[0] = 1;
        massiv1[1] = 2;
        massiv1[2] = 3;

        for(int i = 0; i < massiv1.length; i++){ // Вывод массива1 в консоли через цикл и условие длины массива1 по Заданию 2
            if(i == massiv1.length-1)
                System.out.println(massiv1[i]);
            else
                System.out.print(massiv1[i] + ", ");
        }

        for(int a = massiv1.length-1; a >= 0; a--) { // Вывод массива1 в консоли в обратном направлении по Заданию 3
            if (a == 0)
                System.out.println(massiv1[a]);
            else
                System.out.print(massiv1[a] + ", ");
        }

        for(int i = 0; i < massiv1.length; i++){ // Для Задания 4 ищем четные и нечетные, выводи в консуль по условия
            if(massiv1[i] % 2 != 0) {
                massiv1[i] = massiv1[i] + 1;
            } else if (massiv1[i] == 0) {
                System.out.println(massiv1[i]);
            }
                System.out.print(massiv1[i] + " ,");
        }
        System.out.println(); // Добавил, потому что не переходит следующий массив 2 на новую строку


        double[] massiv2 = {1.57, 7.654, 9.986}; // Объявление массива2 по заданным параметрам Задания 1
        for ( int i = 0; i < massiv2.length; i++){ // Вывод массива2 в консоли через цикл и условие длины массива2 по Заданию 2
            if(i == massiv2.length-1)
                System.out.println(massiv2[i]);
            else
                System.out.print(massiv2[i] + ", ");
        }

        for(int a = massiv2.length-1; a >= 0; a--) { // Вывод массива2 в консоли в обратном направлении по Заданию 3
            if (a == 0)
                System.out.println(massiv2[a]);
            else
                System.out.print(massiv2[a] + ", ");
        }


        int[] massiv3 = new int[5]; // Объявление массива3 по заданным параметрам Задания 1
        massiv3[0] = 2;
        massiv3[1] = 4;
        massiv3[2] = 6;
        massiv3[3] = 8;
        massiv3[4] = 10;

        for ( int i = 0; i < massiv3.length; i++){ // Вывод массива3 в консоли через цикл и условие длины массива3 по Заданию 2
            if(i == massiv3.length-1)
                System.out.println(massiv3[i]);
            else
                System.out.print(massiv3[i] + ", ");
        }

        for(int a = massiv3.length-1; a >= 0; a--) { // Вывод массива3 в консоли в обратном направлении по Заданию 3
            if (a == 0)
                System.out.println(massiv3[a]);
            else
                System.out.print(massiv3[a] + ", ");
        }






















    }
}
