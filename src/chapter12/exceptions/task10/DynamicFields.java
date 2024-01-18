package chapter12.exceptions.task10;

/**
 * Динамическое добавление полей в класс
 * Демонстрирует цепочку исключений
 * @version 12.10 2024-01-18
 * @author Bruce Eckel
 */

class DynamicFieldsException extends Exception {}

public class DynamicFields {
    private Object[][] fields;

    public DynamicFields(int initialSize) {
        fields = new Object[initialSize][2];
        for(int i = 0; i < initialSize; i++)
            fields[i] = new Object[] { null, null };
    }
    public String toString() {
        StringBuilder result = new StringBuilder();
        for(Object[] obj : fields) {
            result.append(obj[0]);
            result.append(": ");
            result.append(obj[1]);
            result.append("\n");
        }
        return result.toString();
    }
}
