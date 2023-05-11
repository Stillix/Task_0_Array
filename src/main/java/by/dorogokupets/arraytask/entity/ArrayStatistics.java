package by.dorogokupets.arraytask.entity;

public class ArrayStatistics {
    private int sumValue;
    private double averageValue;
    private int maxValue;
    private int minValue;

    public ArrayStatistics(DataArray array) {
        int[] arrayData = array.getArray();
        sumValue = calculateSum(arrayData);
        averageValue = calculateAverage(arrayData);
        maxValue = findMaxValue(arrayData);
        minValue = findMinValue(arrayData);
    }

    public int calculateSum(int[] array) {
        int sumValue = 0;
        for (int i = 0; i < array.length; i++) {
            sumValue += array[i];
        }
        return sumValue;
    }

    public double calculateAverage(int[] array) {
         double averageValue;
        int arrayLength = array.length;
        int sum = calculateSum(array);
        averageValue=(double) sum / arrayLength;
        return averageValue;
    }

    public int findMaxValue(int[] array) {
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    public int findMinValue(int[] array) {
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }
}
