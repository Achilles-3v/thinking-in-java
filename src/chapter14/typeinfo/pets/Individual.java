package chapter14.typeinfo.pets;

/**
 * @version 14.31 2024-01-30
 * @author Bruce Eckel
 */
public class Individual implements Comparable<Individual> {
    private static long counter = 0;
    private final long id = counter++;
    private String name;
    public Individual(String name) { this.name = name; }
    // 'name' is optional:
    public Individual() {}
    public String toString() {
        return getClass().getSimpleName() +
                (name == null ? "" : " " + name);
    }
    public long id() { return id; }
    public boolean equals(Object o) {
        return o instanceof Individual &&
                id == ((Individual)o).id;
    }
    public int hashCode() {
        return 0;
    }
    public int compareTo(Individual arg) {
        return 0;
    }
}