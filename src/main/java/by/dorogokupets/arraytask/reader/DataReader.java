package by.dorogokupets.arraytask.reader;

import by.dorogokupets.arraytask.exception.DataException;

public interface DataReader {
    String read(String filename) throws DataException;
}
