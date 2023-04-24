package by.dorogokupets.arraytask.test;

import by.dorogokupets.arraytask.service.impl.ArrayExecuteServiceImpl;
import by.dorogokupets.arraytask.entity.DataArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class ArrayExecuteServiceTest {

    @Test
    void findMaxValue() {
        int expected = 67;
        DataArray dataArray = new DataArray(new int[]{6, 9, 11, 13, 29, 67, 22, 44});
        DataArray dataArray2 = new DataArray(new int[]{1,2,3,4,5,6,7,8,1,2,3});
        ArrayExecuteServiceImpl arrayExecuteService = new ArrayExecuteServiceImpl();
        int actual = arrayExecuteService.findMaxValue(dataArray2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMinValue() {
        int expected = 6;
        DataArray dataArray = new DataArray(new int[]{6, 9, 11, 13, 29, 67, 22, 44});
        ArrayExecuteServiceImpl arrayExecuteService = new ArrayExecuteServiceImpl();
        int actual = arrayExecuteService.findMinValue(dataArray);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void calculateSumArray() {
        int expected = 201;
        DataArray dataArray = new DataArray(new int[]{6, 9, 11, 13, 29, 67, 22, 44});
        ArrayExecuteServiceImpl arrayExecuteService = new ArrayExecuteServiceImpl();
        int actual = arrayExecuteService.calculateSumArray(dataArray);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findPositiveNumbers() {
        int expected = 8;
        DataArray dataArray = new DataArray(new int[]{6, 9, 11, 13, 29, 67, 22, 44});
        ArrayExecuteServiceImpl arrayExecuteService = new ArrayExecuteServiceImpl();
        int actual = arrayExecuteService.findPositiveNumbers(dataArray);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findNegativeNumbers() {
        int expected = 3;
        DataArray dataArray = new DataArray(new int[]{6, 9, 11, 13, 29, 67, 22, 44});
        ArrayExecuteServiceImpl arrayExecuteService = new ArrayExecuteServiceImpl();
        int actual = arrayExecuteService.findNegativeNumbers(dataArray);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findAverageArray() {
        double expected = 25;
        DataArray dataArray = new DataArray(new int[]{6, 9, 11, 13, 29, 67, 22, 44});
        ArrayExecuteServiceImpl arrayExecuteService = new ArrayExecuteServiceImpl();
        double actual = arrayExecuteService.findAverageArray(dataArray);
        Assertions.assertEquals(expected, actual);
    }
}