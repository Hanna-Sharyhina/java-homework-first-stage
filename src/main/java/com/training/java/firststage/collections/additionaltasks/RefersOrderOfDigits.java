package com.training.java.firststage.collections.additionaltasks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class RefersOrderOfDigits {
    public static void main(String[] args) {
        String number;
        System.out.println("Введите число: ");
        Scanner scan = new Scanner(System.in);
        number = scan.next();
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < number.length(); i++) {
            stack.push(Character.digit(number.charAt(i), 10));
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
