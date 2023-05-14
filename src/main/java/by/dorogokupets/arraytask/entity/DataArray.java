package by.dorogokupets.arraytask.entity;

import by.dorogokupets.arraytask.observer.ArrayStatisticsObserver;
import by.dorogokupets.arraytask.observer.impl.ArrayStatisticsObserverImpl;
import by.dorogokupets.arraytask.util.IdGenerator;

import java.util.Arrays;
import java.util.StringJoiner;

public class DataArray {
    private int[] array;
    private int arrayId;
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

    public void setArrayId(int arrayId) {
        this.arrayId = arrayId;
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

    @Override
    public String toString() {
        return new StringJoiner(", ", "Class Name: " + DataArray.class.getSimpleName() + ".  ", "")
                .add("array=" + Arrays.toString(array))
                .toString();
    }
}
