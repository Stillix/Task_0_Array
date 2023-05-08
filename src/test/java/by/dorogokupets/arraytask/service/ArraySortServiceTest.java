package by.dorogokupets.arraytask.service;

import by.dorogokupets.arraytask.entity.DataArray;
import by.dorogokupets.arraytask.service.impl.ArraySortServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ArraySortServiceTest {
    private static final int[] EXPECTED = {6, 9, 11, 13, 22, 29, 44, 67};
    private static final DataArray dataArray = new DataArray(new int[]{6, 9, 11, 13, 29, 67, 22, 44});
    private static final ArraySortServiceImpl arrayExecuteService = new ArraySortServiceImpl();

    @Test
    void bubbleSortArray() {
        arrayExecuteService.bubbleSortArray(dataArray);
        Assertions.assertArrayEquals(EXPECTED, dataArray.getArray());
    }

    @Test
    void selectionSortArray() {
        arrayExecuteService.selectionSortArray(dataArray);
        Assertions.assertArrayEquals(EXPECTED, dataArray.getArray());
    }

    @Test
    void insertionSortArray() {
        arrayExecuteService.insertionSortArray(dataArray);
        Assertions.assertArrayEquals(EXPECTED, dataArray.getArray());
    }
}