package com.tw;

public class MultiplicationTableBuilder {

    public static void main(String[] args) {
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 4;
        String multiplicationTable = builder.build(start, end);

        System.out.println(multiplicationTable);
    }

    public String build(int start, int end) {
        return "";
    }



    public boolean isValid(int start, int end) {
        return isInRange(start) && isInRange(end) && isStartNotBiggerThanEnd(start, end);
    }

    public boolean isInRange(int number) {
        return number > 1 && number <= 1000;
    }

    public boolean isStartNotBiggerThanEnd(int start, int end) {
        return start <= end;
    }


    public String generateExpression(int multiplicand, int multiplier) {
        int product = multiplicand * multiplier;
        return multiplicand + "*" + multiplier + "=" + product;
    }
}
