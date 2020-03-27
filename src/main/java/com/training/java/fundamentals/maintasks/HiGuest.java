package com.training.java.fundamentals.maintasks;

import java.util.Scanner;

public class HiGuest {
    public static void main(String[] args) {
        System.out.println("Введите ваше имя: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Здравствуйте, " + name);
    }
}
