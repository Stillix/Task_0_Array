package by.dorogokupets.arraytask.service.impl;

import by.dorogokupets.arraytask.entity.DataArray;
import by.dorogokupets.arraytask.service.ArraySortService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArraySortServiceImpl implements ArraySortService {
    private static Logger logger = LogManager.getLogger();

    @Override
    public int[] bubbleSortArray(DataArray dataarray) {
        int[] array = dataarray.getArray();
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        logger.log(Level.INFO, "Bubble sorting of the array is successful");
        return array;
    }

    @Override
    public int[] selectionSortArray(DataArray dataarray) {
        int[] array = dataarray.getArray();
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (array[j] < array[min_idx])
                    min_idx = j;
            int temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
        logger.log(Level.INFO, "Select sorting of the array is successful");
        return array;
    }

    @Override
    public int[] insertionSortArray(DataArray dataarray) {
        int[] array = dataarray.getArray();
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        logger.log(Level.INFO, "Insert sorting of the array is successful");
        return array;
    }
}
