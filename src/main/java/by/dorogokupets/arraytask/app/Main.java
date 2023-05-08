package by.dorogokupets.arraytask.app;


import by.dorogokupets.arraytask.exception.DataException;
import by.dorogokupets.arraytask.parser.DataParser;
import by.dorogokupets.arraytask.reader.DataReader;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DataReader reader = new DataReader();
        DataParser parser = new DataParser();
        List<Integer> data;
        try {
            data = parser.parseData(reader.read("data\\dataarray.txt"));
            System.out.println(data);
        } catch (DataException e) {
            try {
                throw new DataException("Ошибка парсинга");
            } catch (DataException ex) {
                ex.printStackTrace();
            }
        }
    }
}