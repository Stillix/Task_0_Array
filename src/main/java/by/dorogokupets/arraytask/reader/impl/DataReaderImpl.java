package by.dorogokupets.arraytask.reader.impl;

import by.dorogokupets.arraytask.exception.DataException;
import by.dorogokupets.arraytask.reader.DataReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class DataReaderImpl implements DataReader {
    private static Logger logger = LogManager.getLogger();

    @Override
    public String read(String filename) throws DataException {
        String data = null;
        Path path = Paths.get(filename);
        if (Files.exists(path) && !Files.isDirectory(path) && Files.isReadable(path)) {
            Stream<String> fileStream = null;
            try {
                fileStream = Files.lines(path);
                data = fileStream.reduce((s1, s2) -> s1 + " " + s2).orElse("empty");
            } catch (IOException e) {
                throw new DataException("Failed to read file. "+filename, e);
            } finally {
                if (fileStream != null) {
                    fileStream.close();
                }
            }
        } else {
            logger.error("File cannot be read due to invalid path."+filename);
        }
        return data;
    }
}