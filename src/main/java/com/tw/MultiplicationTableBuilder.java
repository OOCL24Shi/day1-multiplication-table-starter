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
        boolean isValid = isValid(start, end);
        if (isValid) {
            return generateTable(start, end);
        } else {
            return null;
        }
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

    public String generateTable(int start, int end) {
        StringBuilder table = new StringBuilder();
        for (int i = start; i <= end; i++) {
            table.append(generateLine(start, i)).append("\n");
        }
        return table.toString().trim();
    }

    public String generateLine(int start, int row) {
        StringBuilder line = new StringBuilder();
        for (int j = start; j <= row; j++) {
            line.append(generateExpression(j, row)).append(" ");
        }
        return line.toString().trim();
    }

    public String generateExpression(int multiplicand, int multiplier) {
        int product = multiplicand * multiplier;
        return multiplicand + "*" + multiplier + "=" + product;
    }
}
