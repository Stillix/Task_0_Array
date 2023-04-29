package by.dorogokupets.arraytask.service;

import by.dorogokupets.arraytask.entity.DataArray;

public interface ArraySortService {
    int[] bubbleSortArray(DataArray dataarray);
    int[] selectionSortArray(DataArray dataarray);
    int[] insertionSortArray(DataArray dataarray);

}
