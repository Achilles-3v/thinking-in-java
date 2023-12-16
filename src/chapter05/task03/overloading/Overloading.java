package chapter05.task03.overloading;

public class Overloading {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            new Tree();
        }
    }
}

class Tree {

    public static int counter = 0;

    public Tree() {
        System.out.println(counter + ": " + "New a tree");
        counter++;
    }
}
