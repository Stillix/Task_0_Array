package by.dorogokupets.arraytask.parser;

import java.util.Arrays;
import java.util.List;

public class DataParser {
        public List<String> parseData(String data) {
            List<String> numbers = Arrays.asList(data.split("\\s+"));
            return numbers;

    }
}