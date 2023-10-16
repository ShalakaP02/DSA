package LeetCode.Basic.inheritance;

public class CombineABInterface implements InterfaceA, InterfaceB{
    @Override
    public void fly() {
        System.out.println("I am flying from A"+InterfaceA.a);
    }

    @Override
    public void pack() {
        System.out.println("I am packing from A");
    }

    @Override
    public void def() {
        InterfaceB.super.def();
    }


}
