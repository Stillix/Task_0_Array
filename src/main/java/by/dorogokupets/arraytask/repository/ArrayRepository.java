package by.dorogokupets.arraytask.repository;

import by.dorogokupets.arraytask.entity.DataArray;
import by.dorogokupets.arraytask.repository.specification.Specification;

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

    public List<DataArray> query(Specification specification) {
        List<DataArray> results = new ArrayList<>();
        for (DataArray array : dataArrays) {
            if (specification.specify(array)) {
                results.add(array);
            }
        }
        return results;
    }

    public List<DataArray> queryStream(Specification specification) {
        List<DataArray> results = dataArrays.stream().filter(array -> specification.specify(array)).toList();
        return results;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ArrayRepository.class.getSimpleName() + "[", "]")
                .add("dataArrays=" + dataArrays)
                .toString();
    }
}

