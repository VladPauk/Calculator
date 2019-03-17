package com.company;

public class Validator {
    public boolean isValid(String origialString) {
        if (origialString.contains("+")
            || origialString.contains("-")
            || origialString.contains("*")
            || origialString.contains("/")) {
            if (isContainsRomeSymbols(origialString) == isContainsArabSymbols(origialString)) {
                System.out.println("String contains rome and arab numbers");
                return false;
            } else {
                return true;
            }
        } else {
            System.out.println(" No valid string. Arithmetic operator is absent");
            return false;
        }
    }

    public boolean isContainsArabSymbols(String originalString) {
        if (originalString.contains("0")
            || originalString.contains("1")
            || originalString.contains("2")
            || originalString.contains("3")
            || originalString.contains("4")
            || originalString.contains("5")
            || originalString.contains("6")
            || originalString.contains("7")
            || originalString.contains("8")
            || originalString.contains("9")) {
            return true;
        } else {
            return false;
        }
    }

    public  boolean isContainsRomeSymbols(String originalString) {
        if (originalString.contains("X")
           ||originalString.contains("I")
           || originalString.contains("V")) {
            return true;
        } else  {
            return false;
        }
    }
}

