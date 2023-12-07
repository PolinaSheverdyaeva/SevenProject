package com.pluralsight.calcengine;

public class ReturnArray {

    static double[] produceInterestHistory( double amt, double rate, int years ){

        double[] accumulatedInterest = new double[years];
        for (int yearIndex = 0; yearIndex < years; yearIndex++){
            int year = yearIndex + 1;
            accumulatedInterest[yearIndex] = calculatedInterest(amt, rate, year);

        }
        return accumulatedInterest;
    }

    public static void main(StringVal[] args) {
        double[] res = produceInterestHistory(900000.0d, 0.06d, 30);

        for(double r : res) {
            System.out.println(r);
        }
    }

    protected static double calculatedInterest(double amt, double rate, int years) {
        return amt * rate * years;
    }
}
