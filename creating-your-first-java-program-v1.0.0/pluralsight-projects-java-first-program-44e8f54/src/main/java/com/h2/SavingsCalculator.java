package com.h2;

import java.time.LocalDate;
import java.time.YearMonth;

public class SavingsCalculator {
    private float[] debits;
    private float[] credits;

    // public SavingsCalculator() {
    // }

    public SavingsCalculator(float[] credits, float[] debits) {
        this.credits = credits;
        this.debits = debits;
    }

    private float sumOfCredits() {
        float sum = 0.0f;

        for (float currentCredit : credits) {
            sum += currentCredit;
        }
        return sum;
    }

    private float sumOfDebits() {
        float sum = 0.0f;

        for (float currentDebit : debits) {
            sum += currentDebit;
        }
        return sum;
    }

    private static int remainingDaysInMonth(LocalDate date) {
        YearMonth yearMonth = YearMonth.of(date.getYear(), date.getMonth());
        int totalDaysInMonth = yearMonth.lengthOfMonth();
        int remainingDays = totalDaysInMonth - date.getDayOfMonth();
        return remainingDays;
    }

    public float calculate() {
        return sumOfCredits() - sumOfDebits();
    }

    public static void main(String[] args) {
        // Takes the arguments passed into the main method and stores them in an array
        // of type of String splits the values by comma.
        final String[] creditsAsString = args[0].split(",");
        final String[] debitsAsString = args[1].split(",");

        // Creates a float array with the same length as the arrays with the array that
        // contain these values of type String.
        final float[] credits = new float[creditsAsString.length];
        final float[] debits = new float[debitsAsString.length];

        // Converts the String element into a float for both credits and debits.
        for (int x = 0; x < creditsAsString.length; x++) {
            credits[x] = Float.parseFloat(creditsAsString[x]);
        }
        for (int x = 0; x < debitsAsString.length; x++) {
            debits[x] = Float.parseFloat(debitsAsString[x]);
        }
        final SavingsCalculator calculator = new SavingsCalculator(credits, debits);

        float netSavings = calculator.calculate();

        System.out.println(
                "Net Savings = " + netSavings + ", remaining days in month = " + remainingDaysInMonth(LocalDate.now()));
    }
}
