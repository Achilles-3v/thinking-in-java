package chapter03.task14.equalsstring;

public class EqualsString {

    public static void main(String[] args) {
        String a = "abc";
        String b = "ABC";
        String c = "abc";
        String d = "Abc";

        equalsString(a, b);
        equalsString(a, c);
        equalsString(b, d);
    }

    static void equalsString(String str1, String str2) {
        System.out.println(str1 + " == " + str2 + " is " + (str1 == str2));
        System.out.println(str1 + " != " + str2 + " is " + (str1 != str2));
        System.out.println(str1 + ".equals(" + str2 + ") is " + (str1.equals(str2)));
        System.out.println(str1 + ".equalsIgnoreCase(" + str2 + ") is " + (str1.equalsIgnoreCase(str2)));
        System.out.println();
    }
}
