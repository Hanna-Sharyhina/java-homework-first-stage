package com.training.java.fundamentals.optionaltask;

import java.util.Scanner;

public class OptionalTask {
    int amountOfNumbers;
    int[] numbers;
    float averageLengthOfNumbers;

    void setAmountOfNumbers() {
        System.out.println("Ввведите количество чисел: ");
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            amountOfNumbers = scan.nextInt();
        } else {
            System.out.println("Вы ввели не число, попробуйте повторить ввод. ");
            setAmountOfNumbers();
        }
    }

    void setNumbers() {
        System.out.println("Введите числа: ");
        Scanner scanner = new Scanner(System.in);
        numbers = new int[amountOfNumbers];
        for (int i = 0; i < amountOfNumbers; i++) {
            if (scanner.hasNextInt()) {
                numbers[i] = scanner.nextInt();
            } else {
                System.out.println("Вы ввели не число! Попробуйте повторить ввод. ");
                setNumbers();
            }
        }
    }

    void findLongestNumber() {
        int length = String.valueOf(numbers[0]).length();
        int longestNumber = 0;
        for (int i = 0; i < numbers.length; i++) {
            int max = String.valueOf(numbers[i]).length();
            if (length < max) {
                length = max;
                longestNumber = i;
            }
        }
        System.out.println("Самое длинное число: " + numbers[longestNumber] + ". Его длина равна: " + length + ". ");
    }

    void findShortestNumber() {
        int length = String.valueOf(numbers[0]).length();
        int shortestNumber = 0;
        for (int i = 0; i < numbers.length; i++) {
            int min = String.valueOf(numbers[i]).length();
            if (length > min) {
                length = min;
                shortestNumber = i;
            }
        }
        System.out.println("Самое короткое число: " + numbers[shortestNumber] + ". Его длина равна: " + length + ". ");
    }

    void findAverageLength() {
        float sum = 0;
        for (int number : numbers) {
            sum += String.valueOf(number).length();
        }
        averageLengthOfNumbers = sum / numbers.length;
        System.out.println("Средняя длина по всем числам равна: " + averageLengthOfNumbers);
    }

    void findNumbersThatLongerThanAverageLength() {
        System.out.print("Числа, длина которых меньше средней: ");
        for (int number : numbers) {
            if (averageLengthOfNumbers > String.valueOf(number).length()) {
                System.out.print("Число: " + number + ", его длина: " + String.valueOf(number).length() + ". ");
            }
        }
        System.out.println();
    }

    void findNumbersThatShorterThanAverageLength() {
        System.out.print("Числа, длина которых больше средней: ");
        for (int number : numbers) {
            if (averageLengthOfNumbers < String.valueOf(number).length()) {
                System.out.print("Число: " + number + ", его длина: " + String.valueOf(number).length() + ". ");
            }
        }
        System.out.println();
    }

    void findNumberWithIncreasingOrderOfDigits() {
        int index;
        boolean flag = false;
        for (int number : numbers) {
            int k = 0;
            int[] newArray = new int[String.valueOf(number).length()];
            index = number;
            while (index != 0) {
                newArray[k] = index % 10;
                index /= 10;
                if (newArray[k] > index % 10) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
                k++;
            }
            if (flag) {
                System.out.println("Число, цифры в котором идут в строгом порядке возрастания: " + number);
                break;
            }
        }
        if (!flag) {
            System.out.println("Чисел с цифрами, идущими в строгом порядке возрастания не найдено.");
        }
    }

    void sortNumbersInAscendingOrderOfLength() {
        System.out.print("Выводим числа в порядке возрастания их длины: ");
        boolean sort = false;
        int index;
        while (!sort) {
            sort = true;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (String.valueOf(numbers[i]).length() > String.valueOf(numbers[i + 1]).length()) {
                    sort = false;
                    index = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = index;
                }
            }
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    void sortNumbersInDescendingOrderOfLength() {
        System.out.print("Выводим числа в порядке убывания их длины: ");
        boolean sort = false;
        int index;
        while (!sort) {
            sort = true;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (String.valueOf(numbers[i]).length() < String.valueOf(numbers[i + 1]).length()) {
                    sort = false;
                    index = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = index;
                }
            }
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
