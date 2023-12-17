package chapter05.task17.arrayString;

public class ArrayString {

    private String word;

    static {
        System.out.println("ArrayString()");
    }

    public ArrayString(String word) {
        this.word = word;
        System.out.println("ArrayString(" + this.word + ")");
    }

    public static void main(String[] args) {

        ArrayString[] array = new ArrayString[10];
        for (ArrayString as : array) {
            System.out.print(as + " ");
        }

        ArrayString[] array2 = new ArrayString[] {
                new ArrayString("123"),
                new ArrayString("234"),
                new ArrayString("345")
        };

        for (ArrayString a : array2) {
            System.out.println(a.word);
        }
    }
}
