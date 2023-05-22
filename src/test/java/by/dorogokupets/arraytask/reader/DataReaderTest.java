package by.dorogokupets.arraytask.reader;

import by.dorogokupets.arraytask.exception.DataException;
import by.dorogokupets.arraytask.reader.impl.DataReaderImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataReaderTest {

    @Test
    void read() {
        DataReaderImpl reader = new DataReaderImpl();
        String filename = "data\\dataarray.txt";
        String actual = null;
        try {
            actual = reader.read(filename);
        } catch (DataException e) {
            e.printStackTrace();
        }
        String expected = "1 1 1 1 1 д93 31 2 73 1 837 4 7 11  1123     123 141 33 13в фыв 1 413 12 954   3 51а 1 41";
        Assertions.assertEquals(expected,actual);
    }
}