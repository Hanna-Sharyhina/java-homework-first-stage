package com.training.java.firststage.collections.maintask.tools;

import java.util.Scanner;
import java.util.logging.Logger;

public class Controller {
    private static final Logger LOGGER = Logger.getLogger(Controller.class.getSimpleName());
    private String criteria;
    SampleSongsByCriteria sampleSongsByCriteria = new SampleSongsByCriteria();

    public void createCriteriaForUserChoice() {
        System.out.println("Введите номер действия, где: ");
        System.out.println("1 - Вывод продолжительности всех композиций.");
        System.out.println("2 - Поиск композиции по заданному диапазону продолжительности. ");
        System.out.println("3 - Перестановка композиций по стилю. ");
        System.out.println("4 - Выбор композиций для прослушивания по заданному стилю. ");
        System.out.println("5 - Выход из приложения. ");
        Scanner scan = new Scanner(System.in);
        criteria = scan.next().trim();
    }

    public void runSampleByUserChoice() {
        while (true) {
            createCriteriaForUserChoice();
            switch (criteria) {
                case "1":
                    sampleSongsByCriteria.calcTotalDuration();
                    sampleSongsByCriteria.outPutTotalDuration();
                    break;
                case "2":
                    sampleSongsByCriteria.findSongsWithDurationInChosenTimeRange();
                    break;
                case "3":
                    sampleSongsByCriteria.sortSongsByStyle();
                    break;
                case "4":
                    sampleSongsByCriteria.setChosenStyle();
                    sampleSongsByCriteria.selectSongsByUserChoice();
                    break;
                case "5":
                    System.exit(0);
                    break;
                default:
                    LOGGER.warning("Неверный ввод. Попробуйте повторить. ");
                    runSampleByUserChoice();
            }
        }
    }
}
