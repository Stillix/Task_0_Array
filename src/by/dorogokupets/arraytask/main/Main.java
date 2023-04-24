package by.dorogokupets.arraytask.main;


import by.dorogokupets.arraytask.service.impl.ArrayExecuteServiceImpl;
import by.dorogokupets.arraytask.entity.DataArray;

public class Main {
    public static void main(String[] args) {
        DataArray dataArray = new DataArray(new int[]{44, 2, 3});
        ArrayExecuteServiceImpl arrayExecuteService = new ArrayExecuteServiceImpl();
        int sum = arrayExecuteService.calculateSumArray(dataArray);
        System.out.println(dataArray);
        System.out.println(sum);

    }
}
