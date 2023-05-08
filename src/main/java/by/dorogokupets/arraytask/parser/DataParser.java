package by.dorogokupets.arraytask.parser;

import by.dorogokupets.arraytask.validator.DataValidator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataParser {
    private DataValidator validator = new DataValidator();

    public List<Integer> parseData(String data) {
        List<Integer> integers = new ArrayList<>();
        Arrays.stream(data.split("\\s+"))
                .filter(s -> validator.isValid(s))
                .forEach(i -> integers.add(Integer.parseInt(i)));
        return integers;
    }
}

