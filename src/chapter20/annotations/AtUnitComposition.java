package chapter20.annotations;

import net.achilles.atunit.*;
import net.achilles.util.*;

public class AtUnitComposition {
    AtUnitExample1 testObject = new AtUnitExample1();
    @Test boolean _methodOne() {
        return
                testObject.methodOne().equals("This is methodOne");
    }
    @Test boolean _methodTwo() {
        return testObject.methodTwo() == 2;
    }
    public static void main(String[] args) throws Exception {
        OSExecute.command(
                "java net.achilles.atunit.AtUnit AtUnitComposition");
    }
}
