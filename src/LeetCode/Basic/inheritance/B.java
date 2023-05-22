package LeetCode.Basic.inheritance;

public class B extends A{

    public B(){
        System.out.println("Constructor B");
    }


    public void print(){
        System.out.println("I am B");
    }

    public void print(String val){
        System.out.println(val);
    }

}
