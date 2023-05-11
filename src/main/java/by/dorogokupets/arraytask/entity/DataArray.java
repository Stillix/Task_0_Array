package by.dorogokupets.arraytask.entity;

import java.util.Arrays;
import java.util.StringJoiner;

public class DataArray {
    private int[] array;
    private int arrayId;

    public DataArray() {
    }

    public int getArrayId() {
        return arrayId;
    }

    public void setArrayId(int arrayId) {
        this.arrayId = arrayId;
    }

    public DataArray(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
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
