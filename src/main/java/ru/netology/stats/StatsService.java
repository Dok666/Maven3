package ru.netology.stats;

public class StatsService {


    public int sum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }

        return sum;
    }

    public int averageAmount(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        int averageAmount = sum / 12;

        return averageAmount;
    }

    public int maximumMonth(int[] sales) {
        int maximumMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maximumMonth])
                maximumMonth = month;

            month = month + 1;
        }

        return maximumMonth + 1;
    }

    public int minimumMonth(int[] sales) {
        int minimumMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minimumMonth])
                minimumMonth = month;

            month = month + 1;
        }

        return minimumMonth + 1;
    }

    public int belowAverageSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        int averageAmount = sum / 12;
        int numberOfMonths = 0;

        for (int sale : sales) {
            if (averageAmount > sale)
                numberOfMonths = numberOfMonths + 1;
        }

        return numberOfMonths;
    }

    public int aboveAverageSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        int averageAmount = sum / 12;
        int numberOfMonthsOfMaximumSales = 0;

        for (int sale : sales) {
            if (averageAmount < sale)
                numberOfMonthsOfMaximumSales = numberOfMonthsOfMaximumSales + 1;
        }
        
        return numberOfMonthsOfMaximumSales;
    }
}













