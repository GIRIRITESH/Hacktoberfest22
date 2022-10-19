import java.util.*;

interface x{
    void show();
}

class y{
   public  void show(){       
        System.out.println("Show from class y : ");
    }
    void print(){
        System.out.println("print from class Y : ");
    }
}
class A extends y implements x{
   public void show(){
        System.out.println("Show from class A : ");
    }
    void print(){
        System.out.println("print from class A : ");
    }

}
class Lab7q6{
    public static void main(String args[]) {
        A a = new A();
        a.show();
        a.print();
    }
}