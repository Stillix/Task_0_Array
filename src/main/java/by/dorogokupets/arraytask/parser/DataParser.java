package by.dorogokupets.arraytask.parser;

import by.dorogokupets.arraytask.validator.DataValidator;
import by.dorogokupets.arraytask.validator.impl.DataValidatorImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class DataParser {
    private static Logger logger = LogManager.getLogger();
    private static final String SPACE_DELIMITER = "\\s+";

    public List<Integer> parseData(String data) {
        DataValidator validator = new DataValidatorImpl();
        List<Integer> integers = new ArrayList<>();
        String[] stringNumbers = data.split(SPACE_DELIMITER);
        for (String str : stringNumbers) {
            if (validator.stringNumberValidate(str)) {
                integers.add(Integer.parseInt(str));
            }
        }
        if (integers.isEmpty()){
            logger.warn("Empty list.");
        }
        return integers;
    }
}