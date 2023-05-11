package by.dorogokupets.arraytask.reader;

import by.dorogokupets.arraytask.exception.DataException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class DataReader {
    private static Logger logger = LogManager.getLogger();

    public String read(String filename) throws DataException {
        String data = null;
        Path path = Paths.get(filename);
        if (Files.exists(path) && !Files.isDirectory(path) && Files.isReadable(path)) {
            Stream<String> fileStream = null;
            try {
                fileStream = Files.lines(path);
                data = fileStream.reduce((s1, s2) -> s1 + " " + s2).orElse("empty");
            } catch (IOException e) {
                throw new DataException("Failed to read file.", e);
            } finally {
                if (fileStream != null) {
                    fileStream.close();
                }
            }
        } else {
            logger.info("File cannot be read due to invalid path.");
        }
        return data;
    }
}