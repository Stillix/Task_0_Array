package by.dorogokupets.arraytask.util;

public class IdGenerator {
    private static int counter;

    public static int generateId() {
        return ++counter;
    }
}
