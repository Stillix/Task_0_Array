package by.dorogokupets.arraytask.repository.specification;

import by.dorogokupets.arraytask.entity.DataArray;
import by.dorogokupets.arraytask.repository.Specification;

public class LengthSpecification implements Specification {
    private int desiredLength;

    public LengthSpecification(int desiredLength) {
        this.desiredLength = desiredLength;
    }

    @Override
    public boolean specify(DataArray dataArray) {
        return dataArray.getArray().length == desiredLength;
    }
}
