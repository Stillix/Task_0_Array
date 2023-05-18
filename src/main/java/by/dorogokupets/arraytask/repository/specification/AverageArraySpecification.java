package by.dorogokupets.arraytask.repository.specification;

import by.dorogokupets.arraytask.entity.DataArray;
import by.dorogokupets.arraytask.repository.Specification;
import by.dorogokupets.arraytask.service.ArrayExecuteService;
import by.dorogokupets.arraytask.service.impl.ArrayExecuteServiceImpl;

public class AverageArraySpecification implements Specification {
    private static ArrayExecuteService arrayExecuteService = new ArrayExecuteServiceImpl();
    private int averageArray;

    public AverageArraySpecification(int averageArray) {
        this.averageArray = averageArray;
    }

    @Override
    public boolean specify(DataArray dataArray) {
        double averageValue = arrayExecuteService.findAverageArray(dataArray);
        return averageValue == averageArray;
    }
}
