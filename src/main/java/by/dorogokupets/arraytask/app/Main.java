package by.dorogokupets.arraytask.app;


import by.dorogokupets.arraytask.creater.ArrayCreator;
import by.dorogokupets.arraytask.exception.DataException;
import by.dorogokupets.arraytask.parser.DataParser;
import by.dorogokupets.arraytask.reader.DataReader;
import by.dorogokupets.arraytask.validator.DataValidator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DataReader reader = new DataReader();
        String filename = "data\\dataarray.txt";

        try {
            String data = reader.read(filename);
            DataParser parser = new DataParser();
            List<String> numbers = parser.parseData(data);
            DataValidator validator = new DataValidator();
            List<Integer> validNumbers = new ArrayList<>();

            for (String number : numbers) {
                if (validator.stringNumberValidate(number)) {
                    validNumbers.add(Integer.parseInt(number));
                }
            }

            ArrayCreator arrayCreator = new ArrayCreator();
            int[] array = arrayCreator.createArray(validNumbers);

            for (int num : array) {
                System.out.print(num + " ");
            }
        } catch (DataException e) {
            e.printStackTrace();
        }
    }
}