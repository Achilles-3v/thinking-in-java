package chapter15.generics;

import chapter14.typeinfo.pets.*;
import java.util.*;
import net.achilles.util.*;

public class SimplerPets {
    public static void main(String[] args) {
        Map<Person, List<? extends Pet>> petPeople = New.map();
        // Rest of the code is the same...
    }
}
