package chapter13.strings.task19;

import java.util.regex.*;

/**
 * Вызов reset()
 * @version 13.19 2024-01-26
 * @author Bruce Eckel
 */
public class Resetting {
    public static void main(String[] args) throws Exception {
        Matcher m = Pattern.compile("[frb][aiu][gx]")
                .matcher("fix the rug with bags");
        while(m.find())
            System.out.print(m.group() + " ");
        System.out.println();
        m.reset("fix the rig with rags");
        while(m.find())
            System.out.print(m.group() + " ");
    }
}
