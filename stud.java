import java.util.*;


class student{

    String name,id,batch;
    
    student(String name,String id){
        this.name = name;
        this.id = id;
    }
    student(String name,String id,String batch){
        this(name,id);
        this.batch = batch;

        this.show(this);
    }
    void show(student t){
        
        System.out.println("name : "+ t.name +" id : "+t.id +" batch : "+ t.batch);
    }

}

class stud{
    
    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);
         String name,id,batch;

        System.out.println("Enter data of student : ");
        
        System.out.println("Enter name : ");
        name = sc.next();

        System.out.println("Enter id : ");
        id = sc.next();

        System.out.println("Enter batch : ");
        batch = sc.next();
        student s = new student(name,id,batch);

    }

}
