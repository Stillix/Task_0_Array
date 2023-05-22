package by.dorogokupets.arraytask.creator;

import by.dorogokupets.arraytask.creator.impl.ArrayCreatorImpl;
import by.dorogokupets.arraytask.entity.DataArray;
import by.dorogokupets.arraytask.exception.DataException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ArrayCreatorTest {
    private static Logger logger = LogManager.getLogger();

    @Test
    void createArray() {
        ArrayCreatorImpl creator = new ArrayCreatorImpl();
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1, 31, 2, 73, 1, 837, 4, 7, 11, 1123, 123, 141, 33, 1, 413, 12, 954, 3, 1, 41));
        DataArray expected = new DataArray(new int[]{1, 1, 1, 1, 1, 31, 2, 73, 1, 837, 4, 7, 11, 1123, 123, 141, 33, 1, 413, 12, 954, 3, 1, 41});
        DataArray actual = null;
        try {
            actual = creator.createArray(numbers);
        } catch (DataException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals(expected,actual);
    }
}