package by.dorogokupets.arraytask.service.impl;

import by.dorogokupets.arraytask.entity.DataArray;
import by.dorogokupets.arraytask.service.ArrayExecuteService;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayExecuteServiceImpl implements ArrayExecuteService {
    private static Logger logger = LogManager.getLogger();

    @Override
    public int findMaxValue(DataArray dataarray) {
        int[] array = dataarray.getArray();
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        logger.log(Level.INFO, "Max value = " + maxValue);
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
        logger.log(Level.INFO, "Min value = " + minValue);
        return minValue;
    }

    @Override
    public int calculateSumArray(DataArray dataarray) {
        int[] array = dataarray.getArray();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        logger.log(Level.INFO, "Sum array numbers = " + sum);
        return sum;
    }

    @Override
    public int findPositiveNumbers(DataArray dataarray) {
        int[] array = dataarray.getArray();
        int countPositiveNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                countPositiveNumbers++;
            }
        }
        logger.log(Level.INFO, "Count positive numbers = " + countPositiveNumbers);
        return countPositiveNumbers;
    }

    @Override
    public int findNegativeNumbers(DataArray dataarray) {
        int[] array = dataarray.getArray();
        int countNegativeNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                countNegativeNumbers++;
            }
        }
        logger.log(Level.INFO, "Count negative numbers = " + countNegativeNumbers);
        return countNegativeNumbers;
    }

    @Override
    public double findAverageArray(DataArray dataarray) {
        int[] array = dataarray.getArray();
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        avg = (double) sum / array.length;
        logger.log(Level.INFO, "Average of the array = " + avg);
        return avg;
    }
}
