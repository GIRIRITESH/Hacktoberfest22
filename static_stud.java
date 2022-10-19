import java.util.*;

class student{

    static String clas;
    String name;

    student(String name){
        this.name = name;
    }
}

class static_stud{

    static String clas;
    public static void main (String args[]) {
        
        Scanner sc = new Scanner(System.in);

        String name;

        System.out.println("Enter the name of first student : ");
        name = sc.next();
        

        student a = new student(name);
        a.clas = "Nine";

        System.out.println("Enter the name of Second student : ");
        name = sc.next();
        
        student b = new student(name);
        
        
        System.out.println("Name : "+a.name+" class : "+a.clas);
        System.out.println("Name : "+b.name+" class : "+b.clas);
        
    }
    static{
        
        System.out.println("Enter the name of student of same class : ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the class : ");
        clas = sc.next();
    }
}