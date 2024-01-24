package chapter13.strings.task07;

import java.util.*;

/**
 * Форматные спецификаторы
 * @version 13.07 2024-01-24
 * @author Bruce Eckel
 */
public class Receipt {
    private double total = 0;
    private Formatter f = new Formatter(System.out);
    public void printTitle() {
        f.format("%-15s %5s %10s\n", "Item", "Qty", "Price");
        f.format("%-15s %5s %10s\n", "----", "---", "-----");
    }
    public void print(String name, int qty, double price) {
        f.format("%-15.15s %5d %10.2f\n", name, qty, price);
        total += price;
    }
}
