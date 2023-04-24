package by.dorogokupets.arraytask.service;

import by.dorogokupets.arraytask.entity.DataArray;

public interface ArrayExecuteService {
    int findMaxValue(DataArray dataarray);
    int findMinValue(DataArray dataarray);
    int calculateSumArray(DataArray dataarray);
    int findPositiveNumbers(DataArray dataarray);
    int findNegativeNumbers(DataArray dataarray);
    double findAverageArray(DataArray dataarray);

}
