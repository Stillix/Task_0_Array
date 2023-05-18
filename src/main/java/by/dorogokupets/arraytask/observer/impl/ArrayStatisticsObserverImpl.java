package by.dorogokupets.arraytask.observer.impl;

import by.dorogokupets.arraytask.entity.ArrayStatistics;
import by.dorogokupets.arraytask.entity.DataArray;
import by.dorogokupets.arraytask.entity.Warehouse;
import by.dorogokupets.arraytask.observer.ArrayStatisticsObserver;

public class ArrayStatisticsObserverImpl implements ArrayStatisticsObserver {
    @Override
    public void changeArrayElement(DataArray array) {
        ArrayStatistics statistics = new ArrayStatistics(array);
        int id = array.getArrayId();
        Warehouse warehouse = Warehouse.getInstance();
        warehouse.put(id, statistics);
        // второй метод реагирует на смену айди
    }
}
