package ru.mirea.task1;

import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void fillHandleArray(int[] arr, Scanner scanner){
        System.out.print("Введите " + arr.length + " чисел: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
    }

    public static void printArray(int[] arr){
        System.out.print("Массив: ");
        for (var s: arr) {
            System.out.print(s + " ");
        }
        System.out.println("\n");
    }

    public static void printSum(int[] arr){

        int sum = 0;
        int i = 0;
        for (; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.print("Цикл 'for': " + sum);
        sum = i = 0;

        while(i < arr.length){
            sum += arr[i];
            i++;
        }
        System.out.print("\nЦикл 'while': " + sum);
        sum = i = 0;

        do {
            sum += arr[i];
            i++;
        }while(i < arr.length);
        System.out.print("\nЦикл 'do while': " + sum + "\n");
    }

    public static void printArgs(String[] args){
        for (int i = 0; i < args.length; i++){
            System.out.print(args[i] + "; ");
        }
        System.out.println();
    }

    public static void printHarmonicSeries(){
        for (int i = 1; i <= 10; i++){
            System.out.printf("%s ", "1/" + i);
        }
        System.out.println();
    }

    public static void fillRandomArray(int[] arr){
        Random random = new Random();
        for (int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(20);
        }
    }

    public static void SelectSort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[minIndex]) minIndex = j;
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void fillMathRandomArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 10);
        }
    }

    public static int getFactorial(int number){
        int result = 1;
        while(number > 0){
            result *= number;
            number--;
        }

        return result;
    }

    public static void main(String[] args) {
        String command = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива >> ");
        int[] array = new int[scanner.nextInt()];
        while (true){
            System.out.print("1. Сумма элементов массива\n" +
                    "2. Аргументы командной строки\n" +
                    "3. Вывод гармонического ряда\n" +
                    "4. Сортировка массива случайных чисел\n" +
                    "5. Получение факториала числа\n" +
                    "Введите номер задания >> ");
            command = scanner.next();
            switch (command){
                case "1" -> {
                    fillHandleArray(array, scanner);
                    printSum(array);
                }
                case "2" -> {
                    printArgs(args);
                }
                case "3" -> {
                    printHarmonicSeries();
                }
                case "4" -> {
                    System.out.println("Используется класс Random");
                    fillRandomArray(array);
                    printArray(array);
                    SelectSort(array);
                    printArray(array);

                    System.out.println("Используется класс Math");
                    fillMathRandomArray(array);
                    printArray(array);
                    SelectSort(array);
                    printArray(array);
                }
                case "5" -> {
                    System.out.print("Введите число для факториала >> ");
                    System.out.println("Факториал: " + getFactorial(scanner.nextInt())+ "\n");
                }
                default -> {
                    return;
                }
            }
        }
    }
}
