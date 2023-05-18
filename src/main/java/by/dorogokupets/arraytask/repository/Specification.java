package by.dorogokupets.arraytask.repository;

import by.dorogokupets.arraytask.entity.DataArray;

public interface Specification {
    boolean specify(DataArray dataArray);
}
