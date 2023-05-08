package by.dorogokupets.arraytask.service;

import by.dorogokupets.arraytask.entity.DataArray;

public interface ArraySortService {
    void bubbleSortArray(DataArray dataarray);
    void selectionSortArray(DataArray dataarray);
    void insertionSortArray(DataArray dataarray);

}
