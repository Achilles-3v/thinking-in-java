package chapter19.enumerated;

public enum OverrideConstantSpecific {
    NUT, BOLT,
    WASHER {
        void f() { System.out.println("Overridden method"); }
    };
    void f() { System.out.println("default behavior"); }
}
