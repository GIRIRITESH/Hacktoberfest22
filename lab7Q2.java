import java.util.*;

final class X{

    final int c = 10;
    final void show(){
        c=20;
        System.out.println("From final class : "+c);
    }

}
class A extends X{
    void show(){
        System.out.println("From class A");

    }

}
class lab7Q2{
    public static void main(String args[]) {
        X x = new X();
        x.show();
        A a = new A();
        a.show();
    }
}