package ru.mirea.task10;

import java.util.Scanner;

public class Main {

    public static int Task10(int number, int length){
        if (number > 10){
            int result = Task10(number / 10, length - 1);
            result += (number % 10)*Math.pow(10., length);
            return result;
        }
        else {
            return number;
        }
    }

    public static int Task11(){
        int count = 0;
        int number, lastNumber = 1;
        Scanner scanner = new Scanner(System.in);
        while(true){
             number = scanner.nextInt();
             if (number == 0 && lastNumber == 0) return count;

             else if (number == 1) {
                 count++;
             }
             lastNumber = number;
        }
    }

    public static void Task12(){
        int number;
        Scanner scanner = new Scanner(System.in);
        while((number =scanner.nextInt()) != 0){
            if (number % 2 == 1) System.out.println("Нечетное число: " + number);
        }
    }

    public static void Task13(){
        int number, i = 0;
        Scanner scanner = new Scanner(System.in);
        while((number =scanner.nextInt()) != 0){
            i++;
            if (i % 2 == 1) System.out.println("Нечетная позиция: " + number);
        }
    }

    public static void Task14(int number){
        if (number > 10){
            Task14(number / 10);
            System.out.print(number % 10 + " ");
        }
        else System.out.print(number + " ");
    }

    public static void main(String[] args) {
        //System.out.println(Task10(123, 2));
        System.out.println(123/-10);

    }
}
