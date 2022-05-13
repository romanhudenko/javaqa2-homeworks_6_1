package ru.netology.stats;

public class StatsService {
    public int sum(int[] sales) {
        int output = 0;
        for (int sale : sales) {
            output += sale;
        }
        return output;
    }

    public double average(int[] sales) {
        return (double) sum(sales) / (double) sales.length;
    }

    public int maxSalesMonthIndex(int[] sales) {
        int currentMax = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] >= sales[currentMax]) {
                currentMax = i;
            }
        }
        return currentMax;
    }

    public int minSalesMonthIndex(int[] sales) {
        int currentMix = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] <= sales[currentMix]) {
                currentMix = i;
            }
        }
        return currentMix;
    }

    public int belowAverageSalesMonthCount(int[] sales) {
        double flag = average(sales);
        int counter = 0;
        for (int sale : sales) {
            if (sale < flag) {
                counter++;
            }
        }
        return counter;
    }

    public int aboveAverageSalesMonthCount(int[] sales) {
        double flag = average(sales);
        int counter = 0;
        for (int sale : sales) {
            if (sale > flag) {
                counter++;
            }
        }
        return counter;
    }
}