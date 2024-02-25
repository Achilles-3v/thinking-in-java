package chapter15.generics;

import java.util.*;

/**
 * Автоматическая упаковка компенсирует невозможность
 * использования примитивов с обобщениями
 * @version 15.41 2024-02-25
 * @author Bruce Eckel
 */
public class ByteSet {
    Byte[] possibles = { 1,2,3,4,5,6,7,8,9 };
    Set<Byte> mySet =
            new HashSet<Byte>(Arrays.asList(possibles));
    // But you can't do this:
    // Set<Byte> mySet2 = new HashSet<Byte>(
    //   Arrays.<Byte>asList(1,2,3,4,5,6,7,8,9));
}
