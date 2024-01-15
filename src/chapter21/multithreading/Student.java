package chapter21.multithreading;

/**
 * Пример многопоточности Java
 * @version 21.2 2024-01-15
 * @author Achilles
 */
class StudentQueue extends Thread {
    private String[] names;

    StudentQueue(String... names) {
        this.names = names;
    }

    @Override
    public void run() {
        for (int i = 0; i < names.length; i++) {
            System.out.println("Download documents is " + names[i]);
            try {
                sleep(700);
            } catch (Exception e) {}
        }
    }
}


public class Student {
    public static void main(String[] args) {

    }
}


