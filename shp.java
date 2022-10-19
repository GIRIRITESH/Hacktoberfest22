import java.util.*;


class shape{

    private float a=1,b=1,c=1;
    
    shape(float x){
        a=x;
		b=x;
    }
    shape(float x,float y){
        a=x;
        b=y;
    }
    shape(float x,float y,float z){
        a=x;
        b=y;
        c=z;
    }

    float area(){
        return (a*b*c);
    }

}



class shp {
    
    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);

        float a,b;

        System.out.println("Enter the side of square : ");
        a = sc.nextFloat();
		b = sc.nextFloat();
        shape sq = new shape(a,b);

        System.out.println("Enter the sides of rectangle : ");
        a = sc.nextFloat();
        b = sc.nextFloat();
        shape rect = new shape(a,b);


        System.out.println("Enter the height and base of triangle : ");
        a = sc.nextFloat();
        b = sc.nextFloat();
        shape tri = new shape(a,b,0.5f);

        System.out.println("Area of square : "+sq.area());
        System.out.println("Area of reactangle : "+rect.area());
        System.out.println("Area of triangle : "+tri.area());


    }

}
