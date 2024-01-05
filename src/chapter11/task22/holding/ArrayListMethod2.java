package chapter11.task22.holding;

import java.util.ArrayList;

public class ArrayListMethod2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ivan");
        arrayList.add("Stepan");
        arrayList.add("Petr");
        arrayList.add("Kirill");
        System.out.println(arrayList);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Stepan");
        arrayList2.add("Petr");
        arrayList2.add("Grigorii");

        arrayList.removeAll(arrayList2);
        System.out.println(arrayList);
    }
}
