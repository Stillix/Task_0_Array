package by.dorogokupets.arraytask.repository.specification;

import by.dorogokupets.arraytask.entity.DataArray;
import by.dorogokupets.arraytask.repository.Specification;

public class MinElementSpecification implements Specification {
    private int minElement;

    public MinElementSpecification(int minElement) {
        this.minElement = minElement;
    }

    @Override
    public boolean specify(DataArray dataArray) {
        int[] data = dataArray.getArray();
        int arrayMin = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] < arrayMin) {
                arrayMin = data[i];
            }
        }
        return arrayMin == minElement;
    }
}
