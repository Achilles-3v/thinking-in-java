package chapter12.exceptions.task4;

import java.util.logging.*;
import java.io.*;

/**
 * Регистрация перехваченных исключений
 * @version 12.4 2024-01-16
 * @author Bruce Eckel
 */
public class LoggingExceptions2 {
    private static Logger logger =
            Logger.getLogger("LoggingExceptions2");
    static void logException(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
    public static void main(String[] args) {
        try {
            throw new NullPointerException();
        } catch(NullPointerException e) {
            logException(e);
        }
    }
}
