package by.dorogokupets.arraytask.entity;

import java.util.Arrays;
import java.util.StringJoiner;

public class DataArray {
    private int[] array;

    public DataArray() {
    }

    public DataArray(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", DataArray.class.getSimpleName() + "[", "]")
                .add("array=" + Arrays.toString(array))
                .toString();
    }
}
