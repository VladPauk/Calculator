package com.company;

import java.util.HashMap;
import java.util.Map;

public class RomeIntegersConverter {

    private Map<Character,Integer> romeSymbols = new HashMap<Character, Integer>();

   public RomeIntegersConverter() {
       romeSymbols.put('X', 10);
       romeSymbols.put('I', 1);
       romeSymbols.put('V', 5);
   }

    public int convertToIntegerFromRomeString(String romeSymbolsString) {
        int convertInteger = 0;
        char[] romeCharsArrey = romeSymbolsString.toCharArray();
        for (int i = 0; i < romeCharsArrey.length; i++) {
            if (i == romeCharsArrey.length - 1
                    && (romeCharsArrey[i] == 'X' || romeCharsArrey[i] == 'V')
                    && i > 0
                    && romeCharsArrey[i-1] == 'I') {
                convertInteger += romeSymbols.get(romeCharsArrey[i]) - romeSymbols.get(romeCharsArrey[i-1]) - 1;
            }else {
                convertInteger += romeSymbols.get(romeCharsArrey[i]);
            }
        }
        return convertInteger;
    }

    public String revertToRomeStringFromInteger(int arabInteger) {
        String romeSymbolsString = "";
        while (arabInteger > 0) {
            if (arabInteger >= 10) {
                romeSymbolsString += "X";
                arabInteger = arabInteger - 10;
            } else if (arabInteger >= 9) {
                romeSymbolsString += "IX";
                arabInteger = arabInteger - 9;
            } else if (arabInteger >= 5) {
                romeSymbolsString += "V";
                arabInteger = arabInteger - 5;
            } else if (arabInteger >= 4) {
                romeSymbolsString += "IV";
                arabInteger = arabInteger - 4;
            } else if (arabInteger >= 1) {
                romeSymbolsString += "I";
                arabInteger = arabInteger - 1;
            }
        }
        return romeSymbolsString;
    }
}
