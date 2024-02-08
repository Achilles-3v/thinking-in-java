package chapter14.typeinfo.task16;

import java.lang.reflect.*;

/**
 * Закрытые поля не скрыты от отражения
 * @version 14.15 2024-02-08
 * @author Bruce Eckel
 */

class WithPrivateFinalField {
    private int i = 1;
    private final String s = "I'm totally safe";
    private String s2 = "Am I safe?";
    public String toString() {
        return "i = " + i + ", " + s + ", " + s2;
    }
}

public class ModifyingPrivateFields {
}
