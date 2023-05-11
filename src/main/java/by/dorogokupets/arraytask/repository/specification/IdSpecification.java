package by.dorogokupets.arraytask.repository.specification;

import by.dorogokupets.arraytask.entity.DataArray;

public class IdSpecification implements Specification {
    private int id;

    public IdSpecification(int id) {
        this.id = id;
    }

    @Override
    public boolean specify(DataArray array) {
        return array.getArrayId() == id;
    }
}
