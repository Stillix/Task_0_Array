package by.dorogokupets.arraytask.observer;

import by.dorogokupets.arraytask.entity.DataArray;

public interface ArrayStatisticsObserver {
    void changeArrayElement(DataArray array);
    void changeArrayId(DataArray array, int newId);
}
