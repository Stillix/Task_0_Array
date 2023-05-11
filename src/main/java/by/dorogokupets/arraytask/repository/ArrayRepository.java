package by.dorogokupets.arraytask.repository;

import by.dorogokupets.arraytask.entity.DataArray;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class ArrayRepository {
    private List<DataArray> dataArrays;


    public ArrayRepository() {
        dataArrays = new ArrayList<>();
    }

    public List<DataArray> getDataArrays() {
        return dataArrays;
    }

    public void setDataArrays(List<DataArray> dataArrays) {
        this.dataArrays = dataArrays;
    }

    public void addArray(DataArray dataArray) {
        dataArrays.add(dataArray);
    }

    public void removeArray(DataArray dataArray) {
        dataArrays.remove(dataArray);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ArrayRepository.class.getSimpleName() + "[", "]")
                .add("dataArrays=" + dataArrays)
                .toString();
    }
}

