package by.dorogokupets.arraytask.service;

import by.dorogokupets.arraytask.entity.DataArray;

public interface ArrayExecuteService {
    int findMaxValue(DataArray dataArray);
    int findMinValue(DataArray dataArray);
    int calculateSumArray(DataArray dataArray);
    int findPositiveNumbers(DataArray dataArray);
    int findNegativeNumbers(DataArray dataArray);
    double findAverageArray(DataArray dataArray);

}
