package by.dorogokupets.arraytask.service;

import by.dorogokupets.arraytask.entity.DataArray;
import by.dorogokupets.arraytask.service.impl.ArrayExecuteServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ArrayExecuteServiceTest {
    private static final ArrayExecuteServiceImpl arrayExecuteService = new ArrayExecuteServiceImpl();
    private static final DataArray dataArray = new DataArray(new int[]{6, 9, 11, 13, 29, 67, 22, 44});

    @Test
    void findMaxValue() {
        int expected = 67;
        int actual = arrayExecuteService.findMaxValue(dataArray);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMinValue() {
        int expected = 6;
        int actual = arrayExecuteService.findMinValue(dataArray);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void calculateSumArray() {
        int expected = 201;
        int actual = arrayExecuteService.calculateSumArray(dataArray);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findPositiveNumbers() {
        int expected = 8;
        int actual = arrayExecuteService.findPositiveNumbers(dataArray);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findNegativeNumbers() {
        int expected = 0;
        int actual = arrayExecuteService.findNegativeNumbers(dataArray);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findAverageArray() {
        double expected = 25.125;
        double actual = arrayExecuteService.findAverageArray(dataArray);
        Assertions.assertEquals(expected, actual);
    }
}