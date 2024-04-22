package chapter20.annotations;

import net.achilles.atunit.*;
import net.achilles.util.*;

public class AtUnitExternalTest extends AtUnitExample1 {
    @Test boolean _methodOne() {
        return methodOne().equals("This is methodOne");
    }
    @Test boolean _methodTwo() { return methodTwo() == 2; }
    public static void main(String[] args) throws Exception {
        OSExecute.command(
                "java net.achilles.atunit.AtUnit AtUnitExternalTest");
    }
}
