package ru.netology.stats.JavaqaStroci;

public class StatsService {
    public long sumOfAllSales(long[] sales) {
        long quantity = 0; //Количесво продаж                //Сумма всех продаж
        for (int i = 0; i < sales.length; i++) {
            quantity = quantity + sales[i];
        }
        return quantity;
    }

    public long averageSales(long[] sales) {
        long average = 0;                                   //Среднее число продаж
        long quantity = sumOfAllSales(sales);
        average = quantity / sales.length;
        return average;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;                                    // //номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;                                        //номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму*;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int numberOfIsBelowAverage(long[] sales) {
        int lowMonth = 0;                                         //количество месяцев, в которых продажи были ниже среднего
        long average = averageSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                lowMonth = lowMonth + 1;
            }
        }
        return lowMonth;
    }

    public int salesAboveAverange(long[] sales) {
        int monthsAboveAverage = 0;                          //количество месяцев, в которых продажи были выше среднего
        long averge = averageSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averge) {
                monthsAboveAverage = monthsAboveAverage + 1;
            }
        }
        return monthsAboveAverage;
    }
}



