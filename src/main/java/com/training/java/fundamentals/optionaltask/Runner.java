package com.training.java.fundamentals.optionaltask;

public class Runner {
    public static void main(String[] args) {
        OptionalTask optionalTask = new OptionalTask();
        optionalTask.setAmountOfNumbers();
        optionalTask.setNumbers();
        optionalTask.findLongestNumber();
        optionalTask.findShortestNumber();
        optionalTask.findAverageLength();
        optionalTask.findNumbersThatLongerThanAverageLength();
        optionalTask.findNumbersThatShorterThanAverageLength();
        optionalTask.findNumberWithIncreasingOrderOfDigits();
        optionalTask.sortNumbersInAscendingOrderOfLength();
        optionalTask.sortNumbersInDescendingOrderOfLength();
    }
}
