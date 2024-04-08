package chapter18.io;

import java.io.*;

public class Blip3 implements Externalizable {
    private int i;
    private String s;
    public Blip3() {
        System.out.println("Blip3 Constructor");
    }
    public Blip3(String x, int a) {
        System.out.println("Blip3(String x, int a)");
        s = x;
        i = a;
    }
    public String toString() { return s + i; }
    public void writeExternal(ObjectOutput out)
            throws IOException {
        System.out.println("Blip3.writeExternal");
        out.writeObject(s);
        out.writeInt(i);
    }
    public void readExternal(ObjectInput in)
            throws IOException, ClassNotFoundException {
        System.out.println("Blip3.readExternal");
        s = (String)in.readObject();
        i = in.readInt();
    }
}
