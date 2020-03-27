package com.training.java.fundamentals.maintasks;

import java.util.Random;
import java.util.Scanner;

public class PrintingRandomNumbers {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Введите количество случайных чисел:");
        int amountOfNumbers = scan.nextInt();
        int [] array = new int[amountOfNumbers];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);}

        System.out.println("Массив случайных чисел без перехода на новую строку: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            }
            System.out.println();


        System.out.println("Массив случайных чисел с переходом на новую строку: ");
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
    }


