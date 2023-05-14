package by.dorogokupets.arraytask.validator.impl;

import by.dorogokupets.arraytask.validator.DataValidator;

public class DataValidatorImpl implements DataValidator {
    private static final String INT_NUMBER_REGEX = "-?\\d{1,9}";
    private static final String INT_ARRAY_REGEX = "([0-9]{1,3}\\s+)+(\\d{1,3})";


    @Override
    public boolean stringNumberValidate(String stringNum) {
        boolean match = stringNum.matches(INT_NUMBER_REGEX);
        return match;
    }


    @Override
    public boolean stringArrayValidate(String stringArray) {
        boolean match = stringArray.matches(INT_ARRAY_REGEX);
        return match;
    }
}
