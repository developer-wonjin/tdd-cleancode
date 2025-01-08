package com.example.www.stringcalculatorv0;

import lombok.Getter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Getter
public class StringCalculatorV0 {

    public static final String DEFAULT_DELIMETER = ",|:";

    public static int splitAndSum(String text) {
        if (isBlank(text)) return 0;

        Matcher m = Pattern
                .compile("//(.)\n(.*)")
                .matcher(text);

        if (m.find()) {
            String customDelimeter = m.group(1);
            String[] values = split(m.group(2), customDelimeter);
            return sum(toInts(values));
        }
        String[] values = split(text, DEFAULT_DELIMETER);
        return sum(toInts(values));
    }

    private static String[] split(String text, String delimeter) {
        return text.split(delimeter);
    }

    private static boolean isBlank(String text) {
        return text == null || text.isBlank();
    }


    private static int sum(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }

    private static int sum(String[] splits) {
        int sum = 0;
        for (String split : splits) {
            sum += toInt(split);
        }
        return sum;
    }

    private static int[] toInts(String[] values) {
        int[] numbers = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            numbers[i] = toInt(values[i]);
        }
        return numbers;
    }

    private static int toInt(String split) {
        int number = Integer.parseInt(split);
        if (number < 0) throw new RuntimeException("음수는 허용안함");
        return number;
    }
}
