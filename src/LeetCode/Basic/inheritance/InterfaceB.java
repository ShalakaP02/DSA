package LeetCode.Basic.inheritance;

public interface InterfaceB {
    void fly();
    void pack();

    static void test() {
        System.out.println("I am static B");
    }

    default void def() {
        System.out.println("I am default B");
    }
}
