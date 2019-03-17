package com.company;

public class CalculatorUtil {
    RomeIntegersConverter romeIntegersConverter = new RomeIntegersConverter();

    public String getFirstNumber(String str) {
        String firstNumber = "";
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' '
                    || chars[i] == '+'
                    || chars[i] == '-'
                    || chars[i] == '*'
                    || chars[i] == '/') {
                firstNumber = str.substring(0, i);
                break;
            }
        }
        return firstNumber;
    }

    public String getSecondNumber(String str) {
        String secondNumber = "";
        char[] chars = str.toCharArray();
        for (int i = chars.length - 1; i > 0; i--) {
            if (chars[i] == ' '
                    || chars[i] == '+'
                    || chars[i] == '-'
                    || chars[i] == '*'
                    || chars[i] == '/') {
                secondNumber = str.substring(i + 1);
                break;
            }
        }
        return secondNumber;
    }

    public boolean isContainsRomeSymbols(String string) {
        return string.contains("I") || string.contains("X") || string.contains("V");
    }

    public int getNumberFromString(String stringNumber) {
        int number;
        if (isContainsRomeSymbols(stringNumber)) {
            number = romeIntegersConverter.convertToIntegerFromRomeString(stringNumber);
        } else {
            number = Integer.valueOf(stringNumber);
        }
        return number;
    }

    public String getStringFromNumber(int number, String originalString) {
        String resultString = "";
        if (isContainsRomeSymbols(originalString)) {
            resultString = romeIntegersConverter.revertToRomeStringFromInteger(number);
        } else {
            resultString = String.valueOf(number);
        }
        return resultString;
    }
}
