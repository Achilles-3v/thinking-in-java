package chapter20.annotations;

import net.achilles.atunit.*;

public class Testable {
    public void execute() {
        System.out.println("Executing..");
    }
    @Test void testExecute() { execute(); }
}
