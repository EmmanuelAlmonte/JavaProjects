package com.h2;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        int[] randomArr = { 1, 2, 3 };
        System.out.println("Hello World!");
        System.out.println(doubleTheNumber(2));
        System.out.println(add(randomArr));
    }

    public static int doubleTheNumber(int number) {
        return number * 2;
    }

    private static int add(int[] numbers) {
        int sum = 0;
        for(int number: numbers) {
           sum += number;
        }
        return sum;
    }
}
