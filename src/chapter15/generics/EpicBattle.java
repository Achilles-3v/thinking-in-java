package chapter15.generics;

import java.util.*;

/**
 * Пример с большим количеством уровней
 * @version 15.29 2024-02-21
 * @author Bruce Eckel
 */

interface SuperPower {}
interface XRayVision extends SuperPower {
    void seeThroughWalls();
}
interface SuperHearing extends SuperPower {
    void hearSubtleNoises();
}
interface SuperSmell extends SuperPower {
    void trackBySmell();
}

public class EpicBattle {
}
