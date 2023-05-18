package by.dorogokupets.arraytask.entity;

import by.dorogokupets.arraytask.observer.ArrayStatisticsObserver;
import by.dorogokupets.arraytask.observer.impl.ArrayStatisticsObserverImpl;
import by.dorogokupets.arraytask.util.IdGenerator;

import java.util.Arrays;
import java.util.StringJoiner;

public class DataArray {
    private int arrayId;
    private int[] array;
    private ArrayStatisticsObserver observer;

    public DataArray() {
    }

    public DataArray(int[] array) {
        setArray(array);
        arrayId = IdGenerator.generateId();
        observer = new ArrayStatisticsObserverImpl();

    }

    public int getArrayId() {
        return arrayId;
    }

    public void setArrayId(int newId) {
        int oldId = this.arrayId;
        this.arrayId = newId;
        Warehouse warehouse = Warehouse.getInstance();
        ArrayStatistics statistics = warehouse.get(oldId);
        warehouse.put(newId, statistics);
        warehouse.remove(oldId);
    }

    public void removeObserver() {
        observer = null;
    }

    public void addObserver() {
        observer = new ArrayStatisticsObserverImpl();
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        if (array != null && array.length > 0) {
            this.array = array;
        } else {
            this.array = new int[]{0};
        }
        notifyObserver();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataArray dataArray = (DataArray) o;
        return Arrays.equals(array, dataArray.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    private void notifyObserver() {
        if (observer != null) {
            observer.changeArrayElement(this);
        }
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", "Class Name: " + DataArray.class.getSimpleName() + ".  ", "")
                .add("array=" + Arrays.toString(array))
                .toString();
    }
}
