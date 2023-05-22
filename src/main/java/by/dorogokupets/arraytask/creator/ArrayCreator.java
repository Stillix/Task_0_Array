package by.dorogokupets.arraytask.creator;

import by.dorogokupets.arraytask.entity.DataArray;
import by.dorogokupets.arraytask.exception.DataException;

import java.util.List;

public interface ArrayCreator {
    DataArray createArray(List<Integer> numbers) throws DataException;
}
