package ru.netology.stats.JavaqaStroci;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void sufAllSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAmount = 180;
        long actualAmount = service.sumOfAllSales(sales);
        Assertions.assertEquals(expectedAmount, actualAmount);

    }

    @Test
    public void averageNumberOfSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAmount = 15;
        long actualAmount = service.averageSales(sales);
        Assertions.assertEquals(expectedAmount, actualAmount);

    }

    @Test
    public void minimumSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAmount = 9;
        long actualAmount = service.minSales(sales);
        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void maximumSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAmount = 8;
        long actualAmount = service.maxSales(sales);
        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void salesBelowAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAmount = 5;
        long actualAmount = service.numberOfIsBelowAverage(sales);
        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void averageMaxMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAmount = 5;
        long actualAmount = service.salesAboveAverange(sales);
        Assertions.assertEquals(expectedAmount, actualAmount);
    }

}