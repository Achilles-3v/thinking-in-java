package chapter13.strings.task09;

/**
 * String.format()
 * @version 13.09 2024-01-24
 * @author Bruce Eckel
 */
public class DatabaseException extends Exception {
    public DatabaseException(int transactionID, int queryID,
                             String message) {
        super(String.format("(t%d, q%d) %s", transactionID,
                queryID, message));
    }
    public static void main(String[] args) {
        try {
            throw new DatabaseException(3, 7, "Write failed");
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
