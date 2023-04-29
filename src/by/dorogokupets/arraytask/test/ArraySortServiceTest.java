package by.dorogokupets.arraytask.test;

import by.dorogokupets.arraytask.entity.DataArray;
import by.dorogokupets.arraytask.service.impl.ArraySortServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ArraySortServiceTest {

    @Test
    void bubbleSortArray() {
        int[] expected = {6,9,11,13,22,29,44,67};
        DataArray dataArray = new DataArray(new int[]{6, 9, 11, 13, 29, 67, 22, 44});
        ArraySortServiceImpl arrayExecuteService = new ArraySortServiceImpl();
        int[] actual = arrayExecuteService.bubbleSortArray(dataArray);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void selectionSortArray() {
        int[] expected = {6,9,11,13,22,29,44,67};
        DataArray dataArray = new DataArray(new int[]{6, 9, 11, 13, 29, 67, 22, 44});
        ArraySortServiceImpl arrayExecuteService = new ArraySortServiceImpl();
        int[] actual = arrayExecuteService.selectionSortArray(dataArray);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void insertionSortArray() {
        int[] expected = {6,9,11,13,22,29,44,67};
        DataArray dataArray = new DataArray(new int[]{6, 9, 11, 13, 29, 67, 22, 44});
        ArraySortServiceImpl arrayExecuteService = new ArraySortServiceImpl();
        int[] actual = arrayExecuteService.insertionSortArray(dataArray);
        Assertions.assertArrayEquals(expected, actual);
    }
}