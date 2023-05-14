package by.dorogokupets.arraytask.app;


import by.dorogokupets.arraytask.creater.ArrayCreator;
import by.dorogokupets.arraytask.entity.ArrayStatistics;
import by.dorogokupets.arraytask.entity.DataArray;
import by.dorogokupets.arraytask.entity.Warehouse;
import by.dorogokupets.arraytask.exception.DataException;
import by.dorogokupets.arraytask.observer.ArrayStatisticsObserver;
import by.dorogokupets.arraytask.observer.impl.ArrayStatisticsObserverImpl;
import by.dorogokupets.arraytask.parser.DataParser;
import by.dorogokupets.arraytask.reader.impl.DataReaderImpl;
import by.dorogokupets.arraytask.repository.ArrayRepository;
import by.dorogokupets.arraytask.repository.specification.IdSpecification;
import by.dorogokupets.arraytask.repository.specification.Specification;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DataReaderImpl reader = new DataReaderImpl();
        String filename = "data\\dataarray.txt";
        String data;
        try {
            data = reader.read(filename);
        } catch (DataException e) {
            try {
                throw new DataException("Failed to read data from file.");
            } catch (DataException ex) {
                ex.printStackTrace();
            }
            return;
        }
        DataParser parser = new DataParser();
        List<Integer> numbers = parser.parseData(data);
        ArrayCreator creator = new ArrayCreator();
        DataArray dataArray;
        try {
            dataArray = creator.createArray(numbers);
        } catch (DataException e) {
            System.out.println("Failed to create DataArray: " + e.getMessage());
            return;
        }
        System.out.println(dataArray);


        DataArray dataArray2 = new DataArray(new int[]{1, 2, 3});
        DataArray dataArray3 = new DataArray(new int[]{4, 5, 6});

        ArrayRepository arrayRepository = new ArrayRepository();

        arrayRepository.addArray(dataArray);
        arrayRepository.addArray(dataArray2);
        arrayRepository.addArray(dataArray3);


        int arrayId = dataArray.getArrayId();
        System.out.println("Array ID: " + arrayId);


        ArrayStatisticsObserver observer = new ArrayStatisticsObserverImpl();
        observer.changeArrayElement(dataArray);

        Specification idSpecification = new IdSpecification(arrayId);
        List<DataArray> queryResults = arrayRepository.query(idSpecification);

        Warehouse warehouse = Warehouse.getInstance();
        ArrayStatistics statistics = warehouse.get(arrayId);
        System.out.println("Statistics: " + statistics);
        for (DataArray result : queryResults) {
            System.out.println(result);
        }
        arrayId = dataArray2.getArrayId();
        System.out.println("Array ID: " + arrayId);
        dataArray2.addObserver();
        observer.changeArrayElement(dataArray2);
        statistics = warehouse.get(arrayId);
        System.out.println("Statistics: " + statistics);
        idSpecification = new IdSpecification(arrayId);
        queryResults = arrayRepository.query(idSpecification);
        System.out.println("Query Results:");
        for (DataArray result : queryResults) {
            System.out.println(result);
        }
    }
}