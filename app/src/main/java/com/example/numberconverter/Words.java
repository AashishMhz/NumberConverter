package com.example.numberconverter;

public class Words {
    public static final String[] units = {
            "", "One", "Two", "Three", "Four", "Five", "Six", "Seven",
            "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen",
            "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    public static final String[] tens = {
            "",
            "",
            "Twenty",
            "Thirty",
            "Forty",
            "Fifty",
            "Sixty",
            "Seventy",
            "Eighty",
            "Ninety"
    };

    public Words() {

    }
    public String converter(int number) {
        if (number < 0){
            return "minus " + converter(-number);
        }
        else if (number < 20){
            return units[number];
        }
        else if (number < 100){
            return tens[number/10] + ((number % 10 != 0) ? " " : "") + units[number % 10];
        }
        else if(number < 1000){
            return units[number / 100] + " Hundred" + ((number % 100 != 0) ? " " : "") +
                    converter(number % 100);
        }
        else if (number < 1000000){
            return converter(number / 1000) + " Thousand" + ((number % 1000 != 0) ? " ": "")
                    + converter(number % 1000);
        }
        return "Unable to convert numbers more than 100 thousands";
    }
}
