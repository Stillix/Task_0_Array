package by.dorogokupets.arraytask.validator;

public class DataValidator {
    private static final String INT_NUMBER_REGEX = "-?\\d{1,9}";

    public final boolean isValid(String stringNum) {
        return stringNum.matches(INT_NUMBER_REGEX);
    }
}

