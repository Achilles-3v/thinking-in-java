package chapter12.exceptions.task18;

/**
 * За созданием каждого объекта, нуждающегося в завершении,
 * должна следовать конструкция try-finally
 * @version 12.18 2024-01-21
 * @author Bruce Eckel
 */

class NeedsCleanup { // Construction can't fail
    private static long counter = 1;
    private final long id = counter++;
    public void dispose() {
        System.out.println("NeedsCleanup " + id + " disposed");
    }
}

class ConstructionException extends Exception {}

class NeedsCleanup2 extends NeedsCleanup {
    // Construction can fail:
    public NeedsCleanup2() throws ConstructionException {}
}

public class CleanupIdiom {
}
