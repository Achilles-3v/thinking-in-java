package chapter12.exceptions.task20;

import java.io.*;

/**
 * @version 12.20 2024-01-22
 * @author Bruce Eckel
 */
public class MainException {
    public static void main(String[] args) throws Exception {
        // Open the file:
        FileInputStream file =
                new FileInputStream("MainException.java");
        // Use the file ...
        // Close the file:
        file.close();
    }
}
