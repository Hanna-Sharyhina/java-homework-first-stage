package com.training.customexceptions;

public class FalseInputException extends Exception {
    @Override
    public String toString(){
        return "Ввод осуществлен неверно, попробуйте повторить.";
    }
}
