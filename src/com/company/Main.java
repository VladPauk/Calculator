package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter arithmetic expression");
        Scanner scanner = new Scanner(System.in);
        String originalString = scanner.nextLine();
        Validator validator = new Validator();
        if (validator.isValid(originalString)) {
            CalculatorUtil calculatorUtil = new CalculatorUtil();
            String firstNumber = calculatorUtil.getFirstNumber(originalString);
            String secondNumber = calculatorUtil.getSecondNumber(originalString);
            int integerFirst = calculatorUtil.getNumberFromString(firstNumber);
            int integerSecond = calculatorUtil.getNumberFromString(secondNumber);
            ArithmeticActionExecutor arithmeticActionExecutor = new ArithmeticActionExecutor();
            int resultOfArithmeticAction = arithmeticActionExecutor.doArithmeticActions(originalString, integerFirst, integerSecond);
            String resultString = calculatorUtil.getStringFromNumber(resultOfArithmeticAction, originalString);
            System.out.println("Result " + resultString);
        }
    }
}