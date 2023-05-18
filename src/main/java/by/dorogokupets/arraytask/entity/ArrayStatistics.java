package by.dorogokupets.arraytask.entity;

import by.dorogokupets.arraytask.service.ArrayExecuteService;
import by.dorogokupets.arraytask.service.impl.ArrayExecuteServiceImpl;

import java.util.StringJoiner;

public class ArrayStatistics {
    private int sumValue;
    private double averageValue;
    private int maxValue;
    private int minValue;

    private static ArrayExecuteService arrayExecuteService = new ArrayExecuteServiceImpl();

    public ArrayStatistics(DataArray array) {
        sumValue = arrayExecuteService.calculateSumArray(array);
        averageValue = arrayExecuteService.findAverageArray(array);
        maxValue = arrayExecuteService.findMaxValue(array);
        minValue = arrayExecuteService.findMinValue(array);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ArrayStatistics.class.getSimpleName() + "[", "]")
                .add("sumValue=" + sumValue)
                .add("averageValue=" + averageValue)
                .add("maxValue=" + maxValue)
                .add("minValue=" + minValue)
                .toString();
    }
}
