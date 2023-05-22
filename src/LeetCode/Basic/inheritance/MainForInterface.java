package LeetCode.Basic.inheritance;

public class MainForInterface {
    public static void main(String[] args) {
        CombineABInterface c = new CombineABInterface();
        c.fly();
        c.pack();
        c.def();
        InterfaceA.test();
        InterfaceB.test();
    }
}
