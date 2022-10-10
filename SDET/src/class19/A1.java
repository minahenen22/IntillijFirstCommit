package class19;

public class A1 {
    static void printF() {
        System.out.println("method");
    }
}
    class B1 extends A1{
    String name;


        }




class C {
    public static void main(String[] args) {
        B1 obj=new B1();
        obj.printF();

    }
}

