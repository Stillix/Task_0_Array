package by.dorogokupets.arraytask.service.impl;

import by.dorogokupets.arraytask.entity.DataArray;
import by.dorogokupets.arraytask.service.ArrayExecuteService;

public class ArrayExecuteServiceImpl implements ArrayExecuteService {
    @Override
    public int findMaxValue(DataArray dataarray) {
        int[] array = dataarray.getArray();
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    @Override
    public int findMinValue(DataArray dataarray) {
        int[] array = dataarray.getArray();
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    @Override
    public int calculateSumArray(DataArray dataarray) {
        int[] array = dataarray.getArray();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
        return sum;
    }

    @Override
    public int findPositiveNumbers(DataArray dataarray) {
        int[] array = dataarray.getArray();
        int CountPositiveNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                CountPositiveNumbers++;
            }
        }
        return CountPositiveNumbers;
    }

    @Override
    public int findNegativeNumbers(DataArray dataarray) {
        int[] array = dataarray.getArray();
        int CountNegativeNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                CountNegativeNumbers++;
            }
        }
        return CountNegativeNumbers;
    }

    @Override
    public double findAverageArray(DataArray dataarray) {
        int[] array = dataarray.getArray();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double  avg = sum / array.length;
        return avg;
    }
}
