package chapter12.exceptions.task7;

/**
 * Программный доступ к информации трасировки стека
 * @version 12.7 2024-01-17
 * @author Bruce Eckel
 */
public class WhoCalled {
    static void f() {
        // Generate an exception to fill in the stack trace
        try {
            throw new Exception();
        } catch (Exception e) {
            for(StackTraceElement ste : e.getStackTrace())
                System.out.println(ste.getMethodName());
        }
    }
    static void g() { f(); }
    static void h() { g(); }
}
