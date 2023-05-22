package by.dorogokupets.arraytask.repository.specification;

import by.dorogokupets.arraytask.entity.DataArray;
import by.dorogokupets.arraytask.repository.Specification;

public class MaxArraySpecification implements Specification {
    private int maxElement;

    public MaxArraySpecification(int minElement) {
        this.maxElement = maxElement;
    }

    @Override
    public boolean specify(DataArray dataArray) {
        int[] data = dataArray.getArray();
        int arrayMax = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > arrayMax) {
                arrayMax = data[i];
            }
        }
        return arrayMax == maxElement;
    }
}
