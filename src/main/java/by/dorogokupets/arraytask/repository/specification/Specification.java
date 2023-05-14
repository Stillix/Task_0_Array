package by.dorogokupets.arraytask.repository.specification;

import by.dorogokupets.arraytask.entity.DataArray;

public interface Specification {
    boolean specify(DataArray dataArray);
}
