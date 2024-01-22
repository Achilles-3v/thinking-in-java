package chapter12.exceptions.task21;

import java.io.*;

/**
 * Отключение контролируемых исключений
 * @version 12.21 2024-01-22
 * @author Bruce Eckel
 */

class WrapCheckedException {
    void throwRuntimeException(int type) {
        try {
            switch(type) {
                case 0: throw new FileNotFoundException();
                case 1: throw new IOException();
                case 2: throw new RuntimeException("Where am I?");
                default: return;
            }
        } catch(Exception e) { // Adapt to unchecked:
            throw new RuntimeException(e);
        }
    }
}

public class TurnOffChecking {
}
