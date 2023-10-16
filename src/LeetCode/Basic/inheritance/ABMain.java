package LeetCode.Basic.inheritance;

public class ABMain {

    public static void main(String[] args) {


//        A a = new A();
//        a.print();

//        B b = new B();
//        b.print();
//        b.print("Shalaka");
//
        A ab  = new B();
        ab.print();

        // ab.print("Shalaka");   //this will not work compile time error

        //This will not work
//        B ba = (B) new A();
//        ba.print();


        try {
            throw new B();
        }catch (B b){
            System.out.println("Ex b");
        }catch (A a){
            System.out.println("Ex a");
        }

    }
}
