import java.util.*;
interface Shape{
	float pi=3.14f;
	double Volume(double a, double b);
}
class Sphere implements Shape{
	public double Volume(double a, double b){
		return((4.0/3.0)*pi*a*a*a);
	}
}
class Cone implements Shape{
	public double Volume(double a, double b){
		return((1.0/3.0)*pi*a*a*b);
	}
}
class Lab7q4{
	public static void main(String args[]){
		Sphere s= new Sphere();
		Cone c= new Cone();
		Shape s1;
		s1=s;
		System.out.println("Volume of Sphere= "+s1.Volume(4,2));
		s1=c;
		System.out.println("Volume of Cone= "+s1.Volume(2,2));
	}
}