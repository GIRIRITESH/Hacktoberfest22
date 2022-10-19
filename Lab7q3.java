abstract class Figure
{
	abstract double area();
	double s1,s2;
	Figure(double a,double b){
		s1=a;
		s2=b;
	}
}
class Rectangle extends Figure{
	final int sides=4;
	Rectangle(double a, double b){
		super(a,b);
	}
	double area(){
		return s1*s2;
	}
}
class Square extends Figure{
	final int sides=4;
	Square(double a, double b){
		super(a,b);
	}
	double area(){
		return s1*s1;
	}
}
class Triangle extends Figure{
	final int sides=3;
	Triangle(double a, double b){
		super(a,b);
	}
	double area(){
		return s1*s2/2;
	}
}
class Lab7q3{
	public static void main(String args[]){
		Figure ref=new Rectangle(12,10);
		double area1=ref.area();
		System.out.println("Area of Rectangle= "+area1);
		ref=new Square(5,5);
		double area2=ref.area();
		System.out.println("Area of Sqaure= "+area2);
		ref=new Triangle(3,4);
		double area3=ref.area() ;
		System.out.println("Area of Triangle= "+area3);
	}
}