package by.dorogokupets.arraytask.creater;

import by.dorogokupets.arraytask.entity.DataArray;
import by.dorogokupets.arraytask.exception.DataException;

import java.util.List;

public class ArrayCreator {
    public DataArray createArray(List<Integer> numbers) throws DataException {
        if (numbers.isEmpty()) {
            throw new DataException("Empty list.");
        }
        int[] array = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            array[i] = number;
        }
        return new DataArray(array);
    }
}
