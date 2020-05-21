package com.training.java.fundamentals.maintasks;

public class FindingSumAndProductOfCommandLineArguments {
    public static void main(String[] args) {
        int sum = 0;
        int mul = 1;
        if (args.length != 0) {
            for (int i = 0; i < args.length; i++) {
                sum += Integer.parseInt(args[i]);
                mul *= Integer.parseInt(args[i]);
            }
            System.out.println("Сумма = " + sum);
            System.out.println("Произведение = " + mul);
        } else {
            System.out.println("Аргументы командной строки отсутствуют!");
        }
    }
}
