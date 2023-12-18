package net.achilles.util;

/**
 * Генератор массива int[]
 * @version 1.0 2023-12-18
 * @author Achilles
 */
public class Range {

    /**
     * Генерирует массив заданной длины от 0
     * @param n Длинна массива
     * @return Массив int[]
     */
    public static int[] range(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++)
            result[i] = i;
        return result;
    }

    /**
     * Генерирует массив заданной длины, от первого
     * значения до последнего не включительно
     * @param start Первое значение
     * @param end Последнее значение не включительно
     * @return Массив int[]
     */
    public static int[] range(int start, int end) {
        int sz = end - start;
        int[] result = new int[sz];
        for (int i = 0; i < sz; i++)
            result[i] = start + i;
        return result;
    }

    /**
     * Генерирует массив заданной длины, от первого
     * значения до последнего не включительно,
     * c указанным шагом.
     * @param start Первое значение
     * @param end Последнее значение не включительно
     * @param step Шаг значения
     * @return Массив int[]
     */
    public static int[] range(int start, int end, int step) {
        int sz = (end - start) / step;
        int[] result = new int[sz];
        for (int i = 0; i < sz; i++)
            result[i] = start + (i * step);
        return result;
    }
}
