package com.company;

public class ArithmeticActionExecutor {
    public int doArithmeticActions(String originalString, int firstInteger, int secondIntegr) {
        int result = 0;
        if (originalString.contains("+")) {
            result = firstInteger + secondIntegr;
        } else if (originalString.contains("-")) {
            result = firstInteger - secondIntegr;
        } else if (originalString.contains("*")) {
            result = firstInteger * secondIntegr;
        } else if (originalString.contains("/")) {
            if (secondIntegr == 0){
              System.out.println( "zero can not be devided");
            } else {
                result = firstInteger / secondIntegr;
            }
        }
        return result;
    }
}
