package by.dorogokupets.arraytask.creater;

import by.dorogokupets.arraytask.exception.DataException;

import java.util.List;

public class ArrayCreator {
    public int[] createArray(List<Integer> numbers) throws DataException {
        if (numbers.isEmpty()) {
            throw new DataException("Empty list.");
        }
//        if (numbers.isEmpty()) {
//            return new int[0];
//        }
        int[] array = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            array[i] = numbers.get(i);
        }
        return array;
    }
}