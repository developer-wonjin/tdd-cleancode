package com.example.www.stringcalculatorv1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculatorV1 {

    public static final String DEFAULT_DELIMETER = ",|:";

    public static int splitAndSum_final (String text) {
        if (isBlank(text)) {
            return 0;
        }

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

    // 컴포즈 메소드 패턴 : 가독성 좋은 코드 , 메소드분리하여 추상화레벨 1로 맞추기
    private static boolean isBlank(String text) {
        return text == null || text.isBlank();
    }

    // 컴포즈 메소드 패턴 : 가독성 좋은 코드 , 메소드분리하여 추상화레벨 1로 맞추기
    private static String[] split(String text, String delimeter) {
        return text.split(delimeter);
    }




    public static int splitAndSum10 (String text) {
        if (text == null || text.isBlank()) {
            return 0;
        }

        Matcher m = Pattern
                .compile("//(.)\n(.*)")
                .matcher(text);

        if (m.find()) {
            String customDelimeter = m.group(1);
            String[] values = m.group(2).split(customDelimeter);
            return sum(toInts(values));
        }

        String[] values = text.split(DEFAULT_DELIMETER);
        return sum(toInts(values));
    }


    private static int[] toInts(String[] values) {
        int[] ints = new int[values.length];
        for (int i = 0; i < values.length; i++) { // N
            ints[i] = toInt(values[i]);
        }
        return ints;
    }

    // N걸리던 작업이 2N으로 늘어놔도 DB I/O작업에 비해 무시할 정도로 미미하다
    private static int sum(int[] values) {
        int result = 0;
        for (int value : values) {// N
            result += value;
        }
        return result;
    }





    public static int splitAndSum9 (String text) {
        if (text == null || text.isBlank()) {
            return 0;
        }

        Matcher m = Pattern
                .compile("//(.)\n(.*)")
                .matcher(text);

        if (m.find()) {
            String customDelimeter = m.group(1);
            String[] values = m.group(2).split(customDelimeter);
            return sum(values);
        }

        String[] values = text.split(DEFAULT_DELIMETER);
        return sum(values);
    }

    // (문제점) 두 가지 작업을 하고 있음
    // 1. 반복을 돌며 합계를 내는 작업
    // 2. 형변환하는 작업
    private static int sum(String[] values) {
        int result = 0;
        for (String value : values) { // N
            result += toInt(value);
        }
        return result;
    }





    public static int splitAndSum8 (String text) {
        if (text == null || text.isBlank()) {
            return 0;
        }

        int result = 0; // (문제점) 쓸모없는데 삭제를 못한다. 아래 함수의 인자로 사용되고있다.
        Matcher m = Pattern
                .compile("//(.)\n(.*)")
                .matcher(text);

        if (m.find()) {
            String customDelimeter = m.group(1);
            String[] values = m.group(2).split(customDelimeter);
            return sum(values, result);
        }

        String[] values = text.split(DEFAULT_DELIMETER);
        return sum(values, result);
    }





    public static int splitAndSum7 (String text) {
        if (text == null || text.isBlank()) {
            return 0; //변경
        }

        int result = 0;
        Matcher m = Pattern
                .compile("//(.)\n(.*)")
                .matcher(text);

        if (m.find()) {
            String customDelimeter = m.group(1);
            String[] values = m.group(2).split(customDelimeter);
            result = sum(values, result);
        } else {
            String[] values = text.split(DEFAULT_DELIMETER);
            result = sum(values, result);
        }
        return result;
    }

    private static int sum(String[] values, int result) {
        for (String value : values) {
            result += Integer.parseInt(value);
        }
        return result;
    }

    private static int toInt(String value) {
        int result = Integer.parseInt(value);
        if (result < 0) {
            throw new RuntimeException("음수는 허용하지 않음");
        }
        return result;
    }





    public static int splitAndSum6 (String text) {
        if (text == null || text.isBlank()) {
            return 0; //변경
        }

        int result = 0;
        Matcher m = Pattern
                .compile("//(.)\n(.*)")
                .matcher(text);

        if (m.find()) {
            String customDelimeter = m.group(1);
            String[] values = m.group(2).split(customDelimeter);

            // (문제점) 코드중복
            for (String value : values) {
                result += Integer.parseInt(value);
            }
        } else {
            String[] values = text.split(DEFAULT_DELIMETER);
            // (문제점) 코드중복
            for (String value : values) {
                result += Integer.parseInt(value);
            }
        }
        return result;
    }





    public static int splitAndSum5_problem(String text) {
        int result = 0;// (문제점) 메소드 전체영역에서 지역변수 사용되는 것이 좋지 않음 ==> Early Return으로 해결하자
        if (text == null || text.isBlank()) {
            result = 0;
        } else {// (문제점) else  ==> Early Return으로 해결하자

            Matcher m = Pattern
                    .compile("//(.)\n(.*)")
                    .matcher(text);

            if (m.find()) {
                String customDelimeter = m.group(1);
                String[] values = m.group(2).split(customDelimeter);
                for (String value : values) {
                    result += Integer.parseInt(value);
                }
            } else {
                String[] values = text.split(DEFAULT_DELIMETER);
                for (String value : values) {
                    result += Integer.parseInt(value);
                }
            }
        }
        return result;
    }





    public static int splitAndSum4(String text) {
        int result = 0;
        if (text == null || text.isBlank()) {
            result = 0;

        } else {
            //추가
            Matcher m = Pattern
                    .compile("//(.)\n(.*)")
                    .matcher(text);
            //추가
            if (m.find()) {
                String customDelimeter = m.group(1);
                String[] values = m.group(2).split(customDelimeter);
                for (String value : values) {
                    result += Integer.parseInt(value);
                }
            } else {
                String[] values = text.split(DEFAULT_DELIMETER);
                for (String value : values) {
                    result += Integer.parseInt(value);
                }
            }
        }
        return result;
    }

    public static int splitAndSum3(String text) {
        int result = 0;
        if (text == null || text.isBlank()) {
            result = 0;
        } else {
            String[] values = text.split(DEFAULT_DELIMETER);//추가
            for (String value : values) {
                result += Integer.parseInt(value);
            }
        }
        return result;
    }

    public static int splitAndSum2(String text) {
        int result = 0;
        if (text == null || text.isBlank()) {
            result = 0;

        //추가
        } else {
            String[] values = text.split(",");
            for (String value : values) {
                result += Integer.parseInt(value);
            }
        }
        return result;
    }

    public static int splitAndSum1(String text) {
        int result;
        if (text == null || text.isBlank()) {//추가
            result = 0;
        }
        return 0;
    }

    public static int splitAndSum0(String text) {
        return 0;
    }
}
