package com.training.java.firstStage.fundamentals.maintasks;

public class ReverseCommandLineArgumentsOrder {
    public static void main(String[] args) {
        if (args.length != 0) {
            for (int i = args.length - 1; i >= 0; --i) {
                System.out.print(args[i] + " ");
            }
        } else {
            System.out.println("Аргументы командной строки отсутствуют!");
        }
    }
}
