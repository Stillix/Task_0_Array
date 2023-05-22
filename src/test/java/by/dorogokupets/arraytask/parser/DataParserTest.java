package by.dorogokupets.arraytask.parser;

import by.dorogokupets.arraytask.parser.impl.DataParserImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.time.Duration.ofMillis;

class DataParserTest {

    @Test
    void parseData() {
        //        DataReaderImpl reader = new DataReaderImpl();
//        String filename = "data\\dataarray.txt";
//        String data = null;
//        try {
//            data = reader.read(filename);
//        } catch (DataException e) {
//            e.printStackTrace();
//        }
        String data = "1 1 1 1 1 д93 31 2 73 1 837 4 7 11  1123     123 141 33 13в фыв 1 413 12 954   3 51а 1 41";
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1, 31, 2, 73, 1, 837, 4, 7, 11, 1123, 123, 141, 33, 1, 413, 12, 954, 3, 1, 41));
        Assertions.assertTimeout(ofMillis(800), () -> {
            DataParserImpl parser = new DataParserImpl();
            List<Integer> actual = parser.parseData(data);
            Assertions.assertEquals(expected, actual);
        });
    }
}