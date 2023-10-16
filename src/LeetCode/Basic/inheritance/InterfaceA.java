package LeetCode.Basic.inheritance;

public interface InterfaceA {

    int a = 50;

    void fly();
    void pack();

    static void test() {
        System.out.println("I am static A");
    }

    default void def() {
        System.out.println("I am default A");
    }

}
