import java.util.*;
abstract class X{
    abstract void calculate(int a);
}
class A extends X{
    void calculate(int a){
        System.out.println("Square of number : "+ (a*a));

    }

}
class B extends X {
void calculate(int a){
        System.out.println("Cube of number : "+ (a*a*a));

    }
    
}
class C extends X{
    void calculate(int a){
        System.out.println("Square Root of number : "+ (Math.sqrt(a)));

    }
    
}
class Lab7Q1{
    public static void main(String args[]) {
        A a = new A();
        B b = new B();
        C c = new C();
        a.calculate(4);
        b.calculate(4);
        c.calculate(4);
    }
}