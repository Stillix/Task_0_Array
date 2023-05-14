package by.dorogokupets.arraytask.parser;

import by.dorogokupets.arraytask.validator.impl.DataValidatorImpl;

import java.util.ArrayList;
import java.util.List;

public class DataParser {
    private static final String SPACE_DELIMITER = "\\s+";

    public List<Integer> parseData(String data) {
        DataValidatorImpl validator = new DataValidatorImpl();
        List<Integer> integers = new ArrayList<>();
        String[] stringNumbers = data.split(SPACE_DELIMITER);
        for (String str : stringNumbers) {
            if (validator.stringNumberValidate(str)) {
                integers.add(Integer.parseInt(str));
            }
        }
        return integers;
    }
}